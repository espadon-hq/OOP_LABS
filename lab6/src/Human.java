public abstract class Human {
    protected Integer id;
    protected String lastName;
    protected String firstName;
    protected String middleName;
    protected String phoneNumber;
    protected String faculty;

    // Конструктор за замовчуванням
    public Human() {
        this.id = 0;
        this.lastName = "";
        this.firstName = "";
        this.middleName = "";
        this.phoneNumber = "";
        this.faculty = "";
    }

    // Параметризований конструктор
    public Human(Integer id, String lastName, String firstName, String middleName, String phoneNumber, String faculty) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
    }

    // Конструктор копіювання
    public Human(Human other) {
        this.id = other.id;
        this.lastName = other.lastName;
        this.firstName = other.firstName;
        this.middleName = other.middleName;
        this.phoneNumber = other.phoneNumber;
        this.faculty = other.faculty;
    }

    // Гетери та сетери
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getMiddleName() { return middleName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public String getFaculty() { return faculty; }
    public void setFaculty(String faculty) { this.faculty = faculty; }

    // Абстрактний метод
    public abstract String getRole();

    @Override
    public String toString() {
        return "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", faculty='" + faculty + '\'';
    }
}