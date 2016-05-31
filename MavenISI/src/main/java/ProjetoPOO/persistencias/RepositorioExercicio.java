package ProjetoPOO.persistencias;

import ProjetoPOO.entidades.Exercicio;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioExercicio extends CrudRepository<Exercicio, Long> {

    public Exercicio findByIdExercicio(long idExercicio);

}
