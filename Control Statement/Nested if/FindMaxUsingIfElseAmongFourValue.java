class FindMaxUsingIfElseAmongFourValue
{
    public static void  main(String[] args)
    {
        int a=100, b=112, c=34, d=115;

        if(a>b)
        {
            if(a>c)
            {
                if(a>d)
                {
                    System.out.println("A is max");
                }    
                else
                {
                    System.out.println("D is max");
                }
            }
            else
            {
                if(c>d)
                {
                    System.out.println("C is max");
                }
                else
                {
                    System.out.println("D is max");
                }
            }

        }
        else
        {
            if(b>c)
            {
                if(b>d)
                {
                    System.out.println("B is max");
                }
                else
                {
                    System.out.println("D is max");
                }
            }
            else
            {
               if(c>d)
               {
                  System.out.println("C is max");
               }
               else
               {
                  System.out.println("D is max");
               }
            }
        }
    }
}