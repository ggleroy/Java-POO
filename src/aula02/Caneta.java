package aula02;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Cor da caneta: " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Qual o tamanho da ponta? " + this.ponta);
        System.out.println("Qual o modelo da caneta? " + this.modelo);
        System.out.println("Carga: " + this.carga);
    }

    void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro! Não posso rabiscar\n");
        }else{
            System.out.println("Estou rabiscando\n");
        }

    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }
    
}
