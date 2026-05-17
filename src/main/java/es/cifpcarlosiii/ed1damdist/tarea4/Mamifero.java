package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Clase que representa un mamífero dentro del reino animal.
 * Hereda de Animal y modifica algunos comportamientos generales.
 */
public class Mamifero extends Animal {

    public Mamifero(String nombre) {
        super(nombre);
    }

    /**
     * Define la reproducción de los mamíferos (vivípara).
     */
    @Override
    void reproducir() {
        System.out.println("La reproduccion es vivipara");
    }

    /**
     * Relación entre mamíferos.
     * @param m animal con el que se relaciona
     */
    @Override
    void relacionar(Animal m) {
        System.out.println("Con el mamifero: " + m.getNombre());
    }
}