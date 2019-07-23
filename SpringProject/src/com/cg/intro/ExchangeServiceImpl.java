package com.cg.intro;

public class ExchangeServiceImpl implements ExchangeService {

	private double exchangeRate;
	
	public ExchangeServiceImpl(double exchangeRate) {
		super();
		this.exchangeRate = exchangeRate;
	}

	@Override
	public double getExchangeRate() {
		
		return exchangeRate;
	}

}
