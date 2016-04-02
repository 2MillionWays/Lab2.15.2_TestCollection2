package com.brainacad.oop.testcollection2;

import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> testLink = new LinkedList<>();

        for (int i = 10; i> 0;) {
            Random rnd = new Random();
            int insertionPoint = rnd.nextInt(11);
            String element = "number_"+insertionPoint;
            if(!testLink.contains(element)){
                testLink.add(element);
                i--;
            }
        }
        for (String element : testLink){
            System.out.println(element);
        }
    }
}