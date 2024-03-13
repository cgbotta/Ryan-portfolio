import java.util.ArrayList;
import java.lang.Math;
public class portfolio{
    private String name;
    private double value;
    private double balance;
    private ArrayList<stock> stocks;  

    portfolio(String name, double value, double balance){
        this.name = name;
        this.value = value;
        this.balance = balance;
        this.stocks = new ArrayList<stock>();
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public double getValue() {
        return value;
    }


    public void setValue(int value) {
        this.value = value;
    }


    public double getBalance() {
        return balance;
    }


    public void setBalance(int balance) {
        this.balance = balance;
    }


    public ArrayList<stock> getStocks() {
        return stocks;
    }


    public void setStocks(ArrayList<stock> stocks) {
        this.stocks = stocks;
    }

    public void buyStock(stock stockBought, int number){
        if(number < 0){
            throw new IllegalArgumentException("You can't enter a negative amount of shares.");
        }
        boolean enoughMoney;
        if((stockBought.getPrice() * number) <= balance){
            enoughMoney = true;
        }
        else{
            enoughMoney = false;
        }

        if(enoughMoney){
            if(this.stocks.size() == 0){
                    this.stocks.add(stockBought);
            }
            else{
                boolean duplicateFound = false;
                for(int i = 0; i < this.stocks.size(); i++){
                    if(this.stocks.get(i).getTicker().equals(stockBought.getTicker())){
                        duplicateFound = true;
                    }
                }
                if(!duplicateFound){
                    this.stocks.add(stockBought);
                }
                

            }
            this.balance -= (stockBought.getPrice() * number);
            stockBought.setAmountOfStock(number + stockBought.getAmountOfStock());
        }
    }

    public void addMoney(double amount){
        balance = Math.round(balance + amount);
        value = Math.round(value + amount);
    }

    public void sellStock(stock stockSold, int number){
        if(number < 0){
            throw new IllegalArgumentException("You can't enter a negative amount of shares.");
        }
        if(number <= stockSold.getAmountOfStock()){
            stockSold.setAmountOfStock(stockSold.getAmountOfStock() - number);
            this.balance += (stockSold.getPrice() * number);
            if(stockSold.getAmountOfStock() == 0){
                this.stocks.remove(stockSold);
            }
        }
        else{
            System.out.println("You don't have enough shares to sell this number.");
        }
    }

    // Portfolio Name: NAME
    // Balance: x
    // Value: x
    // List of all stocks we have (just print the name of each stock)
    // [stock1, stock2, stock3...]
// double num = 3.14159;
// DecimalFormat df = new DecimalFormat("#.##");
// double rounded = Double.parseDouble(df.format(num));

// double num = 3.14159;
// double rounded = Math.ceil(num * 100) / 100;

    public String toString(){
        String portfolio = "";
        portfolio += "Portfolio Name: " + this.name 
                  + "\nBalance: " + Math.ceil(this.balance * 100) / 100
                  + "\nValue: " + Math.ceil(this.value * 100) / 100
                  + "\n";
        if(stocks.size() != 0){
            portfolio += "[";
        }
        for(stock item: this.stocks){
            if(item == stocks.get(stocks.size() - 1)){
                portfolio += item.getCompanyName()+ " (" + item.getAmountOfStock() + " shares" + item.getPrice() + ")]\n";
            }
            else{
                portfolio += item.getCompanyName() + " (" + item.getAmountOfStock() + " shares" + item.getPrice() + "\"), ";
            }
        }
        return portfolio;
    }

    public void calculatePortfolioValue(){
        this.value = this.balance;
        for(stock item: this.stocks){
            this.value += (item.getPrice() * item.getAmountOfStock());
        }
    }

    public void updatePrices(String[][] stockInfo){  
        for(int i = 0; i < stockInfo.length; i++){
            for(int x = 0; x < this.stocks.size(); x++){
                if(stocks.get(x).getTicker().equals(stockInfo[i][0])){
                         stocks.get(x).setPrice(Integer.parseInt(stockInfo[i][1]));
                }
            }
        }         
    }

}
                
