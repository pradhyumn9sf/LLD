package BuilderDesignPattern;

public class Client {
    public static void main(String[] args) {
        Director engineerStudentDirector = new Director(new EngineeringStudentBuilder());
        Director mbaStudentDirector = new Director(new MBAStudentBuilder());
        Student engineerStudent = engineerStudentDirector.createEngineeringStudent();
        Student mbaStudent = mbaStudentDirector.createMBAStudent();
        System.out.println(engineerStudent.toString());
        System.out.println(mbaStudent.toString());
    }
}
