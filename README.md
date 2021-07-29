# SantanderFase2_BedufyMusic
En este repositorio se agrega el código de la aplicación Android desarrollado en el módulo 2 utilizando como Entorno de Desarrollo Integrado (IDE) Android Studio. 
El proyecto contiene elementos vistos en las sesiones 1,2,3:
- Views
- Elementos fundamentales como botones, textos inputs e imágenes.
- Activities y Layouts.

Alcance del proyecto.

Tenemos proyectado usar  API de Android que nos permite reproducir contenido multimedia,  audio. Podemos reproducir, tanto archivos almacenados en el dispositivo como desde un flujo de datos que llega a través de Internet.

Como conceptos básicos tenemos:

La clase Reproductor que es la API principal para reproducir sonido.

La clase AudioManager que administra fuentes y salidas de audio en el dispositivo.
Diagrama de estados
Para poder conocer y aprovechar al máximo esta API debemos conocer su flujo de estados, 
como podemos ver en la siguiente imagen, tenemos varios estados y acciones para llegar a cada uno de ellos
 nos centraremos en los principales para reproducir un archivo de audio. Como apunte, las flechas simples representan llamadas 
a métodos síncronos y las flechas dobles a métodos asíncronos. A continuación vamos a explicar el diagrama.
![Diagrama](https://ibb.co/xSdSMRT)
