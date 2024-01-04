public class main{
    public static void main(String[] args) {
        stock stock1 = new stock(100, "2/3/23", "NASDAQ", "Apple Inc", "AAPL");
        System.out.println(stock1);
        stock1.setPrice(90);
        System.out.println(stock1);
    }
}