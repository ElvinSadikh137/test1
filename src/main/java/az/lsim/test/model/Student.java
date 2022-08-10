package az.lsim.test.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;
    @Column(name = "student_name")
    String name;
    @Column(name = "student_surname")
    String surname;
    @Column(name = "age")
    int age;
    @Column(name = "email")
    String email;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "phone_id",referencedColumnName = "id")
    Phone phone;


}
