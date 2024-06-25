import java.util.Date;

public class Emprestimos {
    String[] livrosDisponiveis;
    String[] nomesLeitores;
    String[] devolucao;
    boolean[] estaEmprestado;

    public Emprestimos(String[] livrosDisponiveis, String[] nomesLeitores, String[] devolucao) {
        this.livrosDisponiveis = livrosDisponiveis;
        this.nomesLeitores = nomesLeitores;
        this.devolucao = devolucao;
    }

    public void listarCatalogo(){
        System.out.println("Livros disponiveis: ");
        for(String livros : livrosDisponiveis){
            System.out.println(livros);
        }
    }

    public void listarLivrosEmprestados(){
        System.out.println("Livros Emprestados: ");
        for (int i = 0; i < livrosDisponiveis.length; i++) {
            if (estaEmprestado[i] == true){
                System.out.println("Nome livro: " + livrosDisponiveis[i]);
                System.out.println("Nome do leitor: " + nomesLeitores[i]);
                System.out.println("Data de devolução: " + devolucao[i]);
            }
        }
    }

}
