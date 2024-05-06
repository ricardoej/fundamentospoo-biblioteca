package br.edu.univas.gerenciadorbiblioteca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n### MENU ###");
            System.out.println("1. Adicionar novo livro");
            System.out.println("2. Adicionar novo autor");
            System.out.println("3. Registrar novo usuário");
            System.out.println("4. Realizar empréstimo de livro");
            System.out.println("5. Devolver livro emprestado");
            System.out.println("6. Visualizar lista de livros disponíveis");
            System.out.println("7. Visualizar lista de empréstimos pendentes");
            System.out.println("8. Visualizar informações de um usuário específico");
            System.out.println("9. Visualizar informações de um livro específico");
            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarLivro();
                    break;
                case 2:
                    adicionarAutor();
                    break;
                case 3:
                    registrarUsuario();
                    break;
                case 4:
                    realizarEmprestimo();
                    break;
                case 5:
                    devolverLivro();
                    break;
                case 6:
                    visualizarLivrosDisponiveis();
                    break;
                case 7:
                    visualizarEmprestimosPendentes();
                    break;
                case 8:
                    visualizarInfoUsuario();
                    break;
                case 9:
                    visualizarInfoLivro();
                    break;
                case 0:
                    continuar = false;
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private static void adicionarLivro() {
        // Implemente a lógica para adicionar um novo livro à biblioteca
    }

    private static void adicionarAutor() {
        // Implemente a lógica para adicionar um novo autor à biblioteca
    }

    private static void registrarUsuario() {
        // Implemente a lógica para registrar um novo usuário da biblioteca
    }

    private static void realizarEmprestimo() {
        // Implemente a lógica para realizar um empréstimo de livro para um usuário
    }

    private static void devolverLivro() {
        // Implemente a lógica para devolver um livro emprestado
    }

    private static void visualizarLivrosDisponiveis() {
        // Implemente a lógica para visualizar a lista de livros disponíveis na biblioteca
    }

    private static void visualizarEmprestimosPendentes() {
        // Implemente a lógica para visualizar a lista de empréstimos pendentes
    }

    private static void visualizarInfoUsuario() {
        // Implemente a lógica para visualizar as informações de um usuário específico
    }

    private static void visualizarInfoLivro() {
        // Implemente a lógica para visualizar as informações de um livro específico
    }

}
