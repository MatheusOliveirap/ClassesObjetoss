
package testeobj;


public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidade;

    // Construtor da classe
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0; // Inicialmente, a velocidade é 0
    }

    // Método para acelerar o carro
    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidade += incremento;
            System.out.println("O carro acelerou em " + incremento + " km/h.");
        } else {
            System.out.println("Valor de aceleração inválido.");
        }
    }

    // Método para desacelerar o carro
    public void desacelerar(double decremento) {
        if (decremento > 0 && velocidade >= decremento) {
            velocidade -= decremento;
            System.out.println("O carro desacelerou em " + decremento + " km/h.");
        } else {
            System.out.println("Desaceleração inválida. Verifique o valor e a velocidade atual.");
        }
    }

    // Método para exibir a velocidade atual
    public void exibirVelocidade() {
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }
}
