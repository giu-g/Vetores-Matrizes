package pctExercicio03;

public class Exercicio03 {

	public static void main(String[] args) {
		int[] vet1 = new int[10];
		int[] vet2 = new int[10];
		int[] vet3 = new int[10];

		vet1[0]=1;
	    vet1[1]=2;
	    vet1[2]=3;
	    vet1[3]=4;
	    vet1[4]=5;
	    
		vet2[0]=6;
	    vet2[1]=7;
	    vet2[2]=8;
	    vet2[3]=9;
	    vet2[4]=0;
	    
	    
		for (int i = 0; i < 5; i++) {
			vet3[i]=vet1[i]+vet2[i];
	}
		for (int i = 0; i < 5; i++) {
		System.out.println(vet3[i]);
		}
}
}
