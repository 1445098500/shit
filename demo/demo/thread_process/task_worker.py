#!/usr/bin/env python3

# -*- coding: utf-8 -*-

import time, sys, queue
from multiprocessing.managers import BaseManager

class QueueManager(BaseManager):
    
    pass

class run():
    QueueManager.register('get_task_queue')
    QueueManager.register('get_result_queue')

    server_addr = '10.11.171.45'
    print('connect to server %s' % server_addr)

    m = QueueManager(address=(server_addr, 5000), authkey=b'abc')


    m.connect()
    
    task = m.get_task_queue()
    result = m.get_result_queue()

    for i in range(10):
        try:
            n= task.get(timeout=1)
            print('run task %d * %d..' %(n,n))
            r='%d * %d = %d' % (n,n,n*n)
            time.sleep(1)
            result.put(r)
        except queue.Empty:
            print('task queue is empty.')
    print('work exit.')

if __name__ == '__main__':
    run()
