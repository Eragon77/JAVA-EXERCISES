package package4;

public class Student implements Comparable<Student>{
    private String name;

    public Student(String name){
        this.name=name;
    }

    @Override
    public String toString(){
        return "Student: "+this.name;
    }

    @Override
    public int compareTo(Student other){
        return this.name.compareTo(other.name);
    }
}
