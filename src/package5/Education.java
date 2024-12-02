package package5;

public enum Education {
    PHD("Doctoral Degree"),
    MA("Master's Degree"),
    BA("Bachelors Degree"),
    HS("High School Diploma");

    private String type;

    private Education(String type){
        this.type=type;
    }

    public String getType(){
        return this.type;
    }

}
