import java.util.Scanner;

public class SistemaDeControle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Loja loja = new Loja();

        int opcao;
        do {

            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Realizar Venda");
            System.out.println("3. Exibir Produtos");
            System.out.println("4. Sair");
            opcao = (sc.nextInt());

            switch (opcao) {

                case 1:
                    Produto newProduto = new Produto();

                    System.out.println("Nome: ");
                    newProduto.setNome(sc.next());

                    System.out.println("Cor: ");
                    newProduto.setCor(sc.next());

                    System.out.println("Tamanho: ");
                    newProduto.setTamanho(sc.next());

                    System.out.println("Peso: ");
                    newProduto.setPeso(sc.next());

                    System.out.println("Código: ");
                    newProduto.setCodigo(sc.nextInt());

                    System.out.println("Quantidade estoque: ");
                    newProduto.setQuantidadeEstoue(sc.nextInt());

                    System.out.println("Valor: ");
                    newProduto.setValor(sc.nextDouble());

                    loja.cadastrarProduto(newProduto);
                    System.out.println("Produto cadastrado!");
                    break;
                case 2:
                    System.out.println("Código: ");
                    int codigo = sc.nextInt();

                    System.out.println("Tipo de pagamento: ");
                    String tipoPagamento = sc.next();

                    System.out.println("Quantidade: ");
                    int quantidade = sc.nextInt();

                    System.out.println("Valor: ");
                    double valor = sc.nextDouble();
                    System.out.println(loja.venderProduto(codigo, tipoPagamento, quantidade, valor));

                    System.out.println("Compra efetuada com sucesso!");
                    break;
                case 3:
                    loja.exibirProdutos();
                    break;
                case 4:
                    System.out.println("Saindo...");
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 4);

    }
}
