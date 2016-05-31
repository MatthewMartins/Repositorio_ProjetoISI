package ProjetoPOO.negocios;
import ProjetoPOO.entidades.Exercicio;
import java.util.List;

public interface InterfaceExercicio {

    public void adicionarExercicio(Exercicio exercicio) throws ExercicioExistenteException;

    public void atualizarExercicio(Exercicio exercicio) throws ExercicioInexistenteException;

    public void removerExercicio(long idExercicio) throws ExercicioInexistenteException;

    public List<Exercicio> listarExercicio();

    public Exercicio buscarExercicioId(long idExercicio) throws ExercicioInexistenteException;

}
