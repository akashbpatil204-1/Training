package Assessment;

import java.util.*;


//import com.sapient.pe.model.Account;



public class Dish implements Comparable<Dish>{
	
	private int id;
	private String name; 
    private double calories ;
    private double price;
    
    public Dish(int id , String name, double calories , double price) {
    	this.id = id;
    	this.calories = calories;
    	this.name = name;
    	this.price = price;
    }
    public int getId() {
		return id;
	}


	//@Override
	
	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getCalories() {
		return calories;
	}


	public void setCalories(double calories) {
		this.calories = calories;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

    @Override
	public String toString() {
		return "[ID=" + id + "Name= "+name+" Calories= "+calories+" 1Price "+price+"]\n1";
	}


    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(calories);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dish other = (Dish) obj;
		if (Double.doubleToLongBits(calories) != Double.doubleToLongBits(other.calories))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	public static void main(String args[]) {
		 Dish i1 = new Dish(1,"Dosa",50,300);
		 
         Dish i2 = new Dish(2,"Idli-Vada",40,400);
         Dish i3 = new Dish(3,"Pulav",80,300);
         Dish i4 = new Dish(4,"Roti-Curry",100,250);
         Dish i5 = new Dish(5,"Neer-Dosa",50,100);
		/*
		    Dish Id:2, name: Idli-Vada, Price: 40.00  Calories: 200
		    Dish Id:4, name: Roti-Curry, Price: 100.00  Calories: 250
		    Dish Id:1, name: Dosa, Price: 50.00  Calories: 300
		    Dish Id:3, name: Pulav, Price: 80.00  Calories: 330
		*/ //System.out.print("11");
		List <Dish>dishes = new ArrayList<Dish>();
		dishes.add(i1);
		dishes.add(i2);
		dishes.add(i3);
		dishes.add(i4);
		dishes.add(i5);
	    
		   

				   
				 
				   
				  
				  
		Scanner scan = new Scanner(System.in);
		System.out.println("=================Welcome=====================");
	    System.out.println("Please choose from the below options");
							   
		System.out.println("1 => To sort the dishes in the increasing order of calories");
		System.out.println("2 => To sort the dishes in the decreasing order of calories");
		System.out.println("3 => To sort the dishes in the increasing order of price");
		System.out.println("4 => To sort the dishes in the decreasing order of price ");
		int ch1=0;
		do {
		int ch = scan.nextInt();
		switch(ch)
		{
		case 1:
		    
			Set<Dish> d1 = new TreeSet<>(new OrderByCalAsc());
			//sample.addAll(obj); {
			//System.out.println("\n"+sample);
			d1.addAll(dishes);
			System.out.println(d1);
			
			
			
			break;
		
		case 2:
			Set<Dish> d2 = new TreeSet<>(new OrderByCalDsc());
			//sample.addAll(obj); {
			//System.out.println("\n"+sample);
			d2.addAll(dishes);
			System.out.println(d2);
			break;
		
		case 3:
			Set<Dish> d3 = new TreeSet<>(new OrderByPriceAsc());
			//sample.addAll(obj); {
			//System.out.println("\n"+sample);
			d3.addAll(dishes);
			System.out.println(d3);
			break;
		case 4:
			Set<Dish> d4 = new TreeSet<>(new OrderByPriceAsc());
			//sample.addAll(obj); {
			//System.out.println("\n"+sample);
			d4.addAll(dishes);
			System.out.println(d4);
			break;
			
		default:
			System.exit(0);
			break;
		}
		}while(ch1!=1);
		
	}
	//@Override
	//public int compareTo(Dish o) {
		// TODO Auto-generated method stub
		//return 0;
//	}
	@Override
	public int  compareTo(Dish o) {
		// TODO Auto-generated method stub
		//double a = 0.0;
		return 0;
	}
	
	
}
