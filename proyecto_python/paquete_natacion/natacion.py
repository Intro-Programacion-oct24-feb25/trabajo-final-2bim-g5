def registrar_participante_natacion():
    nombre = input("Nombre del participante: ")
    edad = input("Edad: ")
    nivel = input("Nivel (principiante/intermedio/avanzado): ")
    ciudad = input("Ciudad: ")
    estilo = input("Estilo favorito: ")

    print(f"\nParticipante registrado en Natación:")
    print(f"Nombre: {nombre}, Edad: {edad}, Nivel: {nivel}, Ciudad: {ciudad}, Estilo: {estilo}")
