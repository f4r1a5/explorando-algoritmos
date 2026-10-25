
import java.util.ArrayList;
import java.util.Scanner;

public class ListaTarefas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n=== LISTA DE TAREFAS ===");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");

            opcao = entrada.nextInt();
            entrada.nextLine();

            if (opcao == 1) {

                System.out.print("Digite a tarefa: ");
                String tarefa = entrada.nextLine();

                tarefas.add(tarefa);

                System.out.println("Tarefa adicionada!");

            } else if (opcao == 2) {

                if (tarefas.isEmpty()) {
                    System.out.println("Nenhuma tarefa cadastrada.");
                } else {
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println(
                            i + ". " + tarefas.get(i)
                        );
                    }
                }

            } else if (opcao == 0) {

                System.out.println("Encerrando o programa.");

            } else {

                System.out.println("Opcao invalida.");
            }
        }

        entrada.close();
    }
}
