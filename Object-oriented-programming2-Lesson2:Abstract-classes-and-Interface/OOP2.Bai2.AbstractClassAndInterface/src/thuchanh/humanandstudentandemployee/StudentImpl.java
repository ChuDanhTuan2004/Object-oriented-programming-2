package thuchanh.humanandstudentandemployee;

public class StudentImpl extends People implements Student {
    public StudentImpl(String name, int age, boolean gender) {
        super(name, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("eat!");
    }
    @Override
    public void sleep() {
        System.out.println("sleep!");
    }
    @Override
    public void registerCourse(String course) {
        System.out.println(course);
    }
    @Override
    public void attendClass() {
        System.out.println("attend!");
    }
}
