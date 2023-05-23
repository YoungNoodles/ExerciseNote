public class Test {


    private static Test test = new Test("张三", 001);

    private String name;

    private Integer id;

    private Test(){}
    public Test(String name){
        this.name = name;
    }
    public Test(Integer id){
        this.id = id;
    }

    private Test(String name, Integer id){
        this.name = name;
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public static Test getTest(){
        return test;
    }

    public Integer getId() {
        return id;
    }
}
