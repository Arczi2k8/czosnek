public class Main {
    public static void sex(){
        double [] tablicaLiczb = new double [10];
        for (int i = 0; i < tablicaLiczb.length; i++) {
            tablicaLiczb[i] = (double) (Math.sqrt(i));
            System.out.println(tablicaLiczb[i]);
        }
    }
    public static int wyszukiwanieBinarne(int [] tablica, int liczba){
        int poczatek = 0;
        int koniec = tablica.length-1;

        while(poczatek <= koniec){
            int indeks = (koniec + poczatek)/2;
            if(tablica[indeks] > liczba){
                poczatek = indeks+1;
                System.out.println(poczatek);
            }
            else if (tablica[indeks] < liczba) {
                koniec = indeks-1;
                System.out.println(koniec);
            }
            else{
                System.out.println("tak"+indeks);
                return indeks;
            }
        }

        return 0;
    }
    public static void sex2(){
        int [] tablicaLiczb = new int [40];
        tablicaLiczb[0] = 0;
        tablicaLiczb[1] = 1;
        for (int i = 0; i < tablicaLiczb.length-2; i++) {
            tablicaLiczb[i+2] = tablicaLiczb[i] + tablicaLiczb[i+1];
        }
        for (int i = 0; i < tablicaLiczb.length; i++) {
            System.out.println(tablicaLiczb[i]);
        }
        wyszukiwanieBinarne(tablicaLiczb,24157817);


    }
    public static void main(String[] args) {
        sex();
        sex2();


    }

}