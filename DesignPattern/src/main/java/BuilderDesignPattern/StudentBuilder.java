package BuilderDesignPattern;

import java.util.List;

public abstract class StudentBuilder {
    String name;
    String fatherName;
    String motherName;
    int rollNumber;
    int age;
    List<String> subjects;
    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }
    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }
    public StudentBuilder setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }
    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }
    public StudentBuilder setSubjects(List<String> subjects) {
        this.subjects = subjects;
        return this;
    }
    abstract public  StudentBuilder setSubjects();
    public Student build() {
        return new Student(this);
    }
}
