package com.fclass;

public class ReverseString {
    public String reverse(String s){
        if(s== null)return "";
        if("".equals(s)) return "";
        StringBuilder reverse = new StringBuilder();
        for(int i=s.length()-1 ; i >= 0 ; i--){
            reverse.append(s.charAt(i));
        }
        return reverse.toString();
    }
}
