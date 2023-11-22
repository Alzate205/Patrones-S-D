package singleton;

public class MainSingleton {
    public static void main(String[] args) {
        Personal producto = Personal.getInstance();

        producto.setNombre("Andres");
        producto.setEdad(50);

        System.out.println(producto.getNombre());
        System.out.println(producto.getEdad());
    }
}