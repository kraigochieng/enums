package dev.kraigochieng.enums;

public enum Role {
        // The enum constants of Role
        CUSTOMER(true, true, false, false),
        EMPLOYEE(true, true, true, false),
        MANAGER(true, true, true, true);

        // The properties of an enum constant
        private boolean create;
        private boolean read;
        private boolean update;
        private boolean delete;

        // Constructor used to make new enum constants
        Role(boolean create, boolean read, boolean update, boolean delete) {
            this.create = create;
            this.read = read;
            this.update = update;
            this.delete = delete;
        }

        public void printPermissions() {
            System.out.println("--PERMISSIONS--");
            System.out.println("C: " + this.create);
            System.out.println("R: " + this.read);
            System.out.println("U: " + this.update);
            System.out.println("D: " + this.delete);
            System.out.println();
        }
    }

