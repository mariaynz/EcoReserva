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
public class ReservaNatural {
    private String nombreReserva;
    private String ubicacionReserva;
    private List<Habitat> habitats;        // composición
    private List<Veterinario> veterinarios;  //agregacion
    
    public ReservaNatural(String nombreReserva, String ubicacionReserva) {
        this.nombreReserva = nombreReserva;
        this.ubicacionReserva = ubicacionReserva;
        this.habitats = new ArrayList<>();      
        this.veterinarios = new ArrayList<>();  
    }
    /// metodos
    public void agregarVeterinario(Veterinario veterinario) {
        veterinarios.add(veterinario); 
    }
    
    public void crearHabitat(String nombre, int capacidad, String tipo) {
        Habitat h = new Habitat(nombre, capacidad, tipo); 
        habitats.add(h);
    }
    // getters
    public String getNombre() { return nombreReserva; }
    public String getUbicacion() { return ubicacionReserva; }
    public List<Habitat> getHabitats() { return habitats; }
    public List<Veterinario> getVeterinarios() { return veterinarios; }
    
    @Override
    public String toString() {
        return String.format("Reserva: %s | Ubicación: %s | Habitats: %d | Veterinarios: %d",
                nombreReserva, ubicacionReserva, habitats.size(), veterinarios.size());
    }
    
    
}
