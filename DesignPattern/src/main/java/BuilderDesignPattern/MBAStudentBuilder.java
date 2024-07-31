package BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{
    public StudentBuilder setSubjects() {
        List<String> subj = new ArrayList<>();
        subj.add("Finance");
        subj.add("HR");
        subj.add("Marketing");
        this.subjects = subj;
        return this;
    }
}
