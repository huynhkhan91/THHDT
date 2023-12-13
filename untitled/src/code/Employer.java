package code;

import java.util.Date;
import java.util.Scanner;

public class Employer extends Persont{
    private double Salary;
    private Date DateStart;
    private Faculty faculty;

    public Employer(String name, int birthday, double salary, Date dateStart, Faculty faculty) {
        super(name, birthday);
        Salary = salary;
        DateStart = dateStart;
        this.faculty = faculty;
    }


    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public Date getDateStart() {
        return DateStart;
    }

    public void setDateStart(Date dateStart) {
        DateStart = dateStart;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public void Insert(){
        super.Insert();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap luong: ");
        setSalary(sc.nextDouble());
        System.out.print("Nhap ngay lam viec: ");
        Date t = new Date();
        t.setDate(sc.nextInt());
        t.setMonth(sc.nextInt());
        t.setYear(sc.nextInt());
        setDateStart(t);
        System.out.print("Nhap khoa: ");
        Faculty f = new Faculty();
        f.setMaKhoa(sc.nextLine());
        f.setTenKhoa(sc.nextLine());
    }

    @Override
    public String toString(){
        System.out.println(super.toString());
        return "- Luong: " + getSalary() + "\n" +
                "- Ngay bat dau lam: " + getDateStart().toString() + "\n" +
                "- Khoa: " + getFaculty().getTenKhoa();
    }
}
