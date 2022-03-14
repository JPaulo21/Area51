package area51.Controller;

import area51.Exception.AlunoInvalidoException;
import area51.Model.Aluno;

public class ControllerAluno {
	


//==========================================================
	
	public AlunoInvalidoException validarAluno(Aluno aluno) {
		
		 AlunoInvalidoException alunoInvalidoException = null;
		
		
		if(aluno.getNome().trim().isEmpty() || aluno.getNome() == null) {
			if(alunoInvalidoException == null) {
				alunoInvalidoException = new AlunoInvalidoException();
			}
			
			alunoInvalidoException.setNomeVazio(true);
		}
		
		if(aluno.getNome().trim().split(" ").length <= 1) {
			if(alunoInvalidoException == null) {
				alunoInvalidoException = new AlunoInvalidoException();
			}
			
			alunoInvalidoException.setNomeInvalido(true);
			
		}

		if(aluno.getCpf().trim().isEmpty() || aluno.getCpf() == null) {
			if(alunoInvalidoException == null) {
				alunoInvalidoException = new AlunoInvalidoException();
			}
			
			alunoInvalidoException.setCpfVazio(true);
		}
		
		if(!aluno.getCpf().matches("\\d\\d\\d\\.\\d\\d\\d\\.\\d\\d\\d\\-\\d\\d")) {
			if(alunoInvalidoException == null) {
				alunoInvalidoException = new AlunoInvalidoException();
			}
			
			alunoInvalidoException.setCpfInvalido(true);
		}
//		
//		AlunoDAO alunoDAO = new AlunoDAO();
//		
//		if(alunoDAO.buscarCpfAluno(aluno.getCpf())){
//			inicializarAlunoException();
//			
//			alunoInvalidoException.setCpfExistente(true);
//		}
		
		if(aluno.getEmail().trim().isEmpty()) {
			if(alunoInvalidoException == null) {
				alunoInvalidoException = new AlunoInvalidoException();
			}
			
			alunoInvalidoException.setEmailVazio(true);
		}
		
		if(!aluno.getEmail().contains("@")) {
			if(alunoInvalidoException == null) {
				alunoInvalidoException = new AlunoInvalidoException();
			}
			
			alunoInvalidoException.setEmailInvalido(true);
		}
		
		if(!aluno.getEmail().contains(".com")) {
			if(alunoInvalidoException == null) {
				alunoInvalidoException = new AlunoInvalidoException();
			}
			
			alunoInvalidoException.setEmailInvalido(true);
		}
			
			
		return alunoInvalidoException;
	}
	
//=====================================================================
	
	public void cadastrarAluno(Aluno aluno) throws AlunoInvalidoException {
		
		//AlunoDAO alunoDAO = new AlunoDAO();
		
		AlunoInvalidoException alunoInvalidoException = validarAluno(aluno);
		
		if(alunoInvalidoException != null) {
			
			throw alunoInvalidoException;
		} else {
			
			System.out.println(2);
			//alunoDAO.cadastrar(aluno);
		}		
		
	}

}
