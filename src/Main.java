public class Main {
    public static void sex(){
        double [] tablicaLiczb = new double [10];
        for (int i = 0; i < tablicaLiczb.length; i++) {
            tablicaLiczb[i] = (double) (Math.sqrt(i));
            System.out.println(tablicaLiczb[i]);
        }
    }
    public static int wyszukiwanieBinarne(int [] tablica, int liczba){

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



    }
    public static void main(String[] args) {
        sex();
        sex2();

    }

}