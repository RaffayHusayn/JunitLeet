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

        System.out.println("==================Before Sorting by Name==================\n");
        studentList.forEach(System.out::println);

        //Task # 1: Using Lambdas to sort the students by Last names
        Comparator<Student> sortByName = (s1, s2)->s1.getLastName().compareTo(s2.getLastName());
        Collections.sort(studentList, sortByName);



        System.out.println("\n==================After Sorting by Name==================\n");
        //Task # 2: Just printing all the students, no need to use lambdas here
        studentList.forEach(System.out::println);

        System.out.println("\n=======Students whose last Name start with \"C\"===========\n");

        //Task # 3: Only printing where lastName starts with "C"
        studentList.stream().filter(s->s.getLastName().startsWith("C")).forEach(System.out::println);

    }
}
