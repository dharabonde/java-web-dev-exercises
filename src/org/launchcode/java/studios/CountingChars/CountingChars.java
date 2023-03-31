package org.launchcode.java.studios.CountingChars;

import org.launchcode.java.demos.lsn1datatypes.Message;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingChars {
    public static void main(String[] args) {

        Scanner input;
        input=new Scanner(System.in);
        HashMap<Character, Integer> charCount=new HashMap<Character,Integer>();
        //String message = Message.getMessage("fr");
        /*String message = "If the product of two terms is zero then " +
                "common sense says at least one of the two terms has " +
                "to be zero to start with. So if you move all the terms " +
                "over to one side, you can put the quadratics into a " +
                "form that can be factored allowing that side of the " +
                "equation to equal zero. Once you’ve done that, " +
                "it’s pretty straightforward from there.";*/
        String message;
        System.out.println("Please enter a String: ");
        message=input.nextLine();
        char[] charactersInString = message.toCharArray();

        for(char c:charactersInString)
        {
            if(charCount.containsKey(c))
            {
                charCount.put(c, charCount.get(c)+1);
            }
            else {charCount.put(c, 1);}
            //System.out.println(c);
        }
        for(Map.Entry entry:charCount.entrySet())
        {
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
        System.out.println(message);
    }
}
