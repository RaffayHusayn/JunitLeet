package com.fclass;

public class JavaApis {

    //this is the plain old switch statement so nothing new here
    public String dayOftheWeekSwitchStatement(int date) throws Exception{

        String day= "";
        switch(date){
            case 1 : day = "monday";break;
            case 2 : day = "tuesday";break;
            case 3 : day = "wednesday";break;
            case 4 : day = "thrusday";break;
            case 5 : day = "friday";break;
            case 6 : day = "weekend" ; break;
            case 7 : day = "weekend"; break;
            default : throw new Exception("Invalid date");
        }
        return day;
    }
}
