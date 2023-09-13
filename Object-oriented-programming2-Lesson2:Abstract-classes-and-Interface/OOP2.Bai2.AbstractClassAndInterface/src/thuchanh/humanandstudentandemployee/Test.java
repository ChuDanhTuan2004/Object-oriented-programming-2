package thuchanh.humanandstudentandemployee;

public class Test {
    public static void main(String[] args) {
        StudentImpl student = new StudentImpl("Tuan Anh", 25, true);
        student.eat();
        student.sleep();
        student.registerCourse("Programming Node JS");
        student.attendClass();
    }
}
