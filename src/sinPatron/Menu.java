package sinPatron;

import java.util.*;

/**
 * 
 */
public class Menu extends MenuDecorator implements MenuOpciones {

    /**
     * Default constructor
     */
    public Menu() {
    }


    /**
     * @param i
     */
    public void Menu(MenuOpciones i) {
        // TODO implement here
    }

    /**
     * @param op 
     * @return
     */
    public abstract Str ejecutarOpcion(int op);

    /**
     * @return
     */
    public void MostrarOpciones() {
        // TODO implement here
        return null;
    }

}