package src;

import javax.sound.midi.Soundbank;

public class MainPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona("Fran", "Gómez");
        Persona persona4 = new Persona("Jossie", "Yovera");

        System.out.println("Persona1");
        persona1.setNombre("Francisco");
        System.out.println("Nombre:" + persona1.getNombre());
        persona1.setApellido1("Gomez");
        persona1.setApellido2("Jojo");
        persona1.setEdad(23);
        System.out.println("Edad:" + persona1.getEdad());

        System.out.println("Persona2");
        persona2.setNombre("Jossie");
        System.out.println("Nombre: " + persona2.getNombre());
        persona2.setEdad(17);
        System.out.println("Edad:" + persona2.getEdad());
        System.out.println("Es menor o mayor de edad?:");
        persona2.EsMayorDeEdad();

        persona1.NombreCompleto();
        persona1.MostrarIniciales();


    }
}

