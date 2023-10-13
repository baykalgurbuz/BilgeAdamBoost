package StudentCasting;

import java.util.Date;

public class Main {
    public static void main(String[] args)
    {
    Student g = new GraduateStudent(123,"enes",1998,new Date(98, 0, 1),"Software","Mr.Rob","Artifcal I");
    MasterStudent m = new MasterStudent(1234,"baykal",1999,new Date(98, 0, 3),"Software","Mr.Rob","Artifcal I");
    RegistrationOffice ro =new RegistrationOffice();
    g.study(); //Upcasting
    // g.meetWithAdvison  Examples of Upcasting
    if(g instanceof GraduateStudent)//Control instanceOf with DownCasting
    {
        GraduateStudent gS =(GraduateStudent) g;
        ((GraduateStudent) g).writeThesis(); //DownCasting Examples
    }

    }
}
