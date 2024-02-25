public class prg {

     public static void main(String[] args) {

         //parte1
         for (int i = 1; i <= 2500; i++) {
             System.out.println(i);
         }


         //parte2
         for (int n = 5; n <= 950; n += 5) {
             System.out.println(n);

         }


         //parte3

         for (int x = 1; x <= 100; x += 3) {
             System.out.println(x);

         }


         //parte4

         int numero = 800;

         while (numero >= 0){

             System.out.println(numero);
             numero -=2;
         }

      //parte5


         for (int z = 1; z <= 300; z++){
             System.out.print(z);
             if (z == 150){

                 System.out.println("Mitad del proceso");
             }

         }


         //parte6

         for (int a =1; a<= 500; a++){
             if (a  % 2 == 0){
                 System.out.print(a);
             }
             else {
                 System.out.print("no aplica este valor");
             }
         }
     }

}
