import socket

s = socket.socket(socket.AF_INET,socket.SOCK_DGRAM)

#s.connect(('127.0.0.1',9999))

#print(s.recv(1024).decode('utf-8'))

for data in [b'Michael',b'Bob',b'Sarah']:
    #s.send(data)
    s.sendto(data, ('127.0.0.1',9999))
    print(s.recv(1024).decode('utf-8'))
#s.send('exit')
s.close()