package com.generation;

public class Main {

    public static void main(String[] args) {
		//objeto y llama al nuevo perro
		Perro lomito = new Perro();
		//caracteristicas
		lomito.nombre = "chems";
		lomito.edad = 1;
		lomito.raza = "mestizo";
		lomito.tamanio = "grande";
		lomito.caracteristicas();

//cada objeto es responsable de cada objeto
		//es independiente
		//Tipo perro llamado lomito2
		//new PERRO es el nuevo objeto

		Perro lomito2 = new Perro();
		lomito2.nombre = "Firulais";
		lomito2.edad = 2;
		lomito2.raza = "pug";
		lomito2.tamanio = "chico";
		//agrega sus clases
		lomito2.caracteristicas();
		lomito2. comer();

	}
}
