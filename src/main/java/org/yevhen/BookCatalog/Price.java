package org.yevhen.BookCatalog;

import java.util.HashMap;
import java.util.Map;

public class Price {
    private Map<String, Double> rates;
    private Double value;

    public Price(Double value) {
        this.value = value;
        rates = new HashMap<String, Double>();
        rates.put("USD", 1.0);
        rates.put("EUR", 0.8);
        rates.put("GBP", 0.6);
    }

    public Double convert(String toCurrency) {
        if (toCurrency.equals("USD")) {
//            return  value;
            return  Double.valueOf(value);
        } else {
            Double conversion = rates.get("USD") / rates.get(toCurrency);
//            value = conversion * value;
//            return value;
            return conversion * value;
        }
    }

    public String toString() {
        return this.value.toString();
    }
}
