package com.kleberaluizio.string;

public class MaximumNumberOfWordsFoundInSentences_2114 {

    public static void main(String[] args) {

    }
    public static int mostWordsFound(String[] sentences) {
        int count = 0;
        int max = 0;
        for(String sentence : sentences){

            count = sentence.split(" ").length;
            if(count > max){
                max = count;
            }
        }
        return max;
    }
}
