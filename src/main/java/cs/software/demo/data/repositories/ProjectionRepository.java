package cs.software.demo.data.repositories;

import cs.software.demo.data.entities.Projection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectionRepository extends JpaRepository<Projection, String> {
    // DEFAULT
}
