public class FindFactorialNumberUsingClassAndObject_2 {
    
    int i, fact=1, number=6;

    void display()
    {
        for(i=1;i<=number;i++)
        {    
             fact=fact*i;    
        }    

        System.out.println("Factorial of "+number+" is = "+fact);    
    }

   public static void main(String[] args) {
    
      FindFactorialNumberUsingClassAndObject_2 f = new FindFactorialNumberUsingClassAndObject_2();
      f.display();

   } 
   
}
