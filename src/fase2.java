
public class fase2 {

	public static void main(String[] args) {
		
		int any = 1948;
		int cadaQuan = 4; //es de traspas cada cuatre anys
		int contador = 0;
		
		for(int i=any; i<=1994; i=i+cadaQuan) {
			contador += 1;
		}
		
		System.out.println(contador+" anys de traspàs entre 1948 i 1994");
		
		
		

	}

}
