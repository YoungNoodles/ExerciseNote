package com.cetc.HashMapTest;

import java.util.HashMap;
import java.util.Random;

public class HashMapDemo003 {
    public static void main(String[] args) {
        Random ra = new Random();
        HashMap<Character,Integer> hm = new HashMap<>();

        for (int i = 0; i < 80; i++) {
            char place =(char) (ra.nextInt(4) + 65);
            if(hm.containsKey(place)){
                hm.put(place,hm.get(place) + 1);
            } else {
                hm.put(place,1);
            }
        }


    }
}
