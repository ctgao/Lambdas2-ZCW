import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.List;

public class Person{
    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    // constructor
    public Person(){
        this("name", null, null, null);
    }
    public Person(String name, LocalDate birthday, Sex gender, String emailAddress){
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public void setBirthday(int year, Month month, int dayOfMonth){
        birthday = LocalDate.of(year, month, dayOfMonth);
    }

    public void setGender(Sex gender){
        this.gender = gender;
    }
    public Sex getGender(){
        return this.gender;
    }

    public int getAge() {
        if(birthday == null){
            return -1;
        }
        // get the current time?
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthday, currentDate).getYears();
    }

    public void printPerson(){
        // this will do stuff later
        String output = "%s is %d years old. They are a %s. Find them at %s\n";
        System.out.format(output, name, getAge(), gender, emailAddress);
    }

    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }
}
