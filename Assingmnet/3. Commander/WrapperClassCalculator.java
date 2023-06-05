public class WrapperClassCalculator {
    
    public static void main(String[] args) {
        
        int i1 = Integer.parseInt(args[0]);
        int i2 = Integer.parseInt(args[1]);
        int i3;
        i3 = i1+i2;
        System.out.println("sum of Integer value = "+i3);

        float f1 = Float.parseFloat(args[2]);
        float f2 = Float.parseFloat(args[3]);
        float f3;
        f3 = f1+f2;
        System.out.println("sum of Float value = "+f3);

        long l1 = Long.parseLong(args[4]);
        long l2 = Long.parseLong(args[5]);
        long l3;
        l3 = l1+l2;
        System.out.println("sum of Long value = "+l3);

        double d1 = Double.parseDouble(args[6]);
        double d2 = Double.parseDouble(args[7]);
        double d3;
        d3 = d1+d2;
        System.out.println("sum of double value = "+d3);


    }

}
