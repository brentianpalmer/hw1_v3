package BpCifHwOne;

/**
 * Helper class with three static methods:
 * a. averagePrice: Method accepts an array of stocks and returns the average price of
 * all the stocks in the array.
 * b. averagePricePerExchange: Method that accepts an array of stocks and an exchange and
 * returns the average price for all the stocks belonging to that exchange.
 * c. numStocksForExchange: Method that accepts an array of stocks and an exchange and
 * returns that number of stocks in that array that belong to that exchange.
 */
class InstrumentHelper {

    /**
     * Method for finding the average price of an array of stocks regardless of their exchange.
     * @param arr array of stocks
     * @return The average price of stocks in the array.
     */
    public static double averagePrice(Stock[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++)
            total = total + arr[i].price();
        double average = total / arr.length;
        return average;
    }


    /**
     * Method for finding the average price of a stock on a specified exchange. Using overridden equals method to compare by exchange name attribute of an object rather than by the variable name of the object. Here we are treating two different exchange objects with the same name attribute as the same exchange
     * @param arr array of stocks
     * @param x_change Exchange
     * @return The average price of stock on a given exchange. Here we are treating two different Exchange objects with the same name attribute as the same Exchange.
     */
    public static double averagePricePerExchange(Stock[] arr, Exchange x_change) {
        double total = 0;
        int validEntries = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].exchange().equals(x_change)) {
                total = total + arr[i].price();
                ++validEntries;
            }
        }
        double avg = total / validEntries;
        return avg;
    }

    /**
     * Method for finding the number of stocks on a given exchange. Using overridden equals method to compare by exchange name attribute of an object rather than by the variable name of the object. Here we are treating two different exchange objects with the same name attribute as the same exchange
     * @param arr array of stocks
     * @param x_change Exchange
     * @return The number of stocks on a given exchange. Here we are treating two different Exchange objects with the same name attribute as the same Exchange.
     */
     public static double numStocksForExchange(Stock[] arr, Exchange x_change) {
        int validEntries = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].exchange().equals(x_change)) {
                ++validEntries;
            }
        }
        return validEntries;
    }


    // print function for exchangeArray
//    public static void printExchangeArray(Exchange[] exchangeArray) {
//        for (Exchange i : exchangeArray) {
//            System.out.println(i.name());
//        }
//    }

    // print function for StockArray
//    public static void printStockArray(Stock[] stockArray) {
//        for (Stock i : stockArray) {
//            System.out.println(i);
//          System.out.println("Stock Name: " + i.name() + ", Stock Price: " + i.price() + ", Stock Exchange: " + (i.exchange()).name());
//
//        }
    }


