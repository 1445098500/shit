import socket, threading, time

s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

s.bind(('127.0.0.1', 9999))

#s.listen(5)

print('waiting for connect...')
'''
def tcplink(sock, addr):
    print('accept new connection from %s:%s' % addr)
    sock.send(b'welcome')
    while True:
        data = sock.recv(1024)
        time.sleep(1)
        if not data or data.decode('utf-8') == 'exit':
            break
        sock.send(('hello ,%s' % data.decode('utf-8')).encode('utf-8'))
    sock.close()
    print('connection from%s:%s' % addr)
'''

while True:
    #sock, addr = s.accept()
    data, addr = s.recvfrom(1024)
    #t = threading.Thread(target=tcplink, args=(sock, addr))
    print('received from %s:%s' % addr)
    #t.start()
    s.sendto(b'hello, %s' % data, addr)
    time.sleep(1)
