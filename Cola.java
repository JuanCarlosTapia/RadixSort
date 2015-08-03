public class Cola {
	// Parametros
	private boolean Empty;
	private Nodo Cabeza;
	private Nodo Actual;
	
	// Constructor
	public Cola() {
		this.Empty = true;
		Cabeza = null;
		Actual = Cabeza;
	}
	
	// Getters y Setters
	public boolean isEmpty() {
		return Empty;
	}

	public void setEmpty(boolean empty) {
		Empty = empty;
	}

	public Nodo getCabeza() {
		return Cabeza;
	}

	public void setCabeza(Nodo cabeza) {
		Cabeza = cabeza;
	}

	public Nodo getActual() {
		return Actual;
	}

	public void setActual(Nodo actual) {
		Actual = actual;
	}

	public void Push(int valor){ // Metodo para meter valores en la cola
		if(Empty){
			Cabeza = new Nodo(valor);
			Actual = Cabeza;
			Empty = false;
			return;
		}
		
			Nodo newNodo = new Nodo(valor);
			Actual.setSiguiente(newNodo);
			Actual = newNodo;
	}

	public int Pop(){ // Metodo para sacar valores de la cola
		if(Empty){
			return -1;
		}
		if(Cabeza.getSiguiente()==null){
			int regreso = Cabeza.getValor();
			Empty=true;
			Cabeza = null;
			Actual = Cabeza;
			return regreso;
		}
		int regreso = Cabeza.getValor();
		Cabeza = Cabeza.getSiguiente();
		return regreso;
	}
	
}

