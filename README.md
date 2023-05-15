# Venta de Boletos de Cine
### En este desarrollo de software se vera reflejado el promedio de boletos vendidos de una pelicula en base a las funciones que presente. Dependiendo del número de boletos vendidos se estimara si la pelicula es rentable o no.
## Aclariaciones
* Se supondrá que la aplicación solo se requiere calcular el promedio de boletos vendidos de una pelicula en base a las funciones que presente.
* Para efectos de mantener la simplicidad del ejemplo no se contemplan manejar persistencia en el almacenamiento de los datos.
* No se realiza validación, ni se verifica calidad en los datos ingresados.

## Análsis del Ejercicio

![image](https://github.com/TonierRain/Ejercicio11.github.io/assets/132966400/ab4d43df-3cd8-499a-a859-8c323838377a)



## Aproximación Caso de Uso
![image](https://github.com/TonierRain/Ejercicio11.github.io/assets/132966400/22a5a5fb-038b-4573-aae0-527a975831a1)



## Diagrama de Flujos de Datos

![image](https://github.com/TonierRain/Ejercicio11.github.io/assets/132966400/37b22b52-0bfe-4a63-8885-64c39797ac19)

Entender el anterior diagrama no debe presentar mayores problemas. Sin embargo, es conveniente realizar las siguientes aclaraciones y comentarios:
* Aunque se puede condensar el código incluyendo las instrucciones del segundo “Para” dentro del primero, de manera intencional se ha dejado así intencionalmente para delimitar funcionalmente cada bloque de código.
* En el algoritmo se captura información, como el nombre de pelicula, el numero de funciones y el numero de boletos, esta información se mantiene porque posteriormente puede ser útil para ampliar la funcionalidad de la aplicación. 




## Seudocódigo
Proceso Venta_De_Boletos


	Definir p1 Como Caracter
	Definir b1 Como Entero
	Definir f1 Como Entero
	Definir suma Como Entero
	Definir promedio Como Entero
	Definir acum Como Entero
	
	Escribir 'Digite el nombre de la  pelicula que está en cartelera en momento'
	Leer p1
	Escribir 'Cuántos funciones tiene  ',p1
	Leer f1
	
	acum=1
	suma=0
	
	Mientras acum<=f1 Hacer
		Escribir 'Cuántos boletos ha vendido ',p1,' en la funcion " acum
		Leer b1
		suma<-suma + b1
		acum<-acum + 1
		
	Fin Mientras
	promedio<-suma / f1
	
	Escribir "El promedio de boletos vendidos en la pelicula ",p1," que tuvo ",f1," funciones es ",promedio
	
	
FinProceso
