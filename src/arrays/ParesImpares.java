package arrays;

import java.util.Scanner;

public class ParesImpares {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int arreglo[]=new int[10];
		int contPar=0, contImpar=0;
		
		for(int i=0; i<10;i++) {
			System.out.print(i+".- Digita un número: ");
			arreglo[i]=entrada.nextInt();
			
			if(arreglo[i]%2==0) {
				contPar++;
			}
			if(arreglo[i]%2!=0) {
				contImpar++;
			}
		}
		
		int par []= new int[contPar];
		int impar []= new int[contImpar];
		
		contPar=0;
		contImpar=0;
		
		for(int i=0; i<10; i++) {
		
			if(arreglo[i]%2==0) {
				par[contPar] = arreglo[i];
				contPar++;
			}
			else {
				impar[contImpar] = arreglo[i];
				contImpar++;
			
			}
			
			
	}
		
		for(int j=0; j<contPar; j++) {
			
			System.out.println("Los números pares son: "+par[j]);
			
			}
		
			for(int k=0; k<contImpar; k++) {
				System.out.println("Los números impares son: "+impar[k]);
			}
		

}}
