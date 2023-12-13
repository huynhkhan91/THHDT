package code;

import java.util.Date;
import java.util.Scanner;

public class ManagerEmployer extends EmolyerHight{
    private double SalaryManager;

    public ManagerEmployer(String name, int birthday, double salary, Date dateStart, Faculty faculty) {
        super(name, birthday, salary, dateStart, faculty);
    }

    public ManagerEmployer(String name, int birthday, double salary, Date dateStart, Faculty faculty, String level, String major, String localSchool, double salaryManager) {
        super(name, birthday, salary, dateStart, faculty, level, major, localSchool);
        SalaryManager = salaryManager;
    }

    public double getSalaryManager() {
        return SalaryManager;
    }

    public void setSalaryManager(double salaryManager) {
        SalaryManager = salaryManager;
    }

    public  void Insert(){
        super.Insert();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap phu cap nhan vien: ");
        setSalaryManager(sc.nextDouble());
    }

    @Override
    public String toString(){
        return super.toString() + "\n" +
                "- Phu cap nhan vien: " + getSalaryManager();
    }
}
