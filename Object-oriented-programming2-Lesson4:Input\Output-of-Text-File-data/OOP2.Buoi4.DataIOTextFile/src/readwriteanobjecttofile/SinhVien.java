package readwriteanobjecttofile;
import java.io.*;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public SinhVien() {
        maSV = "";
        hoTen = "";
        diemToan = 0.0;
        diemLy = 0.0;
        diemHoa = 0.0;
    }

    public SinhVien(String maSV, String hoTen, double diemToan, double diemLy, double diemHoa) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public String toString() {
        return maSV + ", " + hoTen + ", " + diemToan + ", " + diemLy + ", " + diemHoa;
    }

    public boolean luuSinhVien(SinhVien sv, String fileName) {
        try {
            FileWriter fw = new FileWriter(fileName, true);
            fw.write(sv.toString() + "\n");
            fw.close();
            return true;
        } catch (IOException e) {
            System.out.println("Lỗi: " + e.getMessage());
            return false;
        }
    }

    public SinhVien[] docSinhVien(String fileName) {
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            String[] s;
            SinhVien[] sv = new SinhVien[100];
            int i = 0;
            while ((line = br.readLine()) != null) {
                s = line.split(", ");
                sv[i] = new SinhVien(s[0], s[1], Double.parseDouble(s[2]), Double.parseDouble(s[3]), Double.parseDouble(s[4]));
                i++;
            }
            if (i == 0) {
                return null;
            } else {
                SinhVien[] result = new SinhVien[i];
                System.arraycopy(sv, 0, result, 0, i);
                return result;
            }
        } catch (IOException e) {
            System.out.println("Lỗi: " + e.getMessage());
            return null;
        }
    }
}
