import socket
ip = '0.0.0.0'
porta = 262
s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.listen(100)
s.bind((ip, int(porta)))