package Abstract;

import java.util.Date;

public class Main {
    public static void main(String[] args)
    {
        GraduateStudent gs = new Abstract.PhdStudent(123,"enes",1998,new Date(98, 0, 1),"Software","Mr.Rob","Artifcal I",true);
        RegistrationOffice ro =new RegistrationOffice();
        System.out.println(ro.getStudent(gs));
        gs.writeThesis();//Upcasting
        gs.study();//Override Method
        gs.register();
        if (gs instanceof PhdStudent)
        {
            PhdStudent newGs = (PhdStudent) gs ;
            newGs.writePaper();
            System.out.println(ro.getStudent(gs));
        }
    }
}
