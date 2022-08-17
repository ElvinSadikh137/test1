package az.lsim.test.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @Column(name = "city_name")
    String city_name;
    @JsonIgnore
    @OneToOne(mappedBy = "city",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    Zipcode zipcode;
}
