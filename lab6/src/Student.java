import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student extends Human {
    private LocalDate birthDate;
    private Integer course;
    private String group;

    // Конструктор за замовчуванням
    public Student() {
        super();
        this.birthDate = LocalDate.of(1900, 1, 1);
        this.course = 0;
        this.group = "";
    }

    // Параметризований конструктор
    public Student(Integer id, String lastName, String firstName, String middleName, LocalDate birthDate,
                   String phoneNumber, String faculty, Integer course, String group) {
        super(id, lastName, firstName, middleName, phoneNumber, faculty);
        this.birthDate = birthDate;
        this.course = course;
        this.group = group;
    }

    // Конструктор копіювання
    public Student(Student other) {
        super(other);
        this.birthDate = other.birthDate;
        this.course = other.course;
        this.group = other.group;
    }

    // Гетери та сетери
    public LocalDate getBirthDate() { return birthDate; }
    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }
    public Integer getCourse() { return course; }
    public void setCourse(Integer course) { this.course = course; }
    public String getGroup() { return group; }
    public void setGroup(String group) { this.group = group; }

    @Override
    public String getRole() {
        return "Student";
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