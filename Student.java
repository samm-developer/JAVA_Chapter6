public class Student {
    public static void main(String args[]) {
        Employee empObject = new Employee();
        empObject.empId = 10;
        modify(empObject);
        System.out.println(empObject.empId);
    }
    private static void modify(Employee employee) {
        employee.empId = 20;
    }
}