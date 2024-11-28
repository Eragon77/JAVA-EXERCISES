package package1;

public class CD implements Packable {
    private String artist;
    private String name;
    private int publicationYear;
    private static final double WEIGHT=0.1;

    public CD(String artist, String name, int publicationYear){
        this.artist=artist;
        this.name=name;
        this.publicationYear=publicationYear;
    }

    public double weight(){
        return WEIGHT;
    }
}
