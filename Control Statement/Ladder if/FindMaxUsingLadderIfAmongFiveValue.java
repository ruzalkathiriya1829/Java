class FindMaxUsingLadderIfAmongFiveValue
{
    public static void main(String[] args)
    {
        int a=112, b=34, c=23, d=32, e=78;

        if(a>b && a>c && a>d && a>e)
        {
            System.out.println("A is max");
        }

        else if(b>c && b>d && b>e)
        {
            System.out.println("B is max");
        }

        else if(c>d && c>e)
        {
            System.out.println("C is max");
        }

        else if(d>e)
        {
            System.out.println("D is max");
        }

        else
        {
            System.out.println("E is max");
        }
    }
}