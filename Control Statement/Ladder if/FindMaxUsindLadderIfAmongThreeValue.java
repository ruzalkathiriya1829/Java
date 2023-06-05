public class FindMaxUsindLadderIfAmongThreeValue {
    
    public static void main(String[] args) {
        
        int a=112, b=84, c=45;

        if(a>b && a>c)
        {
            System.out.println("A is max");
        }

        else if(b>c)
        {
            System.out.println("B is max");
        }

        else
        {
            System.out.println("C is max");
        }

    }

}
