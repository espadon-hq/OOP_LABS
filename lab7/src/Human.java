public abstract class Human {
    protected Integer id;
    protected String lastName;
    protected String firstName;
    protected String middleName;
    protected String phoneNumber;
    protected String faculty;

    public Human() {
        this.id = 0;
        this.lastName = "";
        this.firstName = "";
        this.middleName = "";
        this.phoneNumber = "";
        this.faculty = "";
    }

    public Human(Integer id, String lastName, String firstName, String middleName, String phoneNumber, String faculty) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
    }

    public Human(Human other) {
        this.id = other.id;
        this.lastName = other.lastName;
        this.firstName = other.firstName;
        this.middleName = other.middleName;
        this.phoneNumber = other.phoneNumber;
        this.faculty = other.faculty;
    }

    // Гетери
    public Integer getId() { return id; }
    public String getLastName() { return lastName; }
    public String getFirstName() { return firstName; }
    public String getMiddleName() { return middleName; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getFaculty() { return faculty; }

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