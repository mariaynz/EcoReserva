/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecoreserva;

/**
 *
 * @author mariayanezojeda
 */
public class Ave extends Animal {
    // atributos de ave
    private String tipoPlumaje;
    private boolean puedeVolar;

    public Ave(String nombre, int edad, double peso, String especie, String genero, String tipoPlumaje, boolean puedeVolar) {
        super(nombre, edad, peso, especie, genero);
        this.tipoPlumaje = tipoPlumaje;
        this.puedeVolar = puedeVolar;
    }

    // metodos animal
    @Override
    public void alimentar() {
        System.out.println("i love dis food");
    }

    @Override
    public void emitirSonido() {
        System.out.println("chirp");
    }
    
    // getters
    public String getTipoPlumaje(){
        return tipoPlumaje;
    }
    public boolean isPuedeVolar(){
        return puedeVolar;
    }
}
