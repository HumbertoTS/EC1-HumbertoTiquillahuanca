package EC1HumbertoTiquillahuanca.idat.service;

import java.util.List;

import EC1HumbertoTiquillahuanca.idat.model.Curso;
import EC1HumbertoTiquillahuanca.idat.model.Universidad;

public interface CursoService {
	
	void guardar(Curso curso);
	void actualizar(Curso curso);
	void eliminar(Integer id);
	List<Curso> listar();
	Curso obtener(Integer id);

}
