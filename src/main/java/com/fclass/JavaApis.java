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
            case 6 : // do noting and just go to case 7 because (case 6 and case 7 have the same output)
            case 7 : day = "weekend"; break;
            default : throw new Exception("Invalid date");
        }
        return day;
    }


    public String dayOftheWeekSwitchExpression(int date){
        String day = "";
        switch(date){
            case 1-> day="monday";
            case 2-> day="tuesday";
            case 3-> day="wednesday";
            case 4-> day = "thursday";
            case 5-> day = "friday";
            case 6,7-> day = "weekend";

        }
        return day;
    }
}
