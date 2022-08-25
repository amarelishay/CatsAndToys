package com.jb.catsAndToys2.beans;

import lombok.*;
import org.springframework.boot.autoconfigure.batch.BatchDataSource;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "cats")
@Data
public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private float weight;
    @OneToMany(cascade = CascadeType.ALL)
    @Singular
    private List<Toy> toys;

}
