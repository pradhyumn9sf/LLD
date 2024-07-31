package BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{
    public StudentBuilder setSubjects() {
        List<String> subj = new ArrayList<>();
        subj.add("OS");
        subj.add("DSA");
        subj.add("IP");
        this.subjects = subj;
        return this;
    }
}
