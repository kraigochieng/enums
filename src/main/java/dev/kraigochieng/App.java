package dev.kraigochieng;

import dev.kraigochieng.enums.Level;
import dev.kraigochieng.enums.Role;
import dev.kraigochieng.models.User;

import java.util.List;

/**
 * Hello world!
 *
 */

public class App 
{
    // Showing how constants are defined
    public static final String LOW = "LOW";
    public static final String MEDIUM = "MEDIUM";
    public static final String HIGH = "HIGH";


    public static void main(String[] args )
    {

        // Define
        Level myLevel = Level.MEDIUM;

        System.out.println(myLevel);
        System.out.println(myLevel.ordinal());

        switch (myLevel) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium Level");
                break;
            case HIGH:
                System.out.println("High Level");
                break;
            default:
                System.out.println("Unknown");
                break;
        }

        for (Level level : Level.values()) {
            System.out.println("---Constant---"); 
            System.out.println(level);
            // The enum constants properties
            System.out.println("--Properties--");
            System.out.println("Ordinal(predefined option): " + level.ordinal());
            System.out.println();
        }

        // Here we can see that enums are static classes, we are accessing values without instantiating an object
        for (Role role : Role.values()) {
            System.out.println("ROLE > " + role);
            role.printPermissions();
        }


        // Creating users with a role and using them for processing
        User manager1 = new User("Manager 1", Role.MANAGER);
        User employee1 = new User("Employee 1", Role.EMPLOYEE);
        User customer1 = new User("Customer 1", Role.CUSTOMER);

        List<User> users = List.of(manager1, employee1, customer1);

        for(User user: users) {
            String adjective = "";
            switch(user.getRole()) {
                case MANAGER:
                    adjective = "many";
                    break;
                case EMPLOYEE:
                    adjective = "some";
                  break;
                case CUSTOMER:
                    adjective = "few";
                    break;
                    default:
                        adjective = "weird";
                        break;

            }

            System.out.println(user.getName() + " has " + adjective + " permissions.");
            user.getRole().printPermissions();
        }

    }
}



