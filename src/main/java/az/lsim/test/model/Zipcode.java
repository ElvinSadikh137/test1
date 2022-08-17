package az.lsim.test.model;

import az.lsim.test.repository.ZipcodeRepository;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "zipcode")
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@NamedEntityGraph(name = "zipcode_entity_graph",attributeNodes = @NamedAttributeNode("city"))
public class Zipcode implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;
    @Column(name = "zipcode_name")
    String zipcode_name;
    @OneToOne(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    @JoinColumn(name = "city_id", referencedColumnName = "id")
    City city;

}
