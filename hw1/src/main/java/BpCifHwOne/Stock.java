package BpCifHwOne;

/**
 * A data class for a stock.
 * Stock interface supports three attributes, name, price, and exchnage
 */
interface Stock {

    /**
     * Returns the name of the stock.
     * @return the name of the stock
     */
    String name();

    /**
     * Returns the price of the stock.
     * @return the price of the stock
     */
    double price();

    /**
     * Returns the exchange for the stock.
     * @return the exchange for the stock (note exchange is an Exchange type that has its own interface)
     */
    Exchange exchange();

}
