public class TwoDimantionalArray {

    public static void main(String[] args) {
        
        int a[][] = new int [2][3];

        a[0][0] = 100;
        a[0][1] = 120;
        a[0][2] = 130;

        a[1][0] = 10;
        a[1][1] = 20;
        a[1][2] = 30;

        System.out.println(a[0][2]);
        System.out.println(a[1][2]);
    }
    
}
