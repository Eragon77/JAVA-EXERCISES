package package7;

/**
 * Un corso di laurea (per esempio, informatica), con nome e durata in anni.
 */
public class Corso {
   private String nome;
   private int durata;

    public Corso(String nome, int durata) {
        this.nome=nome;
        this.durata=durata;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    public String getNome(){
        return this.nome;
    }

    public int getDurata(){
        return this.durata;
    }
}
