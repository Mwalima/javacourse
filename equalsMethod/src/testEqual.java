public class testEqual {

    public static void main(String[] ags){

        BankAccount b1 = new BankAccount();
        b1.accType =4;
        b1.accNumber = "2145879856";

        BankAccount b3 = new BankAccount();
        b3.accType =4;
        b3.accNumber = "2145879856";

        BankAccount b2= new BankAccount();
        b2.accType = 3;
        b2.accNumber = "123654789";

        System.out.println(b1.equals(b2));

        System.out.println(b1.equals(b3));
    }
}
