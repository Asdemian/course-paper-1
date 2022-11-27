public class Employee {

    private final String name;
    private final String lastname;
    private final String patronymic;

    private int department;

    private int salary;

    private static int counter = 1;
    private final int id;

    public Employee(String name, String lastname, String patronymic, int department, int salary) {
        this.name = name;
        this.lastname = lastname;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
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

    @Override
    public String toString() {
        return "№"+id+" ФИО: "+name+" "+lastname+" "+patronymic+" отдел №"+department+" Зарплата: "+salary+ "р.";
    }
}
