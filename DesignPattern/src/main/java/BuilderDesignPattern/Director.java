package BuilderDesignPattern;

public class Director {
    StudentBuilder studentBuilder;
    Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }
    public Student createStudent() {
        if (studentBuilder instanceof EngineeringStudentBuilder) {
            return createEngineeringStudent();
        } else {
            return createMBAStudent();
        }
    }
    public Student createEngineeringStudent() {
       return studentBuilder.setRollNumber(1).setAge(23).setSubjects().build();
    }
    public Student createMBAStudent() {
        return studentBuilder.setRollNumber(2).setAge(24).setName("sj").setFatherName("MyFatherName").setMotherName("MyMotherName").setSubjects().build();
    }


}
