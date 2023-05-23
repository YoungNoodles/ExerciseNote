import com.CETC.a01PackageTest.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        com.CETC.a01PackageTest.Student student = new com.CETC.a01PackageTest.Student("zhangsan","10","太阳");
        com.CETC.a02PackageTest.Student student1 = new com.CETC.a02PackageTest.Student("stu0001","123456","zhangsan");

        System.out.printf("""
                %s
                %s
                %s
                %s
                %s
                %s
                """,student.getName(),student.getAge(),student.getAddress(),student1.getName(),student1.getID(),student1.getPassword());
    }
}