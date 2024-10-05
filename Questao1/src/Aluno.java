public class Aluno {

    String nome;
    Double nota1, nota2, nota3, media;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public Double getNota1() {
        return nota1;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double guetNota2() {
        return nota2;
    }
    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }
    public double guetNota3() {
        return nota3;
    }
    public void calcularMedia() {
        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Sua media è: " + media);

    if ( (media) >= 7) {
        System.out.println("Aprovado");

    } else if ( (media) < 4) {
        System.out.println("Reprovado");

    } else {
        System.out.println("Esta na final");
        }

    }
}
