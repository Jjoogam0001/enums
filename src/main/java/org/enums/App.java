package org.enums;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Iterate loop
        for (WeekDay day: WeekDay.values()){
            System.out.println(day +" "+ day.getOpeningHours());
        }



    }


}
