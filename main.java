public class main {
	public static void main(String[] args) {
		int[] numeros =  {9, 6 , 7 , 8, 11, 63, 61, 234, 227, 233};
		
		
		RadixSort sort = new RadixSort();
		numeros = sort.Ordenar(numeros);
		for (int i = 0; i< numeros.length; i++){
		System.out.println(numeros[i]);
		}
	}
	
}
