package biz.seagull.mycrmsea.model.user;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "authorities")
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private AuthorityName name;

    @ManyToMany(mappedBy = "authorities")
    private List<User> users = new ArrayList<>();
}
