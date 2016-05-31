package ProjetoPOO.persistencias;

import ProjetoPOO.entidades.Avaliacao;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioAvaliacao extends CrudRepository<Avaliacao, Long> {

    public Avaliacao findByIdAvaliacao(long idAvaliacao);
}
