package Practico9;

public interface Identificable<K> {
    K getID();
    boolean tieneMismoID(K id);
}
