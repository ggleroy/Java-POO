package aula02;

public class Aula02ex02 {
    public static void main(String[] args) throws InterruptedException {
        Carro c1 = new Carro();
        c1.nome = "Ricardinho";
        c1.odometro = 22500;
        c1.potencia = 82;
        c1.peso = 880;
        c1.tanqueCombustivel = 8;
        c1.cor = "Prata Lunar";
        c1.portas = 2;
        c1.capacidadePessoas = 5;
        c1.limpo = false;
        c1.status();
        Thread.sleep(2000);
        c1.abastece();
        c1.lavagem();
        c1.status();
    }
}
