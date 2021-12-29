import string
import random

# Solicitamos al usuario el largo de su contraseña
def length_pass():
    while (True):
        length = int(input('Ingrese el largo de su contraseña\n>> '))
        if length>=5:
            return length
            break
        else:
            print('La contraseña debe ser mayor a 4')

    return length
            
# Generamos la contraseña
def password(lst1, lst2, lst3, cant):
    total_characters = lst1+lst2+lst3
    my_password = list()

    for i in range(cant):
        random_choice = random.choice(total_characters)
        my_password.append(random_choice)

    my_password = ''.join(my_password)

    return my_password

def upper_case(lst):
    new_list = list()
    for letter in lst:
        new_list.append(letter.upper())
    return new_list

def number_list():
    nums = list()

    for number in range(10):
        num_to_string = str(number)
        nums.append(num_to_string)

    return nums
    
def run():
    # Creamos la lista del ABC
    characters = list(string.ascii_lowercase)
    characters_upper = upper_case(characters) 
    numbers = number_list() 
    # Validamos las listas
    print(characters)
    print(characters_upper)
    print(numbers)
    
    # Arrancando la aplicación
    large = length_pass()
    my_password = password(characters, characters_upper, numbers, large)

    print(f'Tu contraseña es:\n{my_password}')

    

if __name__ == '__main__':
    run()
