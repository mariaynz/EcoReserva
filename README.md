```mermaid
classDiagram
    class Animal {
        <<abstract>>
        -String nombre
        -int edad
        -double peso
        -String especie
        -String genero
        +getNombre() String
        +getEdad() int
        +getPeso() double
        +getEspecie() String
        +getGenero() String
        +setNombre(String)
        +setEdad(int)
        +setPeso(double)
        +setEspecie(String)
        +setGenero(String)
        +alimentar()* void
        +emitirSonido()* void
        +toString() String
    }

    class IVacunar {
        <<interface>>
        +aplicarVacuna(String)* void
    }

    class Mamifero {
        -String tipoPelaje
        -List~String~ vacunas
        +getTipoPelaje() String
        +getVacunas() List
        +alimentar() void
        +emitirSonido() void
        +aplicarVacuna(String) void
    }

    class Ave {
        -String tipoPlumaje
        -boolean puedeVolar
        +getTipoPlumaje() String
        +isPuedeVolar() boolean
        +alimentar() void
        +emitirSonido() void
    }

    class Habitat {
        -String nombreHabitat
        -String tipoAmbiente
        -int capacidadMax
        -List~Animal~ animales
        +agregarAnimal(Animal) void
        +getNombreHabitat() String
        +getTipoAmbiente() String
        +getCapacidadMax() int
        +getAnimales() List
        +toString() String
    }

    class Veterinario {
        -String nombreVet
        -String especialidad
        -int expYears
        +getNombreVet() String
        +getEspecialidad() String
        +getExpYears() int
        +setNombreVet(String)
        +setEspecialidad(String)
        +setExpYears(int)
        +toString() String
    }

    class ReservaNatural {
        -String nombreReserva
        -String ubicacionReserva
        -List~Habitat~ habitats
        -List~Veterinario~ veterinarios
        +crearHabitat(String, int, String) void
        +agregarVeterinario(Veterinario) void
        +getNombre() String
        +getUbicacion() String
        +getHabitats() List
        +getVeterinarios() List
        +toString() String
    }

    Animal <|-- Mamifero : herencia
    Animal <|-- Ave : herencia
    IVacunar <|.. Mamifero : implementa
    ReservaNatural *-- Habitat : composición
    ReservaNatural o-- Veterinario : agregación
