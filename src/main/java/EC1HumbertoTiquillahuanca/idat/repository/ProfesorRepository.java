package EC1HumbertoTiquillahuanca.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EC1HumbertoTiquillahuanca.idat.model.Profesor;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Integer> {

}
