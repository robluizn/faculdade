package br.com.faculdade.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.faculdade.models.Aluno;

public class AlunoDao {
	
	List<Aluno> alunos = new ArrayList<Aluno>();
	
	public void insert(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public void deleta(Aluno aluno) {
		alunos.remove(aluno);
	}
	
	public List<Aluno> lista(){
		return alunos;
	}
	
	public Aluno getAluno(String nome) {
		
		Aluno alunoRet = new Aluno();
		
		for(Aluno aluno : alunos) {
			if(aluno.getNome().equals(nome)) {
				alunoRet = aluno;
			}
		}
		
		return alunoRet;
		
	}

}
