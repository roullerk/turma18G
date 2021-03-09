package ClienteObjeto;

public class ContaCorrente extends Conta {
	//MATHEUS
	
		
		private double valor = 0;
		private int qtdTalao=3;
		 /*constructor*/
		
	
			
		public ContaCorrente (String nomeCliente, String cpf) {
			super(nomeCliente, cpf);
			
		}
		
		public ContaCorrente (int qtdTalao, String nomeCliente, String cpf) {
			super(nomeCliente, cpf);
			this.qtdTalao = qtdTalao;
		} 
			
	
		public int getContadorTalao() {
			return qtdTalao;
		}

		public void setContadorTalao(int contadorTalao) {
			this.qtdTalao = contadorTalao;
		}
		 public double getValor() {
				return valor;
		}
		public void setValor(double valor) {
			this.valor = valor;
		}
		//metodo cheque 
		public void pedirTalao(int talao) {
			if (qtdTalao > 0) 
			{
			qtdTalao--;
			System.out.printf("Voc� solicitou um tal�o!\nTal�es dispon�veis: %d\n", qtdTalao);
			} 
		else 
			{
			 System.out.printf("Voc� j� atingiu seu limite de tal�es mensais %d",qtdTalao,"e n�o pode solicitar novos.");
			}	
		}
		
			
 }

			

	