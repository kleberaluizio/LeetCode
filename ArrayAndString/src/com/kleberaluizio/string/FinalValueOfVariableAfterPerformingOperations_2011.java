package com.kleberaluizio.string;

public class FinalValueOfVariableAfterPerformingOperations_2011 {

    public static void main(String[] args){

        String[] operations = {"--X","X++","X++"};
        finalValueAfterOperations(operations);
    }

    public static void finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String i : operations){
            if(i.charAt(1) == '-'){
                x--;
            } else {
                x++;
            }
        }

        System.out.println(x);
    }
}
