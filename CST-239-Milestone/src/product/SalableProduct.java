package product;

/**
 * Represents a product
 * @author Victor Marrujo
 * @version 1.0
 * @since 1.0
 */
public class SalableProduct 
{
	// Fields
    private String Name;
    private String Description;
    private double Price;
    private int Quantity;

    /**
     *  SalableProduct Constructor
     *
     * @param name        The name of the product
     * @param description The description of the product
     * @param price       The price of the product
     * @param quantity    The quantity of the product
     */
    public SalableProduct(String name, String description, double price, int quantity) {
    	super();
    	Name = name;
        Description = description;
        Price = price;
        Quantity = quantity;
    }

    // Getters and Setters
    /**
     * Name getter
     * @return Name Returns product's name
     */
    public String getName() {
        return Name;
    }
    
    /**
     * Description getter
     * @return description Returns product's description
     */
    public String getDescription() {
        return Description;
    }
    
    /**
     * Price getter
     * @return price Returns product's price
     */
    public double getPrice() {
        return Price;
    }
    
    /**
     * Quantity getter
     * @return quantity Returns product's quantity
     */
    public int getQuantity() {
        return Quantity;
    }
    
    /**
     * Quantity setter
     * @param quantity product's new quantity
     */
    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}