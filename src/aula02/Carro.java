package aula02;

public class Carro {
    String nome;
    int odometro;
    int potencia;
    int peso;
    int tanqueCombustivel;
    String cor;
    int portas;
    int capacidadePessoas;
    Boolean limpo;

    void status(){
        System.out.println("Carro: " + this.nome);
        System.out.println("Rodou "  + this.odometro + " Km.");
        System.out.println("Tem " + this.potencia + "cv");
        System.out.println("Pesa  " + this.peso + "Kg");
        System.out.println("Combustível no tanque: " + this.tanqueCombustivel + "L");
        System.out.println("Cor: " + this.cor);
        System.out.println("Possui " + this.portas + " portas");
        System.out.println("Cabe " + this.capacidadePessoas + " pessoas");
        System.out.println("Está limpo? " + this.limpo + "\n");
    }

    void abastece(){
        this.tanqueCombustivel = 50;
    }
    void lavagem(){
        this.limpo = true;
    }
    void reserva(){
        if(this.tanqueCombustivel<=10){
            System.out.println("O carro está na reserva.");
        }else{
            System.out.println("O carro não está na reserva.");
        }
    }

}
