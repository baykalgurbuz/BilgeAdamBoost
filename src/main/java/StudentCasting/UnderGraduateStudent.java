package StudentCasting;

import java.util.Date;

public class UnderGraduateStudent extends Student{
    private String minor ;
    UnderGraduateStudent(int no, String name, int year, Date dob, String major,String minor) {
        super(no, name, year, dob, major);
        this.minor=minor;
    }
}
