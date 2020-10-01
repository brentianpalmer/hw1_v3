package BpCifHwOne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test file for mutable implementation of Exchange and Stock as well as all classes and methods including the Instrument Helper class
 */
public class Test_Hw1Demo {

    /**
     * Created two private MutableExchange objects to avoid re-creating within a number of tests below
     */
    private MutableExchange nasdaq = new MutableExchange("NASDAQ");
    private MutableExchange nyse = new MutableExchange("NYSE");

    /**
     * Test that an instance of MutableExchange implements the Exchange interface
     */
    @Test
    public void test1_mutableExchangeInstanceOfExchange() {

        MutableExchange exchangeTest = new MutableExchange("NASDAQ");
        assertTrue(exchangeTest instanceof Exchange);
    }

    /**
     * Test that a Class instance of MutableExchange implements the Exchange interface
     */
    @Test
    public void test2_mutableExchangeClassInstanceExchange() {

        Class<MutableExchange> exchangeClazz = MutableExchange.class;
        assertTrue(Exchange.class.isAssignableFrom(exchangeClazz));
    }

    /**
     * Test MutableExchange name method
     */
    @Test
    public void test3_mutableExchange() {

        MutableExchange bats = new MutableExchange("NASDAQ");
        bats.name("BATS");
        assertEquals(bats.name(), "BATS");
//      System.out.println(bats);
    }


    /**
     * Test MutableExchange hashcode and equals methods
     * confirm equals and hashcode methods check name field value
     */
    @Test
    public void test4_mutableExchangeEqualsAndHashCodeIf() {

        MutableExchange s1 = new MutableExchange("BATS");
        MutableExchange s2 = new MutableExchange("BATS");

//      System.out.println(s1.hashCode());
//      System.out.println(s2.hashCode());
        assertTrue(s1.hashCode() == s2.hashCode());
        assertTrue(s1.equals(s2) && s2.equals(s1));
        // comparing above created Objects.
        if (s1.hashCode() == s2.hashCode()) {
            if (s1.equals(s2)) {
                System.out.println("test4_Both Objects are equal. ");
            } else {
                System.out.println("test4_Both Objects are not equal. ");
            }
        } else
            System.out.println("test4_Both Objects are not equal. ");
    }

    /**
     * Test MutableExchange Hashcode method
     * confirm hashcode checks name field value
     */
    @Test
    public void test5_mutableExchangeHashCodeIf() {

        MutableExchange s1 = new MutableExchange("BATS");
        MutableExchange s2 = new MutableExchange("BATS");

//      System.out.println(s1.hashCode());
//      System.out.println(s2.hashCode());
        assertTrue(s1.hashCode() == s2.hashCode());
        assertTrue(s1.equals(s2) && s2.equals(s1));

        // comparing above created Objects by hashcode.
        if(s1.hashCode() == s2.hashCode())
        {
        System.out.println("test5_Both hashcodes are equal. ");
        } else {
            System.out.println("test5_Both hashcodes are not equal. ");
        }
    }


    /**
     * Test MutableExchange Equals method
     * confirm equals checks name field value
     */
    @Test
    public void test6_mutableExchangeEquals() {

        MutableExchange s1 = new MutableExchange("BATS");
        MutableExchange s2 = new MutableExchange("BATS");
        assertEquals(s1.name(), "BATS");
        assertEquals(s2.name(), "BATS");
        assertTrue(s1.equals(s2) && s2.equals(s1));
        }

    /**
     * Test MutableExchange hashcode method
     * confirm hashCode checks name field value
     */
    @Test
    public void test7_mutableExchangeHashCode() {

        MutableExchange s1 = new MutableExchange("BATS");
        MutableExchange s2 = new MutableExchange("BATS");
        assertEquals(s1.name(), "BATS");
        assertEquals(s2.name(), "BATS");
        assertTrue(s1.hashCode() == s2.hashCode());
    }

    /**
     * Test create an array of MutableExchange objects of length 10 and name them sequentially
     */
    @Test
    public void test8_mutableExchangeMoreTests() {

        Exchange[] exchangeArray = new Exchange[10];
        for (int i = 0; i < 10; ++i) {
            MutableExchange singleExchange = new MutableExchange("NASDAQ");
            singleExchange.name("This is exchange # " + i);
            exchangeArray[i] = singleExchange;
        }

        assertEquals(exchangeArray[0].name(), "This is exchange # 0");
        assertEquals(exchangeArray[1].name(), "This is exchange # 1");
        assertEquals(exchangeArray[2].name(), "This is exchange # 2");
        assertEquals(exchangeArray[3].name(), "This is exchange # 3");
        assertEquals(exchangeArray[9].name(), "This is exchange # 9");
    }

    /**
     * Test an instance of MutableStock implements the Stock interface
     */
    @Test
    public void test9_mutableStockInstanceOfStock() {
        MutableStock stockTest = new MutableStock("AAPL", 100, nasdaq);
        assertTrue(stockTest instanceof Stock);
    }

    /**
     * Test a Class instance of MutableStock implements the Stock interface
     */
    @Test
    public void test10_mutableStockClassInstanceStock() {
        Class<MutableStock> stockClazz = MutableStock.class;
        assertTrue(Stock.class.isAssignableFrom(stockClazz));
    }

    /**
     * Test MutableStock hashcode and equals methods
     * confirm equals and hashcode methods check name, price, and exchange values
     */
    @Test
    public void test11_mutableStockEqualsAndHashCodeIf() {

        MutableStock stockOne = new MutableStock("TRV", 100, nasdaq);
        MutableStock stockTwo = new MutableStock("TRV", 100, nasdaq);

//      System.out.println(s1.hashCode());
//      System.out.println(s2.hashCode());

        assertTrue(stockOne.hashCode() == stockTwo.hashCode());
        assertTrue(stockOne.equals(stockTwo) && stockTwo.equals(stockOne));
        // comparing above created Objects.
        if (stockOne.hashCode() == stockTwo.hashCode()) {
            if (stockOne.equals(stockTwo)) {
                System.out.println("test11_Both Objects are equal. ");
            } else {
                System.out.println("test11_Both Objects are not equal. ");
            }
        } else
            System.out.println("test11_Both Objects are not equal. ");
    }

    /**
     * Test MutableStock name method
     */
    @Test
    public void test12_mutableStockName() {

        MutableStock stockOne = new MutableStock("name", 100, nasdaq);
        stockOne.name("AAPL");
        assertEquals(stockOne.name(), "AAPL");
        stockOne.name("GOOG");
        assertEquals(stockOne.name(), "GOOG");
    }

    /**
     * Test MutableStock price method
     */
    @Test
    public void test13_mutableStockPrice() {

        MutableStock stockTwo = new MutableStock("TRV", 100, nasdaq);
        assertEquals(stockTwo.price(), 100);
        stockTwo.price(105.5);
        assertEquals(stockTwo.price(), 105.5);
        stockTwo.price(125.5);
        assertEquals(stockTwo.price(), 125.5);
    }

    /**
     * Test MutableStock Exchange method
     */
    @Test
    public void test14_mutableStockExchange() {

        MutableStock stockThree = new MutableStock("MSFT", 100, nasdaq);
        stockThree.exchange(nyse);
        assertEquals(stockThree.exchange(), nyse);
        assertEquals(stockThree.exchange().name(), "NYSE");
    }

    /**
     * Create an array of MutableStock objects of length 10,
     * and name them sequentially,
     * assign prices sequentially 1000 + i,
     * and assign an exchange
     */
    @Test
    public void test15_arrayOfStocks() {
        Stock[] stockArray = new Stock[10];
        for (int i = 0; i < 10; ++i) {
            MutableStock singleStock = new MutableStock("HK", 100, nasdaq);
            singleStock.name("HK" + i);
            singleStock.price(1000 + i);
            if (i % 2 == 0) {
                singleStock.exchange(nyse);
            }
            stockArray[i] = singleStock;
        }
//        InstrumentHelper.printStockArray(stockArray);
        assertEquals(stockArray[0].name(), "HK0");
        assertEquals(stockArray[0].price(), 1000);
        assertEquals(stockArray[0].exchange(), nyse );
        assertEquals(stockArray[1].name(), "HK1");
        assertEquals(stockArray[1].price(), 1001);
        assertEquals(stockArray[1].exchange(), nasdaq);
    }

    /**
     * Test averagePrice function
     * Create an array of MutableStock objects of length 10,
     * assign prices sequentially 1000 + i, average price should be 1004.5
     * assign all prices to 0, average price should be 0
     * assign all prices to 100, average price should be 100
     */
    @Test
    public void test16_averagePrice() {
        Stock[] stockArray = new Stock[10];
        for (int i = 0; i < 10; ++i) {
            MutableStock singleStock = new MutableStock("HK", 100, nasdaq);
            singleStock.price(1000 + i);
            stockArray[i] = singleStock;
        }
//        InstrumentHelper.printStockArray(stockArray);
        assertEquals(InstrumentHelper.averagePrice(stockArray), 1004.5);
//        System.out.println("Average Price of all stocks is: " + InstrumentHelper.averagePrice(stockArray));

        Stock[] stockArray2 = new Stock[10];
        for (int i = 0; i < 10; ++i) {
            MutableStock singleStock = new MutableStock("HK", 100, nasdaq);
            singleStock.price(0);
            stockArray2[i] = singleStock;
        }
//        InstrumentHelper.printStockArray(stockArray2);
        assertEquals(InstrumentHelper.averagePrice(stockArray2), 0);
//        System.out.println("Average Price of all stocks is: " + InstrumentHelper.averagePrice(stockArray2));

        Stock[] stockArray3 = new Stock[10];
        for (int i = 0; i < 10; ++i) {
            MutableStock singleStock = new MutableStock("HK", 100, nasdaq);
            stockArray3[i] = singleStock;
        }
//        InstrumentHelper.printStockArray(stockArray3);
        assertEquals(InstrumentHelper.averagePrice(stockArray3), 100);
//        System.out.println("Average Price of all stocks is: " + InstrumentHelper.averagePrice(stockArray3));
    }

    /**
     * Test numStocksForExchange function
     * Create an array of MutableStock objects of length 10,
     * name all stocks sequentially HK + i,
     * price sequentially 1000 + i,
     * use modulus to change exchange for every other stock from default nasdaq to nyse (even = nyse, odd = nasdaq)
     * check numStocksForExchange returns 5 for each exchange
     */
    @Test
    public void test17_numStocksForExchange() {
        Stock[] stockArray = new Stock[10];
        for (int i = 0; i < 10; ++i) {
            MutableStock singleStock = new MutableStock("HK", 100, nasdaq);
            singleStock.name("HK" + i);
            singleStock.price(1000 + i);
            if (i % 2 == 0) {
                singleStock.exchange(nyse);
            }
            stockArray[i] = singleStock;
        }
//        InstrumentHelper.printStockArray(stockArray);

//        System.out.println("Average Price of NASDAQ stocks is: " + InstrumentHelper.averagePricePerExchange(stockArray, nasdaq));
//        System.out.println("Number of stocks on nyse: " + InstrumentHelper.numStocksForExchange(stockArray, nyse));
        assertEquals(InstrumentHelper.numStocksForExchange(stockArray, nyse), 5);
        assertEquals(InstrumentHelper.numStocksForExchange(stockArray, nasdaq), 5);
//
    }

    /**
     * Test numStocksForExchange function again
     * Create an array of MutableStock objects of length 10,
     * name all stocks sequentially HK + i,
     * price sequentially 1000 + i,
     * here there are two MutableExchange objects bats and hkex, both have the same name attribute "BATS"
     * use modulus to change MutableExchange object for every other MutableStock object in the array from default MutableExchange object bats
     * to MutableExchange object hkex (even = hkex, odd = bats)
     * check numStocksForExchange returns 10 for "BATS" regardless of exchange object since both hkex and bats have same name: "BATS"
     */
    @Test
    public void test18_numStocksForExchange() {
        MutableExchange bats = new MutableExchange("BATS");
        MutableExchange hkex = new MutableExchange("BATS");
        Stock[] stockArray = new Stock[10];
        for (int i = 0; i < 10; ++i) {
            MutableStock singleStock = new MutableStock("HK", 100, bats);
            singleStock.name("HK" + i);
            singleStock.price(1000 + i);
            if (i % 2 == 0) {
                singleStock.exchange(hkex);
            }
            stockArray[i] = singleStock;
        }
//        InstrumentHelper.printStockArray(stockArray);
//
//        System.out.println("Num stocks on BATS stocks is: " + InstrumentHelper.numStocksForExchange(stockArray, hkex));
//        System.out.println("Num stocks on BATS stocks is: " + InstrumentHelper.numStocksForExchange(stockArray, bats));
//        System.out.println("Number of stocks on nyse: " + InstrumentHelper.numStocksForExchange(stockArray, nyse));
        assertEquals(InstrumentHelper.numStocksForExchange(stockArray, hkex), 10);
        assertEquals(InstrumentHelper.numStocksForExchange(stockArray, bats), 10);
    }


    /**
     * Test averagePricePerExchange function
     * Create an array of MutableStock objects of length 10,
     * name all stocks sequentially HK + i,
     * price sequentially 1000 + i,
     * use modulus to change exchange for every other stock from default nasdaq to nyse (even = nyse, odd = nasdaq)
     * check averagePricePerExchange returns 1004 for NYSE and 1005 for NASDAQ
     */
    @Test
    public void test19_averagePricePerExchange() {
        Stock[] stockArray = new Stock[10];
        for (int i = 0; i < 10; ++i) {
            MutableStock singleStock = new MutableStock("HK", 100, nasdaq);
            singleStock.name("HK" + i);
            singleStock.price(1000 + i);
            if (i % 2 == 0) {
                singleStock.exchange(nyse);
            }
            stockArray[i] = singleStock;
        }

//        InstrumentHelper.printStockArray(stockArray);
//        System.out.println("Average Price of NASDAQ stocks is: " + InstrumentHelper.averagePricePerExchange(stockArray, nasdaq));
//        System.out.println("Number of stocks on nyse: " + InstrumentHelper.numStocksForExchange(stockArray, nyse));
        assertEquals(InstrumentHelper.averagePricePerExchange(stockArray, nyse), 1004);
        assertEquals(InstrumentHelper.averagePricePerExchange(stockArray, nasdaq), 1005);
    }

    /**
     * Test averagePricePerExchange function again
     * Create an array of MutableStock objects of length 10,
     * name all stocks sequentially HK + i,
     * price sequentially 1000 + i,
     * here there are two MutableExchange objects bats and hkex, both have the same name attribute "BATS"
     * use modulus to change MutableExchange object for every other MutableStock object in the array from default MutableExchange object bats
     * to MutableExchange object hkex (even = hkex, odd = bats)
     * check numStocksForExchange returns 10 for "BATS" regardless of exchange object since both hkex and bats have same name: "BATS"
     * use modolus to change exchange for every other stock from default nasdaq to nyse (even = nyse, odd = nasdaq)
     * check averagePricePerExchange returns 1004.5 for hkex and 1004.5 for bats because both are
     * looking at all 10 MutableExchange objects named "BATS" for each MutableStock in the array of stocks due to override of equals and hashcode methods
     */
    @Test
    public void test20_averagePricePerExchange() {
        MutableExchange bats = new MutableExchange("BATS");
        MutableExchange hkex = new MutableExchange("BATS");
        Stock[] stockArray = new Stock[10];
        for (int i = 0; i < 10; ++i) {
            MutableStock singleStock = new MutableStock("HK", 100, bats);
            singleStock.name("HK" + i);
            singleStock.price(1000 + i);
            if (i % 2 == 0) {
                singleStock.exchange(hkex);
            }
            stockArray[i] = singleStock;
        }

//        InstrumentHelper.printStockArray(stockArray);
//        System.out.println("Average Price of BATS stocks is: " + InstrumentHelper.averagePricePerExchange(stockArray, hkex));
//        System.out.println("Average Price of BATS stocks is: " + InstrumentHelper.averagePricePerExchange(stockArray, bats));
//        System.out.println("Number of stocks on nyse: " + InstrumentHelper.numStocksForExchange(stockArray, nyse));
        assertEquals(InstrumentHelper.averagePricePerExchange(stockArray, hkex), 1004.5);
        assertEquals(InstrumentHelper.averagePricePerExchange(stockArray, bats), 1004.5);
    }




}