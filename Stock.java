/*Christopher Wong (#111386693)
 * CSE 114
 * Lab Section 05
 */
public class Stock {
	String symbol;
	String name;
	private double previousClosingPrice;
	private double currentPrice;
	public Stock (String newSymbol, String newName, double NewPCP) {
		symbol = newSymbol;
		name = newName;
		previousClosingPrice = NewPCP;
	}
	public void setCurrentPrice(double a) {
		currentPrice = a;
	}
	public double getChangePercent() {
		return ((currentPrice - previousClosingPrice) / Math.abs(previousClosingPrice)) * 100;
	}
public static void main (String[] args) {
	Stock myStock = new Stock ("ORCL", "Oracle Corporation",34.5);
	myStock.setCurrentPrice(34.35);
	System.out.print(myStock.getChangePercent() + "% change.");
}
}
