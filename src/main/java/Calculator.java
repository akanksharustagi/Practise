public class Calculator {
 public int sum(int a, int b){
     return (a + b );
    }
    public int multiply ( int a, int b){
     return (a*b);
    }
    public int divide (int a, int b){
     if (b==0){
         throw new RuntimeException("you cant pass b as 0");
     }
     return a/b;
    }
}
