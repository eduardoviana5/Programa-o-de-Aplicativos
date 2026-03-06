public class carro {
    String marca;
    int velocidade_atual = 0;
    int velocidade_maxima;

    public carro(String marca, int velocidade_maxima) {
        this.marca = marca;
        this.velocidade_maxima = velocidade_maxima;
    }

    public void acelerar(int valor) {
        velocidade_atual += valor;
        if (velocidade_atual > velocidade_maxima) {
            velocidade_atual = velocidade_maxima;
        }
    }

    public void frear(int valor) {
        if (valor <= velocidade_atual) {
            velocidade_atual -= valor;
        } else {    
            System.out.println("Não pode frear mais que a velocidade atual!");
        }
    }


    public int getVelocidadeAtual() { 
        return velocidade_atual;
    }

    public int getVelocidadeMaxima() { 
        return velocidade_maxima;
    }
}
