Organización modular y creación de una librería personalizada – Desarrollo Orientado a Objetos I

Autora del proyecto

Nombre completo: Evelin Castro Carrera: Analista Programador Computacional Sede: On-Line

Descripción general del proyecto

Este proyecto es un sistema orientado a objetos desarrollado en Java con IntelliJ IDEA Maven, tiene por objetivo llamar y leer linea por linea un archivo excel, para aplicar metodos como filtrar, mostrar y agregar nuevos objetos "Centro Cultivo"

Estructura general del proyecto

src -> main -> java -> cl.salmontt -> app    -> Main (clase para ejecutar el proyecto)
                                   -> data   -> GestorCentros (clase que gestiona los datos del archivo excel tiene metodos para filtrar, agregar y listar)
                                   -> model  -> CentroCultivo (clase que representa un objeto "Centro Cultivo" y tiene relacion de composicion con ubicacion)
                                             -> Ubicación (clase que representa la ubicacion de un objeto "Centro Cultivo)
                                   -> util   -> LestorArchivo (clase que llama y recorre y archivo excel línea por línea)
                                  
Instrucciones para clonar y ejecutar el proyecto

Clona el repositorio desde GitHub: git clone https://github.com/EveC16/SalmonttAppNew.git

Abre el proyecto en IntelliJ IDEA.

Verifica que el archivo .xlsx este correctamente ubicado.

Ejecuta el archivo Main.java desde el paquete app.

Salida por consola esperada: 

  - Lista de objetos "Centro Cultivo" con ubicacion y toneladas de producción
  - Agregación de nuevo "Centro Cultivo"
  - Filtro por comuna
    
Ejemplo:

  Lsita ->  CentroCultivo{Nombre del Centro: Libra', Ubicación: comuna de Santiago', Toneladas Producidas: 4200}
  Agregación de un nuevo centro -> Centro Cultivo Zodiacal Nuevo agregado con exito
  Filtro por comuna ->  Se encontro 1 centro cultivo de Salmontt en La Florida
  Nueva lista de objetos con el centro agregado -> CentroCultivo{Nombre del Centro: Tauro', Ubicación: comuna de La Florida', Toneladas Producidas: 3700}

Repositorio GitHub: https://github.com/EveC16/SalmonttAppNew.git Fecha de entrega: 24/11/2025

Referencias: Plantilla README.md – Repositorio oficial de la asignatura
