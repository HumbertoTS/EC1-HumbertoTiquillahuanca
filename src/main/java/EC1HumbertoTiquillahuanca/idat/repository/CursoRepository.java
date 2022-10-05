package EC1HumbertoTiquillahuanca.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EC1HumbertoTiquillahuanca.idat.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {

}
