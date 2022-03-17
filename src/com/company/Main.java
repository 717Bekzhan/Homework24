package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random random = new Random(0);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2);
            System.out.println(array[i]);
        }
        Arrays.sort(array);
          System.out.println(" Assorted numbers by simple array " + Arrays.toString(array));

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int j = 0; j < 10; j++)
            arrayList.add(random.nextInt(2));
         System.out.println(" Random numbers by arraylist : " + arrayList);
        Collections.sort(arrayList);
        System.out.println( " Assorted numbers by arraylist : " + arrayList);

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++)
            linkedList.add(random.nextInt(2));
         System.out.println(" Random numbers by linkedlist : " + linkedList);
         Collections.sort(linkedList);
        System.out.println(" Assorted numbers by linkedlist  " + linkedList);


    }
}



