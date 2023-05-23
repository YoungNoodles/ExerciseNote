package com.cetc.TreeSetTest;

import java.util.TreeSet;

public class ReportCardTest004 {
    //用比较器-在创建TreeSet对象时传入比较器参数的方法
        private static TreeSet<ReportCard> ts = new TreeSet<>((ReportCard o1, ReportCard o2) -> {
        if (o1.totalPoints() == o2.totalPoints()) {
            int i = o1.getChinese() - o2.getChinese();
            if (i == 0) {//若语文成绩相同，比较数学成绩
                i = o1.getMath() - o2.getMath();
                if (i == 0) {//数学成绩相同，比较英语成绩
                    i = o1.getEnglish() - o2.getEnglish();
                    if (i == 0) {//英语成绩相同，比较年龄
                        i = o1.getAge() - o2.getAge();
                        //年龄相同返回姓名，姓名也一样那就是都一样
                        return i == 0 ? o1.getName().compareTo(o2.getName()) : i;
                    }
                    //英语成绩不同，返回英语排序
                    return i;
                }
                //数学成绩不同，返回数学排序
                return i;
            }
            //语文成绩不同，返回语文排序
            return i;
        }
        return o1.totalPoints() - o2.totalPoints();
    });

    //一般默认使用的自然排序法，JavaBean类实现接口
//    private static TreeSet<ReportCard> ts = new TreeSet<>();


    static {
        ReportCard r1 = new ReportCard("ZhangSan",23,90,99,50);
        ReportCard r2 = new ReportCard("LiSi",24,90,98,50);
        ReportCard r3 = new ReportCard("WangWu",25,90,100,30);
        ReportCard r4 = new ReportCard("ZhaoLiu",26,60,99,70);
        ReportCard r5 = new ReportCard("QianQi",27,70,80,70);

        ts.add(r1);
        ts.add(r2);
        ts.add(r3);
        ts.add(r4);
        ts.add(r5);
    }

    public static void main(String[] args) {
        for (ReportCard t : ts) {
            System.out.print(t.totalPoints() + " ");
            System.out.println(t);
        }
    }
}
