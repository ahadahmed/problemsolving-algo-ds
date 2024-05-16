package com.maico.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ValidIpAddress {

    Map<String, Boolean> numberRange = new HashMap();

    public ValidIpAddress(){
        for(int i = 0; i < 256; i++){
            numberRange.put(String.valueOf(i) , true);
        }
    }

    public ArrayList<String> validIPAddresses(String string) {

        ArrayList<String> ips = new ArrayList<>();

        if(string.length() < 4){
            return ips;
        }


        int firstDotPosition = 1;
        int secondDotPosition = firstDotPosition + 1;
        int thirdDotPosition = secondDotPosition + 1;


        while (firstDotPosition <= 3){
            while ((secondDotPosition - firstDotPosition) <= 3){
                while((thirdDotPosition - secondDotPosition) <= 3 && thirdDotPosition < string.length()){

                    String firstPart = string.substring(0, firstDotPosition);
                    String secondPart = string.substring(firstDotPosition, secondDotPosition);
                    String thirdPart = string.substring(secondDotPosition, thirdDotPosition);
                    String fourthPart = string.substring(thirdDotPosition);
                    if(checkIpParts(firstPart, secondPart, thirdPart, fourthPart)){
                        StringBuilder
                                 validIp = new StringBuilder();
                        validIp
                                .append(firstPart).append(".")
                                .append(secondPart).append(".")
                                .append(thirdPart).append(".")
                                .append(fourthPart);

                        ips.add(validIp.toString());
                    }

                    thirdDotPosition ++;
                }

                secondDotPosition++;
                thirdDotPosition = secondDotPosition + 1;
            }

            firstDotPosition++;

            secondDotPosition = firstDotPosition + 1;
            thirdDotPosition = secondDotPosition + 1;
        }


        return ips;
    }

    private boolean checkIpParts(String firstPart, String secondPart, String thirdPart, String fourthPart){



        boolean firstPartValid = numberRange.getOrDefault(firstPart,false);
        boolean secondPartValid  = numberRange.getOrDefault(secondPart, false);
        boolean thirdPartValid = numberRange.getOrDefault(thirdPart, false);
        boolean fourthPartValid =  numberRange.getOrDefault(fourthPart, false);



        return  firstPartValid && secondPartValid && thirdPartValid && fourthPartValid;
    }
}
