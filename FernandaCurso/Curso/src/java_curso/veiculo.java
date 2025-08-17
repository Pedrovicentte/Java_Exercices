package java_curso;

public class veiculo {
    String modelo;
    public veiculo(String modelo){
        this.modelo = modelo;
    }

    public void acelerar(){
        System.out.println("Acelerando o carro " + this.modelo);
    }
}
