import random

  

# Pedimos el nº al usuario
def user():
    print('Bienvenido a adivina el nº')
    while True:
        number = int(input('Ingresa un número entre 0 a 9\n>> '))

        if number>=0 and number<=9:
            break;
        else:
            print('Haz ingresado un nº erróneo. Vuélve a intentar')
    return number


# Generamos el nº a adivinar.
def random_number():
    cpu = random.randint(0, 9)
    return cpu

# Función entregará los datos complementarios de nuestro juego.
def show_info(cpu, user):
    print('*** RESULTADOS ***')
    print(f'CPU: {cpu}')
    print(f'USUARIO: {user}')

# Ejecutamos nuestro juego
def game(user, cpu):
    if user != cpu:
        print('CPU ha ganado')
    elif user == cpu:
        print('USUARIO ganador!')

# 
 # Entry Point == Método main
if __name__ == '__main__':
   cpu_number = random_number()
   user_number = user()   
   show_info(cpu_number, user_number)
   game(user_number, cpu_number)

