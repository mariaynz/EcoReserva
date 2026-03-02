/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecoreserva;

/**
 *
 * @author mariayanezojeda
 */
public class Veterinario {
    private String nombreVet;
    private String especialidad;
    private int expYears;
    
    public Veterinario(String nombreVet, String especialidad, int expYears){
        this.especialidad = especialidad;
        this.nombreVet = nombreVet;
        this.expYears = expYears;
    }
    
   // getters
    public String getNombreVet() { 
        return nombreVet; 
    }
    public String getEspecialidad() { 
        return especialidad; 
    }
    public int getExpYears() { 
        return expYears; 
    }

        // SETTERS
    public void setNombreVet(String nombreVet) { 
        this.nombreVet = nombreVet; 
    }
    public void setEspecialidad(String especialidad) { 
        this.especialidad = especialidad; 
    }
    public void setExpYears(int expYears) {
        if(expYears < 0) {
            System.out.println("Años de experiencia no válidos");
        } else this.expYears = expYears;
        
    }
    @Override
    public String toString() {
        return String.format("Dr. %s | Especialidad: %s | Experiencia: %d años",
                          nombreVet, especialidad, expYears);
}
}
