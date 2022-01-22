import random


# Validamos las opciones de los jugadores y mostramos los resultados
def play_game(usr, cpu):
    if usr == cpu:
        print('Es un empate.')
     
    elif usr == 1 and cpu == 3:
        print('***Ganador***\nUsuario\n*************')
   
    elif usr == 2 and usr == cpu ==1:
        print('***Ganador***\nUsuario\n*************')
    
    elif usr == 3  and cpu == 2:
        print('***Ganador***\nUsuario\n*************')
   
    else:
        print('***Ganador***\nCPU\n*************')


# Creamos el número aleatorio de la CPU 
def cpu_option():
    options = random.randint(1, 3) 
    
    print(f'Opción CPU = {options}')
    return options 


# Se recibe la opción del usuario. También se valida su opción.
def input_user():
    while(True):
        print('***Opciones***')
        print('1) Piedra\n2) Papel\n3) Tijeras')
      
        user_opt = int(input('Ingrese una opción\n>> '))
        print(type(user_opt))

        if  user_opt>0 and user_opt<4:
            break
        else:
            print('Haz introducido una opción incorrecta')
            continue
        
        return user_opt


def run():
    '''
        **Simbología:
        1. Piedra.
        2. Papel.
        3. Tijeras.
    '''    
    print('Bienvenido al juego *Piedra - Papel - Tijeras*')
    
    user = input_user()
    cpu = cpu_option()
    play_game(user, cpu)

    


if __name__ == '__main__':
    run()

