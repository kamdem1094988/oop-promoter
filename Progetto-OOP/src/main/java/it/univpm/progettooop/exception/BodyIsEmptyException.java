package it.univpm.progettooop.exception;

/**
 * <b>Eccezione</b> thi is exception
 * @author kamdem defo patrice
 * @author 

 */
public class BodyIsEmptyException extends Exception{
	private static final long serialVersionUID = 1L;

	/**
     * <b>Costruttore</b>
     */
    public BodyIsEmptyException() {
        super("Il body del post non contiene nulla");
    }
}
