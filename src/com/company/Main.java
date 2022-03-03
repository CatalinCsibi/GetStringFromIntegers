package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

/*        Write a program accepting multiple non negative integers, and returning their largest possible combined number as a string. For example:
        given [50, 2, 1, 9]  it returns "95021"    (9 - 50 - 2 - 1)
        given [5, 50, 56]    it returns "56550"    (56 - 5 - 50)
        given [420, 42, 423] it returns "42423420" (42 - 423 - 420)*/

        List<Integer> integerList = new ArrayList<>();
        integerList.add(420);
        integerList.add(42);
        integerList.add(423);

        System.out.println(getHighestNumberAsStringFromIntegers(integerList));


    }

    private static String getHighestNumberAsStringFromIntegers(List<Integer> list) {
        List<String> stringList = new ArrayList<>();
        for(Integer number : list) {
            if(number >= 0) {
                stringList.add(String.valueOf(number));
            }
        }
        stringList.sort((o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        return String.join("", stringList);
    }

 }
