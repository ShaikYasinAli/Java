Java uses POJO, but the code in the POJO is very high and it uses setters getters and tostring and also constructors. but to reduce complexity java introduced record type,
which is used in the beow code:


Main Class:
  
public class Main {
    public static void main(String[] args) {
        RecStudent r = new RecStudent("12345", "Nova", "06/07/2002", "SuperBowl");
        System.out.println(r);
        student s = new student("12345", "Nova", "06/07/2002", "SuperBowl");
        System.out.println(s);
    }

}

Without using record we have to write this code:

public class student {
    private String id;
    private String name;
    private String dateOfBirth;
    private String classList;

    public student(String id, String name, String dateOfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }
}
we can optimize this student class with help of record type in java:

public record RecStudent(String id, String name, String dateOfBirth, String classList) {

}
Output:
RecStudent[id=12345, name=Nova, dateOfBirth=06/07/2002, classList=SuperBowl]
Student{id='12345', name='Nova', dateOfBirth='06/07/2002', classList='SuperBowl'}
