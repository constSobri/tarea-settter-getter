public class Main {
    public static void main(String[] args) {
        Persona carlos = new Persona();
        carlos.setNombre("Carlos Sanchez");
        System.out.println(carlos.getNombre());
        carlos.setEdad("20");
        System.out.println(carlos.getEdad());
        carlos.setTelefono("5551114444");
        System.out.println(carlos.getTelefono());
    }
}

class Persona {
    private String edad;
    private String nombre;
    private String telefono;

    public void setEdad (String edad) {
        this.edad = edad;
    }
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono (String telefono) {
        this.telefono = telefono;
    }
    public String getEdad () {
        return this.edad;
    }
    public String getNombre () {
        return this.nombre;
    }
    public String getTelefono () {
        return this.telefono;
    }
}