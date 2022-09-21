package lesson3;

public class Employee {
    private String username;
    private String position;
    private String email;
    private String telephone;
    private int compensation;
    private int age;

    public Employee(String username, String position, String email, String telephone, int compensation, int age){
        this.username = username;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.compensation = compensation;
        this.age = age;
    }

    public static void main(String[] args){
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Jack Jones", "Engineer", "jj@gmail.com", "0504545656", 30000, 50);
        employeeArray[1] = new Employee("Candy Jones", "HR", "cj@gmail.com", "050454086", 35000, 52);
        employeeArray[2] = new Employee("Anna Frank", "Developer", "af@mgmail.com", "0674521656", 29000, 37);
        employeeArray[3] = new Employee("Will Smith", "PM", "ws@mgmail.com", "0444540056", 40000, 21);
        employeeArray[4] = new Employee("Toad Green", "CEO", "tg@mgmail.com", "0372545611", 130000, 25);

        employeeInfoDisplay(employeeArray[4]);
        employeesOlderThanForty(employeeArray);
    }
    public static void employeeInfoDisplay(Employee someone){
        String newLine = System.getProperty("line.separator");
        System.out.println(someone.username + newLine + someone.position + newLine + someone.email + newLine + someone.telephone + newLine + someone.compensation + newLine + someone.age);
    }
    public static void employeesOlderThanForty(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age > 40) {
                employeeInfoDisplay(employees[i]);
            }
        }
    }
}
