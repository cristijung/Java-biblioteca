import java.util.Date;

public class Emprestimos {
    private String[] livrosDisponiveis;
    private String[] nomesLeitores;
    private String[] devolucao;

    public Emprestimos(String[] livrosDisponiveis, String[] nomesLeitores, String[] devolucao) {
        this.livrosDisponiveis = livrosDisponiveis;
        this.nomesLeitores = nomesLeitores;
        this.devolucao = devolucao;
    }

}
