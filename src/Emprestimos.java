import java.util.Arrays;

public class Emprestimos {
    String[] livros;
    String[] nomesLeitores;
    String[] devolucao;
    boolean[] estaEmprestado;

    public Emprestimos(String[] livrosDisponiveis) {
        this.livros = livrosDisponiveis;
        this.nomesLeitores = new String[livrosDisponiveis.length];
        this.devolucao = new String[livrosDisponiveis.length];
        this.estaEmprestado = new boolean[livrosDisponiveis.length];
        Arrays.fill(estaEmprestado, false);
    }

    //public Emprestimos(){}

    public void listarCatalogo(){
        System.out.println("Livros disponiveis: ");
        for(String livros : livros){
            System.out.println(livros);
        }
    }

    public void listarLivrosEmprestados(){
        System.out.println("Livros Emprestados: ");
        for (int i = 0; i < livros.length; i++) {
            if (estaEmprestado[i] == true){
                System.out.println("Nome livro: " + livros[i]);
                System.out.println("Nome do leitor: " + nomesLeitores[i]);
                System.out.println("Data de devolução: " + devolucao[i]);
            }
        }
    }

    public void emprestarLivro (String nomeDoLivro, String nomeDoLeitor, String dataDeDevolucao){
        for (int x = 0; x < livros.length; x++){
            if (estaEmprestado[x] == false){
                if(livros[x].equalsIgnoreCase(nomeDoLivro)) {
                    estaEmprestado[x] = true;
                    devolucao[x] = dataDeDevolucao;
                    nomesLeitores[x] = nomeDoLeitor;
                    System.out.println("O livro " + nomeDoLivro + " foi emprestado ao leitor " + nomeDoLeitor );
                    break;
                }
            }
        }
    }

    public void devolverLivro(String tituloLivro) {

        for (int i = 0; i < livros.length; i++) {
            if (livros[i].equalsIgnoreCase(tituloLivro)) {
                if (estaEmprestado[i]) {
                 estaEmprestado[i] = false;
                 nomesLeitores[i] = "";
                 devolucao[i] = "";
                 break;
                }
            }
        }

    }

}
