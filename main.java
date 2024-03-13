import java.util.ArrayList;
public class main{
    public static void main(String[] args) {
        portfolio portfolio1 = new portfolio("Ryan", 1000, 1000);
        stock stock1 = new stock(194.50, "2/3/23", "NASDAQ", "Apple Inc", "AAPL");
        stock stock2 = new stock(156.87, "1/4/24", "NASDAQ", "Amazon.com Inc", "AMZN");
        
        portfolio1.buyStock(stock1, 1);
        portfolio1.buyStock(stock2, 1);
        System.out.println(portfolio1);

        String[][] updates = {{"AAPL", "150"}, {"AMZN", "230"}};
        portfolio1.updatePrices(updates);
        System.out.println(portfolio1);


        // TODO also: withdrawls











        // ArrayList<String> names = new ArrayList<String>();
        // names.add("Joe");
        // names.add("Rick");
        // System.out.println(names);
        // names.add(0, "Kate");
        // System.out.println(names);
        // String name = names.get(1);
        // System.out.println(name);
        // names.set(names.size() - 1, "Steve");
        // System.out.println(names);
        // names.remove(0);
        // System.out.println(names.toString());
        // for(int i = 0; i < names.size(); i++){
        //     System.out.println(names.get(i));
        // }
        // for(String item: names){
        //     System.out.println(item);
        // }
        
    }     

}