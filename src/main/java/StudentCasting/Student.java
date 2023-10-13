package StudentCasting;

import java.util.Date;

public class Student {
    private int no;
    private String name;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    private int year;
    private Date dob ;
    private String major ;
    Student(int no,String name,int year,Date dob ,String major)
    {
        this.no=no;
        this.name=name;
        this.year=year;
        this.dob=dob;
        this.major=major;
    }
    public void study (){
        System.out.println("Student is working.");
    }
    public void register(){
        System.out.println(this.name+"is register.");
    }
    public String toString(){
        return this.name+"->"+this.dob;
    }
}
