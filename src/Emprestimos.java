public class Emprestimos {
    String[] livros;
    String[] nomesLeitores;
    String[] devolucao;
    boolean[] estaEmprestado;

    public Emprestimos(String[] livrosDisponiveis, String[] nomesLeitores, String[] devolucao) {
        this.livros = livrosDisponiveis;
        this.nomesLeitores = nomesLeitores;
        this.devolucao = devolucao;
    }

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
                    System.out.println("O livro " + nomeDoLivro + " foi emprestado ao leitor " + nomeDoLeitor );
                }
            }
            else{
                System.out.println("O livro não esta disponível.");
            }
        }
    }

}
