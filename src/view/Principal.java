package view;

import model.PilhaInt;

public class Principal {

	public static void main(String[] args) {
		PilhaInt p = new PilhaInt();
		
		//Recebe a referência do próximo, até que seja NULL;
		p.push(0);
		p.push(1);
		p.push(2);
		
		try {
			int valor = p.pop();
			System.out.println("Pop: " + valor);
			
			valor = p.pop();
			System.out.println("Pop: " + valor);
		} catch (Exception e) {
			e.printStackTrace();				//SE FICAR SOZINHA, RETORNA ERRO
		}
		
		//VERIFICAR O TAMANHO DA PILHA
		int tamanho = p.size();
		System.out.println ("Tamanho da pilha: " + tamanho);
		
		//VERIFICAR SE ESTÁ VAZIA;
		
	// boolean vazia = p.isEmpty();
	// System.out.println(vazia);
		
		//VERIFICAR O TOPO
		int top = 0;
		try {
			top = p.top();
			System.out.println(top);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(top);

	}

}
