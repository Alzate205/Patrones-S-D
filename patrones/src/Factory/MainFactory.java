package Factory;

import java.util.Objects;

public class MainFactory {
    public static void main(String[] args) {
        Persona p1 = PersonaFactory.getPersona("A");
        Objects.requireNonNull(p1).mostrarInfo();
        Persona p2 = PersonaFactory.getPersona("B");
        Objects.requireNonNull(p2).mostrarInfo();
    }
}
