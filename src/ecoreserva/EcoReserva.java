/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecoreserva;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author mariayanezojeda
 */
public class EcoReserva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // añadir lista de animales
        List<Animal> animales = new ArrayList<>();
        animales.add(new Mamifero("Chanel", 2, 2.34, "Cat", "hembra", "Pelaje corto"));
        animales.add(new Ave("Coco", 1, .045, "Colibrí", "hembra", "iridiscencia", true)); 
        
        // reserva
        ReservaNatural reserva = new ReservaNatural("EcoReserva", "Mexico");
        // composicion de la reserva
        reserva.crearHabitat("Sabana", 10, "Tropical");
        reserva.crearHabitat("Lago", 5, "Acuático");
        // agregacion de la reserva
        Veterinario vet1 = new Veterinario("María", "Cetáceos", 9);
        Veterinario vet2 = new Veterinario("Andrés", "Aves", 3);
        reserva.agregarVeterinario(vet1);
        reserva.agregarVeterinario(vet2);
        
        
        for(Animal a : animales) {
        System.out.println("\n" + a.toString());
        a.alimentar();
        a.emitirSonido();
    }
    
        // INTERFAZ IVacunar
        System.out.println("\n=== VACUNACIÓN ===");
        for(Animal a : animales) {
            if(a instanceof IVacunar) {
                ((IVacunar) a).aplicarVacuna("Obligatoria");
            }
        }
        
            //  RESERVA
            System.out.println("\n=== RESERVA ===");
            System.out.println(reserva.toString());
            
    
            // vets
            System.out.println("\n=== VETERINARIOS ===");
            for(Veterinario v : reserva.getVeterinarios()) {
            System.out.println(v.toString());
        }
            System.out.println("\n=== HABITATS ===");
            for(Habitat h : reserva.getHabitats()) {
                System.out.println(h.toString());
        }
    }
}
