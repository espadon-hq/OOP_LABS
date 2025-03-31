import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    private static final Student[] students = new Student[5];

    public static void main(String[] args) {
        // Original test data
        students[0] = new Student(1, "Іванов", "Іван", "Іванович", LocalDate.of(2000, 1, 1), "123-45-67",
                "Інформатика", 2, "ІН-21");
        students[1] = new Student(2, "Петров", "Петро", "Петрович", LocalDate.of(2001, 2, 2), "987-65-43",
                "Математика", 1, "МТ-11");
        students[2] = new Student(3, "Сидорова", "Олена", "Сидорівна", LocalDate.of(2000, 3, 3), "555-55-55",
                "Інформатика", 2, "ІН-22");
        students[3] = new Student(4, "Козлов", "Олег", "Козлович", LocalDate.of(1999, 4, 4), "111-22-33",
                "Фізика", 3, "ФЗ-31");
        students[4] = new Student(5, "Андрєєва", "Анна", "Андріївна", LocalDate.of(2001, 5, 5), "444-55-66",
                "Математика", 1, "МТ-12");

        printAllStudents();
        printStudentsByFaculty();
        printStudentsBornAfterYear();
        printStudentsByGroup();
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

    public static void printStudentsByFaculty() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть назву факультету: ");
        String faculty = scanner.nextLine();
        printStudentsByFaculty(faculty);
    }

    public static void printStudentsBornAfterYear(Integer year) {
        for (Student student : students) {
            if (student.getBirthDate().getYear() > year) {
                System.out.println(student);
            }
        }
    }

    public static void printStudentsBornAfterYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть рік для фільтрування: ");
        int year = scanner.nextInt();
        printStudentsBornAfterYear(year);
    }

    public static void printStudentsByGroup(String group) {
        for (Student student : students) {
            if (student.getGroup().equals(group)) {
                System.out.println(student);
            }
        }
    }

    public static void printStudentsByGroup() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть назву групи: ");
        String group = scanner.nextLine();
        printStudentsByGroup(group);
    }
}