package jsonproblems.oops.model;

import java.util.List;

import json_prob3.oops.model.stock;

public class StockPortfolio {
	public static void main(String[] args) {

		JsonUtil_3 utiljson = new JsonUtil_3();
		List<stock> listStock = utiljson.convertJsonObj("C:\\Users\\Asus-i3\\shweta_bridgelabz\\json_prob\\src\\main\\java\\json_prob3\\JsonUtil_3.java");

		System.out.println("Total stock value : " + listStock);
		StockPortfolioManager manager = new StockPortfolioManager();

		manager.readStock(listStock);
		manager.getInfoTechShare();
		manager.getBhunaShare();
		manager.getGildieShare();
		manager.getInfoTechValue();
		manager.getBhunaValue();
		manager.getGildieValue();

	}

}
