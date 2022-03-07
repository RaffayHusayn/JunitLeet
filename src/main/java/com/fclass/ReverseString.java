package com.fclass;

public class ReverseString {
    public String reverse(String s) throws Exception {
        if(s== null){
            throw new Exception("String is null");
        };
        if("".equals(s)) return "";
        StringBuilder reverse = new StringBuilder();
        for(int i=s.length()-1 ; i >= 0 ; i--){
            reverse.append(s.charAt(i));
        }
        return reverse.toString();
    }
}
