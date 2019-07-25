package Assessment;

import java.util.Comparator;

//import com.sapient.pe.model.Account;

public class Order  implements Comparator<Dish> {
	private int id;
	public int compare(Dish o1 , Dish o2) {
//	    return Integer.valueOf(o1.get).compareTo(o2.getId());	
	  //  return Long.valueOf(o1.getAccountNumber()).compareTo(o1.getAccountNumber());
	    //return Integer.valueOf(o1.getId().compareTo(o2.getId()));
	    
	    return Integer.valueOf(o1.getId()).compareTo(o2.getId());
	}

}
class OrderByCalAsc  implements Comparator<Dish> {
	//private int id;
	public int compare(Dish o1 , Dish o2) {
//	    return Integer.valueOf(o1.get).compareTo(o2.getId());	
	  //  return Long.valueOf(o1.getAccountNumber()).compareTo(o1.getAccountNumber());
	    //return Integer.valueOf(o1.getId().compareTo(o2.getId()));
	    
	    return Double.valueOf(o1.getCalories()).compareTo(o2.getCalories());
	}

}

class OrderByCalDsc  implements Comparator<Dish> {
	//private int id;
	public int compare(Dish o1 , Dish o2) {
//	    return Integer.valueOf(o1.get).compareTo(o2.getId());	
	  //  return Long.valueOf(o1.getAccountNumber()).compareTo(o1.getAccountNumber());
	    //return Integer.valueOf(o1.getId().compareTo(o2.getId()));
	    
	    return Double.valueOf(o2.getCalories()).compareTo(o1.getCalories());
	}

}

class OrderByPriceAsc  implements Comparator<Dish> {
	//private int id;
	public int compare(Dish o1 , Dish o2) {
//	    return Integer.valueOf(o1.get).compareTo(o2.getId());	
	  //  return Long.valueOf(o1.getAccountNumber()).compareTo(o1.getAccountNumber());
	    //return Integer.valueOf(o1.getId().compareTo(o2.getId()));
	    
	    return Double.valueOf(o1.getPrice()).compareTo(o2.getPrice());
	}

}

class OrderByPriceDsc  implements Comparator<Dish> {
	//private int id;
	public int compare(Dish o1 , Dish o2) {
//	    return Integer.valueOf(o1.get).compareTo(o2.getId());	
	  //  return Long.valueOf(o1.getAccountNumber()).compareTo(o1.getAccountNumber());
	    //return Integer.valueOf(o1.getId().compareTo(o2.getId()));
	    
	    return Double.valueOf(o2.getPrice()).compareTo(o1.getPrice());
	}

}
