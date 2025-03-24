package product_containers;

import java.util.ArrayList;
import java.util.List;

import product.SalableProduct;

/**
 * Manages the inventory of products
 * @author Victor Marrujo
 * @version 1.0
 * @since 1.0
 */
public class InventoryManager 
{
	// Fields
    private List<SalableProduct> products;

    /**
     *  InventoryManager Constructor
     */
    public InventoryManager() 
    {
        products = new ArrayList<>();
    }

    /**
     * Adds product to inventory
     *
     * @param product Product to add
     */
    public void addProduct(SalableProduct product) {
        products.add(product);
    }

    /**
     * Removes product from inventory
     *
     * @param product Product to remove
     */
    public void removeProduct(SalableProduct product) {
        products.remove(product);
    }

    /**
     * Retrieves list of products in inventory
     *
     * @return products List of products
     */
    public List<SalableProduct> getProducts() {
        return products;
    }
}
