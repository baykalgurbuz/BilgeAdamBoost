package Abstract;

import Abstract.Student;

import java.util.Date;

public class UnderGraduateStudent extends Student {
    private String minor ;
    UnderGraduateStudent(int no, String name, int year, Date dob, String major, String minor) {
        super(no, name, year, dob, major);
        this.minor=minor;
    }

    @Override
    void study() {
        System.out.println("UnderGraduate student study method called");
    }

    @Override
    void register() {
        System.out.println("UnderGraduate student register method called");
    }
}
