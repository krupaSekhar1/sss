package com.example.movie.repository; 
  import org.springframework.data.jpa.repository.JpaRepository;
  import org.springframework.stereotype.Repository;
  import com.example.movie.model.*;
 import java.util.*;
@Repository
 public interface MovieJpaRepository extends JpaRepository<Movie,Integer>{

 }