package it.univpm.progettooop.exception;

/**
 * <b>Eccezione</b> che avvisa quando non sono presenti
 * @author kamdem defo patrice 
 */
public class NoDataException extends Exception{

    /**
     * <b>Costruttore</b>
     */
    public NoDataException() {
        super("ERRORE: IL PROGRAMMA NON HA ALCUN DATO DA ELABORARE");
    }
}