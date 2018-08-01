public class BankAccount {

    String accNumber;
    int accType;

    public boolean equals(Object obj){
        if(obj instanceof BankAccount){
            BankAccount b = (BankAccount)obj;
            return (accNumber.equals(b.accNumber) && accType == b.accType);
        }else{
            return false;
        }
    }
}



