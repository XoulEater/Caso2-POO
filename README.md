# Caso2-POO

![Untitled](https://user-images.githubusercontent.com/99497779/187833654-c7847125-9f71-4c28-9066-37f0f8bfa3a1.jpg)

En la clase constant se puede configurar lo siguinte 
- CHARGEPS: 
Valor base de energia que producen los paneles al 100% de eficiencia
- BATCAPACITY:
Capacidad de las baterias
- BATQUANTITY:
Cantidad de baterias 
- PANQUANTITY:
Cantidad de paneles
- YATCHINTAKE:
Valor base del consumo de energia del barco cuando el multiplicador es igual a 1

En la clase MainThread se puede configurar lo siguiente
- Eficiencia de los paneles y sus intervalos en base al tiempo
- Configuracion de la velocidad y sus intervalos en base al tiempo 

Para la simulacion no logre hacer que funcionasen los threads a la vez que la interfaz sin que esta fuese interrumpida, por eso el mecanismo manual de pasar de horas
