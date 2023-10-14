package Abstract;

import Abstract.GraduateStudent;

import java.util.Date;

public class PhdStudent extends GraduateStudent {
    private boolean qualifyingExamToken;
    PhdStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis, boolean qualifyingExamToken) {
        super(no, name, year, dob, major, advisor, thesis);
        this.qualifyingExamToken=qualifyingExamToken;
    }
    @Override
    void study() {
        System.out.println("Phd Student study method called");
    }
    public void writePaper()
    {
        System.out.println("Phd Student writePaper method called");
    }
}
