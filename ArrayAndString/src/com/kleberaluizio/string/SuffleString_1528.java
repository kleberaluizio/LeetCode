package com.kleberaluizio.string;

public class SuffleString_1528 {
    public static void main(String[] args) {
        String s = "codeleet";
        int [] indices = {4,5,6,7,0,2,1,3};


        System.out.println(restoreString(s,indices));
    }
    public static String restoreString(String s, int[] indices) {
        String output = "";

        for(int i = 0; i < indices.length; i++){
            output = output + s.charAt(indices[i]);
        }
        return output;
    }
}
