package edu.up.bsi.soap.progserver;
import javax.jws.WebService;


@WebService
public class ProgressaoCalc {
	
	

	int i = 0;
	
	
	public int[] ProgressArit(int qtdNumero, int razao, int vPa) {
		
		int[] tamanhoVetor = new int[qtdNumero];
		 
		while(i < qtdNumero) {
			
			vPa = razao + vPa;
		
			tamanhoVetor[i] = vPa;
			i++;
		}
		
		return tamanhoVetor;
	}
	

}
