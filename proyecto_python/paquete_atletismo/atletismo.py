def registrar_participante_atletismo():
    nombre = input("Nombre del participante: ")
    edad = input("Edad: ")
    especialidad = input("Especialidad (carreras/salto/lanzamiento): ")
    ciudad = input("Ciudad: ")
    record = input("Récord personal: ")

    print(f"\nParticipante registrado en Atletismo:")
    print(f"Nombre: {nombre}, Edad: {edad}, Especialidad: {especialidad}, Ciudad: {ciudad}, Récord: {record}")
