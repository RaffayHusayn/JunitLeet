package com.fclass.lambda_vs_innerclass;

public class ThisReferenceExampleInnerClass {

    public void doSomething(SomeFunctionalInterface sfi){
        sfi.something();
    }
    public static void main(String[] args){
        ThisReferenceExampleInnerClass thisReferenceExampleInnerClass = new ThisReferenceExampleInnerClass();
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
