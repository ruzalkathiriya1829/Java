public class TowDimantionalArrayUsingLoop {

    public static void main(String[] args) {
        
        int a[][] = new int[3][3];

        a[0][0] = 15;
        a[0][1] = 12;
        a[0][2] = 13;

        a[1][0] = 10;
        a[1][1] = 20;
        a[1][2] = 30;

        a[2][0] = 11;
        a[2][1] = 25;
        a[2][2] = 30;

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
