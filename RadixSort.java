
public class RadixSort {
	// Parametros
	private Cola[] Colas = new Cola[10]; // Arreglo de 10 colas necesarias para el sort
	
	// Constructor
	public RadixSort() {
		// Se crean las 10 colas
		for (int i = 0; i<=9; i++){ 
			Colas[i] = new Cola();
		}
	
	}
	
	public int[] Ordenar(int [] lista){
		int digito; // variable para el digito menos significativo del valor a guardar
		
		int divisor = 1; // Variable para poder realizar una division por multiplos de 10, y asi analisar el digito correcto.
		for(int i=0; i<10; i++){ // Este ciclo es para la cantidad de digitos. Se pueden ordenar numeros de hasta 10 digitos.
			 
			for (int j = 0; j<lista.length; j++ ){ // Este ciclo es para analizar cada valor de la lista de numeros
			
				digito = (lista[j] / divisor) % 10; // Se obtiene el digito que toca del numero a analizar.
				
				
				Colas[digito].Push(lista[j]); // El valor de la lista se guarda en la cola que corresponde al digito obtenido.
			}
			divisor = divisor *10; // Se aumenta el divisor para obtener el siguiente digito en la siguiente vuelta.
			int contador = 0; // Se fija un nuevo contador para saber en que posicion de la lista guardar los valores sacados de las colas
			for (int j = 0; j<=9; j++ ){ // Este ciclo rrecorre las 10 colas
				
				while (!Colas[j].isEmpty()){ // Este ciclo sigue hasta que la cola de turno quede vacia
					lista[contador] = Colas[j].Pop(); // Se van guardando los valores de la cola en la lista
					contador++; // se aumente el contador.
				}
				
			}
			
			
		}
		
		return lista;
		
		
	}
	
}
