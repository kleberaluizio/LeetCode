package com.kleberaluizio.string;

public class DefangingAnIPAddress_1108 {

    public static void main (String[] args){

        // Example 1
        String address1 = "1.1.1.1";
        defangingIpAddress(address1);
        defangingIpAddressUsingReplace(address1);

        // Example 2
        String address2 = "255.100.50.0";
        defangingIpAddress(address2);


    }

    public static void defangingIpAddress(String ip){

        String newIp ="";

        for(int i = 0; i<ip.length(); i++){
            if(ip.charAt(i) == '.'){
                newIp = newIp + "[.]";
            } else {
                newIp = newIp + ip.charAt(i);
            }
        }
        System.out.println(newIp);
    }

    public static void defangingIpAddressUsingReplace(String address){

        System.out.println(address.replace(".","[.]"));

    }

    public static void defangingIpAddressUsingSplitJoin(String address){

        String[] parts = address.split("\\.");

    }

}
