package com.fclass.lambda_vs_innerclass;

public class ThisReferenceExampleLambda {
    public String doSomething(SomeFunctionalInterface sfi){
        return sfi.something();
    }
    public String doSomethingCaller(ThisReferenceExampleLambda obj){
        return obj.doSomething(()-> String.valueOf(this));
    }
    public static void main(String[] args){
        ThisReferenceExampleLambda thisReferenceExampleLambda = new ThisReferenceExampleLambda();
        //very strange code, probably a really bad way to do something
        System.out.println(thisReferenceExampleLambda.doSomethingCaller(thisReferenceExampleLambda));
    }
    public String toString(){
        return "Changing 'this' reference of the Object of class 'ThisReferenceExampleLambda'";
    }

}
interface SomeFunctionalInterface2{
    String something();
}