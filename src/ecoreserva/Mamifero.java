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
public  class Mamifero extends Animal implements IVacunar{
    /// Atributos de mamiferos
    private String tipoPelaje;
    private List<String> vacunas;

    public Mamifero(String nombre, int edad, double peso, String especie, String genero, String tipoPelaje) {
        super(nombre, edad, peso, especie, genero);
        this.tipoPelaje = tipoPelaje;
        this.vacunas = new ArrayList<>();
    }
    
    
    /// metodos de animal
    @Override
    public void alimentar() {
        System.out.println("EAT yummy");
    }

    @Override
    public void emitirSonido() {
        System.out.println("meaow");
    }
    
    // getter
    public String getTipoPelaje(){
        return tipoPelaje;
    }
    public List<String> getVacunas() {
        return vacunas;
    }
    
    //// interfaz
    @Override
    public void aplicarVacuna(String tipoVacuna) {
        vacunas.add(tipoVacuna);
    System.out.println("Vacuna " + tipoVacuna + " aplicada a " + getNombre());
    }

    
    
    
    
}
