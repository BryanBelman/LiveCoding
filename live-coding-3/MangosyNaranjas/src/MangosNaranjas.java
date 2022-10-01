import java.util.Scanner;

public class MangosNaranjas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce el número de mangos");
		System.out.println("Introduce el número de naranjas");
		
		Scanner mangos = new Scanner(System.in);
		int mango = mangos.nextInt();
		
		Scanner naranjas = new Scanner(System.in);
		int naranja = naranjas.nextInt();
		
		int cajas = mcd(mango,naranja);
		
		int cmango; 
		int cnaranja;
		
		if(mango<naranja) {
			cmango = naranja/(mcd(mango,naranja));
			cnaranja = mango/(mcd(mango,naranja));
		}else{
			cmango =  mango/(mcd(mango,naranja));
			cnaranja =  naranja/(mcd(mango,naranja));
		}//else
		
		
		System.out.println("El número de cajas es " + cajas + ". El número de mangos en una caja es: "
				+ cmango + ". El número de naranjas en una caja es " + cnaranja + ".");
		
		
	}//main
	public static int mcd(int a, int b) {
		if(a>b) {
		int div = a/b;
		int res = a%b;
		while(res !=0) {
			int temp = res;
			res = b%res;
			b = temp;
		}//while
		return b;
		}else {
			int div = b/a;
			int res = b%a;
			while(res !=0) {
				int temp = res;
				res = a%res;
				a = temp;
			}//while
			return a;
			
		}//else
	}
}//MangosNaranjas
