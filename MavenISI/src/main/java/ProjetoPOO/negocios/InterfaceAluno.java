package ProjetoPOO.negocios;

import ProjetoPOO.entidades.Aluno;
import java.util.List;

public interface InterfaceAluno {
    
    public void adicionarAluno (Aluno aluno) throws AlunoExistenteException;
    public void atualizarAluno (Aluno aluno) throws AlunoInexistenteException;
    public void removerAluno (long numMatricula) throws AlunoInexistenteException;
    public List<Aluno> listarAluno();
    public Aluno buscarIdAluno(long numMatricula) throws AlunoInexistenteException;
    
}
