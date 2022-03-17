package com.fclass.LambdaExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaMain {
    public static void main(String[] args){
        List<Student> studentList = Arrays.asList(
                new Student("Raffay", "Hussain",41),
                new Student("Nelson", "Mandela",34),
                new Student("Lee", "Cassidy",45),
                new Student("Camila", "Cabello",84)
        );

        /*
        TAKS:
            T#1: Sort the list by last names
            T#2: Print all the element in the list
            T#3: Print all the student whose last name start wth "C"
         */

        System.out.println("==================Before Sorting by Name==================");
        studentList.forEach(System.out::println);
        //Task # 1:
        Comparator<Student> sortByName = (s1, s2)->s1.getLastName().compareTo(s2.getLastName());
        Collections.sort(studentList, sortByName);



        System.out.println("==================After Sorting by Name==================");
        //Task # 2:
        studentList.forEach(System.out::println);
    }
}
