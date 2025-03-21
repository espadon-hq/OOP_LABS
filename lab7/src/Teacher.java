public class Teacher extends Human implements Comparable<Teacher> {
    private String position;
    private Integer experience;

    public Teacher() {
        super();
        this.position = "";
        this.experience = 0;
    }

    public Teacher(Integer id, String lastName, String firstName, String middleName, String phoneNumber,
                   String faculty, String position, Integer experience) {
        super(id, lastName, firstName, middleName, phoneNumber, faculty);
        this.position = position;
        this.experience = experience;
    }

    public Teacher(Teacher other) {
        super(other);
        this.position = other.position;
        this.experience = other.experience;
    }

    public String getPosition() { return position; }
    public Integer getExperience() { return experience; }

    @Override
    public String getRole() {
        return "Teacher";
    }

    // Реалізація Comparable (сортування за ім'ям - пункт a)
    @Override
    public int compareTo(Teacher other) {
        return this.firstName.compareTo(other.firstName);
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