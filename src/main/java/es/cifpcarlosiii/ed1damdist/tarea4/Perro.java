package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Clase que representa un perro dentro del reino animal.
 * Añade comportamientos específicos como ladrar y gruñir.
 */
public class Perro extends Mamifero {

    public Perro(String nombre) {
        super(nombre);
    }

    /**
     * Simula el comportamiento de dormir del perro.
     */
    @Override
    void dormir() {
        System.out.println("El perro debe dormir en funcion del ejericio que realiza");
    }

    /**
     * Simula el ladrido del perro.
     */
    void ladrar() {
        System.out.println("Es una labor social de guarda");
    }

    /**
     * Simula el gruñido del perro.
     */
    void gruñir() {
        System.out.println("Es un sonido ronco y sostenido");
    }

    /**
     * Relación del perro con otro animal.
     * @param p animal con el que se relaciona
     */
    @Override
    void relacionar(Animal p) {
        System.out.println("Con el perro: " + p.getNombre());
    }
}