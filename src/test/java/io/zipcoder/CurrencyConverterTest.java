package io.zipcoder;

import org.junit.Test;
import org.junit.Assert;

public class CurrencyConverterTest 
{

	@Test
	public void convertUSDollarToEuroTest()
	{
		CurrencyConverter converter = new CurrencyConverter();
		
		Double expected = 5.0*0.94/1.0;
		Double actual = converter.convertCurrency(Currency.USDollar, Currency.Euro, 5.0);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void convertEuroToUSDollarTest()
	{
		CurrencyConverter converter = new CurrencyConverter();
		
		Double expected = 5.0*1.0/0.94;
		Double actual = converter.convertCurrency(Currency.Euro, Currency.USDollar, 5.0);
		
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void convertEuroToBritishPoundTest()
	{
		CurrencyConverter converter = new CurrencyConverter();
		
		Double expected = 5.0*0.82/0.94;;
		Double actual = converter.convertCurrency(Currency.Euro, Currency.BritishPound, 5.0);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void convertBritishPoundToIndianRupeeTest()
	{
		CurrencyConverter converter = new CurrencyConverter();
		
		Double expected = 5.0*68.32/0.82;
		Double actual = converter.convertCurrency(Currency.BritishPound, Currency.IndianRupee, 5.0);
		
		Assert.assertEquals(expected, actual);
	}


	@Test
	public void convertIndianRupeeToCanadianDollarTest()
	{
		CurrencyConverter converter = new CurrencyConverter();
		
		Double expected = 5.0*1.32/68.32;
		Double actual = converter.convertCurrency(Currency.IndianRupee, Currency.CanadianDollar, 5.0);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void convertCanadianDollarToSingaporeDollarTest()
	{
		CurrencyConverter converter = new CurrencyConverter();
		
		Double expected = 5.0*1.43/1.32;
		Double actual = converter.convertCurrency(Currency.CanadianDollar, Currency.SingaporeDollar, 5.0);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void convertSingaporeDollarToSwissFrancTest()
	{
		CurrencyConverter converter = new CurrencyConverter();
		
		Double expected = 5.0*1.01/1.43;
		Double actual = converter.convertCurrency(Currency.SingaporeDollar, Currency.SwissFranc, 5.0);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void convertSwissFrancToMalaysianRinggitTest()
	{		
		CurrencyConverter converter = new CurrencyConverter();
	
		Double expected = 5.0*4.47/1.01;
		Double actual = converter.convertCurrency(Currency.SwissFranc, Currency.MalaysianRinggit, 5.0);
	
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void convertMalaysianRinggitToJapaneseYenTest()
	{
		CurrencyConverter converter = new CurrencyConverter();
		
		Double expected = 5.0*115.84/4.47;
		Double actual = converter.convertCurrency(Currency.MalaysianRinggit, Currency.JapaneseYen, 5.0);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void convertJapaneseYenToChineseYuanRenminbiTest()
	{
		CurrencyConverter converter = new CurrencyConverter();
		
		Double expected = 5.0*6.92/115.84;
		Double actual = converter.convertCurrency(Currency.JapaneseYen, Currency.ChineseYuanRenminbi, 5.0);
		
		Assert.assertEquals(expected, actual);
	}
}
