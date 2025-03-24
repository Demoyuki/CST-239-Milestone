package store;

import product.SalableProduct;
import product_containers.InventoryManager;
import product_containers.ShoppingCart;

/**
 * Represents store front that interacts with inventory and shopping cart
 * @author Victor Marrujo
 * @version 1.0
 * @since 1.0
 */
public class StoreFront
{
	// Fields
    private InventoryManager inventory;
    private ShoppingCart cart;

    /**
     * StoreFront Constructor
     *
     * @param Inventory inventory manager
     * @param Cart      shopping cart
     */
    public StoreFront(InventoryManager Inventory, ShoppingCart Cart) 
    {
       inventory = Inventory;
       cart = Cart;
    }

    /**
     * Move product from inventory to cart.
     *
     * @param product The product to purchase.
     */
    public void grabProduct(SalableProduct product) 
    {
        if (inventory.getProducts().contains(product))
        {
            inventory.removeProduct(product);
            cart.addProduct(product);
            System.out.println(product.getName() + " added to cart!");
        } else {
            System.out.println("Product not found on shelves.");
        }
    }

    /**
     * Move product back to the inventory.
     *
     * @param product Product to cancel.
     */
    public void cancelPurchase(SalableProduct product) 
    {
        if (cart.getCartItems().contains(product)) 
        {
            cart.removeProduct(product);
            inventory.addProduct(product);
            System.out.println(product.getName() + " was put back on shelf.");
        } else {
            System.out.println("Product not found in cart.");
        }
    }
    
    /**
     * Finalizes purchase by removing items from cart, calculating the total, and thanking the user
     */
    public void purchaseProduct() 
    {
        if (cart.getCartItems().isEmpty()) 
        {
            System.out.println("Your cart is empty. Nothing to purchase.");
            return;
        }

        double total = 0;
        System.out.println("Finalizing your purchase...");

        // Calculate total and remove items from cart
        for (SalableProduct product : cart.getCartItems()) 
        {
            total += product.getPrice();
            System.out.println("Purchased: " + product.getName() + " for $" + product.getPrice());
        }

        // Clear the cart
        cart.getCartItems().clear();

        // Display total and thank the user
        System.out.println("Total: $" + total);
        System.out.println("Thank you for shopping with us!");
    }

	/**
	 * Main function
	 * @param args Main function arguments
	 */
	public static void main(String[] args) 
	{
		// Initialize inventory and add products
        InventoryManager inventory = new InventoryManager();
        inventory.addProduct(new SalableProduct("Tortillas", "1kg of freshly made maiz tortillas", 3.00, 10));
        SalableProduct Tortillas = inventory.getProducts().get(0);
        inventory.addProduct(new SalableProduct("BagCheese", "Great Value Finely Shredded Low-Moisture Part-Skim Mozzarella Cheese", 1.97, 20));
        SalableProduct BagCheese = inventory.getProducts().get(1);
        // Initialize shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Initialize store front
        StoreFront store = new StoreFront(inventory, cart);

        // Purchase a product
        store.grabProduct(Tortillas);
        store.grabProduct(BagCheese);

        // Cancel a purchase
        store.cancelPurchase(Tortillas);
        
        // Complete purchase
        store.purchaseProduct();
    }
}