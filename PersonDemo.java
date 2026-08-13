public class PersonDemo {
    public static void main(String[] args) {
        Person teacher = new Teacher();
        Person engineer = new Engineer();

        System.out.println(teacher.profession());
        System.out.println(engineer.profession());
    }
}
