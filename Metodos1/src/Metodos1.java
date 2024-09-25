class Metodos{

    // Método que verifica se um número é positivo ou negativo (considerando zero como positivo)
    public void verificarPositivoNegativo(int numero) {
        if (numero >= 0) {
            System.out.println(numero + " é positivo.");
        } else {
            System.out.println(numero + " é negativo.");
        }
    }

    // Metodo que recebe 3 numeros e informa a média aritmética
    public double calcularMediaAritmetica(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    // Método que recebe três números e retorna o maior
    public double encontrarMaior(double num1, double num2, double num3) {
        double maior = num1;  //Assumimos inicialmente que num1 é o maior
        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }
        return maior;
    }

    // Método que recebe dois números, a e b, e retorna a elevado à potência b (ab)
    public double elevarPotencia(double a, int b) {
        double resultado = 1;
        for (int i = 0; i < b; i++) {
            resultado *= a;
        }
        return resultado;
    }

    // Método que recebe uma quantidade de minutos e retorna o equivalente em horas e minutos
    public void converterMinutosParaHoras(int minutos) {
        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;
        System.out.println(minutos + " minutos = " + horas + " hora(s) e " + minutosRestantes + " minuto(s).");
    }

    // Método que retorna o fatorial de um número informado por parâmetro
    public int calcularFatorial(int numero) {
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
public class Metodos1{
    // Método principal para testar os outros métodos
    public static void main(String[] args) {
        Metodos util = new Metodos();

        // Testando o método de positivo ou negativo
        util.verificarPositivoNegativo(-5);
        util.verificarPositivoNegativo(0);

        // Testando o cálculo da média aritmética
        double media = util.calcularMediaAritmetica(7.5, 8.0, 9.0);
        System.out.println("Média aritmética: " + media);

        // Testando encontrar o maior número
        double maior = util.encontrarMaior(3.5, 7.0, 5.5);
        System.out.println("Maior número: " + maior);

        // Testando a conversão de minutos para horas
        util.converterMinutosParaHoras(90);

        // Testando o cálculo do fatorial
        int fatorial = util.calcularFatorial(5);
        System.out.println("Fatorial de 5 = " + fatorial);
    }
}
}
