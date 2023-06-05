public class FindMaxMinValueUsingOneDimantionalArray_3 {
   
        public static void main(String[] args) {
            
            int a[] = new int [5];
    
            a[0] = 100;
            a[1] = 20;
            a[2] = 130;
            a[3] = 40;
            a[4] = 10;
    
            System.out.println("Array=");
    
            for(int i=0; i<5; i++)
            {
                    System.out.println(+a[i]);
            }
    
            for(int i=0; i<5; i++)
            {
                if(a[0]<a[i])
                {
                    a[0] = a[i];
                }
            }
    
            System.out.println("Max value of Array is = "+a[0]);

            for(int i=0; i<5; i++)
            {
                if(a[0]>a[i])
                {
                    a[0] = a[i];
                }
            }
    
            System.out.println("\nMin value of Array is = "+a[0]);
    
    
        }
    }
    

