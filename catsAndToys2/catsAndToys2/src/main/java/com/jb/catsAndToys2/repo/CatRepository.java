package com.jb.catsAndToys2.repo;

import com.jb.catsAndToys2.beans.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<Cat,Integer> {
}
