package dev.kraigochieng.models;

import dev.kraigochieng.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class User {
    private String name;
    private Role role;
}
