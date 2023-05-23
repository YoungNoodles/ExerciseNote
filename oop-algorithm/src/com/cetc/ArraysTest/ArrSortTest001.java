package com.cetc.ArraysTest;

import java.util.Arrays;
import java.util.Comparator;

public class ArrSortTest001 {

    private static final Dogs[] arr = new Dogs[6];

    static {
        arr[0] = new Dogs("tusi", 2, 30);
        arr[1] = new Dogs("doujiang", 4, 23);
        arr[2] = new Dogs("tangyuan", 3, 110);
        arr[3] = new Dogs("kele", 2, 33);
        arr[4] = new Dogs("huoguo", 4, 50);
        arr[5] = new Dogs("tuolaji", 3, 110);
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        //对arr中的对象进行排序，按年龄从小到大排
        //若年龄相同，就按体重排
        //若体重也相同，就按名字的字母排
        Arrays.sort(arr, (o1, o2) -> {
            //按照顺序比较排序
            if (o1.getAge() == o2.getAge()) {//若年龄相等，则比较体重

                if (o1.getWeight() == o2.getWeight()) {//若体重相等则比较名字

                    /*for (int i = 0; i < Math.min(o1.getName().length(), o2.getName().length()); i++) {//从第一位开始遍历，直到找到不一样的字符
                        //使用默认升序排列
                        if (o1.getName().charAt(i) != o2.getName().charAt(i)) {
                            return o1.getName().charAt(i) - o2.getName().charAt(i);
                        }
                    }*/
                    return o1.getName().compareTo(o2.getName());//调用String类本身具有的方法，前调后升序，后调前降序

                }
                //年龄相同但体重不同，按体重排序
                return (int) (o1.getWeight() - o2.getWeight());
            }
            //年龄不同，按年龄排序,前减后是从小到大，后减前是从大到小
            return o1.getAge() - o2.getAge();
        });

        long b = System.currentTimeMillis();
        System.out.println(b - a);

        //输出一下结果
        for (Dogs dogs : arr) {
            System.out.println(dogs.toString());
        }

        Arrays.sort(arr, new Comparator<Dogs>() {
            @Override
            public int compare(Dogs o1, Dogs o2) {
                return o1.getAge() - o2.getAge();
            }
        });
    }
}
