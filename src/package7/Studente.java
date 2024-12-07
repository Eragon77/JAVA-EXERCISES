package package7;

import javax.naming.ServiceUnavailableException;
import java.time.Year;
import java.util.Objects;
import java.util.Scanner;

/**
 * Uno studente, che si puo' iscrivere agli esami di un corso di laurea.
 */
public class Studente implements Comparable<Studente> {
    private String nome;
    private String cognome;
    private int matricola;
    private int annoDiImmatricolazione;

    /**
     * Crea uno studente con il nome, cognome, matricola e anno di immatricolazione indicati.
     *
     * @throws StudenteIllegaleException se l'anno di immatricolazione è nel futuro
     *                                   o se la matricola è negativa
     */
    public Studente(String nome, String cognome, int matricola, int annoDiImmatricolazione) throws StudenteIllegaleException {
        int currentYear=Year.now().getValue();
        if(annoDiImmatricolazione>currentYear)
            throw new StudenteIllegaleException("Inserisci un anno di immatricolazione valido");
        else if(matricola<0)
            throw new StudenteIllegaleException("Inserisci un numero di matricola non negativo");

        this.annoDiImmatricolazione=annoDiImmatricolazione;
        this.nome=nome;
        this.cognome=cognome;
        this.matricola=matricola;
    }

    /**
     * Legge da tastiera i dati di uno studente, lo crea e lo restituisce.
     * Già fatto, non modificate.
     *
     * @throws StudenteIllegaleException se i dati letti sono illegali
     */
    public static Studente leggiDaTastiera(Scanner keyboard) throws StudenteIllegaleException {
        System.out.print("Nome: ");
        String nome = keyboard.nextLine();
        System.out.print("Cognome: ");
        String cognome = keyboard.nextLine();
        System.out.print("Matricola: ");
        int matricola = keyboard.nextInt(); keyboard.nextLine();
        System.out.print("Anno di immatricolazione: ");
        int annoDiImmatricolazione = keyboard.nextInt(); keyboard.nextLine();

        return new Studente(nome, cognome, matricola, annoDiImmatricolazione);
    }

    /**
     * Due studenti sono uguali se e solo se hanno la stessa matricola.
     */
    @Override
    public boolean equals(Object other) {
        if(!(other instanceof Studente))
            return false;

        Studente otherAsStudente=(Studente) other;

        return this.matricola==otherAsStudente.matricola;
    }

    /**
     * Deve essere non banale e compatibile con equals.
     */
    @Override
    public int hashCode() {
        return this.matricola;
    }

    /**
     * Determina chi viene prima (per matricola) tra this e other.
     */
    @Override
    public int compareTo(Studente other) {
        Studente otherAsStudente=(Studente) other;
        return Integer.compare(this.matricola,otherAsStudente.matricola);

    }

    @Override
    public String toString() {
        // restituisce una stringa del tipo "34555 Giulio Andreotti immatricolato nel 2017"
        return this.matricola+" "+this.nome+" "+this.cognome+" immatricolato nel "+this.annoDiImmatricolazione;
        // completare
    }

    /**
     * Determina se questo studente e' fuori corso rispetto al corso di laurea indicato:
     * ovvero se si e' immatricolato prima della durata del corso di laurea.
     */
    public boolean fuoriCorso(Corso corso) {
        int currentYear= Year.now().getValue();
        return currentYear-corso.getDurata()>this.annoDiImmatricolazione;
    }

    // aggiungete i metodi accessori pubblici getAnnoDiImmatricolazione() e getMatricola()

    public int getAnnoDiImmatricolazione() {
        return annoDiImmatricolazione;
    }

    public int getMatricola() {
        return matricola;
    }
}
