package com.citadelglobal.ranking.repo;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete



import com.citadelglobal.ranking.entity.citadelranking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface UserRepository extends CrudRepository<citadelranking, Integer> {
    //   public interface UserRepository extends JpaRepository<citadelranking, Integer> {

}



