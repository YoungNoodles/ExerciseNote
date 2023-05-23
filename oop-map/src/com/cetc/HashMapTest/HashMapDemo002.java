package com.cetc.HashMapTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HashMapDemo002 {
    private static HashMap<Students,Character> hm = new HashMap<>();

    static {
        String str = "Dell";
        Random ra = new Random();
        for (int i = 0; i < 80; i++) {
            Students s = new Students(str,i + 1);
            hm.put(s,(char) (ra.nextInt(4) + 65));
            str += "a";
        }

    }
    public static void main(String[] args) {
//        System.out.println(hm.size());
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;

        for(Character v:hm.values()){
            switch(v){
                case 'A' -> countA += 1;
                case 'B' -> countB += 1;
                case 'C' -> countC += 1;
                default -> countD += 1;
            }
        }

        HashMap<String,Integer> hsi = new HashMap<>();
        hsi.put("A",countA);
        hsi.put("B",countB);
        hsi.put("C",countC);
        hsi.put("D",countD);

        int max = Math.max(Math.max((Math.max(countA, countB)), countC), countD);

        for (Map.Entry<String, Integer> ent : hsi.entrySet()) {
            System.out.println(ent);
        }

        for(Map.Entry<String,Integer> entry:hsi.entrySet()){
            if(entry.getValue() == max){
                System.out.println(entry.getKey());
            }
        }
    }
}
