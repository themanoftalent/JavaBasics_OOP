package matris;
public class matris {
	    public static void main(String[] args) {

	        int[][] matris1 = { {1, 2}, {3, 4} };
	        int[][] matris2 = { {5, 6}, {7, 8} };
	        int[][] matrisToplam = new int[2][2];
	        int[][] matrisCikarma = new int[2][2];
	        int[][] matrisCarpma = new int[2][2];

	        
	        System.out.println("Toplam: ");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                matrisToplam[i][j] = matris1[i][j] + matris2[i][j];
	                System.out.print(matrisToplam[i][j] + " ");
	            }
	            System.out.println();
	        }

	        System.out.println("Çıkarma: ");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                matrisCikarma[i][j] = matris1[i][j] - matris2[i][j];
	                System.out.print(matrisCikarma[i][j] + " ");
	            }
	            System.out.println();
	        }

	       
	        System.out.println("Çarpma: ");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                for (int k = 0; k < 2; k++) {
	                    matrisCarpma[i][j] += matris1[i][k] * matris2[k][j];
	                }
	                System.out.print(matrisCarpma[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}