package dev.kraigochieng;

import dev.kraigochieng.enums.Level;
import dev.kraigochieng.enums.Role;
import dev.kraigochieng.models.User;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

public class App 
{
    /* ================================================================================================================= */
    /* 1.1 Showing how constants are defined without an enum */
//    public static final String LOW = "LOW";
//    public static final String MEDIUM = "MEDIUM";
//    public static final String HIGH = "HIGH";
    /* ================================================================================================================= */

    public static void main(String[] args )
    {

        /* ================================================================================================================= */
        /* 1.2 Showing how using static benefits us */
//        System.out.println(App.LOW);
//        System.out.println(App.MEDIUM);
//        System.out.println(App.HIGH);

        /* 1.3 Showing the purpose of */
//        App.LOW = "not low";
        /* ================================================================================================================= */


        /* ================================================================================================================= */
        /* 3. Show a simple use case of how an enum constant from an enum can be used. */
        /* 3.1. Use an enum constant */

//        Level myLevel = Level.MEDIUM;
//        System.out.println("My level: " + myLevel);

        /* 3.2. Switch statement processing */
        /* Credit: https://www.w3schools.com/java/java_enums.asp */
//        switch (myLevel) {
//            case LOW:
//                System.out.println("Low level");
//                break;
//            case MEDIUM:
//                System.out.println("Medium Level");
//                break;
//            case HIGH:
//                System.out.println("High Level");
//                break;
//            default:
//                System.out.println("Unknown");
//                break;
//        }


        /* 3.3 Show the methods provided for us by Java */
        /* 3.3.1. Ordinal */
//        System.out.println("My level ordinal: " + myLevel.ordinal());
        /* 3.3.2. Name */
//        System.out.println("My level name: " + myLevel.name());
        /* 3.3.3. values() */
//        System.out.println("Level values:::::::::");
//        for (Level level : Level.values()) {
//            System.out.println("---Constant---");
//            System.out.println(level);
//            // The enum constants properties
//            System.out.println("--Properties--");
//            System.out.println("Ordinal(predefined property): " + level.ordinal());
//            System.out.println();
//        }
        /* ================================================================================================================= */


        /* ================================================================================================================= */
        /* Implementation of an enum by a Java library */
        /* DayOfWeek documentation: https://docs.oracle.com/javase/8/docs/api/java/time/DayOfWeek.html */
//        System.out.println(DayOfWeek.SUNDAY);
//        System.out.println(DayOfWeek.MONDAY);
//        System.out.println(DayOfWeek.TUESDAY);
//        System.out.println(DayOfWeek.WEDNESDAY);
//        System.out.println(DayOfWeek.THURSDAY);
//        System.out.println(DayOfWeek.FRIDAY);
//        System.out.println(DayOfWeek.SATURDAY);

        /* ================================================================================================================= */




        /* ================================================================================================================= */
        /* 6.2. Define users */
//        User manager1 = new User("Manager 1", Role.MANAGER);
//        User employee1 = new User("Employee 1", Role.EMPLOYEE);
//        User customer1 = new User("Customer 1", Role.CUSTOMER);

        /* 6.3. Compile users into a list for easier processing */
//        List<User> users = List.of(manager1, employee1, customer1);
//
//        for(User user: users) {
//            String adjective = "";
//            switch(user.getRole()) {
//                case MANAGER:
//                    adjective = "many";
//                    break;
//                case EMPLOYEE:
//                    adjective = "some";
//                  break;
//                case CUSTOMER:
//                    adjective = "few";
//                    break;
//                    default:
//                        adjective = "weird";
//                        break;
//
//            }
//
//            System.out.println(user.getName() + " has " + adjective + " permissions.");
//            /* Show the use of a method over here */
//            user.getRole().printPermissions();
//        }
        /* ================================================================================================================= */

    }
}



