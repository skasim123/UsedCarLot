 
public class UsedCarLot
{
  // this is a brute force method of creating various car instance variables
  // How could we simplify this using a list?
 
  private Car c1, c2, c3, c4, c5;
  int totalValue;
  
ArrayList<String> list=new ArrayList<String>(Carlist);//Creating arraylist   
 public UsedCarLot(){
     /** loop and add cars to the array usedCarlist**/
     
     c1=(Car) new AutoTransCar("VW",2500,"VW Bug","red", 1959,"auto","Vin 01", false);
     totalValue=c1.getPrice();
     c2=(Car) new AutoTransCar("Ford",5000,"Ford Mustang","red",1959,"auto","Vin 02", false);
     totalValue+=c2.getPrice();
     c3= (Car) new ManualTransCar("Honda",12000,"Honda Fit","red", 5, "manual", "Vin 03");
     totalValue+=c3.getPrice();
     
     /* Note Cannot instantiate c4 below.  Why? -> Because there is an arument missing
     c4= (Car) new Car(12000,"Honda Fit");
     totalValue+=c4.getPrice();
     */
    
     // This is how you would have to determin number of gears of a manual trans
     // car.  Why?
     System.out.println("c3 num gears = " + ((ManualTransCar)c3).getNumGears());
     
}

    public Car addCar(int p, String m, String carType, int ng, boolean cc){
        if ( ng >= 3 && ng <= 6){
            System.out.println("This has an acceptable number of gears");
        }
            else 
            {   System.out.println("This ain't meetin the gear needs");
                return null;}
        if (p <= 0){
             System.out.println("Could not add car");
             return null;
            }
         if (carType.equals("Auto")){
             Car c=(Car) new AutoTransCar(m,p,null,null,0,"auto","v", false );
             totalValue+=c.getPrice();
             return c;
            }
            if (carType.equals("Manual")) {
              Car c= (Car) new ManualTransCar(m,p,null,null,ng,"manual","v");
              totalValue+=c.getPrice();  
              return c;
            }
            
            System.out.println("AddCar: Incorrect car type passed to addCar method!");
            
            return null;
        }
    
    /**
     * removeCar takes a Car variable as a param, and returns a null pointer,
     * thus setting the Car that you are trying to remove to null.  Why can't
     * we do this inside the method?
     * To call: c=removeCar(c);
     * @param c the car that you want to remove
     */
    public Car removeCar(Car c){
        totalValue-=c.getPrice();
        return null;
        // you could call System.gc() to force garbage collection
    }

    /**
     * Just a test method to allow testing through Bluej
     * @param n the car (c1,c2...) that you want to remove
     */
    public  void testRemove(int n){
        if (n==1) { c1=removeCar(c1);}
        if (n==2) { c2=removeCar(c2);}
        if (n==3) { c3=removeCar(c3);}
    }  
}
