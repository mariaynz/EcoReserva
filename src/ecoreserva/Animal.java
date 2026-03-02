/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecoreserva;


public abstract class Animal {
    // atributos
    private String nombre;
    private int edad;
    private double peso;
    private String especie;
    private String genero;
    
    // constructor
    public Animal(String nombre, int edad, double peso, String especie, String genero){
        setNombre(nombre);
        setEdad(edad);
        setPeso(peso);
        setEspecie(especie);
        setGenero(genero);
             
    }
    //// metodos abstractos
    public abstract void  alimentar();
    public abstract void  emitirSonido();

     ///// setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if(edad < 0){
            System.out.println("Edad no válida");
        } else this.edad = edad;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setPeso(double peso) {
       if(peso < 0){
            System.out.println("peso no válido");
        }  else this.peso = peso;
    }

    public void setGenero(String genero) {
         if(genero.equalsIgnoreCase("macho") || genero.equalsIgnoreCase("hembra")) {
        this.genero = genero;
    } else {
        System.out.println("Género no válido. Use: macho o hembra");
    }
    }
   
    
    /// getters
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getGenero(){
        return genero;
    }
    public double getPeso(){
        return peso;
    }
    public String getEspecie(){
        return especie;
    }
    
    @Override
    public String toString(){
        return String.format("Nombre: %s | Edad: %d | Peso: %.3fkg | Especie: %s | Género: %s",
                          nombre, edad, peso, especie, genero);
        
    }
    
}
