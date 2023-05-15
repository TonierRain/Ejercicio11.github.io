# Venta de Boletos de Cine
### En este desarrollo de software se vera reflejado el promedio de de boletos vendidos de una pelicula que esté en cartelera que hayan vendido la menor cantidad de boletos y la mayor cantidad de boletos. Dependiendo del número de boletos vendidos se elijira la mejor pelicula taquillera y la peor en el momento 
## Aclariaciones
* Se supondrá que la aplicación solo se requiere calcular la mejor y la peor pelicula taquillera de la cartelera en ese momento según el número de boletos vendidos.
* Para efectos de mantener la simplicidad del ejemplo no se contemplan manejar persistencia en el almacenamiento de los datos.
* No se realiza validación, ni se verifica calidad en los datos ingresados.

## Análsis del Ejercicio

![image](https://github.com/TonierRain/Ejercicio11.github.io/assets/132966400/ab4d43df-3cd8-499a-a859-8c323838377a)



## Aproximación Caso de Uso

![image](https://github.com/TonierRain/Ejercicio11.github.io/assets/132966400/e51cfdab-af54-4753-87d7-139e6f0497fd)



## Diagrama de Flujos de Datos
![image](https://github.com/TonierRain/Ejercicio11.github.io/assets/132966400/22a5a5fb-038b-4573-aae0-527a975831a1)




## Seudocódigo

Proceso Venta_De_Boletos

	Definir p1 Como Caracter
	Definir p2 Como Caracter
	Definir p3 Como Caracter
	Definir p4 Como Caracter
	Definir p5 Como Caracter
	Definir b1 Como Entero
	Definir b2 Como Entero
	Definir b3 Como Entero
	Definir b4 Como Entero
	Definir b5 Como Entero
	Escribir 'Digite el nombre de las 5 peliculas que están en cartelera en momento'
	Leer p1
	Leer p2
	Leer p3
	Leer p4
	Leer p5
	Escribir '¿Cuántos boletos ha vendido ',p1,' ?'
	Leer b1
	Escribir '¿Cuántos boletos ha vendido ',p2,' ?'
	Leer b2
	Escribir '¿Cuántos boletos ha vendido ',p3,' ?'
	Leer b3
	Escribir '¿Cuántos boletos ha vendido ',p4,' ?'
	Leer b4
	Escribir '¿Cuántos boletos ha vendido ',p5,' ?'
	Leer b5
	Si b1>b2 Y b1>b3 Y b1>b4 Y b1>b5 Entonces
		Escribir 'La pelicula más taquillera es ',p1,' que vendio ',b1,' boletos'
	SiNo
		Si b2>b1 Y b2>b3 Y b2>b4 Y b2>b5 Entonces
			Escribir 'La pelicula más taquillera es ',p2,' que vendio ',b2,' boletos'
		SiNo
			Si b3>b1 Y b3>b2 Y b3>b4 Y b3>b5 Entonces
				Escribir 'La pelicula más taquillera es ',p3,' que vendio ',b3,' boletos'
			SiNo
				Si b4>b1 Y b4>b2 Y b4>b3 Y b4>b5 Entonces
					Escribir 'La pelicula más taquillera es ',p4,' que vendio ',b4,' boletos'
				SiNo
					Si b5>b1 Y b5>b2 Y b5>b3 Y b5>b4 Entonces
						Escribir 'La pelicula más taquillera es ',p5,' que vendio ',b5,' boletos'
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
	Si b1<b2 Y b1<b3 Y b1<b4 Y b1<b5 Entonces
		Escribir 'La pelicula menos taquillera es ',p1,' que vendio ',b1,' boletos'
	SiNo
		Si b2<b1 Y b2<b3 Y b2<b4 Y b2<b5 Entonces
			Escribir 'La pelicula menos taquillera es ',p2,' que vendio ',b2,' boletos'
		SiNo
			Si b3<b1 Y b3<b2 Y b3<b4 Y b3<b5 Entonces
				Escribir 'La pelicula menos taquillera es ',p3,' que vendio ',b3,' boletos'
			SiNo
				Si b4<b1 Y b4<b2 Y b4<b3 Y b4<b5 Entonces
					Escribir 'La pelicula menos taquillera es ',p4,' que vendio ',b4,' boletos'
				SiNo
					Si b5<b1 Y b5<b2 Y b5<b3 Y b5<b4 Entonces
						Escribir 'La pelicula menos taquillera es ',p5,' que vendio ',b5,' boletos'
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinProceso



