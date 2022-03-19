package com.fclass.lambda_exception_handling;

import jdk.jshell.execution.JdiDefaultExecutionControl;

import java.util.function.BiConsumer;

public class LambdaExceptionHandling {
    public static void main(String[] args){
        int[] numArray = {0,1,2,3,4,5,6};
        int target = 5;
        BiConsumer<Integer, Integer> addProcessLambda = (num1, num2 )-> System.out.println(num1+num2);
        BiConsumer<Integer, Integer> subtractProcessLambda = (num1, num2 )-> System.out.println(num1-num2);
        BiConsumer<Integer, Integer> multiplyProcessLambda = (num1, num2 )-> System.out.println(num1*num2);
        BiConsumer<Integer, Integer> divideProcessLambda = (num1, num2 )-> System.out.println(num1/num2);
        System.out.println("+++++++++ Addition Process ++++++++++++++");
        process(numArray, target, addProcessLambda);
        System.out.println("-------- Subtract Process ---------------");
        process(numArray, target, subtractProcessLambda);
        System.out.println("xxxxxxxx Multiply Process xxxxxxxxxxxxxxxx");
        process(numArray, target, multiplyProcessLambda);
        System.out.println("//////// Divide Process /////////////////");
        process(numArray, target, divideProcessLambda);

    }
    public static void process(int[] numArray, int target , BiConsumer<Integer, Integer> biConsumer){
        for(int n: numArray){
            biConsumer.accept(n, target);
        }
    }
}
