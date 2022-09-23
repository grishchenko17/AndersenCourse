package course.lesson3;

public class Employees {
    public static void main(String[] args) {
        showEmployee();

    }

    private String name;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public Employees(String name, String position, String email, int phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
@Override
    public String toString() {
        return ("Employee name: " + name + "\n" +
                "Position: " + position + "\n" +
                "Email: " + email + "\n" +
                "Phone number: " + phone + "\n" +
                "Salary: " + salary + "\n" +
                "Age: " + age);

    }

        public static void showEmployee() {
        Employees[] employeeArray = new Employees[5];
        employeeArray[0] = new Employees("Severus Snape", "Project Manager", "snapesev@gmail.com", 539678546, 1500, 43);
        employeeArray[1] = new Employees("Hermione Granger", "HR manager", "grangerh@gmail.com", 434545675, 1850, 21);
        employeeArray[2] = new Employees("Albus Dumbledore", "Director", "dumbledore@gmail.com", 455455875, 5500, 60);
        employeeArray[3] = new Employees("Harry Potter", "Developer", "potter@gmail.com", 909902275, 3500, 45);
        employeeArray[4] = new Employees("Ronald Weasley", "QA engineer", "weasleyronald@gmail.com", 434545675, 2000, 33);
        for (Employees employees : employeeArray) {
            if (employees.getAge() > 40) {

                System.out.println(employees);

            }
        }
    }
}





