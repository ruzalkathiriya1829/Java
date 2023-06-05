class FindMaxUsingIfElseAmongFiveValue
{
     public static void main(String[] args) 
    {
        int a=760, b=510 ,c=315, d=89, e=116;
        
        if(a>b)
        {
            if(a>c)
            {
                if(a>d)
                {
                    if(a>e)
                    {
                        System.out.println("A is max");
                    }
                    else
                    {
                        System.out.println("E is max");
                    }
                }
                else
                {
                    if(d>e)
                    {
                        System.out.println("D is max");
                    }
                    else
                    {
                        System.out.println("E is max");
                    }
                }
            }
            else
            {
                if(c>d)
                {
                    if(c>e)
                    {
                        System.out.println("C is max");
                    }
                    else
                    {
                        System.out.println("E is max");
                    }
                }
                else
                {
                    if(d>e)
                    {
                        System.out.println("D is max");
                    }
                    else
                    {
                        System.out.println("E is max");
                    }
                }
            }
        }
        else
        {
            if(b>c)
            {
                if(b>d)
                {
                    if(b>e)
                    {
                        System.out.println("B is max");
                    }
                    else
                    {
                        System.out.println("E id max");
                    }
                }
                else
                {
                   if(d>e)
                   {
                       System.out.println("D is max");
                   }
                   else
                   {
                       System.out.println("E is max");
                   }
                }
            }
            else
            {
                if(c>d)
                {
                    if(c>e)
                    {
                        System.out.println("C is max");
                    }
                    else
                    {
                        System.out.println("E is max");
                    }
                }
                else
                {
                    if(d>e)
                    {
                        System.out.println("D is max");
                    }
                    else
                    {
                        System.out.println("E is max");
                    }
                }
            }
        }
        
    }
}