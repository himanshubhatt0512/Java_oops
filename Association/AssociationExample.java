import java.util.ArrayList;
import java.util.List;

class Teacher{
    private String TeacherName;
    private List<students> students;

    public Teacher(String teacherName, List<students> students) {
        TeacherName = teacherName;
        this.students = students;
    }

    public String getTeacherName() {
        return TeacherName;
    }

    public void setTeacherName(String teacherName) {
        TeacherName = teacherName;
    }

    public List<students> getStudents() {
        return students;
    }

    public void setStudents(List<students> students) {
        this.students = students;
    }
}

class students{
    private String studentName;

    public students(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }
}

public class AssociationExample {
    public static void main(String[] args) {
        students s1 = new students("Scott");
        students s2 = new students("jean");
        students s3 = new students("storm");
        students s4 = new students("logan");

        List<students> s = new ArrayList<>();

        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);

        Teacher t = new Teacher("Charles", s);

        System.out.println("The Professor's name is : "+ t.getTeacherName());
        System.out.println("Under professor "+ t.getTeacherName() + " the students are ");
        for(students st : t.getStudents()){
            System.out.println(st.getStudentName());
        }

    }
}
