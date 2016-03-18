package circular;

public class Elemento implements Comparable<Elemento>{

	private int valor;
	private Elemento anterior;
	private Elemento proximo;
	
	
	public Elemento() {
		super();
	}
	
	public Elemento(int valor) {
		super();
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public Elemento getAnterior() {
		return anterior;
	}
	public void setAnterior(Elemento anterior) {
		this.anterior = anterior;
	}
	public Elemento getProximo() {
		return proximo;
	}
	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}

	@Override
	public int compareTo(Elemento o) {
		if(o.getValor()>valor){
			return 1;
		}
		return 0;
	}
	
	
	
}
