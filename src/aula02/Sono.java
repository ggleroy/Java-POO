package aula02;
public class Sono{
    int horas;
    String qualidade;

    void status(){
        System.out.println("Você dormiu: " + this.horas + " horas.");
        System.out.println("Seu sono foi de qualidade: " + this.qualidade);
    }

    void aptoTreinar(){
        if ( this.horas > 6 || (this.horas > 4 && this.qualidade != "ruim")){
            System.out.println("Você está apto a treinar.\n");
        }else{
            System.out.println("Você não está apto a treinar.\n");
        }
    }
}