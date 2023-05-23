package com.cetc.TreeSetTest;

public class ReportCard implements Comparable<ReportCard>{
    private String name;
    private int age;
    private int Chinese;
    private int math;
    private int English;


    public ReportCard() {
    }

    public ReportCard(String name, int age, int Chinese, int math, int English) {
        this.name = name;
        this.age = age;
        this.Chinese = Chinese;
        this.math = math;
        this.English = English;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return Chinese
     */
    public int getChinese() {
        return Chinese;
    }

    /**
     * 设置
     * @param Chinese
     */
    public void setChinese(int Chinese) {
        this.Chinese = Chinese;
    }

    /**
     * 获取
     * @return math
     */
    public int getMath() {
        return math;
    }

    /**
     * 设置
     * @param math
     */
    public void setMath(int math) {
        this.math = math;
    }

    /**
     * 获取
     * @return English
     */
    public int getEnglish() {
        return English;
    }

    /**
     * 设置
     * @param English
     */
    public void setEnglish(int English) {
        this.English = English;
    }

    /**
     * 获取总分
     * @return
     */
    public int totalPoints(){
        return Chinese + math + English;
    }

    public String toString() {
        return "ReportCard{name = " + name + ", age = " + age + ", Chinese = " + Chinese + ", math = " + math + ", English = " + English + "}";
    }

    @Override
    public int compareTo(ReportCard o) {
        /*if (this.totalPoints() == o.totalPoints()) {
            int i = this.getChinese() - o.getChinese();
            if (i == 0) {//若语文成绩相同，比较数学成绩
                i = this.getMath() - o.getMath();
                if (i == 0) {//数学成绩相同，比较英语成绩
                    i = this.getEnglish() - o.getEnglish();
                    if (i == 0) {//英语成绩相同，比较年龄
                        i = this.getAge() - o.getAge();
                        //年龄相同返回姓名，姓名也一样那就是都一样
                        return i == 0 ? this.getName().compareTo(o.getName()) : i;
                    }
                    //英语成绩不同，返回英语排序
                    return i;
                }
                //数学成绩不同，返回数学排序
                return i;
            }
            //语文成绩不同，返回语文排序
            return i;
        }*/
        return this.totalPoints() - o.totalPoints();
    }
}
