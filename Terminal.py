# Dsa Terminal para Android
__version__ = "0.0.01"
# Importando módulos
from time import sleep, strftime
from random import choice
# Setup
print(strftime('Iniciando Dsa Terminal...'))
print(strftime(f'(C) %Y Dsa Terminal versão {__version__}'))
print(strftime('================Dsa Terminal===============')), sleep(0.08)
while True:
	try:
		print('┌─────────[root@DESKTOP-962732] \033[34m~\033[m')
        cmd: str = input(f'└─$ ').strip()
        if cmd == 'help':
        	print('Comando:          Função:\n')
        	print('help              Ajuda')
        	print('exit              Sai do Dsa Terminal')
       	elif cmd == 'exit':
       		break
       	else:
       		print(f'{cmd}: Comando invalido!')
	except:
		print('Dsa Terminal: Error internal storage!')