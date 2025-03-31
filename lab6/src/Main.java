import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Створення масиву типу Human
        Human[] people = new Human[4];

        // Заповнення масиву об’єктами похідних класів
        people[0] = new Student(1, "Іванов", "Іван", "Іванович", LocalDate.of(2000, 1, 1), "123-45-67",
                "Інформатика", 2, "ІН-21");
        people[1] = new Student(2, "Петров", "Петро", "Петрович", LocalDate.of(2001, 2, 2), "987-65-43",
                "Математика", 1, "МТ-11");
        people[2] = new Teacher(3, "Сидоренко", "Олег", "Петрович", "222-33-44", "Інформатика", "Доцент", 10);
        people[3] = new Teacher(4, "Коваленко", "Оксана", "Іванівна", "333-44-55", "Математика", "Професор", 15);

        // Виведення елементів масиву
        System.out.println("Список осіб:");
        for (Human person : people) {
            System.out.println(person);
        }
    }
}