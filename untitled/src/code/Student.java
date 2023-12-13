package code;

import java.util.Scanner;

public class Student extends Persont{
    private double Score_A;
    private double Score_B;
    private double Score_C;

    public Student() {
    }

    public Student(String name, int birthday, double score_A, double score_B, double score_C) {
        super(name, birthday);
        Score_A = score_A;
        Score_B = score_B;
        Score_C = score_C;
    }

    public double getScore_A() {
        return Score_A;
    }

    public void setScore_A(double score_A) {
        Score_A = score_A;
    }

    public double getScore_B() {
        return Score_B;
    }

    public void setScore_B(double score_B) {
        Score_B = score_B;
    }

    public double getScore_C() {
        return Score_C;
    }

    public void setScore_C(double score_C) {
        Score_C = score_C;
    }

    public void Insert(){
        Scanner sc = new Scanner(System.in);
        super.Insert();
        System.out.print("Nhap diem mon 1: ");
        setScore_A(sc.nextInt());
        System.out.print("Nhap diem mon 2: ");
        setScore_B(sc.nextInt());
        System.out.print("Nhap diem mon 3: ");
        setScore_C(sc.nextInt());
    }

    @Override
    public String toString(){
        System.out.println(super.toString());
        return "- Diem mon 1: " + getScore_A() + "\n" +
                "- Diem mon 2: " + getScore_B() + "\n" +
                "- Diem mon 3: " + getScore_B();
    }
}
