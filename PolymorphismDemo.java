public class PolymorphismDemo {

    public static void main(String args[]) {
        Person softwareEngineer = new Engineer();
        Person teacher = new Teacher();
        Teacher teacher1 = new Teacher();
        Engineer softwareEngineer1 = new Engineer();

        System.out.println(softwareEngineer.profession());
        System.out.println(teacher.profession());
        System.out.println(teacher1.profession());
        System.out.println(softwareEngineer1.profession());
    }
}
