package com.jb.catsAndToys2.clr;

import com.jb.catsAndToys2.beans.Cat;
import com.jb.catsAndToys2.beans.Toy;
import com.jb.catsAndToys2.repo.CatRepository;
import com.jb.catsAndToys2.repo.ToyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class Test implements CommandLineRunner {
   @Autowired
    private CatRepository catRepository;
   @Autowired
   private ToyRepository toyRepository;
   @Override
    public void run(String... args) throws Exception {
       Cat c1= Cat.builder().name("shimi").build();
       Cat c2= Cat.builder().name("eli").build();
       Toy toy1=new Toy("ball");
       Toy toy2=new Toy("basket");
       Toy toy3=new Toy("Snake");
       Toy toy4=new Toy("tetris");
       c1.getToys().add(toy1);
       c1.getToys().add(toy2);
       c2.getToys().add(toy3);
       c2.getToys().add(toy4);
       catRepository.save(c1);
       catRepository.save(c2);
    }
}
