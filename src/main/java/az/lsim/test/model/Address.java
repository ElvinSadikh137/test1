package az.lsim.test.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "address")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Address implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Long id;
    @Column(name="address_name")
    String addressName;
    @JsonIgnore
    @OneToOne(mappedBy = "address",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    User user;

}
