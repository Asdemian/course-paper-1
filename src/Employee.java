public class Employee {

    private String name;
    private String lastname;
    private String patronymic;

    private int department;

    private int salary;

    private int id;

    public Employee(String name, String lastname, String patronymic, int department, int salary) {
        this.name = name;
        this.lastname = lastname;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
