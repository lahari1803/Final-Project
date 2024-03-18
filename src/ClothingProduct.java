public class ClothingProduct implements Product {
    private String name;
    private double price;
    private String description;
    private int quantityInStock;
   
    public ClothingProduct(String name, double price, String description, int quantityInStock) 
    {
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantityInStock = quantityInStock;        
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public double getPrice() 
    {
        return price;
   
    }

    @Override
    public String getDescription()
    {
            return description;

    }

    @Override
    public int getQuantityInStock()
    {
            return quantityInStock;
    
    }

    public String toString()
    {
        return "ClothingProduct{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", description='" + getDescription() + '\'' +
                ", quantityInStock=" + getQuantityInStock() +
                '}';
    }

}
