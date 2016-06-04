package ProjetoPOO.listar;

public class ListarAluno {

    private String listaNome;
    private int listaIdade;
    private String listaTelefone;
    private String listaRua;
    private String listaBairro;
    private String listaCidade;
    private long listaNumMatricula;
    private String listaSenha;
    //private List<Treino> ListaTreinoAlunos;
    //private List<Avaliacao> listaAvaliacaoAlunos; 

    public ListarAluno() {
    }

    public ListarAluno(String listaNome, int listaIdade, String listaTelefone, String listaRua, String listaBairro, String listaCidade, long listaNumMatricula, String listaSenha) {
        this.listaNome = listaNome;
        this.listaIdade = listaIdade;
        this.listaTelefone = listaTelefone;
        this.listaRua = listaRua;
        this.listaBairro = listaBairro;
        this.listaCidade = listaCidade;
        this.listaNumMatricula = listaNumMatricula;
        this.listaSenha = listaSenha;
    }

    public String getListaNome() {
        return listaNome;
    }

    public void setListaNome(String listaNome) {
        this.listaNome = listaNome;
    }

    public int getListaIdade() {
        return listaIdade;
    }

    public void setListaIdade(int listaIdade) {
        this.listaIdade = listaIdade;
    }

    public String getListaTelefone() {
        return listaTelefone;
    }

    public void setListaTelefone(String listaTelefone) {
        this.listaTelefone = listaTelefone;
    }

    public String getListaRua() {
        return listaRua;
    }

    public void setListaRua(String listaRua) {
        this.listaRua = listaRua;
    }

    public String getListaBairro() {
        return listaBairro;
    }

    public void setListaBairro(String listaBairro) {
        this.listaBairro = listaBairro;
    }

    public String getListaCidade() {
        return listaCidade;
    }

    public void setListaCidade(String listaCidade) {
        this.listaCidade = listaCidade;
    }

    public long getListaNumMatricula() {
        return listaNumMatricula;
    }

    public void setListaNumMatricula(long listaNumMatricula) {
        this.listaNumMatricula = listaNumMatricula;
    }

    public String getListaSenha() {
        return listaSenha;
    }

    public void setListaSenha(String listaSenha) {
        this.listaSenha = listaSenha;
    }

    
}
