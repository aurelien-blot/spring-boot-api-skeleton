package fr.adgsoftware.point_hebdo.dao;

import fr.adgsoftware.point_hebdo.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//TODO A supprimer à la fin
@Repository
public interface TestRepository extends JpaRepository<Test, Long> {

    List<Test> findByContentContainsIgnoreCase(String content);

}
