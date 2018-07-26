package patrones.creational;

import java.util.*;

/**
 * 
 */
public abstract class MenuBuilder {

    /**
     * Default constructor
     */
    public MenuBuilder() {
    }

    /**
     * 
     */
    protected MenuOpciones m;


    /**
     * @return
     */
    public MenuOpciones getMenu() {
        // TODO implement here
        return null;
    }

    /**
     * 
     */
    public abstract void definirMenu();

    /**
     * 
     */
    public abstract void construirMenu();

}