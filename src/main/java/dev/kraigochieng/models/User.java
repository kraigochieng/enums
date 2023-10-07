package dev.kraigochieng.models;

import dev.kraigochieng.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*
NB:

This user is not connected to any database, this is just a demo
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private String name;
    /* 6.1. As you can see here, we shall use an enum to define the role of a user */
    private Role role;
}
