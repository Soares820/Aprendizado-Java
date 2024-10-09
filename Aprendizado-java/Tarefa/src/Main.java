public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
        System.out.println("\nMenu:");
        System.out.println("1. Adicionar Tarefa");
        System.out.println("2. Visualizar Tarefas");
        System.out.println("3. Editar Tarefa");
        System.out.println("4. Remover Tarefa");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        switch (opcao) {
        case 1:
        System.out.println("Digite o título da tarefa:");
        String titulo = scanner.nextLine();
        System.out.println("Digite a descrição da tarefa:");
        String descricao = scanner.nextLine();
        System.out.println("Digite o status da tarefa:");
        String status = scanner.nextLine();
        toDoList.adicionarTarefa(titulo, descricao, status);
        break;
        case 2:
        toDoList.visualizarTarefas();
        break;
        case 3:
        System.out.println("Digite o título da tarefa que deseja editar:");
        titulo = scanner.nextLine();
        toDoList.editarTarefa(titulo);
        break;
        case 4:
        System.out.println("Digite o título da tarefa que deseja remover:");
        titulo = scanner.nextLine();
        toDoList.removerTarefa(titulo);
        break;
        case 5:
        System.out.println("Saindo...");
        break;
default:
        System.out.println("Opção inválida!");
        }
        } while (opcao != 5);
        scanner.close();
        }
        }
}