package com.fclass.lambda_exercise;

import java.util.function.BiConsumer;

public class LambdaWithBiConsumer {
    public static void main(String[] args){
        int[] numArray = {0,1,2,3,4,5,6};
        int target = 3;

        BiConsumer<Integer, Integer> addProcessLambda = (num1, num2 )-> System.out.println(num1+num2);
        BiConsumer<Integer, Integer> subtractProcessLambda = (num1, num2 )-> System.out.println(num1-num2);
        BiConsumer<Integer, Integer> multiplyProcessLambda = (num1, num2 )-> System.out.println(num1*num2);
        BiConsumer<Integer, Integer> divideProcessLambda = (num1, num2 )-> System.out.println(num1/num2);
        System.out.println("+++++++++ Addition Process ++++++++++++++");
        processConsumer(numArray, target, addProcessLambda);
        System.out.println("-------- Subtract Process ---------------");
        processConsumer(numArray, target, subtractProcessLambda);
        System.out.println("xxxxxxxx Multiply Process xxxxxxxxxxxxxxxx");
        processConsumer(numArray, target, multiplyProcessLambda);
        System.out.println("//////// Divide Process /////////////////");
        processConsumer(numArray, target, divideProcessLambda);
    }

    public static void processConsumer(int[] numArray, int target , BiConsumer<Integer, Integer> biConsumer){
        for(int n: numArray){
            biConsumer.accept(n, target);
        }
    }
}
