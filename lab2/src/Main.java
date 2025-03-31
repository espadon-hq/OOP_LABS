import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
public class Main {
    private static Student[] students = new Student[5];
    public static void main(String[] args) {
        // Заповнення масиву тестовими даними
        students[0] = new Student(1, "Іванов", "Іван", "Іванович", LocalDate.of(2000, 1, 1), "123-45-67",
                "Інформатика", 2, "ІН-21");
        students[1] = new Student(2, "Петров", "Петро", "Петрович", LocalDate.of(2001, 2, 2), "987-65-43",
                "Математика", 1, "МТ-11");
        students[2] = new Student(3, "Сидорова", "Олена", "Сидорівна", LocalDate.of(2000, 3, 3), "555-55-55", "Інформатика", 2, "ІН-22");

        students[3] = new Student(4, "Козлов", "Олег", "Козлович", LocalDate.of(1999, 4, 4), "111-22-33",
                        "Фізика", 3, "ФЗ-31");
        students[4] = new Student(5, "Андрєєва", "Анна", "Андріївна", LocalDate.of(2001, 5, 5), "444-55-66",
                "Математика", 1, "МТ-12");
        // Виведення всіх студентів
        System.out.println("Список всіх студентів:");
        printAllStudents();
        // Виведення студентів заданого факультету
        System.out.println("\nСписок студентів факультету Інформатика:");
        printStudentsByFaculty("Інформатика");
        // Виведення студентів, які народились після заданого року
        System.out.println("\nСписок студентів, які народились після 2000 року:");
        printStudentsBornAfterYear(2000);
        // Виведення студентів заданої групи
        System.out.println("\nСписок студентів групи ІН-21:");
        printStudentsByGroup("ІН-21");
    }
    public static void printAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public static void printStudentsByFaculty(String faculty) {
        for (Student student : students) {
            if (student.getFaculty().equals(faculty)) {
                System.out.println(student);
            }
        }
    }
    public static void printStudentsBornAfterYear(int year) {
        for (Student student : students) {
            if (student.getBirthDate().getYear() > year) {
                System.out.println(student);
            }
        }
    }
    public static void printStudentsByGroup(String group) {
        for (Student student : students) {
            if (student.getGroup().equals(group)) {
                System.out.println(student);
            }
        }
    }
}
