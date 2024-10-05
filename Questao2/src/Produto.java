public class Produto {
    private String nome, cor, tamanho, peso;
    private int codigo, quantidadeEstoque;
    private double valor;

    public Produto(String nome,
                   String cor,
                   String tamanho,
                   String peso,
                   int codigo,
                   int quantidadeEstoque,
                   double valor) {
        this.nome = nome;
        this.cor = cor;
        this.tamanho = tamanho;
        this.peso = peso;
        this.codigo = codigo;
        this.quantidadeEstoque = quantidadeEstoque;
        this.valor = valor;
    }

    public Produto() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setQuantidadeEstoue(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getPeso() {
        return peso;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", peso='" + peso + '\'' +
                ", codigo=" + codigo +
                ", quantidadeEstoque=" + quantidadeEstoque +
                ", valor=" + valor +
                '}';
    }
}
