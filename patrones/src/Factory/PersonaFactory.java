package Factory;

class PersonaFactory {
    public static Persona getPersona(String tipo) {
        if (tipo.equalsIgnoreCase("A")) {
            return new PersonaA();
        } else if (tipo.equalsIgnoreCase("B")) {
            return new PersonaB();
        }
        return null;
    }
}