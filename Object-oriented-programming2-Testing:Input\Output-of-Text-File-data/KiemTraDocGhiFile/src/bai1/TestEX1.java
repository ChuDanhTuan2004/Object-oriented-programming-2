package bai1;

public class TestEX1 {
    public static void main(String[] args) {
        People people = new People();
        People people1 = new People("Nguyen Van A",18,"nam",180,50);
        people.setName("Nguyen Van B");
        System.out.println(people.getName());
        people.setAge(18);
        System.out.println(people.getAge());
        people.setSex("nu");
        System.out.println(people.getSex());
        people.setHeight(160);
        System.out.println(people.getHeight());
        people.setWeight(45);
        System.out.println(people.getWeight());
        System.out.println(people1.toString());

        Teacher teacher = new Teacher();
        Teacher teacher1 = new Teacher("Nguyen Van C",25,"nam",180,60,"Ths","Normal","OOP");
        teacher.setLevel("TS");
        System.out.println(teacher.getLevel());
        teacher.setExperience("Profesional");
        System.out.println(teacher.getExperience());
        teacher.setSubject("OOP");
        System.out.println(teacher.getSubject());
        System.out.println(teacher1.toString());
    }
}
