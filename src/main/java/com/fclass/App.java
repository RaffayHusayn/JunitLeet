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
    }
}
