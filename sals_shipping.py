def shipping_payment(lst):
    total = float()
    
    for item in lst:
        if item > 0 and item <= 2:
             total += 1.50
        elif item > 2 and item <= 6:
             total += 3.0
        elif item > 6 and item <= 10:
             total += 4.0
        elif item > 10:
             total += 4.76
    
    return total



def validate_weight(weight):
    if weight > 0:
        return weight
    else:
        weight = float(input('Reingrese nueamente el peso de su paquete\n>> '))
        
        return validate_weight(weight)

def package_weight(cant):
    quantity_packages = list() # Almacenamos el peso de los paquetes
    

    for item in range(cant):
        weight = float(input(f'Ingrese el peso del paquete {item + 1}\n>> '))
        weight = validate_weight(weight)
        
        quantity_packages.append(weight)

    return quantity_packages
       

def number_of_package():
    amount = int(input('Ingrese la cantidad de paquetes que desea enviar, por favor\n >>'))

    if amount > 0:
        return amount
    else:
        return number_of_package()

def validate_name():
    name = input('Ingrese su nombre, por favor\n >> ')

    if len(name) >= 3:
        return name
    else:
        return validate_name()

def run():
    print('*** Bienvenido a envíos Sal\'s ***')
    username = validate_name()
    
    print('Necesito saber la cantidad de paquetes y el peso de estos para mostrar los tipos de envíos que tenemos.')
    user_package = number_of_package()
    weight = package_weight(user_package)

    # Mostramos la información que a ingresado el usuario
    print('*** Información ***')
    print(f'Cantidad de paquetes: {user_package}')
    print(f'peso de paquetes: {weight}')

    total_price = shipping_payment(weight)

    print('* * * *')
    print(f'Total = {total_price}')
    



    
    


if __name__ == '__main__':
    run()
