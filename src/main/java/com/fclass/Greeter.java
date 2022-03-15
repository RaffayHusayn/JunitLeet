package com.fclass;
/*
Just trying out an alternative lambda function thingy
 */
public class Greeter {
    public void greet(Message message){
        System.out.println(message.msg());
    }

}
interface Message{
   public String msg();
}
class HelloWorldMsg implements Message {
    public String msg(){
        return "Hello World using a simple method";
    }
}
