package BpCifHwOne;

import java.util.Objects;


/**
 * Mutable implementation of {@code Stock}
 * Class for mutable implementation of Stock includes three methods that return name, price, and exchange.
 */
class MutableStock implements Stock {
    private String name;
    private double price;
    private Exchange exchange;

    /**
     * class for mutable implementation of stock
     * includes three methods that returns name, price, and exchange
     * equals and hashcode methods have been overriden to compare by
     * stock name attribute, price attribute, and exchange name attribute
     * of the exchange object rather than by the variable name of
     * the object
     * @param name name of stock
     * @param price price of stock
     * @param exchange exchange for stock
     */
    public MutableStock(
            String name,
            double price,
            Exchange exchange
    ) {
        this.name = name;
        this.price = price;
        this.exchange = exchange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MutableStock that = (MutableStock) o;
        return Double.compare(that.price, price) == 0 &&
                name.equals(that.name) &&
                exchange.equals(that.exchange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, exchange);
    }

    @Override
    public String name() {
        return name;
    }

    public void name(String name) {
        this.name = name;
    }

    @Override
    public double price() {
        return price;
    }

    public void price(double price) {
        this.price = price;
    }

    @Override
    public Exchange exchange() {
        return exchange;
    }

    public void exchange(Exchange exchange) {
        this.exchange = exchange;
    }


    /**
     * Override toString method to pretty print attributes of a MutableStock instance
     * @return pretty print attributes of a MutableStock instance
     */
    public String toString() {
        return "Stock Name: " + this.name() + ", Stock Price: " + this.price() + ", Stock Exchange: " + this.exchange().name();
    }
}
