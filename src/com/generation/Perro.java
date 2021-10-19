package com.generation;

public class Perro {
    //un objeto es una instancia lo que sale de nuestro molde
    //METODO o molde
    //solo definición atributos de la clase
    //caracteristicas
    String nombre;
    String raza;
    int edad;
    String tamanio;

    //CONSTRUCTOR valores iniciales a los elementos
    //mas de una forma para inicializar un objeto
    //no se inicializa ningun tipo de valor
    //sirve para que cuando se cree le de ciertos valores
    //inicializa el objeto
    public Perro(){

    }
//si mando un parametro
    public Perro(String nombre){
        //this.nombre hace referencia al atributo de la clase
        this.nombre=nombre;
    }
    //si mando 2 parametros
    public Perro(String nombre, String raza){
        //this.nombre hace referencia al atributo de la clase
        this.nombre=nombre;
        this.raza= raza;
    }

    public Perro(int edad){
        //this.nombre hace referencia al atributo de la clase
        this.edad=edad;
    }

    //si mando 4 parametros
    public Perro (String nombre, String raza, int edad, String tamanio){
        this.nombre= nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    //con this llamamos al metodo llamamos a los atributos de la clase
    public void caracteristicas(){
        System.out.println("Hola, mi nombre es " + this.nombre+", soy de raza " + this.raza + " tengo " + this.edad + " años " + "soy de tamaño " + this.tamanio);
    }

    //clases operaciones que pueden realizar
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
