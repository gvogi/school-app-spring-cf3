package gr.aueb.cf.schoolapp.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "USERS")
public class User {
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Long id;

    @Column(name = "USERNAME", unique = true)
    private String username;

    @Column(name = "PASSWORD")
    private String password;
}
