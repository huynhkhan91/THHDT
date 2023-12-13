package code;

import java.util.Date;
import java.util.Scanner;

public class EmolyerHight extends Employer{

    private String Level;
    private String Major;
    private String LocalSchool;

    public EmolyerHight(String name, int birthday, double salary, Date dateStart, Faculty faculty) {
        super(name, birthday, salary, dateStart, faculty);
    }


    public EmolyerHight(String name, int birthday, double salary, Date dateStart, Faculty faculty, String level, String major, String localSchool) {
        super(name, birthday, salary, dateStart, faculty);
        Level = level;
        Major = major;
        LocalSchool = localSchool;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String level) {
        Level = level;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        Major = major;
    }

    public String getLocalSchool() {
        return LocalSchool;
    }

    public void setLocalSchool(String localSchool) {
        LocalSchool = localSchool;
    }

    public void Insert(){
        super.Insert();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap trinh do: ");
        setLevel(sc.nextLine());
        System.out.print("Nhap nganh: ");
        setMajor(sc.nextLine());
        System.out.print("Nhap noi dao tao: ");
        setLocalSchool(sc.nextLine());
    }

    @Override
    public String toString(){
        return super.toString() + "\n" +
                "- Trinh do: " + getLevel() + "\n" +
                "- Nhap nganh: " + getMajor() + "\n" +
                "- Noi dao tao: " + getLocalSchool();
    }
}
