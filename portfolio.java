public class portfolio{
    private String name;
    private int value;
    private int balance;
    private stock[] stocks;  


    portfolio(String name, int value, int balance, stock[] stocks){
        this.name = name;
        this.value = value;
        this.balance = balance;
        this.stocks = stocks;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getValue() {
        return value;
    }


    public void setValue(String value) {
        this.value = value;
    }


    public String getBalance() {
        return balance;
    }


    public void setBalance(String balance) {
        this.balance = balance;
    }


    public stock[] getStocks() {
        return stocks;
    }


    public void setStocks(stock[] stocks) {
        this.stocks = stocks;
    }
}