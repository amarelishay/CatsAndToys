package com.jb.catsAndToys2.repo;

import com.jb.catsAndToys2.beans.Toy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToyRepository extends JpaRepository<Toy,Integer> {
}
