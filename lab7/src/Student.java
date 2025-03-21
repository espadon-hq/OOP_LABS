import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student extends Human implements Comparable<Student> {
    private LocalDate birthDate;
    private Integer course;
    private String group;

    public Student() {
        super();
        this.birthDate = LocalDate.of(1900, 1, 1);
        this.course = 0;
        this.group = "";
    }

    public Student(Integer id, String lastName, String firstName, String middleName, LocalDate birthDate,
                   String phoneNumber, String faculty, Integer course, String group) {
        super(id, lastName, firstName, middleName, phoneNumber, faculty);
        this.birthDate = birthDate;
        this.course = course;
        this.group = group;
    }

    public Student(Student other) {
        super(other);
        this.birthDate = other.birthDate;
        this.course = other.course;
        this.group = other.group;
    }

    public LocalDate getBirthDate() { return birthDate; }
    public Integer getCourse() { return course; }
    public String getGroup() { return group; }

    @Override
    public String getRole() {
        return "Student";
    }

    // Реалізація Comparable (сортування за прізвищем - пункт a)
    @Override
    public int compareTo(Student other) {
        return this.lastName.compareTo(other.lastName);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return "Student{" +
                super.toString() +
                ", birthDate=" + birthDate.format(formatter) +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }
}