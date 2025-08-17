public class Carro {
    String modelo;
    public Carro(String modelo){
        this.modelo = modelo;
    }

    public void acelerar(){
        System.out.println("Acelerando o carro " + this.modelo);
    }
}
