package com.fclass.lambda_vs_innerclass;

public class ThisReferenceExampleInnerClass {

    //some function that uses Functional Interface as an argument:
    // we can define this Interface using 1. Regular Class 2. Anonymous Inner class 3. Lambda function
    public void doSomething(SomeFunctionalInterface sfi){
        sfi.something();
    }
    public static void main(String[] args){
        ThisReferenceExampleInnerClass thisReferenceExampleInnerClass = new ThisReferenceExampleInnerClass();
        System.out.println("can't access the value of 'this' in the static function");
        thisReferenceExampleInnerClass.doSomething(new SomeFunctionalInterface() {
            @Override
            public void something() {
                System.out.println("Value of this in the Anonymous Inner class : \"" + this + "\" reference the object of the Interface");
            }
        });

    }

}
interface SomeFunctionalInterface{
    public void something();
}
