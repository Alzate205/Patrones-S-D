package singleton;

public class Personal {
    private static Personal instance;
    private String nombre;
    private int edad;
    private Personal() {}

    public static Personal getInstance() {
        if(instance == null) {
            instance = new Personal();
        }
        return instance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
