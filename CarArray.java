import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Cars {
		private String make;
		private int price;
		private String color;
		private String model;
		private String trans;
		private int ng;
		private String vin;
		
		List<Cars> usedCars = new ArrayList<>();

	public Cars (String make, int price, String color, String model, String trans, int ng, String vin) {
		
		this.make = make;
		this.price = price;
		this.color = color;
		this.model = model;
		this.trans = trans;
		this.ng = ng;
		this.vin = vin;
		
		
	}
	
	public String getMake() {
		return this.make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

	public String getTrans() {
		return this.trans;
	}
	
	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getVin() {
		return this.vin;
	}

	public void setTrans(String trans) {
		this.trans = trans;
	}

	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getng() {
		return this.ng;
	}
	
	public void setng(int ng) {
		this.ng = ng;
	}
	

public static Cars AddCar() {
	Scanner Input = new Scanner(System.in);
	//Cars Mycar = new Cars();
	Cars c1 = new Cars ("",1500,"", "", "",1,"");
	
	System.out.println("Enter Make :");
	String make = Input.next();
	
	System.out.println("Enter Model :");
	String model = Input.next();

	System.out.println("Enter Price :");
	int price = Input.nextInt();

	System.out.println("Enter Color :");
	String color = Input.next();

	System.out.println("Enter Trans Type :");
	String trans = Input.next();

	System.out.println("Enter Number of Gears :");
	int ng = Input.nextInt();

	System.out.println("Enter Vin :");
	String vin = Input.next();
	
	
	Boolean CarValid = true;
	if (trans == "Auto"  && ng > 2) {
		System.out.println("Invalid car type");
		CarValid = false;
	}
	 
	if ((trans == "Manual") && (ng < 3  || ng > 6)) {
				System.out.println("Invalid car type");
				CarValid = false;
			}

		if (CarValid) {
	    c1.setMake(make);
		c1.setColor(color);
		c1.setModel(model);
		c1.setPrice(price);
		c1.setTrans(trans);
		c1.setVin(vin);
		c1.setng(ng);
		}
	return(c1);
}	


public static int SearchCar(List<Cars> usedCars) {
		Scanner Input = new Scanner(System.in); 
		System.out.println("Enter Make to search :");
	//System.out.println("NUMBER OF CARS IN THE ARRAY :" +usedCars.size());
	String make = Input.next();
	//System.out.println("sEARCH VALUE IS :"+make);
	
	System.out.println("List of "+make+" "+"Cars");
	
	
	for (int i = 0; i < usedCars.size(); i++) {
		
		//System.out.println(usedCars.get(i).getVin());
		//System.out.println(usedCars.get(i).getMake());
		if (usedCars.get(i).getMake().compareTo(make) == 0) {
			System.out.println(usedCars.get(i).getMake()+" "+usedCars.get(i).getModel()+" "+usedCars.get(i).getColor()+" "+usedCars.get(i).getVin()+" "+usedCars.get(i).getPrice());
		}
		
	}
 return(1);
}

public static int RemoveCar(List<Cars> usedCars) {
	Scanner Input = new Scanner(System.in); 
	System.out.println("Enter Vin to remove :");
	//System.out.println("NUMBER OF CARS IN THE ARRAY :" +usedCars.size());
	String vin = Input.next();
	//System.out.println("SEARCH VALUE IS :"+vin);

	
	for (int i = 0; i < usedCars.size(); i++) {
		System.out.println(usedCars.get(i).getVin());
		if (usedCars.get(i).getVin().compareTo(vin) == 0) {
			
			usedCars.remove(i);
		}
		
	}
	System.out.println("Cars left :");
	usedCars.forEach(Car->{
			System.out.println(Car.getMake()+" "+Car.getPrice()+" "+Car.getVin());

});
	return(1);
}



}


public class CarArray {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars C = new Cars("",1500,"", "", "",1,"");
		
		List<Cars> usedCars = new ArrayList<>();
	
        int Search = 0;
		int Choice = 0;
		int Remove = 0;
		int Menu = 0;
		
		while (Menu !=9) {
			System.out.println("Enter 1 to Add");
			System.out.println("Enter 2 to List");
			System.out.println("Enter 3 to Delete");
			System.out.println("Enter 9 to Exit");
			Scanner MenuInput =new Scanner(System.in);
			Menu = MenuInput.nextInt();
			
		if (Menu==1) { 
		while (Choice!=9) {
		usedCars.add(Cars.AddCar());
		System.out.println("Enter any number to add more cars, 9 to stop :");
		Scanner userInput =new Scanner(System.in);
		Choice = userInput.nextInt();
		}
		} else if (Menu == 2) {
	   
	// Search Cars	
		Search = Cars.SearchCar(usedCars);
		}else if (Menu==3) {
	// Remove a car
		Remove = Cars.RemoveCar(usedCars);
		}
		
	}

}






}


