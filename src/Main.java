import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opc;

        Emprestimos emprestimos = new Emprestimos();

        do{
            System.out.println("Menu de opcoes");

            System.out.println("1 - Listar catalogo");
            System.out.println("2 - Listar livros emprestados");
            System.out.println("3 - Pegar o livro emprestado");
            System.out.println("4 - Devolver livro");
            System.out.println("5 - Sair do programa");
            System.out.println("Informe qual opcao deseja selecionar:");

            opc = scanner.nextInt();
            scanner.nextLine();

            switch (opc){
                case 1:
                    emprestimos.listarCatalogo();
                    break;
                case 2:
                    emprestimos.listarLivrosEmprestados();
                    break;
                case 3:
                    System.out.println("Lista de livros\n");
                    emprestimos.listarCatalogo();

                    System.out.println("\nInforme o nome do livro que deseja pegar emprestado:");
                    String nomeLivro = scanner.nextLine();
                    System.out.println("Informe o nome do Leitor:");
                    String leitor = scanner.nextLine();
                    System.out.println("Informe a data de devolucao:");
                    String data = scanner.nextLine();
                    emprestimos.emprestarLivro(nomeLivro, leitor, data);
                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("\nSaindo do programa...");
                    return;
                default:
                    System.out.println("\nNumero invalido, escolha novamente.");
            }

        }while(opc != 5);

        }

    }


