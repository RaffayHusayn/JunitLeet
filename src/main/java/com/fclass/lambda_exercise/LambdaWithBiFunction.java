package com.fclass.lambda_exercise;

import java.util.function.BiFunction;

public class LambdaWithBiFunction {
    public static void main(String[] args){
        int[] numArray = {0,1,2,3,4,5,6};
        int target = 2;
        System.out.println("==========================================\n===========================================");
        System.out.println(" Using Bi Function which take 2 things in and return 1 thing out");
        System.out.println("==========================================\n===========================================\n");

        BiFunction<Integer, Integer, Integer> addFunction = (num1, num2)->num1+num2;
        BiFunction<Integer, Integer, Integer> subtractFunction = (num1,num2)->num1-num2;
        BiFunction<Integer, Integer, Integer> multiplyFunction = (num1,num2)->num1*num2;
        BiFunction<Integer, Integer, Integer> divideFunction = (num1,num2)->num1/num2;

        System.out.println("++++++++++++Add Function+++++++++++++++");
        int[] addFunctionArray = processFunction(numArray, target, addFunction);
        for(int n:addFunctionArray) System.out.println(n);
        System.out.println("----------Subtract Function--------------");
        int[] subtractFunctionArray = processFunction(numArray, target, subtractFunction);
        for(int n:subtractFunctionArray) System.out.println(n);
        System.out.println("xxxxxxxxxxxx Multiply Function xxxxxxxxxxxx");
        int[] multiplyFunctionArray = processFunction(numArray, target, multiplyFunction);
        for(int n:multiplyFunctionArray) System.out.println(n);
        System.out.println("////////// Divide Function /////////////");
        int[] divideFunctionArray = processFunction(numArray, target, divideFunction);
        for(int n:divideFunctionArray) System.out.println(n);
    }

    public static int[] processFunction(int[] numArray, int target , BiFunction<Integer, Integer, Integer> biFunction){
        int[] processResultArray = new int[numArray.length];
        for(int i=0; i < numArray.length; i++){
            processResultArray[i] =  biFunction.apply(numArray[i], target);
        }
        return processResultArray;

    }
}
