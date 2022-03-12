package br.edu.ifsertaope.projeto_farmacia_02.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import br.edu.ifsertaope.projeto_farmacia_02.model.Medicamento;

public interface MedicamentoRepository extends CrudRepository<Medicamento, Integer>{
	
	List<Medicamento> findAll();
	
	Medicamento findById(int id);
	
	void delete(Medicamento medicamento);
	
	<Med extends Medicamento>Med save(Med medicamento);
}
