/**
 * This class is a represents a House Exception that shows a message when 
 * one of the instance variable's doesn't fit the validity restrictions
 * 
 * @author Miles Cobb Dumlao
 */
public class HouseException extends Exception {
	private String message;
	
	/**
	 * Creates a House Exception object
	 */
	
	public HouseException() {
		
	}
	
	/**
	 * Gets message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * 
	 * @param message 	Message that pops up when an instance variable doesn't
	 * 					fit the validity restrictions
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
}
