def registrar_participante():
    print("Registrando participante en Atletismo")
    nombre = input("Nombre: ")
    edad = int(input("Edad: "))
    especialidad = input("Especialidad (carreras, salto, lanzamiento): ")
    ciudad = input("Ciudad: ")
    record_personal = input("Récord personal: ")
    return f"Atletismo: {nombre}, {edad} años, especialidad {especialidad}, de {ciudad}, récord personal {record_personal}"