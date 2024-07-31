package BuilderDesignPattern;

import java.util.List;

public class Student {
    String name;
    String fatherName;
    String motherName;
    int rollNumber;
    int age;
    List<String> subjects;
    public Student( StudentBuilder studentBuilder) {
        this.name = studentBuilder.name;
        this.fatherName = studentBuilder.fatherName;
        this.motherName = studentBuilder.motherName;
        this.rollNumber = studentBuilder.rollNumber;
        this.age = studentBuilder.age;
        this.subjects = studentBuilder.subjects;
    }
    public String toString() {
        return ""+ " roll number: " + this.rollNumber +
                " age: " + this.age +
                " name: " + this.name +
                " father name: " + this.fatherName +
                " mother name: " + this.motherName +
                " subjects: " + subjects.get(0) + "," + subjects.get(1) + "," + subjects.get(2);

    }
}
