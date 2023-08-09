import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        // my list of peeps
        List<Person> listOfPeople = new ArrayList<>();
        listOfPeople.add(new Person("Joe Huntenburg", LocalDate.of(2010, Month.APRIL, 24),
                Person.Sex.MALE, "himynameisjoehuntenburg@pain.com"));
        listOfPeople.add(new Person("Minsoo Jo", LocalDate.of(2023, Month.AUGUST, 8),
                Person.Sex.MALE, "bestchef@chef.com"));
        listOfPeople.add(new Person());
        listOfPeople.add(new Person("Maggie Snyder", LocalDate.of(2010, Month.DECEMBER, 25),
                Person.Sex.FEMALE, "merrybirthday@christmas.com"));
        listOfPeople.add(new Person("Angela Kim", LocalDate.of(2023, Month.FEBRUARY, 14),
                Person.Sex.FEMALE, "nachos@omnom.com"));
        listOfPeople.add(new Person());

        printing(listOfPeople, new CheckPersonConcrete());

        //ANONYMOUS CLASS TIME
        CheckPerson checkPersonAnonymous = new CheckPerson(){
            public boolean test(Person p){
                return true;
            }
        };
        printing(listOfPeople, checkPersonAnonymous);
    }

    private static void printing(List<Person> people, CheckPerson tester){
        //format things nicely
        System.out.println();
        Person.printPersons(people, tester);
    }
}
