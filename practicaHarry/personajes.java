package practicaHarry;

public class Harry Potter {
    public static void main(String[] args) {
        harry();
        hermione();
        ron();
        dumbledore();
        luna();
    }

    private static void harry() {
        Personaje harry = new Personaje();
        hermione.setNombre("Harry Potter");
        hermione.setGenero("Masculino");
        hermione.setCasa("Gryffindor");
        hermione.setBoggart("Dementor");
        hermione.setPatronus("Ciervo");
        System.out.println(harry.showMessage());
        System.out.println("--------------");
    }

    private static void hermione() {
        Personaje hermione = new Personaje();
        hermione.setNombre("Hermione Granger");
        hermione.setGenero("Femenino");
        hermione.setCasa("Gryffindor");
        hermione.setBoggart("Fracaso");
        hermione.setPatronus("Nutria");
        System.out.println(hermione.showMessage());
        System.out.println("--------------");
    }

    private static void ron() {
        Personaje ron = new Personaje();
        hermione.setNombre("Ronald Weasley");
        hermione.setGenero("Masculino");
        hermione.setCasa("Gryffindor");
        hermione.setBoggart("Acromántula");
        hermione.setPatronus("Jack Russell Terrier");
        System.out.println(ron.showMessage());
        System.out.println("--------------"); 
    }

    private static void dumbledore() {
        Personaje dumbledore = new Personaje();
        draco.setNombre("Albus Dumbledore");
        draco.setGenero("Masculino");
        draco.setCasa("Gryffindor");
        draco.setBoggart("Ariana");
        draco.setPatronus("Fénix");
        System.out.println(dumbledore.showMessage());
        System.out.println("--------------");
    }

    private static void luna() {
        Personaje luna = new Personaje();
        draco.setNombre("Luna Lovegood");
        draco.setGenero("Femenino");
        draco.setCasa("Ravenclaw");
        draco.setBoggart("Desconocido");
        draco.setPatronus("Liebre");
        System.out.println(luna.showMessage());
        System.out.println("--------------");
    }
}
