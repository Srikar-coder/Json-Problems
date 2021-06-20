package jsonproblems.oops.model;

import java.util.ArrayList;
import java.util.List;

import json_prob3.oops.model.stock;

public class StockPortfolioManager {

	private List<stock> InfoTech = new ArrayList<stock>();
	private List<stock> Bhuna = new ArrayList<stock>();
	private List<stock> Gildie = new ArrayList<stock>();

	public void readStock(List<stock> liststock) {
		for (stock stk : liststock) {
			if (stk.getName() == "InfoTech") {
				InfoTech.add(stk);
			}
			if (stk.getName() == "Bhuna") {
				Bhuna.add(stk);
			}
			if (stk.getName() == "Gildie") {
				Gildie.add(stk);
			}
		}

	}

	public double getInfoTechShare() {
		double shares = 0;
		for (stock stk : InfoTech) {
			shares = shares + stk.getShares();
			System.out.println("Total InfoTech shares = " + shares);
		}
		return shares;
	}

	public double getBhunaShare() {
		double shares = 0;
		for (stock stk : Bhuna) {
			shares = shares + stk.getShares();
			System.out.println("Total Bhuna shares = " + shares);
		}
		return shares;
	}

	public double getGildieShare() {
		double shares = 0;
		for (stock stk : Gildie) {
			shares = shares + stk.getShares();
			System.out.println("Total Gildie shares = " + shares);
		}
		return shares;
	}

	public double getInfoTechValue() {
		double price = 0;
		for (stock stk : InfoTech) {
			price = price + stk.getPrice() * stk.getShares();
			System.out.println("Total value of InfoTech shares = " + price + " Rs");

		}
		return price;

	}

	public double getBhunaValue() {
		double price = 0;
		for (stock stk : Bhuna) {
			price = price + stk.getPrice() * stk.getShares();
			System.out.println("Total value of Bhuna shares = " + price + " Rs");

		}
		return price;

	}

	public double getGildieValue() {
		double price = 0;
		for (stock stk : Gildie) {
			price = price + stk.getPrice() * stk.getShares();
			System.out.println("Total value of Gildie shares = " + price + " Rs");

		}
		return price;

	}

}
