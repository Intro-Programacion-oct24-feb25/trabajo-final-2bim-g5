def registrar_participante_tenis():
    nombre = input("Nombre del participante: ")
    edad = input("Edad: ")
    nivel = input("Nivel (principiante/intermedio/avanzado): ")
    ciudad = input("Ciudad: ")
    mano = input("Mano hábil (derecha/izquierda): ")

    print(f"\nParticipante registrado en Tenis:")
    print(f"Nombre: {nombre}, Edad: {edad}, Nivel: {nivel}, Ciudad: {ciudad}, Mano hábil: {mano}")
