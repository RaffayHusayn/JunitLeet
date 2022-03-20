package com.fclass.lambda_exception_handling;

import java.util.function.BiConsumer;

public class LambdaExceptionHandling {
    public static void main(String[] args){
        int[] numArray = {0,1,2,3,4,5,6};
        int target = 0;

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

        /*
                            EXPLANATION OF THE FLOW IN EXCEPTION HANDLING USING A METHOD
        ====================================================================================================================================
        This is how exception is handled:
        1. We create a lambda that can cause an exception
        2. We create another lambda which accepts and returns the same Type as the Lambda that can cause exception to wrap the first lambda
        3. We handle the exception in the WrapperLambda and do the same process as the lambda the causes exception in the try block of the wrapper

        When the program runs:
        1. processConsumer method is called
        2. We go into the loop
        3. biConsumer.accept() triggers the exceptionWrapperMethod which checks for exception and calls the biConsumer.accept method
        in the try block
        4. Go back to the loop iteration in the processConsumer method
        5. Repeat until loop is over
        ====================================================================================================================================
         */
        processConsumer(numArray, target, exceptionWrapperMethod(divideProcessLambda));
    }

    public static void processConsumer(int[] numArray, int target , BiConsumer<Integer, Integer> biConsumer){
        for(int n: numArray){
            biConsumer.accept(n, target); // this calls the wrapperLambda to execute where we are doing the same thing ie biConsumer.accept()
        }
    }

    public static BiConsumer<Integer, Integer> exceptionWrapperMethod(BiConsumer<Integer, Integer> biConsumer){
        return (num1, num2)->{
            try{
                biConsumer.accept(num1, num2);
            }catch(Exception e){
                System.out.println("exception caught in the wrapper lambda");
            }
        };
    }
}
