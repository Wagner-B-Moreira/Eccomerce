
// Classe principal do sistema
public class EcommerceSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // leitura de dados do usuário
        List<Produto> produtos = new ArrayList<>(); // lista para armazenar produtos

        while (true) { // loop infinito até o usuário sair
            System.out.println("\n=== MENU E-Commerce ===");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // consumir quebra de linha

            if (opcao == 1) {
                System.out.print("Nome do produto: ");
                String nome = scanner.nextLine();
                System.out.print("Preço do produto: ");
                double preco = scanner.nextDouble();
                produtos.add(new Produto(nome, preco)); // adicionar produto
                System.out.println("Produto cadastrado com sucesso!");
            } else if (opcao == 2) {
                System.out.println("\n--- Lista de produtos ---");
                if (produtos.isEmpty()) {
                    System.out.println("Nenhum produto cadastrado.");
                } else {
                    for (Produto p : produtos) {
                        p.exibir();
                    }
                }
            } else if (opcao == 3) {
                System.out.println("Saindo do sistema...");
                break; // sair do loop
            } else {
                System.out.println("Opção inválida!");
            }
        }
        scanner.close(); // fechar scanner
    }
}
