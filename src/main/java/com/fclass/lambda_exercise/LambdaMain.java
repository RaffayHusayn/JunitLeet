package com.fclass.lambda_exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

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


        //Task # 3: Only printing where lastName starts with "C" using lambda in the filter method
                /*
                Predicate and Consumer are two of the Functional Interfaces provided by java
                in the java.util.function package that we can use for the lambdas type definition
                 */
        Predicate<Student> nameStartC = s->s.getLastName().startsWith("C");

        //this is the same as using .map(s->s.getFirstName()).forEach(System.out::println)
        Consumer<Student> printFirstName = s-> System.out.println(s.getFirstName());

        //this is the same as using forEach(System.out::println)
        Consumer<Student> printFullStudent = s-> System.out.println(s.toString());

        System.out.println("\n=======Students whose last Name start with \"C\"(using Consumer and Predicate Functional interfaces)===========\n");
        System.out.println("-----First Names-----");
        studentList.stream().filter(nameStartC).forEach(printFirstName);
        System.out.println("-----Full Names-----");
        studentList.stream().filter(nameStartC).forEach(printFullStudent);

        System.out.println("\n =====Student whose last Name start with \"C\" (using method references and Lambdas )=========\n");
        System.out.println("-----First Names-----");
        studentList.stream().filter(nameStartC).map(s->s.getFirstName()).forEach(System.out::println);
        System.out.println("-----Full Names-----");
        studentList.stream().filter(nameStartC).forEach(System.out::println);

        System.out.println("\n =====Student whose last Name start with \"C\" (using only method references )=========\n");
        System.out.println("-----First Names-----");
        studentList.stream().filter(nameStartC).map(Student::getFirstName).forEach(System.out::println);
        System.out.println("-----Full Names-----");
        studentList.stream().filter(nameStartC).forEach(System.out::println);
    }
}
