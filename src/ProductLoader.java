import java.util.ArrayList;
import java.util.List;
public class ProductLoader {
 public static List<Product> loadProducts() {
 List<Product> products = new ArrayList<>();

 ClothingProduct top = new ClothingProduct("Top", 25.0, "Comfortable cotton T-shirt", 50);
 ClothingProduct shoes = new ClothingProduct("Shoes", 59.99, "Casual sneakers for everyday wear", 25);
 ClothingProduct jeans = new ClothingProduct("Jeans", 39.99, "Slim-fit blue jeans", 30);
 ClothingProduct skirt= new ClothingProduct("Skirt", 29.99, "Cute Korean skirt", 40);
 ClothingProduct dress = new ClothingProduct("Dress", 79.99, "Partywear dress", 15);
 ElectronicProduct Iphone= new ElectronicProduct("Iphone", 1099.0, "16-Pro Max", 10);
 ElectronicProduct headphones = new ElectronicProduct("Headphones", 99.99, "Wireless over-ear headphones", 20);
 ElectronicProduct smartwatch = new ElectronicProduct("Smartwatch", 199.99, "Fitness and health tracker", 15);
 ElectronicProduct tablet = new ElectronicProduct("Tablet", 499.99, "10-inch tablet with high-resolution display", 8);
 ElectronicProduct smartphone = new ElectronicProduct("Smartphone", 799.99, "smartphone with advanced camera quality", 12);
 products.add(Iphone);
 products.add(smartwatch);
 products.add(headphones);
 products.add(smartphone);
 products.add(tablet);
 products.add(top);
 products.add(jeans);
 products.add(shoes);
 products.add(dress);
 products.add(skirt);
 return products;
 }

}

