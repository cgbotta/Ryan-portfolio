public class stock {
    private double price;
    private String date;
    private double dailyValueChange;
    private String stockExchange;
    private String companyName;
    private String ticker;
    private int amountOfStock;

    public String getDate() {
        return date;
    }



    public void setDate(String date) {
        this.date = date;
    }



    public double getDailyValueChange() {
        return dailyValueChange;
    }




    public void setDailyValueChange(int dailyValueChange) {
        this.dailyValueChange = dailyValueChange;
    }



    public String getStockExchange() {
        return stockExchange;
    }



    public void setStockExchange(String stockExchange) {
        this.stockExchange = stockExchange;
    }



    public String getCompanyName() {
        return companyName;
    }



    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }



    public String getTicker() {
        return ticker;
    }



    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    
    public int getAmountOfStock(){
        return amountOfStock;
    }

    public void setAmountOfStock(int amountOfStock){
        this.amountOfStock = amountOfStock;
    }

    public void addAmountOfStock(int amountOfStock){
        this.amountOfStock += amountOfStock;
    }



    stock(double price, String date, String stockExchange, String companyName, String ticker){
        this.price = price;
        this.date = date;
        this.dailyValueChange = 0;
        this.stockExchange = stockExchange;
        this.companyName = companyName;
        this.ticker = ticker;
        this.amountOfStock = 0;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        if(this.price > price){
            dailyValueChange = price - this.price;
        }
        else{
            dailyValueChange = this.price - price;
        }
        this.price = price;
    }

    public String toString(){
        return "== Stock Info ==\nCompany Name: " + companyName + "\nCompany Ticker: " + ticker + "\nStock Exchange: " + stockExchange + "\nDate: " + date + "\nStock price: $" + price + "\nDaily Value Change: $" + dailyValueChange;
    }


    public String shortVersion(){
        return "== Short Stock Info ==\nCompany Ticker: " + ticker + "\nStock price: $" + price;
    }
}
