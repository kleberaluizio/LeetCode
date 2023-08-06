import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String a = "11";

        String b = "1";

        int valueA = 0;
        int valueB = 0;
        int sum = 0;

        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == '1') {
                valueA += Math.pow(2, i);
            }
        }
        for(int i = 0; i < b.length(); i++){
            if(a.charAt(i) == '1') {
                valueB += Math.pow(2, i);
            }
        }

        sum = valueA + valueB;

        System.out.println(2%2);

        System.out.println(valueA + " + " + valueB + " igual " + sum );



    }

}