import java.util.ArrayList;
import java.util.List;
public class Catalog {

 private List<Product> products = new ArrayList<>();
 public void addProduct(Product product)
 {
        products.add(product);
   
 }
 
 public Product getProductByName(String name)
 {
    for (Product product : products) 
    {
    	if (product.getName().equals(name))
        {
           return product;
        }

    }

    return null;
 }

 public List<Product> getAllProducts() 
 {
    return products;
 }

 public void addProducts(List<Product> newProducts)
 {
   
    products.addAll(newProducts);

 }

}
