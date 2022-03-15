package com.fclass;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        Message helloWorldMsg = new HelloWorldMsg();
        Greeter greeter = new Greeter();
        greeter.greet(helloWorldMsg);

        //using Message interface with only one method definition to define the return type and input parameters of the Lambda function
        // because how else would Java know;
        Message helloWorldMsgLambda = ()-> "hello world using lambda";
        greeter.greet(helloWorldMsgLambda);
    }
}
