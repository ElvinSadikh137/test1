package az.lsim.test.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "city")
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class City implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;
    @Column(name = "name")
    String name;

}
