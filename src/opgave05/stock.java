package opgave05;

public class stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    stock(){
    }

    stock(String newSymbol, String newName, double newPreviousClosingPrice, double newCurrentPrice){
        symbol = newSymbol;
        name = newName;
        previousClosingPrice = newPreviousClosingPrice;
        currentPrice = newCurrentPrice;
    }

    double getChangePercent(){
        return previousClosingPrice / currentPrice * 100;
    }

}

