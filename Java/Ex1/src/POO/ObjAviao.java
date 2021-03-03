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
        System.out.println("Modelo do avião: "+ modelo.toUpperCase());
        System.out.println("Número de série: "+ id);
        System.out.println("Fabricante : " + fabricante);
        System.out.println("Cor do avião: " + cor.toUpperCase());  
        System.out.println("Capacidade: " + assentos );
        System.out.println("Velocidade máxima : " + velocidadeMaxima );
        System.out.println("--------------------------------------");
    }
	
}
