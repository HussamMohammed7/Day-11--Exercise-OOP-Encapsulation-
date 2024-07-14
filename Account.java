import java.util.ArrayList;

public class Account {

    private static ArrayList<String> ids = new ArrayList<>();
    private String id;
    private String name;
    private int balance = 0;

    public Account() {
    }

    public Account(String id, String name) throws IllegalArgumentException {
        if (ids.contains(id)) {
            throw new IllegalArgumentException("ID already exists.");
        }
        this.id = id;
        this.name = name;
        ids.add(id);
    }

    public Account(String id, String name, int balance)throws IllegalArgumentException {
        if (ids.contains(id)) {
            throw new IllegalArgumentException("ID already exists.");
        }
        this.id = id;
        this.name = name;
        this.balance = balance;
        ids.add(id);
    }


    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws IllegalArgumentException{
        if (ids.contains(id)) {
            throw new IllegalArgumentException("ID already exists.");
        }
        this.id = id;
        ids.add(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        this.balance = getBalance() + amount;
        return balance;
    }

    public int debit(int amount) throws IllegalArgumentException{
        if(amount <=this.balance) {

            this.balance = getBalance() - amount;

            return this.balance;
        }else{
            throw new IllegalArgumentException("You cannot debit , Balance is not enough.");

        }
    }

    public int transferTo(Account another, int amount) throws IllegalArgumentException{
        if(amount <=this.balance){
            another.credit(amount);
            debit(amount);
            return this.balance;
        }else{
            throw new IllegalArgumentException("Balance is out of range");
        }
    }


}
