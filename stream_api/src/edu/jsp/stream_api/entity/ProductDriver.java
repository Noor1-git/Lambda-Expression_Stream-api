package edu.jsp.stream_api.entity;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ProductDriver {

	public static void main(String[] args) {
		
		Set<Product> products=new HashSet<>();
		
		
		products.add(new Product(1, "p1", "a1", 100));
		products.add(new Product(2, "p2", "a2", 450));
		products.add(new Product(3, "p3", "a3", 700));
		products.add(new Product(4, "p4", "a4", 575));
		products.add(new Product(5, "p5", "a5", 600));
		products.add(new Product(6, "p6", "a6", 800));
		
//		Iterator<Product> iterator= products.iterator();
//	
//		while (iterator.hasNext()) {
//			Product pro;
//			if ((pro= iterator.next()).getCost()>500) {
//				System.out.println(pro);
//			}
//		}
		
//		fetch all products with cost greater than 500;
		Set<Product> filterProduct= products.stream().filter(prd->prd.getCost()>500).map(p->p).collect(Collectors.toSet());
		filterProduct.forEach(p->System.out.println(p));
		
		
//		find product with max cost;
		Product MaxCost= products.stream().max((p1,p2)->(int)p1.getCost()-(int)p2.getCost()).get();
		System.out.println(MaxCost);
		
//		find product with min cost;		
		Product MinCost= products.stream().min((p1,p2)->(int)p1.getCost()-(int)p2.getCost()).get();
		System.out.println(MinCost);
		
//		find total cost of products;
		Double cost=products.stream().collect(Collectors.summingDouble((product)->product.getCost()));
		System.out.println(cost);
	}
	
}
