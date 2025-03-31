import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Student {
    private  Integer id;
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate birthDate;
    private String phoneNumber;
    private String faculty;
    private Integer course;
    private String group;
    private Boolean isActive = Boolean.TRUE;
    private static int counter = 0;


    public Student() {
        counter++;
        this.id = counter;
        this.lastName = "";
        this.firstName = "";
        this.middleName = "";
        this.birthDate = LocalDate.of(1900, 1, 1);
        this.phoneNumber = "";
        this.faculty = "";
        this.course = 0;
        this.group = "";
    }

    public Student(Integer id, String lastName, String firstName, String middleName, LocalDate birthDate, String phoneNumber, String faculty, Integer course, String group) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        counter++;
    }

    public Student(String lastName, String firstName, LocalDate birthDate) {
        counter++;
        this.id = counter;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = "";
        this.birthDate = birthDate;
        this.phoneNumber = "";
        this.faculty = "";
        this.course = 0;
        this.group = "";
    }

    public Student(String lastName, String firstName) {
        counter++;
        this.id = counter;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = "";
        this.birthDate = LocalDate.of(1900, 1, 1);
        this.phoneNumber = "";
        this.faculty = "";
        this.course = 0;
        this.group = "";
    }

    public Student(Student other) {
        counter++;
        this.id = counter;
        this.lastName = other.lastName;
        this.firstName = other.firstName;
        this.middleName = other.middleName;
        this.birthDate = other.birthDate;
        this.phoneNumber = other.phoneNumber;
        this.faculty = other.faculty;
        this.course = other.course;
        this.group = other.group;
        this.isActive = other.isActive;
    }


    public String getFaculty() {
        return faculty;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getGroup() {
        return group;
    }

    public Integer getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Integer getCourse() {
        return course;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return "Student{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", birthDate=" + birthDate.format(formatter) +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}