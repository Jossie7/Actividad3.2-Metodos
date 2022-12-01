package src;
public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;

    private String EsMayorDeEdad;
    private String EsMenorDeEdad;


    Persona() {
        nombre="Anónimo";
    }
    Persona(String nombre, String apellido1){
        this.nombre=nombre;
        this.apellido1=apellido1;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2(){
        return apellido2;

    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void EsMayorDeEdad(){
        if(edad<18){
            System.out.println("Es menor de edad");
        } else{
            System.out.println("Es mayor de edad");
        }
     }
    public void NombreCompleto(){
        System.out.println(getNombre() + getApellido1() + getApellido2());
 }
    public void MostrarIniciales(){
        System.out.println(nombre.charAt(0) + " " + apellido1.charAt(0) + " " + apellido2.charAt(0));
    }


}

