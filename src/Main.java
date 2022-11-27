import java.util.Arrays;

public class Main {

    public static Employee[] storage = new Employee[10];

    public static void main(String[] args) {

        storage[0] = new Employee("Прохор", "Шаляпин", "Андреевич", 1, 25348);
        storage[1] = new Employee("Сергей", "Ломыкин", "Станиславович", 1, 15750);
        storage[2] = new Employee("Галина", "Павлова", "Емельяновна", 2, 55358);
        storage[3] = new Employee("Андрей", "Каменский", "Васильевич", 2, 35753);
        storage[4] = new Employee("Илья", "Кузеев", "Дмитриевич", 2, 45781);
        storage[5] = new Employee("Поликарп", "Демин", "Андреевич", 3, 38411);
        storage[6] = new Employee("Иван", "Стальченков", "Кузмич", 3, 65325);
        storage[7] = new Employee("Павел", "Шаляпин", "Андреевич", 4, 36453);
        storage[8] = new Employee("Николай", "Потапенко", "Дмитриевич", 4, 38911);
        storage[9] = new Employee("Ксения", "Казинская", "Васильевна", 5, 75350);

        printAll();
        System.out.println("Сумма ЗП всех сотрудников составляет: " + salaryAll() + "р.");
        Employee employeeMinSalary = minimumWage();
        System.out.println("Сотрудник с минимальной ЗП: " + employeeMinSalary);
        Employee employeeMaxSalary = maximumWage();
        System.out.println("Сотрудник с максимальной ЗП: " + employeeMaxSalary);
        System.out.println("Средняя ЗП составляет: " + averageSalary() + "р.");

    }


    private static void printAll() {
        for (Employee storage : storage) {
            if (storage != null) {
                System.out.println(storage);
            }
        }
    }

    private static int salaryAll() {
        int theAmount = 0;
        for (Employee storage : storage) {
            if (storage != null) {
                theAmount = theAmount + storage.getSalary();
            }
        }
        return theAmount;
    }

    private static Employee minimumWage() {
        int min = Integer.MAX_VALUE;
        Employee employeeMinSalary = null;
        for (Employee storage : storage) {
            if (storage != null && min > storage.getSalary()) {
                min = storage.getSalary();
                employeeMinSalary = storage;
            }
        }
        return employeeMinSalary;
    }

    private static Employee maximumWage() {
        int max = Integer.MIN_VALUE;
        Employee employeeMaxSalary = null;
        for (Employee storage : storage) {
            if (storage != null && max < storage.getSalary()) {
                max = storage.getSalary();
                employeeMaxSalary = storage;
            }
        }
        return employeeMaxSalary;
    }

    private static double averageSalary() {
        int counter = 0;
        for (Employee storage : storage) {
            if (storage != null) {
                counter++;
            }
        }
        if (counter != 0) {
            return salaryAll() / counter;
        }
        return 0;
    }
}