package tugasmodul02;

public class nomor1 {

    public static void main(String[] args) {
        // TODO code application logic here
     int matriks[][] = {
         {34, 56, 41},
         {45, 36, 37},
         {51, 32, 46},
     };
     for (int x = 0; x < matriks.length; x++){
         for (int y = 0; y < matriks[0].length; y++){
             System.out.print(matriks[x][y] + " ");
         }
         System.out.println();
     }
     System.out.println();
     System.out.println(matriks[1][0]);
     System.out.println("muhammad affan tamami");
    }
}

