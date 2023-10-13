package StudentCasting;

public class RegistrationOffice {
    RegistrationOffice(){}
    public Student getStudent(Student s){
        return s;
    }
    public void registerStudent(Student s)
    {
        System.out.println("Register Student is "+s.getName());
    }
}
