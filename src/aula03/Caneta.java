package aula03;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status(){
        System.out.println("Cor da caneta: " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Qual o tamanho da ponta? " + this.ponta);
        System.out.println("Qual o modelo da caneta? " + this.modelo);
        System.out.println("Carga: " + this.carga);
    }

    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro! Não posso rabiscar\n");
        }else{
            System.out.println("Estou rabiscando\n");
        }

    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }
    
}
