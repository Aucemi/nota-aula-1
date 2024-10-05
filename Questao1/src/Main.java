import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.println("Digite seu nome: ");
        a.setNome(sc.next());

        System.out.println("Digite a primeira nota: ");
        a.setNota1(sc.nextDouble());

        System.out.println("Digite a segunda nota: ");
        a.setNota2(sc.nextDouble());

        System.out.println("Sigite a terceira nota: ");
        a.setNota3(sc.nextDouble());

        a.calcularMedia();
    }

}