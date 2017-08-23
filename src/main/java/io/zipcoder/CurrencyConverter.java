package io.zipcoder;

import java.util.HashMap;

public class CurrencyConverter 
{	
    HashMap<Currency, Double> currencies = new HashMap<Currency, Double>();
    
    
    public CurrencyConverter()
    {
    	currencies.put(Currency.USDollar, 1.00);
    	currencies.put(Currency.Euro, 0.94);
    	currencies.put(Currency.BritishPound, 0.82);
    	currencies.put(Currency.IndianRupee, 68.32);
    	currencies.put(Currency.AustralianDollar, 1.35);
    	currencies.put(Currency.CanadianDollar, 1.32);
    	currencies.put(Currency.SingaporeDollar, 1.43);
    	currencies.put(Currency.SwissFranc, 1.01);
    	currencies.put(Currency.MalaysianRinggit, 4.47);
    	currencies.put(Currency.JapaneseYen, 115.84);
    	currencies.put(Currency.ChineseYuanRenminbi, 6.92);
    }
    
    public double convertCurrency(Currency initialCurrency, Currency finalCurrency, Double amount)
    {
    	double rateIn = currencies.get(initialCurrency);
    	double rateOut = currencies.get(finalCurrency);
    	
    	return amount*rateOut/rateIn;
    }
    
}