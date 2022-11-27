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

    }


    public static void printAll() {
        for (Employee storage : storage) {
            if (storage != null) {
                System.out.println(storage);
            }
        }
    }

    public static int salaryAll() {
        int theAmount = 0;
        for (Employee storage : storage) {
            if (storage != null) {
                theAmount = theAmount + storage.getSalary();
            }
        }
        return theAmount;
    }

    public static Employee minimumWage() {
        int min = Integer.MAX_VALUE;
        for (Employee storage : storage) {
            if (min<storage.getSalary()) {

            }
        }
    }
}
    }


    /*public static void 11111111()

    {
        int enumeration = 0;
        for (int i = 0; i < storage.length; i++) {
            if (storage != null) {
                enumeration++;
            }
        }
        if (enumeration != 0) {
            return (double) get;
        }
    }*/
            }