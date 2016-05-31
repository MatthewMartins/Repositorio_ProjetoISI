package ProjetoPOO.entidades;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Treino {

    private long idBDTreino;

    private long idTreino;
    private String nomeTreino;
    private String dataExpiracao; //perguntar sobre anotação @temporal
    private Aluno aluno;
    private Funcionario funcionario;
    private List<Exercicio> exercicios;

    public Treino() {
        this.aluno = aluno;
        this.funcionario = funcionario;
        this.exercicios = exercicios;

    }

    public Treino(long idTreino, String nomeTreino, String dataExpiracao, Aluno aluno, Funcionario funcionario, List<Exercicio> exercicios) {
        this.idTreino = idTreino;
        this.nomeTreino = nomeTreino;
        this.dataExpiracao = dataExpiracao;
        this.aluno = aluno;
        this.funcionario = funcionario;
        this.exercicios = exercicios;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getIdBDTreino() {
        return idBDTreino;
    }

    public void setIdBDTreino(long idBDTreino) {
        this.idBDTreino = idBDTreino;
    }

    public long getIdTreino() {
        return idTreino;
    }

    public void setIdTreino(long idTreino) {
        this.idTreino = idTreino;
    }

    public String getNomeTreino() {
        return nomeTreino;
    }

    public void setNomeTreino(String nomeTreino) {
        this.nomeTreino = nomeTreino;
    }

    public String getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(String dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @OneToMany(mappedBy = "treino", fetch = FetchType.EAGER)
    public List<Exercicio> getExercicios() {
        return exercicios;
    }

    public void setExercicios(List<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }

}
