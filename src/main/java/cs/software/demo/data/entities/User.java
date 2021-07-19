package cs.software.demo.data.entities;

import cs.software.demo.data.AuthProvider;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column
    private String googleId;

    @Column(nullable = true)
    private String role;

    @Column(nullable = true)
    private String imageUrl;

    private AuthProvider provider;

    public User(){
        //default implementation ignored
    }

}
