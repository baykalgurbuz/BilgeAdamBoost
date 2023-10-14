package Abstract;

import Abstract.GraduateStudent;

import java.util.Date;

public class MasterStudent extends GraduateStudent {
    MasterStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
        super(no, name, year, dob, major, advisor, thesis);
    }
    @Override
    public void register(){
        System.out.println("Master student register method called");
    }
}
