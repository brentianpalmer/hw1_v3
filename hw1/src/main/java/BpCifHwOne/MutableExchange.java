package BpCifHwOne;

import java.util.Objects;


/**
 * Mutable implementation of {@code Exchange}.
 * Class for mutable implementation of Exchange includes one method that returns name.
 */
class MutableExchange implements Exchange {

    private String name;


    /**
     * Method for name
     * @param name name attribute MutableExchange object
     */
    public MutableExchange(String name) {
        this.name = name;
    }

    /**
     * equals and hashcode have been overriden to compare by exchange name attribute of an object rather than by the variable name of the object
     * @param o
     * @return result of test of equality by value
     */
    @Override
    public boolean equals(Object o) {

        // checking if both the object references are
        // referring to the same object.
        if (this == o) {
            return true;
        }
        // it checks if the argument is of the
        // type MutableExchange by comparing the classes
        // of the passed argument and this object.
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        // type casting of the argument.
        MutableExchange test_eq_exchange = (MutableExchange) o;

        // comparing the state of argument with
        // the state of 'this' Object.
        return name.equals(test_eq_exchange.name);
    }


    /**
     * @return a hash value of provided String name
     */
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String name() {
        return name;
    }

    public void name (String name) {
        this.name = name;
    }

    /**
     * Override toString method to print name attribute of instance of a MutableExchange object
     * @return Print name attribute of instance of a MutableExchange object
     */
    public String toString() {
        return "Stock Exchange: " + this.name();
    }
}


