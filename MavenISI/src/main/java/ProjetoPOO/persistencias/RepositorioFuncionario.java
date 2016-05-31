package ProjetoPOO.persistencias;

import ProjetoPOO.entidades.Funcionario;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioFuncionario extends CrudRepository<Funcionario, Long> {

    public Funcionario findByNumContrato(long numContrato);
    public List<Funcionario> findByNomeFunContaining(String nomeFun);

    
}
