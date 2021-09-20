package br.com.faculdade.controllers;

import javax.swing.JOptionPane;

import br.com.faculdade.dao.AlunoDao;
import br.com.faculdade.models.Aluno;

public class ControllerAluno {

	public static void main(String[] args) {
		
		AlunoDao alunodao = new AlunoDao();
		
		boolean controller = true;
		String menu;
		
		while(controller) {
			menu = JOptionPane.showInputDialog(null,"Gerenciamento de Alunos \n1 - Cadastrar \n2 - Listar \n3 - Apagar \n4 - Sair", "Cadastro",2);
			switch (menu) {
			case "1" : {
				Aluno aluno = new Aluno();
				aluno.setNome(JOptionPane.showInputDialog("Digite seu nome:"));
				aluno.setCpf(JOptionPane.showInputDialog("Digite seu cpf:"));
				aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:")));
				
				alunodao.insert(aluno);
				break;
				}
			case "2" : {
				for (Aluno aluno : alunodao.lista()) {
					JOptionPane.showMessageDialog(null, aluno.getNome() + "\n" + aluno.getCpf() +"\n" + aluno.getIdade());
					}
				break;
				}
			
			case "3" : {
				Aluno aluno = new Aluno();
				aluno.setNome(JOptionPane.showInputDialog("Digite seu nome:"));
				alunodao.deleta(alunodao.getAluno(aluno.getNome()));
				
				break;
				}
			
			case "4" : {
				controller = false;
				break;
				}
			default : {
				JOptionPane.showMessageDialog(null, "O Cidadão, Digite apenas os números informados","Erro", 1);
				}
			}
		}


	}

}
