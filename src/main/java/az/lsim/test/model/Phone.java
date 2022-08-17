package az.lsim.test.model;

import liquibase.repackaged.org.apache.commons.lang3.builder.HashCodeExclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "phone")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;
    @Column(name = "phone")
    String phone;

    @Column(name = "phone_number")
    String phone_number;


    @OneToMany(mappedBy = "phone", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    List<Student> student;


}
