def registrar_participante_yoga():
    nombre = input("Nombre del participante: ")
    edad = input("Edad: ")
    nivel = input("Nivel (principiante/intermedio/avanzado): ")
    ciudad = input("Ciudad: ")
    estilo = input("Estilo de yoga preferido: ")

    print(f"\nParticipante registrado en Yoga:")
    print(f"Nombre: {nombre}, Edad: {edad}, Nivel: {nivel}, Ciudad: {ciudad}, Estilo: {estilo}")
