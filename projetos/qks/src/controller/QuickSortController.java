package controller;

public class QuickSortController {
	public QuickSortController(){
		super();
	}

	public void ordenar (int[] vetor) {
		quick(vetor, 0, vetor.length-1);
	}

	private void quick (int [] vetor, int inicio, int fim){
		if (fim>inicio){
			int iPivo = dividir (vetor, inicio, fim);
			quick (vetor, inicio, iPivo - 1);
			quick (vetor, iPivo + 1, fim);
		}
	}
	
	private int dividir (int [] vetor, int inicio, int fim) {
		int pivo = vetor [inicio];
		int pDir = fim;
		int pEsq = (inicio + 1);

		while (pEsq <= pDir) {
			while (pEsq <= pDir && vetor [pEsq] <= pivo){
				pEsq++;
			}
			while (pDir >= pEsq && vetor[pDir] > pivo){
				pDir--;
			}
			if (pEsq<pDir)
				trocar (vetor, pDir--, pEsq++);
		}
		trocar (vetor, inicio, pDir);
		return pDir;
	}
	
	private void trocar (int[] vetor, int i, int j) {
		int temp = vetor[i];
		vetor[i] = vetor [j];
		vetor[j] = temp;
	}
}