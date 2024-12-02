package package5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private List<Person> employees;

    public Employees(){
        this.employees=new ArrayList<>();
    }

    public void add(Person personToAdd){
        employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd){
        peopleToAdd.stream().forEach(person->employees.add(person));
    }

    public void print(){
        employees.stream().forEach(System.out::println);
    }

    public void print (Education education){

        for (Person toEvaluate : employees) {
            if (toEvaluate.getEducation().equals(education))
                System.out.println(toEvaluate);
        }
    }

    public void fire(Education education){
        Iterator<Person> iteratore=employees.iterator();

        while(iteratore.hasNext()){
            Person toEvaluate=iteratore.next();
            if(toEvaluate.getEducation().equals(education))
                employees.remove(toEvaluate);
        }
    }

}
