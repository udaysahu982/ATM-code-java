public class AtmMachine{
    public class Atm{
private String userName="UDAY SAHU";
private int userId=12345;
private int Balance=10000;
public static int BankBalance(){
   int Balance=this.Balance;
    return Balance;
}
    }
public static void main(String args[]){
Atm A1=new Atm();
System.out.println(A1.BankBalance());
}
}