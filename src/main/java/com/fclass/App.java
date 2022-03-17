package com.fclass;

import javax.swing.plaf.TableHeaderUI;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws Exception {
        Message helloWorldMsg = new HelloWorldMsg();
        Greeter greeter = new Greeter();

        //using Message interface with only one method definition to define the return type and input parameters of the Lambda function
        // because how else would Java know;
        Message helloWorldMsgLambda = ()-> "hello world using lambda";
        Message helloWorldMsgInnerClass = new Message(){
            public String msg(){
                return "hello world anonymous inner class";
            }
        };


        //Calling Greeter class with a regular class
        greeter.greet(helloWorldMsg);
        // Calling Greeter class with anonymous inner class method
        greeter.greet(helloWorldMsgInnerClass);
        // Calling Greeter class with lambda function saved to a variable
        greeter.greet(helloWorldMsgLambda);
        //Calling Greeter class with inline lambda function
        greeter.greet(()-> "hello world using inline lambda");


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside the Thread : T1 (implemented using Anonymous Inner Class)");
                for(int i=0; i < 10 ; i++){
                    System.out.println(i);
                }
            }
        });

       t1.start();

       Thread t2 = new Thread(()->{
           System.out.println("Inside the Thread : T2 (Implemented using lambda function)");
           for(int i = 0 ; i < 10 ; i ++){
               System.out.println(i);
           }
       });
       t2.start();

       Runnable runnableClassImpl = new RunnableImpl();
       Thread t3 = new Thread(runnableClassImpl);
       t3.start();

    }
}
class RunnableImpl implements Runnable{

    @Override
    public void run() {
        System.out.println("Inside the Thread : T3 (Implemented using a regular class implementing the Runnable interface)");
        for(int i = 0 ; i < 10; i++){
            System.out.println(i);
        }
    }
}
