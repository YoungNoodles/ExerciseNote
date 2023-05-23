import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //定义一个集合存储各个员工的得分
        ArrayList<Integer> score = new ArrayList<>();
        //定义一个集合存储每个员工获得奖品的数量
        ArrayList<Integer> count = new ArrayList<>();
        //输入每个员工的评分然后判断，输入#结束输入
        while (true){
            String input = sc.nextLine();
            if (input.equals("#")) {
                break;
            } else {
                inPut(score, count, Integer.parseInt(input));
            }
        }

        //从第二位开始遍历集合，调整奖品数量
        adjust(score,count);

        System.out.println(count);
    }

    public static void inPut(ArrayList<Integer> score, ArrayList<Integer> count, Integer input){
        score.add(input);
        count.add(1);
    }

    public static void adjust(ArrayList<Integer> score, ArrayList<Integer> count){

        for (int i = 1; i < score.size(); i++) {
            if(score.get(i - 1) > score.get(i)) {
                for (int index = i; index > 0; index--) {
                    if (score.get(index - 1) > score.get(index)) {
                        count.set(index - 1, count.get(index) + 1);
                    } else if(score.get(index - 1) < score.get(index) && count.get(index - 1) >= count.get(index)) {
                        count.set(index,count.get(index - 1) + 1);
                        break;
                    }
                }

            } else if (score.get(i - 1) < score.get(i)) {
                count.set(i, count.get(i - 1) + 1);
            }
        }
// 3199653672 //[2, 1, 2, 4, 3, 2, 1, 2, 3, 1]
// 2523237318 //[1, 2, 1, 2, 1, 2, 3, 2, 1, 2]
// 8645485514 //[3, 2, 1, 2, 1, 2, 1, 2, 1, 2]
        /*for (int i = 0; i < count.size() - 1; i++) {
            if(score.get(i) < score.get(i + 1) && count.get(i) >= count.get(i + 1)){
                count.set(i + 1, count.get(i) + 1);
            }
        }*/
    }
}