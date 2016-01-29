package com.training.domains;

import com.training.ifaces.Automobiles;
//import com.training.ifaces.*;
public class ShowRoom {
	public Automobiles getItem(int key){
		switch(key){
		case 1: return new PassengerCar();
		case 2:return new LuxuryCar();
		case 3:return new SportsCar();
		default:	
		return null;
		}
	}
	/**
	 * 
	 * @param polyAuto takes the Object of Automobiles
	 * Method prints the quotation of Product selected
	 */
public void printQuote(Automobiles polyAuto)
{
	System.out.println("========Quotation=========");
	System.out.println("Model := "+polyAuto.getModel());
	System.out.println("Color := "+polyAuto.getColor());
	System.out.println("Price  :="+ polyAuto.getPrice());
}
}
