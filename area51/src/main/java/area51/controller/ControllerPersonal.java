package area51.controller;

import java.util.List;

import area51.DAO.ExercicioDAO;
import area51.model.Exercicio;

public class ControllerPersonal {

	public List<Exercicio> classificarExercicio(String tipo) {
		
		ExercicioDAO exercicioDAO = new ExercicioDAO();
		List<Exercicio> exercicios = exercicioDAO.obterClassificacao(tipo);
				
		return exercicios;
	}
	
}
