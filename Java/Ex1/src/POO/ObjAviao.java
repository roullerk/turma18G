package POO;

public class ObjAviao {

    double velocidadeMaxima;
    String cor;
    String modelo;
    int assentos;
    int id;
    String fabricante;



    public void Dados() {
        System.out.println("--------------------------------------");
        System.out.println("           DADOS DA AERONAVE:         ");
        System.out.println("--------------------------------------");
        System.out.println("Modelo do avi�o: "+ modelo.toUpperCase());
        System.out.println("N�mero de s�rie: "+ id);
        System.out.println("Fabricante : " + fabricante);
        System.out.println("Cor do avi�o: " + cor.toUpperCase());  
        System.out.println("Capacidade: " + assentos );
        System.out.println("Velocidade m�xima : " + velocidadeMaxima );
        System.out.println("--------------------------------------");
    }
	
}
