package com.fclass.lambda_vs_innerclass;

public class ThisReferenceExampleLambda {
    public void doSomething(SomeFunctionalInterface sfi){
        sfi.something();
    }
    public void doSomethingCaller(ThisReferenceExampleLambda obj){
        obj.doSomething(()-> System.out.println(this));
    }
    public static void main(String[] args){
        ThisReferenceExampleLambda thisReferenceExampleLambda = new ThisReferenceExampleLambda();
        //very strange code, probably a really bad way to do something
        thisReferenceExampleLambda.doSomethingCaller(thisReferenceExampleLambda);
    }
    public String toString(){
        return "Changing 'this' reference of the Object of class 'ThisReferenceExampleLambda'";
    }

}
interface SomeFunctionalInterface2{
    void something();
}