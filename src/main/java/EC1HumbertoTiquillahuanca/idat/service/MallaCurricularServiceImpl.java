package EC1HumbertoTiquillahuanca.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EC1HumbertoTiquillahuanca.idat.model.MallaCurricular;
import EC1HumbertoTiquillahuanca.idat.repository.MallaCurricularRepository;

@Service
public class MallaCurricularServiceImpl implements MallaCurricularService {

	@Autowired
	private MallaCurricularRepository repositorio;
	
	@Override
	public void guardar(MallaCurricular malla) {
		// TODO Auto-generated method stub
		repositorio.save(malla);
	}

	@Override
	public void actualizar(MallaCurricular malla) {
		// TODO Auto-generated method stub
		repositorio.saveAndFlush(malla);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

	@Override
	public List<MallaCurricular> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public MallaCurricular obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

}
