/**
 * This class represents a house
 * 
 * @author Miles Cobb Dumalao
 */
import java.text.DecimalFormat;
public class House {
	private int mls;
	private int bedrooms;
	private double price;
	private String seller; 
	
	/**
	 * Creates a house that validates instance variables by calling the set methods.
	 * Set methods are used instead of the this keyword because there are validity
	 * restrictions
	 * 
	 * @param mls				Unique listing number when a house is on sale
	 * @param bedrooms			Amount of bedrooms in the house
	 * @param price				Price of the house
	 * @param seller			Person selling the house
	 * @throws HouseException	Validity restrictions on each instance variable
	 */
	
	public House(int mls, int bedrooms, double price, String seller) throws HouseException{
		this.setMls(mls);
		this.setBedrooms(bedrooms);
		this.setPrice(price);
		this.setSeller(seller);
	}
	/**
	 * Gets MLS
	 * 
	 * @return mls	Unique listing number when a house is on sale
	 */
	public int getMls() {
		return mls;
	}
	
	/**
	 * Sets the MLS and throws HouseException if MLS isn't within a range between 10001 and 99999
	 * 
	 * @param mls
	 * @throws HouseException
	 */
	
	public void setMls(int mls) throws HouseException {
		if(mls<10001 || mls>99999) {
			HouseException houseException = new HouseException();
			houseException.setMessage("MLS must range from 10001-99999");
			throw houseException;
		}
		this.mls = mls;
	}
	
	/**
	 * Gets bedrooms
	 * 
	 * @return bedrooms	Amount of bedrooms in the house
	 */
	
	public int getBedrooms() {
		return bedrooms;
	}
	
	/**
	 * Sets bedrooms and throws HouseException if bedrooms isn't within a range of 0-5
	 * 
	 * @param bedrooms
	 * @throws HouseException
	 */
	
	public void setBedrooms(int bedrooms) throws HouseException{
		if(bedrooms<0 || bedrooms>5) {
			HouseException houseException = new HouseException();
			houseException.setMessage("There must be 0-5 bedrooms");
			throw houseException;
		}
		this.bedrooms = bedrooms;
	}
	
	/**
	 * Gets the house's price
	 * 
	 * @return price	price of the house
	 */
	
	public double getPrice() {
		return price;
	}
	
	/**
	 * Sets price and throws HouseException if price isn't within a range of 0-1,000,000
	 * 
	 * @param price
	 * @throws HouseException
	 */
	
	public void setPrice(double price) throws HouseException {
		if(price<0 || price>1000000) {
			HouseException houseException = new HouseException();
			houseException.setMessage("Price must range from 0-1,000,000");
			throw houseException;
		}
		this.price = price;
	}
	
	/**
	 * Gets the seller
	 * 
	 * @return seller	person selling the house
	 */
	
	public String getSeller() {
		return seller;
	}
	
	/**
	 * Sets seller and throws HouseException if seller isn't at least 2 non-blank characters long
	 * 
	 * @param seller
	 * @throws HouseException
	 */
	
	public void setSeller(String seller) throws HouseException {
		if(seller.trim().length()<2) {
			HouseException houseException = new HouseException();
			houseException.setMessage("Seller must be at least 2 non-blank characters long");
			throw houseException;
		}
		this.seller = seller;
	}
	
	/**
	 * Displays the house's MLS, bedrooms, price, and seller
	 */
	
	public String toString() {
		DecimalFormat df = new DecimalFormat(".00");
		return "MLS: " + mls + "\n" + 
		"Bedrooms: " + bedrooms + "\n" +
		"Price: $" + df.format(price) + "\n" + 
		"Seller: " + seller;
	} 
	
	public int compareTo(Object o) {
		House house = (House)o;
		
		if(house.getMls() == this.mls) { //If house has same MLS 
			return 0;
		}
		else if(house.getMls() > this.mls) { //If MLS is greater 
			return -1;
		}
		else { //If MLS is less than
			return 1;
		}
	}
	
	public boolean equals (Object obj) {
		House house = (House)obj;
		if(house.getMls() == this.mls) { //If house has same MLS
			return true;
		}
		else {
			return false;
		}
	}
	
}
