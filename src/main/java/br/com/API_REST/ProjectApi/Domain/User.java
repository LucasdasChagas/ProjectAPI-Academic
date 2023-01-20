package br.com.API_REST.ProjectApi.Domain;

import br.com.API_REST.ProjectApi.Dtos.UserDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "User")
@Table(name = "user")
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;

    @Column(unique = true)
    private String email;

    public User(UserDTO dados) {
        this.email = dados.name();
        this.name =  dados.email();
        this.password =  dados.password();
    }
}
