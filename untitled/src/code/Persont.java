package code;

import java.util.Date;
import java.util.Scanner;

public class Persont {

    private String name;
    private int birthday;

    public Persont(){

    }

    public Persont(String name, int birthday){
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public void Insert(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        setName(sc.nextLine());
        System.out.print("Nhap nam sinh: ");
        setBirthday(sc.nextInt());
    }

    @Override
    public String toString(){
        return "- Ho ten: " + getName() + "\n" +
                "- Nam sinh: " + getBirthday();
    }
}
