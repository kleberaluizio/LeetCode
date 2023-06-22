package com.kleberaluizio.string;

public class JewelsAndStones_771 {
    public static void main(String[] args){

        //Exemplo 1
//        String jewels = "aA";
//        String stones = "aAAbbbb";

        //Exemplo 2
//        String jewels = "z";
//        String stones = "ZZ";

        //Exemplo 3
        String jewels = "zabCD";
        String stones = "ZzAAbbccDd";



        int numberOfJewels = numJewelsInStones(jewels,stones);
        System.out.println(numberOfJewels);
    }
    public static int numJewelsInStones(String jewels, String stones) {
        int counter = 0;

        for(int i = 0; i < jewels.length();i++){
            for(int j = 0; j < stones.length(); j++){
                if(jewels.charAt(i) == stones.charAt(j)){
                    counter++;
                }
            }
        }
        return counter;
    }
}
