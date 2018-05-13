/**
 * Created by 12 on 13.05.2018.
 */
public class Person {

    private final boolean man;

    private final String name;

    private Person spouse;

    public Person (boolean man, String name){
        this.man = man;
        this.name = name;
    }

    public boolean isMan(){
        return man;
    }

    public void setSpouse (Person spouse) {
        this.spouse = spouse;
    }

    public boolean Marry (Person person){

        if (this.man != person.man && this.spouse != person){
            this.divorce();
            person.divorce();
            this.spouse = person;
            person.spouse = this;
            return true;
        }
        return false;
    }

    public boolean divorce(){
        if (this.spouse != null) {
            this.spouse = null;
            return true;
        }
        return false;
    }

    public String getName(){
        return name;
    }

    public Person getSpouse(){
        return spouse;
    }

}
