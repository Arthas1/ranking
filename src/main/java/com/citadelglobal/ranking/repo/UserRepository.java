package com.citadelglobal.ranking.repo;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete



import com.citadelglobal.ranking.entity.CitadelRanking;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface UserRepository extends CrudRepository<CitadelRanking, Long> {

    @Query(value = "SELECT * FROM citadel_ranking WHERE user = :player", nativeQuery = true)
    List<CitadelRanking> findByName(@Param("player") String player);


    @Query(value = "SELECT * FROM citadel_ranking WHERE user = :player AND pass =:pass", nativeQuery = true)
    List<CitadelRanking> loginUser(@Param("player") String player ,String pass);


    @Query(value = "SELECT * FROM citadel_ranking ORDER BY score DESC", nativeQuery = true)
    List<CitadelRanking> findByScore();



// @Query(nativeQuery = true, value = "SELECT * FROM RECTANGLE rect WHERE (2*rect.height + 2*rect.width) >= :size")
//
//    List<Rectangle> getBigRectangles(@Param("size") int size);
//
//
//
//    @Query(nativeQuery = true, value = "SELECT * FROM RECTANGLE rect WHERE (2*rect.height + 2*rect.width) < :size")
//
//    List<Rectangle> getSmallRectangles(@Param("size") int size);



}
