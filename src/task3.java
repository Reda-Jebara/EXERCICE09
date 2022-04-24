class Account
{
    String Owner, NoAccount;
    int balance;

    public Account(String owner,String Acc_No,int balance)
    {
        this.Owner=owner;
        this.NoAccount=Acc_No;
        this.balance=balance;
    }

    // Getters
    public String getOwner()
    {return Owner;}

    public String getNo_Account()
    {return NoAccount;}

    public int getbalance()
    {return balance;}

    // Setters
    public void setOwner(String nv)
    {this.Owner = nv;}

    public void setNo_Account(String nv)
    {this.NoAccount = nv;}

    public void setbalance(int nv)
    {this.balance = nv;}

    //Method Transfer
    public void Transfer(int amount) throws NotEnoughMoneyException
    {
        if (balance>amount)
        {
            balance-=amount;
        }

        else
        {
            throw new NotEnoughMoneyException("Your balance  account is empty");
        }
    }

    public static void main(String[]args) throws NotEnoughMoneyException
    {
        Account User1 = new Account("Patrick","2021 1356 1334 7676 6699",5454000);
        Account User2 = new Account("Lucy","1102 3561 9132 6666 7777",455000);
        try{
            User2.Transfer(23000);
        }
        catch(NotEnoughMoneyException xx){
            System.out.println(xx);
        }
        finally{
            System.out.println("Amount u left is:  "+User2.balance);
        }

    }

}