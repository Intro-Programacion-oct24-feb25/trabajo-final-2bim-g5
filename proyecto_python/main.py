from actividades import futbol, natacion, atletismo, basquetbol, ciclismo, tenis, yoga
from utils import obtener_informacion, obtener_reporte

def main():
    actividades = ["Fútbol", "Natación", "Atletismo", "Básquetbol", "Ciclismo", "Tenis", "Yoga"]
    conteos = [0] * len(actividades)
    resumen = []
    
    while True:
        print("\nSeleccione una actividad:")
        for i, actividad in enumerate(actividades, start=1):
            print(f"{i}. {actividad}")
        opcion = int(input("Opción: "))
        
        if 1 <= opcion <= 7:
            actividad_func = [
                futbol.registrar_participante,
                natacion.registrar_participante,
                atletismo.registrar_participante,
                basquetbol.registrar_participante,
                ciclismo.registrar_participante,
                tenis.registrar_participante,
                yoga.registrar_participante
            ][opcion - 1]
            resumen.append(actividad_func())
            conteos[opcion - 1] += 1
        else:
            print("Lo sentimos, el club no tiene esa opción.")
        
        salir = input("¿Desea salir? (s/n): ").strip().lower()
        if salir == "s":
            break
    
    print("\nResumen de participantes:")
    for r in resumen:
        print(r)
    
    print("\n" + obtener_informacion(len(resumen)))
    print("\n" + obtener_reporte(actividades, conteos))

if __name__ == "__main__":
    main()