public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void envelhecer() {
        if (idade < 21) {
            crescer(0.5);
        }
        idade++;
    }

    public void engordar(double quilos) {
        peso += quilos;
    }

    public void emagrecer(double quilos) {
        peso -= quilos;
    }

    public void crescer(double centimetros) {
        altura += centimetros / 100;
    }
}