import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
public class CatalogTest 
{

    @Test
    public void testAddProduct() 
    {
   
        Catalog catalog = new Catalog();
        Product Iphone = new ElectronicProduct("Iphone", 1099.0, "16-Pro Max", 10);
        catalog.addProduct(Iphone);
        assertEquals(1, catalog.getAllProducts().size());
        assertEquals(Iphone, catalog.getProductByName("Iphone"));
       
    }

    @Test
    public void testAddProducts() 
    {
        Catalog catalog = new Catalog();
        List<Product> newProducts = new ArrayList<>();
        Product skirt = new ClothingProduct("Skirt", 29.99, "Cute Korean skirt", 40);
        newProducts.add(skirt);
        catalog.addProducts(newProducts);
        assertEquals(1, catalog.getAllProducts().size());
        assertEquals(skirt, catalog.getProductByName("skirt"));
        
    }

    @Test
    public void testGetProductByName() 
    {
        Catalog catalog = new Catalog();
        Product tablet = new ElectronicProduct("Tablet", 499.99, "10-inch tablet with high-resolution display", 8);
        catalog.addProduct(tablet);
        assertEquals(tablet, catalog.getProductByName("tablet"));
        assertNull(catalog.getProductByName("NonexistentProduct"));

    }

}
