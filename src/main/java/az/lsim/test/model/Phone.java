package az.lsim.test.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "phone")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Long id;
    @Column(name = "phone")
    String phone;
    @Column(name = "phone_number")
    String phoneNumber;


    @OneToMany(mappedBy = "phone", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Student> student;


}
