package peixes.peixariaprojeto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import peixes.peixariaprojeto.Model.Peixe;


@Repository
public interface PeixeRepository extends JpaRepository<Peixe, Integer> {
}