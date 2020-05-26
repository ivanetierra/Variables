
public class fase4 {

	public static void main(String[] args) {

		String nomComplert = "Ivan Elizalde Arkharova.";
		String dataNaixement ="19/04/1994";
		
		int any = 1948;
		boolean deTraspas = false;
		
		int i;		
		for(i=any; i<=1994; i=i+4) {
			if(any == 1994) {
				deTraspas = true;
			}
		}
		
		
		String text;
		
		if(deTraspas) {
			text = "1994 es de traspaso.";
		}else {
			text = "1994 no es de traspaso.";
		}
		System.out.println("Mi nombre es "+nomComplert);
		System.out.println("naci el: "+dataNaixement);
		System.out.println(text);

	}

}
