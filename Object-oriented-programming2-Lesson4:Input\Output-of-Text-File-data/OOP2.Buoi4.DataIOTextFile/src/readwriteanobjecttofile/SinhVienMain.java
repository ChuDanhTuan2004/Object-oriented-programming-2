package readwriteanobjecttofile;

public class SinhVienMain {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("SV001", "Nguyễn Văn A", 9.5, 8.5, 7.5);
        SinhVien sv2 = new SinhVien("SV002", "Nguyễn Văn B", 8.5, 7.5, 9.5);
        SinhVien sv3 = new SinhVien("SV003", "Nguyễn Văn C", 7.5, 9.5, 8.5);
        SinhVien sv4 = new SinhVien("SV004", "Nguyễn Văn D", 10.0, 10.0, 10.0);

        SinhVien sv = new SinhVien();
        sv.luuSinhVien(sv1, "sinhvien.txt");
        sv.luuSinhVien(sv2, "sinhvien.txt");
        sv.luuSinhVien(sv3, "sinhvien.txt");
        sv.luuSinhVien(sv4, "sinhvien.txt");

        SinhVien[] dsSV = sv.docSinhVien("sinhvien.txt");
        if (dsSV != null) {
            for (int i = 0; i < dsSV.length; i++) {
                System.out.println(dsSV[i]);
            }
        } else {
            System.out.println("File trống!");
        }
    }
}
