package code;

public class Faculty {
    private String MaKhoa;
    private String TenKhoa;

    public Faculty(String maKhoa, String tenKhoa) {
        MaKhoa = maKhoa;
        TenKhoa = tenKhoa;
    }

    public Faculty() {
    }

    public String getMaKhoa() {
        return MaKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        MaKhoa = maKhoa;
    }

    public String getTenKhoa() {
        return TenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        TenKhoa = tenKhoa;
    }
}
