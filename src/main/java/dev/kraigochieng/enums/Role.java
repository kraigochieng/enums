package dev.kraigochieng.enums;


/*
The sections of an enum with properties and methods is as follows:
1. Enum Constants
2. Properties
3. Constructor
4. Methods
*/

public enum Role {
        /* 5.3 The enum constants that are being created from the  */
        CUSTOMER(true, true, false, false),
        EMPLOYEE(true, true, true, false),
        MANAGER(true, true, true, true);

        /* 5.1. Define the properties */
        private final boolean create;
        private final boolean read;
        private final boolean update;
        private final boolean delete;

        /* 5.2. Constructor to allow us to create enum constants that will have the following properties */
        Role(boolean create, boolean read, boolean update, boolean delete) {
            this.create = create;
            this.read = read;
            this.update = update;
            this.delete = delete;
        }

        /* 5.4. Properties */
        public void printPermissions() {
            System.out.println("--PERMISSIONS--");
            System.out.println("C: " + this.create);
            System.out.println("R: " + this.read);
            System.out.println("U: " + this.update);
            System.out.println("D: " + this.delete);
            System.out.println();
        }
    }

