package az.lsim.test.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
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
    @Column(name = "author_name")
    String author_name;
    @JsonIgnore
    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "zipcode_id")
    Zipcode zipcode;
    @JsonIgnore
    @ManyToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    List<Book> books;

}
