package pl.gromada.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.gromada.api.entity.EsportPlayer;

@Repository
public interface EsportPlayerRepository extends JpaRepository<EsportPlayer, Long> {
}
