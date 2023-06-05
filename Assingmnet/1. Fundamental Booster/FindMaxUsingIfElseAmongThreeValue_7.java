class FindMaxUsingIfElseAmongThreeValue_7
{
    public static void main(String[] args)
    {
        int a=10, b=15, c=13;

        if(a>b)
        {
            if(a>c)
            {
                System.out.println("A is max");
            }
            else
            {
                System.out.println("C is max");
            }
        }
        else
        {
           if(b>c)
           {
                System.out.println("B is max");
           }
           else
           {
                System.out.println("C is max");
           }
        }
    }
}