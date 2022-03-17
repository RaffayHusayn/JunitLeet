package com.fclass.LambdaExercise;

import java.util.Arrays;
import java.util.List;

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


        //Task # 2:
        studentList.forEach(System.out::println);
    }
}
