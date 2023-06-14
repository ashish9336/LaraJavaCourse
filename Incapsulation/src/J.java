class Product {
    private String name;
    private double price;
    private int quantity;

    // Getters and setters for name, price, and quantity
    // ...

	public String getName()
	{
	return name;
	}

	public Double getPrice()
	{
	return price;
	}
	public int getQuantity()
	{
    return quantity;
	}

	public void setName(String name)
	{
	this.name=name;
	}

	public void setQuantity(int quantity)
	{
	this.price=price;
	}
	public void setPrice(Double price)
	{
	this.price=price;
	}
}
class J
{

    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Phone");
        product.setPrice(500.0);
        product.setQuantity(10);
        String name = product.getName();
        double price = product.getPrice();
        int quantity = product.getQuantity();
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}