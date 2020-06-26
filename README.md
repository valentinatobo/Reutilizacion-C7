# Proy_Twitter
Proyecto final de grupo de trabajo Interfaz Gráfica 
Diana Valentina Uscategui Tobo 20172020063

# Reutilizacion-C7

## Construcción base del componente inicio

![paneles inicio](https://github.com/valentinatobo/Reutilizacion-C7/blob/master/imagenes/panelesinicio.PNG)

## Enfoque de reutilización por incorporación

Vamos a crear un nuevo component que encapsule la creación del contenido de los paneles, este componente sera llamado tarjeta, para esto creamos la clase component y template:

* Clase TarjetaTemplate

![clasetempla](https://github.com/valentinatobo/Reutilizacion-C7/blob/master/imagenes/tarjetat.PNG)

* Clase TarjetaComponent

![clasecomponent](https://github.com/valentinatobo/Reutilizacion-C7/blob/master/imagenes/trjetac.PNG)

Cuando el componente Tarjeta este listo para ser incorporado, debemos hacer dicha incorporación en el componente inicio. Nos posicionamos en la clase InicioTemplate y allí primero vamos a declarar las imágenes que necesitamos para nuestros componentes y luego las ejemplificamos:

![Ejemplificación](https://github.com/valentinatobo/Reutilizacion-C7/blob/master/imagenes/Reutilizacionporincorporaci%C3%B3n.PNG)

Para finalmente por medio de la reutilización nuestros cuatro paneles queden así:

![ImagenTweets](https://github.com/valentinatobo/Reutilizacion-C7/blob/master/imagenes/panelincioreutilizaci%C3%B3n.PNG)
