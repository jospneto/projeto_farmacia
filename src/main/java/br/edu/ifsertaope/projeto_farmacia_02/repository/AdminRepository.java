package br.edu.ifsertaope.projeto_farmacia_02.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.edu.ifsertaope.projeto_farmacia_02.model.Admin;
import br.edu.ifsertaope.projeto_farmacia_02.model.Medicamento;

public interface AdminRepository extends CrudRepository<Admin, Integer>{
	
	List<Admin> findAll();
	
	Admin findById(int id);
	
	void delete(Admin admin);
	
	<Ad extends Admin>Ad save(Ad admin);	
}
