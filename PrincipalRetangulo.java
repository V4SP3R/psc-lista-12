import java.util.Scanner;

public class PrincipalRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a base do local (em metros): ");
        double base = scanner.nextDouble();

        System.out.print("Informe a altura do local (em metros): ");
        double altura = scanner.nextDouble();

        Retangulo local = new Retangulo(base, altura);

        double area = local.calcularArea();
        double perimetro = local.calcularPerimetro();

        System.out.println("Área do local: " + area + " m²");
        System.out.println("Perímetro do local: " + perimetro + " m");
        System.out.println("Quantidade de pisos necessários: " + Math.ceil(area));
        System.out.println("Quantidade de rodapés necessários: " + Math.ceil(perimetro));

        scanner.close();
    }
}