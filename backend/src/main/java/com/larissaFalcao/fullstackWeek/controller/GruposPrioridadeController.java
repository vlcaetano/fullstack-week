package com.larissaFalcao.fullstackWeek.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.larissaFalcao.fullstackWeek.domain.GruposPrioridades;
import com.larissaFalcao.fullstackWeek.repository.GruposPrioridadesRepository;

@RestController
@RequestMapping("/grupos-prioridades")
public class GruposPrioridadeController {
	
	@Autowired
	private GruposPrioridadesRepository gruposPrioridadesRepository;
	
	@GetMapping
	public List<GruposPrioridades> listarTodos() {
		return gruposPrioridadesRepository.findAll();
	}
	
	@GetMapping("/{codigo}")
	public GruposPrioridades buscarPeloCodigo(@PathVariable Long codigo) {
		return gruposPrioridadesRepository.findById(codigo).orElse(null);
	}
}
