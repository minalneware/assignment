public class PrimeNum {

    public static void main(String[] args) {

  int x;
  int n = 1;
  int dc;

  while (n <= 100) {
    dc = 0;
    x = 2;
    while (x <= n / 2) {
     if (n % x == 0) {
      dc++;
      break;

    }
    x++;
   }
   if (dc == 0 && n != 1) 
   {
    System.out.print(n + " ");
   }
   
   n++;
  }

 }
}

