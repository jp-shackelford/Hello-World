public class Hello {
   public static void main(String[] args) {
      System.out.println("Hello World!");
      System.out.println();
      int x = 0;
      int broke = 0;
      while(broke == 0) {
         if (Math.abs(x) < 0) {
            System.out.println("The value of x was" + x);
            System.out.println("absolutely strange");
            broke = 1;
         }
         x--;
      }
   }
}