public class CheckPersonConcrete implements CheckPerson{
    @Override
    public boolean test(Person p) {
        // check for age and check for gender
        return (p.getAge() != -1 || p.getGender() != null);
//        return !(p.getAge() == -1 && p.getGender() == null);
    }
}
