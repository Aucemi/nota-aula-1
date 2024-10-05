import java.util.List;

public class Loja {
    private List<Produto> produtos;

    public Loja(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Loja() {
    }

    public void cadastrarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public String venderProduto(int codigo, String tipoPagamento, int quantidade, double valor) {
        for (Produto p: this.produtos) {
            if (p.getCodigo() == codigo) {
                if (p.getQuantidadeEstoque() < quantidade) {
                    System.out.println("A quantidade informada é maior do que a do estoque.");
                }

                double valorFinal = p.getValor() * quantidade;

                if (tipoPagamento.equals("pix") ||
                        tipoPagamento.equals("especie") ||
                        tipoPagamento.equals("transferencia") ||
                        tipoPagamento.equals("debito")) {
                    valorFinal =  valorFinal - ((5 * valorFinal) / 100);

                }

                p.setQuantidadeEstoue(p.getQuantidadeEstoque() - quantidade);

                if (tipoPagamento.equals("especie") && valor > p.getValor()) {
                    return "Produto de código" + p.getCodigo() + " vendido por " + valorFinal + "." +
                            " \n Estoque atual: " + p.getQuantidadeEstoque() + "\n Troco: " + (valor - p.getValor());
                }

                String mensagem = "Produto de código" + p.getCodigo() + " vendido por " + valorFinal + "." +
                        " \n Estoque atual: " + p.getQuantidadeEstoque() + "\n";

                if (tipoPagamento.equals("credito")) {
                    mensagem = mensagem + "Parcelado em 3x (sem juros)";
                }

                return mensagem;

            }

        }

        return "Produto não existe";
    }

    public void exibirProdutos() {
        for (Produto p: this.produtos) {
            System.out.println(p.toString());
        }
    }
}
