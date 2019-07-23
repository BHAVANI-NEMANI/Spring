package com.cg.intro;

public class CurrencyConverterImpl implements CurrencyConverter {
	
	/*private double exchangeRate;
	

	public CurrencyConverterImpl(double exchangeRate) {
		super();
		this.exchangeRate = exchangeRate;
	}

	public double getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}*/
	private ExchangeService exchangeservice;
	
	public ExchangeService getExchangeservice() {
		return exchangeservice;
	}

	public void setExchangeservice(ExchangeService exchangeservice) {
		this.exchangeservice = exchangeservice;
	}

	@Override
	public double dollarsToRupees(double dollars) {
		return dollars * exchangeservice.getExchangeRate();
	}
	
	
}
