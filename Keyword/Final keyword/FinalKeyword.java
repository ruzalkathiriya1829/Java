// final keyword does not change value when we must required variable value
// doesn't change in any case we use to final key word

class FinalKeyword {

    final int a = 10;

    public static void main(String[] args) {

        int b = 100;

        FinalKeyword f = new FinalKeyword();

        // int f.a = 100; not change because final keyword use

        System.out.println(b);
        System.out.println(f.a);

    }

}