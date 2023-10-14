package Abstract;

import Abstract.Student;

import java.util.Date;

public class VocationalStudent extends Student {
    VocationalStudent(int no, String name, int year, Date dob, String major) {
        super(no, name, year, dob, major);
    }

    @Override
    void study() {
        System.out.println("VocationalStudent student study method called");
    }

    @Override
    void register() {
        System.out.println("VocationalStudent student register method called");
    }
}
