import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Carro meuCarro =  new  Carro("Fusca");
    Carro meuCarro1 =  new  Carro("Sandero");
    Carro meuCarro2 =  new  Carro("BMW");

    meuCarro.acelerar();
    meuCarro1.acelerar();
    meuCarro2.acelerar();

  }
}



/*
      ARRAY
       -Quando se cria uma array não se pode modificar a quantidade de elementos.
            int[] colecaoDeInteiros = {1, 2, 3, 4, 5, 33333};
      -Sempre precisa declarar a quantidade de valores da array, não da pra criar arrays vazios.
            int[] meuNumeros = new int[10];

      ArrayList<String> nomes = new ArrayList<>();
      nomes.add("Fernanda");
      nomes.add("Pedro");
      nomes.add("Gustavo");
      nomes.add("Joao");
      nomes.add("Lucas");

      System.out.println(nomes.toArray().length);
      //nomes.remove(0); //removendo por índice.
      //nomes.remove("Pedro");
      //System.out.println(nomes.get(2));
      System.out.println(nomes);

      /*for(int i = 0; i< nomes.size();i++){
          System.out.println(nomes.get(i));
      }

      for (String nome: nomes){
          System.out.println(nome);
      }
    */