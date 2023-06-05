public class SetterGetterWithThisKeyword {

    int a;

    public void setData(int a) {
        this.a = a;
    }

    public int getData() {
        return a;
    }

    public static void main(String[] args) {

        SetterGetterWithThisKeyword s = new SetterGetterWithThisKeyword();
        s.setData(20);
        int z = s.getData();
        System.out.println(z);
    }
}
