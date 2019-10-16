package ba.unsa.etf.rpr;
import java.util.Scanner;


public class Main {

    static int sumaCifara(int x){
        int suma=0;
        do{
            suma=suma+x%10;
            x=x/10;
        }while(x>0);
        return suma;
    }

    public static void main(String[] args) {
	    Scanner ulaz=new Scanner(System.in);
	    int n;
	    n=ulaz.nextInt();
        for(int i=1;i<=n;i++){
	        if(i%sumaCifara(i)==0) System.out.println(i);
        }
    }
}
