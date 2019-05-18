/**
 * @ProblemStatemment: Commercial data processing ­ StockAccount.java implements a data type that might be used by 
 * a financial institution to keep track of customer information. The StockAccount class implements following methods
 * The StockAccount class also maintains a list of CompanyShares object which has Stock Symbol and Number of Shares 
 * as well as DateTime of the transaction. When buy or sell is initiated StockAccount checks if CompanyShares are 
 * available and accordingly update or create an Object.
 * @author: Vishwajeet malusare
 * */
package comercialDataProcessing;

public class CompanyShares {
	private String companyName;
	private String stockSymbol;
	private int noOfShares;
	private int price;
	private String dateTime;
	
	

	// for companyName
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}// toString method

	public String toString() {
		StringBuilder stringbuffer = new StringBuilder();
		stringbuffer.append(String.format("%-15s %-20s %-20d %-20d %-20s\n", companyName, stockSymbol,noOfShares, price,dateTime));

		return stringbuffer.toString();
	}

	// for symbol
	public String getStockSymbol() {
		return stockSymbol;
	}

	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}

	/// number of shares
	public int getNoOfShares() {
		return noOfShares;
	}

	public void setNoOfShares(int noOfShares) {
		this.noOfShares = noOfShares;
	}

	// for price
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	/// For time
	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		dateTime = java.util.Calendar.getInstance().getTime().toString();
		this.dateTime = dateTime;
	}
	public CompanyShares(String companyName, String stockSymbol, int noOfShares, int price) {
		super();
		this.companyName = companyName;
		this.stockSymbol = stockSymbol;
		this.noOfShares = noOfShares;
		this.price = price;
	

	}
	public CompanyShares() {
		
	}

}
