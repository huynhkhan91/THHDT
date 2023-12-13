package code;

import java.util.Date;
import java.util.Scanner;

public class Teacher extends EmolyerHight{
    private double SalaryTeacher;

    public Teacher(String name, int birthday, double salary, Date dateStart, Faculty faculty) {
        super(name, birthday, salary, dateStart, faculty);
    }

    public Teacher(String name, int birthday, double salary, Date dateStart, Faculty faculty, String level, String major, String localSchool, double salaryTeacher) {
        super(name, birthday, salary, dateStart, faculty, level, major, localSchool);
        SalaryTeacher = salaryTeacher;
    }

    public double getSalaryTeacher() {
        return SalaryTeacher;
    }

    public void setSalaryTeacher(double salaryTeacher) {
        SalaryTeacher = salaryTeacher;
    }

    public void Insert(){
        Scanner sc = new Scanner(System.in);
        super.Insert();
        System.out.print("Nhap phu cap giao vien: ");
        setSalaryTeacher(sc.nextDouble());
    }

    @Override
    public String toString(){
        return super.toString() + "\n" +
                "- Phu cap giao vien: " + getSalaryTeacher();
    }
}
