package model;

public class PilhaInt {

	No topo;
	
	public PilhaInt() {
		
		//CRIAR ESTRUTURA DA PILHA 
		topo = null;					//Uma Pilha que não tem nada ( VAZIA )
	}
	
	//TESTE DA PILHA VAZIA
	public boolean isEmpty() {
		if (topo == null) {
			return true;				//SE O TOPO É NULL -> A PILHA É VAZIA
		} else {
			return false;
		}
	}
	
	//EMPILHAMENTO ->>> PUSH -> PARA EMPILHAR NA PILHA 
	public void push(int e) {
		No elemento = new No();
		elemento.dado = e;
		
		if(isEmpty()) {						//AQUI ELE JÁ TESTA == TRUE
			topo = elemento;				//!isEmpty()) -> AO CONTRARIO DE TRUE, TESTA SE É FALSO
		} else {
			elemento.proximo = topo;
			topo = elemento;
		}
	}
	
	//REMOVER DA FILA ->>> TOP -> DESEMPILHAMENTO 
	//POSSO FAZER ISSO ATÉ A PILHA FICAR VAZIA
	public int pop() throws Exception {					//FORÇA TRATAR O ERRO
		if(isEmpty()) {
			throw new Exception("Não há elementos para desempilhar");		//ARREMESSA E FINALIZA
		}
		
		int valor = topo.dado;		//PEGA O DADO DO TOPO
		topo = topo.proximo;		//TOPO PASSA A SER O PROXIMO
		return valor;				//RETORNA O VALOR
	}
	
	//TOPO --> SABER VALOR QUE ESTÁ NO TOPO
	public int top() throws Exception {
		if(isEmpty()){
			throw new Exception("Não há elementos na pilha");
		}
		
		int valor = topo.dado;		//PEGA O DADO DO TOPO
		return valor;	
	}
	
	//CONTINUAR EM CASA:
	//TAMANHO -> SIZE
	public int size() {
		int cont = 0;
		if(!isEmpty()) {
			
			No auxiliar = topo;
			cont = 1;
			
			while(auxiliar.proximo != null) {
				auxiliar = auxiliar.proximo;
				cont++;
			}
		}
		
		return cont;
	}

}
