import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TeaTotal{
public static void main(String args[]){
List<Product>Products=new ArrayList<>();
products.add(new Product("Green Tea",2022,10.0));
products.add(new Product("Black Tea",2022,5.0));
products.add(new Product("Iced Tea",2022,12.0));
products.add(new Product("Chai Tea",2022,15.0));

Map<Integer,Double>teaTotalsByyear = products.stream()
.filter(p ->p.getName().contains("Tea"))
.collect(Collectors.groupBy(Product:getYear,Collectors.summingDouble(Product:getPrice)));
System.out.println("Tea totals by year:");
teaTotalsByYear.forEach(year,total) ->System.out.println("year+":"+total));
}
}
class Product(
private String name;
private int year;
private double price;
   public Product(String name, int year,double price){
this.name=name;
this.year=year;
this.price=price;
}


public String getName() {
return name;
}

public int getYear() {
return year;
}

public double getPrice() {
return price;
}
}