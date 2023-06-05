class FindMaxUsingLadderIfAmongFourValue
{
    public static void main(String[] args)
    {
        int a=5, b=6 ,c=45, d=34;

        if(a>b && a>c && a>d)
        {
            System.out.println("A is max");
        }

        else if(b>c && b>d)
        {
            System.out.println("B is max");
        }

        else if(c>d)
        {
            System.out.println("C is max");
        }

        else
        {
            System.out.println("D is max");
        }
    }
}