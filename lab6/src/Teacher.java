public class Teacher extends Human {
    private String position;
    private Integer experience;

    // Конструктор за замовчуванням
    public Teacher() {
        super();
        this.position = "";
        this.experience = 0;
    }

    // Параметризований конструктор
    public Teacher(Integer id, String lastName, String firstName, String middleName, String phoneNumber,
                   String faculty, String position, Integer experience) {
        super(id, lastName, firstName, middleName, phoneNumber, faculty);
        this.position = position;
        this.experience = experience;
    }

    // Конструктор копіювання
    public Teacher(Teacher other) {
        super(other);
        this.position = other.position;
        this.experience = other.experience;
    }

    // Гетери та сетери
    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }
    public Integer getExperience() { return experience; }
    public void setExperience(Integer experience) { this.experience = experience; }

    @Override
    public String getRole() {
        return "Teacher";
    }

    @Override
    public String toString() {
        return "Teacher{" +
                super.toString() +
                ", position='" + position + '\'' +
                ", experience=" + experience +
                '}';
    }
}