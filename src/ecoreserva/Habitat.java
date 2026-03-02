/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecoreserva;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mariayanezojeda
 */
public class Habitat{
    // atributos
    private String nombreHabitat;
    private String tipoAmbiente;
    private int capacidadMax;
    private List<Animal> animales;

    public Habitat(String nombreHabitat, int capacidadMax, String tipoAmbiente) {
        this.nombreHabitat = nombreHabitat;
        this.tipoAmbiente = tipoAmbiente;
        this.capacidadMax = capacidadMax;
        this.animales = new ArrayList<>();
    }
    
    
    /// metodos
    public void agregarAnimal(Animal animal) {
    if (animales.size() < capacidadMax) {
        animales.add(animal);
        System.out.println(animal.getNombre() + " agregado a " + nombreHabitat);
    } else {
        System.out.println("Habitat lleno, capacidad máxima: " + capacidadMax);
    }
    }
    
    
    
    ////// setters
    public void setNombreHabitat(String nombreHabitat) {
        this.nombreHabitat = nombreHabitat;
    }
    public void setTipoAmbiente(String tipoAmbiente) {
        this.tipoAmbiente = tipoAmbiente;
    }
    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }
    
    
    /// getters
    public String getNombreHabitat(){
        return nombreHabitat;
    }
    public String getTipoAmbiente(){
        return tipoAmbiente;
    }
    public int getCapacidadMax(){
        return capacidadMax;
    }
    public List<Animal> getAnimales(){
        return animales;
    }
    
    
    
    
    
    @Override
    public String toString() {
        return String.format("Habitat: %s | Ambiente: %s | Capacidad: %d | Animales: %d",
                          nombreHabitat, tipoAmbiente, capacidadMax, animales.size());
    }
    
    
}
