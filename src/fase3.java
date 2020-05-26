
public class fase3 {

	public static void main(String[] args) {
		
		int any = 1948;
		int i;
		boolean deTraspas = false;
		
		
		for(i=any; i<=1994; i=i+4) {
			System.out.println(i);
			if(any == 1994) {
				deTraspas = true;
			}
			
		}
		System.out.println("----");
		
		
		String text;
		
		if(deTraspas) {
			text = "1994 es de traspaso.";
		}else {
			text = "1994 no es de traspaso";
		}
		System.out.println(text);
		
		
		
		
		

	}

}