public class FindMinElementUsingOneDimantionalArray {
    
    public static void main(String[] args) {
        
        int a[] = new int [5];
    
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        System.out.println("Array=");

        for(int i=0; i<5; i++)
        {
            System.out.println(a[i]);
        }

        for(int i=0; i<5; i++)
        {
            if(a[0]>a[i])
            {
                a[0] = a[i];
            }
        }

        System.out.println("Smallest element of Array = "+a[0]);
    }
}
