package com.generation;

public class Perro {
    //METODO
    //solo definición atributos de la clase
    String nombre;
    String raza;
    int edad;
    String tamanio;

    //con this llamamos al metodo llamamos a los atributos de la clase
    public void caracteristicas(){
        System.out.println("Hola, mi nombre es " + this.nombre+", soy de raza " + this.raza + " tengo " + this.edad + " años " + "soy de tamaño " + this.tamanio);
    }

    //clases
    //clase publica
    public void comer (){
        System.out.println("Estoy comiendo");
    }
    public void dormi (){
        System.out.println("zzzzzz");
    }
    public void jugarr (){
        System.out.println("Estoy jugando");
    }

}
