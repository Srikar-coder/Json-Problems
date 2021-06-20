package jsonproblems.oops.model;
import java.util.ArrayList;
import java.util.List;
import com.bridgelabz.oops.model.Stock;
public class InventoryManager {
	private List<Stock> rice = new ArrayList<Stock>();
	private List<Stock> pulses = new ArrayList<Stock>();
	private List<Stock> wheat = new ArrayList<Stock>();
	public void readInventory(List<Stock> stockList) {
		for (Stock stock : stockList) {
			if (stock.getId() == 1001) {
				rice.add(stock);
			}
			if (stock.getId() == 1002) {
				pulses.add(stock);
			}
			if (stock.getId() == 1003) {
				wheat.add(stock);
			}
		}
	}
	public double getTotalRiceWeight() {
		double weight = 0;
		for (Stock stock : rice) {
			weight = weight + stock.getWeight();
			System.out.println("Total rice weight = " + weight + " kgs");
		}
		return weight;
	}
	public double getTotalPulsesWeight() {
		double weight = 0;
		for (Stock stock : pulses) {
			weight = weight + stock.getWeight();
			System.out.println("Total pulses weight = " + weight + " kgs");
		}
		return weight;
	}
	public double getTotalWheatWeight() {
		double weight = 0;
		for (Stock stock : wheat) {
			weight = weight + stock.getWeight();
			System.out.println("Total wheat weight = " + weight + " kgs");
		}
		return weight;
	}
	public double getPriceOfRice() {
		double price = 0;
		for (Stock stock : rice) {
			price = price + stock.getPrice() * stock.getWeight();
			System.out.println("Total value of rice = " + price + " Rs");
		}
		return price;
	}
	public double getPriceOfPulses() {
		double price = 0;
		for (Stock stock : pulses) {
			price = price + stock.getPrice() * stock.getWeight();
 		        System.out.println("Total value of pulses = " + price + " Rs");
		}
		return price;
	}
	public double getPriceOfWheat() {
		double price = 0;
		for(Stock stock:wheat) {
			price = price+stock.getPrice()*stock.getWeight();
			System.out.println("Total value of wheat = "+price+" Rs");
		}
		return price;
       }
}
