package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Clase que representa un gato dentro del reino animal.
 * Hereda de Mamifero y añade el atributo pelos.
 */
public class Gato extends Mamifero {

    /**
     * Número de pelos del gato.
     */
    private int pelos;

    public Gato(String nombre) {
        super(nombre);
    }

    /**
     * Simula el comportamiento de dormir del gato.
     */
    @Override
    void dormir() {
        System.out.println("El gato se pasa todo el día durmiendo");
    }

    /**
     * Simula el maullido del gato.
     */
    void maullar() {
        System.out.println("Es lo que hacen los gatos");
    }

    /**
     * Relación del gato con otro animal.
     * @param p animal con el que se relaciona
     */
    @Override
    void relacionar(Animal p) {
        System.out.println("Con el gato: " + p.getNombre());
    }

    public int getPelos() {
        return pelos;
    }

    public void setPelos(int pelos) {
        this.pelos = pelos;
    }
}