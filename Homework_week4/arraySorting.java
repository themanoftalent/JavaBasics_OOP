
/*burcinkutlusan*/
public class arraySorting {
    public static void main(String[] args) {
        int[] sayilar = {15, 868, 9119, 783};

        System.out.println();
        yazdir(sayilar);
        System.out.print("dizisinin sıralanmıs hali:");
        siralama(sayilar);
        System.out.println();
        yazdir(sayilar);
    }

    public static void siralama(int[] sayilar) {
        int n = sayilar.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sayilar[j] > sayilar[j + 1]) {
                    int a = sayilar[j];
                    sayilar[j] = sayilar[j + 1];
                    sayilar[j + 1] = a;
                }

            }

        }
    }
        public static void yazdir( int[] sayilar){
            for (int i = 0; i < sayilar.length; i++) {
                System.out.print(sayilar[i] + " ");
            }
        }
    }