package EC1HumbertoTiquillahuanca.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EC1HumbertoTiquillahuanca.idat.model.Curso;
import EC1HumbertoTiquillahuanca.idat.repository.CursoRepository;

@Service
public class CursoServiceImpl implements CursoService {

	@Autowired
	private CursoRepository repositorio;
	
	@Override
	public void guardar(Curso curso) {
		// TODO Auto-generated method stub
		repositorio.save(curso);
	}

	@Override
	public void actualizar(Curso curso) {
		// TODO Auto-generated method stub
		repositorio.saveAndFlush(curso);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

	@Override
	public List<Curso> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Curso obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

}
