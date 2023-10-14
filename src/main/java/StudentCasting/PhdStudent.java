package StudentCasting;

import java.util.Date;

public class PhdStudent extends GraduateStudent{
    private boolean qualifyingExamToken;
    public PhdStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis, boolean qualifyingExamToken) {
        super(no, name, year, dob, major, advisor, thesis);
        this.qualifyingExamToken=qualifyingExamToken;
    }
}
