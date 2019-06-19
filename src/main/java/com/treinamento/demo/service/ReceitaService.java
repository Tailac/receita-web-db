package com.treinamento.demo.service;

import java.util.List;

import com.treinamento.demo.model.Receita;

public interface ReceitaService {
	
	Double calculaCalorias(Long id);
	Receita criaNovaReceita(Receita receita);
	Receita pesquisaReceita(Long id) throws Exception;
	List<Receita> pesquisaTodasReceita();
	List<Receita> pesquisaReceitaDescricao(String descricao);
	Receita deletaReceita(Long id);
	

}
