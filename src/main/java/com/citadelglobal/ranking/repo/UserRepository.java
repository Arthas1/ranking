package com.citadelglobal.ranking.repo;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete



import com.citadelglobal.ranking.entity.CitadelRanking;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<CitadelRanking, Integer> {
    //   public interface UserRepository extends JpaRepository<citadelranking, Integer> {

}



