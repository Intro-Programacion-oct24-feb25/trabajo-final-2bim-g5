def registrar_participante_ciclismo():
    nombre = input("Nombre del participante: ")
    edad = input("Edad: ")
    tipo = input("Tipo de ciclismo (montaña/ruta/urbano): ")
    ciudad = input("Ciudad: ")
    marca = input("Marca de bicicleta preferida: ")

    print(f"\nParticipante registrado en Ciclismo:")
    print(f"Nombre: {nombre}, Edad: {edad}, Tipo: {tipo}, Ciudad: {ciudad}, Marca: {marca}")
