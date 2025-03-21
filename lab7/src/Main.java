import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Масив студентів (10 елементів)
        Student[] students = new Student[10];
        students[0] = new Student(1, "Іванов", "Іван", "Іванович", LocalDate.of(2000, 1, 1), "123-45-67", "Інформатика", 2, "ІН-21");
        students[1] = new Student(2, "Петров", "Петро", "Петрович", LocalDate.of(2001, 2, 2), "987-65-43", "Математика", 1, "МТ-11");
        students[2] = new Student(3, "Сидоров", "Олег", "Сидорович", LocalDate.of(2000, 3, 3), "555-55-55", "Інформатика", 2, "ІН-22");
        students[3] = new Student(4, "Козлов", "Олег", "Козлович", LocalDate.of(1999, 4, 4), "111-22-33", "Фізика", 3, "ФЗ-31");
        students[4] = new Student(5, "Андрєєва", "Анна", "Андріївна", LocalDate.of(2001, 5, 5), "444-55-66", "Математика", 1, "МТ-12");
        students[5] = new Student(6, "Бондаренко", "Юлія", "Олегівна", LocalDate.of(2002, 6, 6), "666-77-88", "Інформатика", 1, "ІН-11");
        students[6] = new Student(7, "Грищенко", "Максим", "Іванович", LocalDate.of(1998, 7, 7), "777-88-99", "Фізика", 4, "ФЗ-41");
        students[7] = new Student(8, "Дмитренко", "Олена", "Петрівна", LocalDate.of(2000, 8, 8), "888-99-00", "Математика", 2, "МТ-21");
        students[8] = new Student(9, "Єрмоленко", "Сергій", "Олександрович", LocalDate.of(1999, 9, 9), "999-00-11", "Інформатика", 3, "ІН-31");
        students[9] = new Student(10, "Жуков", "Олексій", "Миколайович", LocalDate.of(2001, 10, 10), "000-11-22", "Фізика", 1, "ФЗ-11");

        // Масив викладачів (10 елементів)
        Teacher[] teachers = new Teacher[10];
        teachers[0] = new Teacher(1, "Сидоренко", "Олег", "Петрович", "222-33-44", "Інформатика", "Доцент", 10);
        teachers[1] = new Teacher(2, "Коваленко", "Оксана", "Іванівна", "333-44-55", "Математика", "Професор", 15);
        teachers[2] = new Teacher(3, "Бойко", "Ірина", "Сергіївна", "444-55-66", "Фізика", "Ст. викладач", 8);
        teachers[3] = new Teacher(4, "Мельник", "Андрій", "Васильович", "555-66-77", "Інформатика", "Доцент", 12);
        teachers[4] = new Teacher(5, "Ткаченко", "Юлія", "Олександрівна", "666-77-88", "Математика", "Викладач", 5);
        teachers[5] = new Teacher(6, "Левченко", "Максим", "Ігорович", "777-88-99", "Фізика", "Професор", 20);
        teachers[6] = new Teacher(7, "Павленко", "Наталія", "Миколаївна", "888-99-00", "Інформатика", "Доцент", 9);
        teachers[7] = new Teacher(8, "Романенко", "Дмитро", "Олегович", "999-00-11", "Математика", "Ст. викладач", 7);
        teachers[8] = new Teacher(9, "Шевченко", "Олена", "Вікторівна", "000-11-22", "Фізика", "Викладач", 4);
        teachers[9] = new Teacher(10, "Гнатенко", "Світлана", "Петрівна", "111-22-33", "Інформатика", "Професор", 18);

        // Сортування за Comparable (пункт a: Student - по прізвищу, Teacher - по імені)
        System.out.println("Сортування студентів за прізвищем:");
        Arrays.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\nСортування викладачів за іменем:");
        Arrays.sort(teachers);
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }

        // Сортування за Comparator (пункт b: Student - спочатку по групі, потім по прізвищу; Teacher - спочатку по прізвищу, потім по імені)
        System.out.println("\nСортування студентів за групою, потім за прізвищем:");
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int groupCompare = s1.getGroup().compareTo(s2.getGroup());
                if (groupCompare != 0) return groupCompare;
                return s1.getLastName().compareTo(s2.getLastName());
            }
        });
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\nСортування викладачів за прізвищем, потім за іменем:");
        Arrays.sort(teachers, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher t1, Teacher t2) {
                int lastNameCompare = t1.getLastName().compareTo(t2.getLastName());
                if (lastNameCompare != 0) return lastNameCompare;
                return t1.getFirstName().compareTo(t2.getFirstName());
            }
        });
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
}