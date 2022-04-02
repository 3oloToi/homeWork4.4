package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <5 ; i++) {
            try {
                listA.add(bufferedReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        System.out.println(listA);
        ArrayList<String> listB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            try {
                listB.add(bufferedReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        System.out.println(listB);
        ArrayList<String> listC = new ArrayList<>();
        Collections.reverse(listB);
        Iterator<String> iteratorA = listA.iterator();
        Iterator<String> iteratorB = listB.iterator();

        for (int i = 0; i <listA.size() ; i++) {
            listC.add(iteratorA.next());
            listC.add(iteratorB.next());

        }
        System.out.println(listC );
        Collections.sort(listC,new LengthFirstComparator());
        System.out.println(listC);

    }


}
