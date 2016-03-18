package circular;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ListaCircular lc = new ListaCircular();
		for(int i=0; i<=10;i++){
			lc.adicionarNoFim(new Elemento(i));
		}
		System.out.println("----LISTA-----");
		lc.listar();
		System.out.println("----POS 5-----");
		System.out.println(lc.getPosicao(5).getValor());
		System.out.println("----POS 9-----");
		System.out.println(lc.getPosicao(9).getValor());
		System.out.println("----POS 10-----");
		System.out.println(lc.getPosicao(10).getValor());
		
		/*System.out.println("----PONTEIRO-----");
		System.out.println("Valor: "+lc.getPonteiro().getValor());
		lc.proximo();
		lc.proximo();
		System.out.println("----PONTEIRO 2x-----");
		System.out.println("Valor: "+lc.getPonteiro().getValor());
		lc.proximo();
		lc.proximo();
		lc.proximo();
		lc.proximo();
		System.out.println("----PONTEIRO 4x-----");
		System.out.println("Valor: "+lc.getPonteiro().getValor());
		lc.proximo();
		lc.proximo();
		lc.proximo();
		lc.proximo();
		lc.proximo();
		lc.proximo();
		System.out.println("----PONTEIRO 6x-----");
		System.out.println("Valor: "+lc.getPonteiro().getValor());
		lc.anterior();
		lc.anterior();
		lc.anterior();
		lc.anterior();
		lc.anterior();
		lc.anterior();
		System.out.println("----PONTEIRO -6x-----");
		System.out.println("Valor: "+lc.getPonteiro().getValor());*/
		
		ArrayList<Elemento> lista = new ArrayList<>();
		for (int i = 0; i < 999999; i++) {
			lista.add(new Elemento(i));
		}
		System.out.println("Finalizado...");
		
		
	}

}
