package br.edu.ifsertaope.projeto_farmacia_02.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import br.edu.ifsertaope.projeto_farmacia_02.model.Admin;
import br.edu.ifsertaope.projeto_farmacia_02.model.Medicamento;
import br.edu.ifsertaope.projeto_farmacia_02.repository.AdminRepository;
import br.edu.ifsertaope.projeto_farmacia_02.repository.MedicamentoRepository;

@RestController
@RequestMapping(value = "/farm")
public class Controle {
	@Autowired
	private AdminRepository acoesAdmin;
	@Autowired
	private MedicamentoRepository acoesMedicamento;
	
	@RequestMapping(value = "/farmacia", method = RequestMethod.GET)
	public @ResponseBody ModelAndView paginaInicial() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("paginaInicial");
		return mv;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public @ResponseBody ModelAndView paginaLogin() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;
	}
	
	@RequestMapping(value = "/cadastro", method = RequestMethod.GET)
	public @ResponseBody ModelAndView paginaCadastro() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("cadastro");
		return mv;
	}
	
	@RequestMapping(value = "/principal", method = RequestMethod.GET)
	public @ResponseBody ModelAndView paginaPrincipal() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("principal");
		return mv;
	}
	
	@RequestMapping(value = "/medicamentos", method = RequestMethod.GET)
	public @ResponseBody List<Medicamento> listarMedicamentos(){
		return this.acoesMedicamento.findAll();
	}
	
	@RequestMapping(value = "/administradores", method = RequestMethod.GET)
	public @ResponseBody List<Admin> listarAdmins(){
		return this.acoesAdmin.findAll();
	}
	
	@RequestMapping(value = "/medicamentos", method = RequestMethod.POST)
	public @ResponseBody Medicamento cadastrarMedicamento(@RequestBody Medicamento medicamento) {
		return this.acoesMedicamento.save(medicamento);
	}
	
	@RequestMapping(value = "/administradores", method = RequestMethod.POST)
	public @ResponseBody Admin cadastrarAdmin(@RequestBody Admin admin) {
		return this.acoesAdmin.save(admin);
	}
	
	@RequestMapping(value = "/medicamentos/{id}", method = RequestMethod.GET)
	public @ResponseBody Optional<Medicamento> filtrarMedicamento(@PathVariable Integer id) {
		return this.acoesMedicamento.findById(id);
	}
	
	@RequestMapping(value = "/administradores/{id}", method = RequestMethod.GET)
	public @ResponseBody Optional<Admin> filtrarAdmin(@PathVariable Integer id) {
		return this.acoesAdmin.findById(id);
	}
	
	@RequestMapping(value = "/medicamentos", method = RequestMethod.PUT)
	public @ResponseBody Medicamento alterarMedicamento(@RequestBody Medicamento medicamento){
		return this.acoesMedicamento.save(medicamento);
	}
	
	@RequestMapping(value = "/administradores", method = RequestMethod.PUT)
	public @ResponseBody Admin alterarAdmin(@RequestBody Admin admin){
		return this.acoesAdmin.save(admin);
	}
	
	@RequestMapping(value = "/medicamentos/{id}", method = RequestMethod.DELETE)
	public @ResponseBody void removerMedicamento(@PathVariable Integer id) {
		this.acoesMedicamento.deleteById(id);
	}
	
	@RequestMapping(value = "/administradores/{id}", method = RequestMethod.DELETE)
	public @ResponseBody void removerAdmin(@PathVariable Integer id) {
		this.acoesAdmin.deleteById(id);
	}
}
