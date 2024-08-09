package setter;

import java.util.Set;

public class WelcomeBean {
    private Set<String> studentsData;

    public void setStudentsData(Set<String> studentsData) {
        this.studentsData = studentsData;
    }

    public void show() {
        System.out.println(studentsData);
    }
}
