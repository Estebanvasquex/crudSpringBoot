package crudSpringBoot.crudSpringBoot.entity;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private String name;
    private String surname;
    private String patronymic;
    private String email;
    private String password;
}
