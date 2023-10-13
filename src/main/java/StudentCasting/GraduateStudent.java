package StudentCasting;

import java.util.Date;

public class GraduateStudent extends Student{
    private String advisor ;
    private String thesis;
    GraduateStudent(int no, String name, int year, Date dob, String major,String advisor,String thesis) {
        super(no, name, year, dob, major);
        this.advisor=advisor;
        this.thesis=thesis;
    }
    public void writeThesis(){
        System.out.println("Graduate student writed thesis");
    }
    public void meetWithAdvison(){
        System.out.println("Graduate student meet with Advison");
    }
}
