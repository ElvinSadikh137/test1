package az.lsim.test.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "author")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Author implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;
    @Column(name = "name")
    String name;

    @ManyToOne
    @JoinColumn(name = "zipcode_id")
    Zipcode zipcode;
    @JsonIgnore
    @ManyToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Book> books;

}
