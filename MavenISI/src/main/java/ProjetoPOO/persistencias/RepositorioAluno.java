package ProjetoPOO.persistencias;

import ProjetoPOO.entidades.Aluno;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface RepositorioAluno extends CrudRepository<Aluno, Long> {
    
    public Aluno findByNumMatricula(long numMatricula);
    public List<Aluno> findByNomeContaining(String nome);
    
}
