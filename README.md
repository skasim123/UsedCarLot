UsedCarLot: 
-----------


public class UsedCarLot
{
  // this is a brute force method of creating various car instance variables
  // How could we simplify this using a list?
 
  private Car c1, c2, c3, c4, c5;
  int totalValue;
  
public Car usedCarList[] = new Car [5];  
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








Car Class:
----------------------
public abstract class Car{

private String make;
private int price;
private String model;
private String color;
private int year;
private String trans;
private String vin;
private int gears;
private boolean cc;

public Car(){
  price=0;
  make = "xxx";
  model="undef";
  color = "black";
  year = 1900;
  trans = "auto";
  vin = "xxxxxxxxxx";
//  gears = 0;
//  cc = false;
}

public Car (String m, int p, String mod, String c, int y, String t, String v){
  price=p;
  make = m;
  model=mod;
  color = c;
  year = y;
  trans= t;
  vin = v;
  
}

public void setMake(String m){
  make =m ;
}

public String getMake(){
  return  make;
}

public void setPrice(int p){
  price=p;
}

public int getPrice(){
  return  price;
}


public void setModel(String mod){
  model=mod;
}

public String getModel(){
  return  model;
}


public String getColor(){
    return color;
}

public void setColor(String c){
    color = c;
}


public int getYear(){
    return year;
}

public void setYear(int y){
    year = y;
}

public String getTrans(){
    return trans;
}

public void setTrans(String t){
    trans = t;
}
public String getVin(){
    return vin;
}

public void setVin(String v){
    vin = v;
}

/** getters and setters needed for gears and cc.**/}






Manual TransCar Class:
----------------------
public class ManualTransCar extends Car{
private int numGears;

public ManualTransCar(){
  super();
  setNumGears(5);
}

public  ManualTransCar(String m, int p,String mod,String c, int  ng, String t, String v){
    super(m,p,mod,c,ng,t, v);
    setNumGears(ng);
    t = " manual";
    
   
}

public void setNumGears(int ng){
    
    if (3<ng && ng <=6){
  
         numGears=ng;
  }
  else {
       numGears=5;
  }
}

public int getNumGears(){
  return numGears;
}

}




AutoTransCar Class:
-------------------

public class AutoTransCar extends Car{ 
private boolean cruzControlOn;

public  AutoTransCar(){
   super();
   cruzControlOn=false;
}

public void toggleCruzControl(){
    cruzControlOn= !cruzControlOn;
}

public  AutoTransCar (String m, int p, String mod, String c,int y, String t, String v,  boolean ccOn){
   super(m,p,mod,c,y,t,v);
   cruzControlOn=ccOn;
}

private void setCruzControl(boolean cc){
  cruzControlOn=cc;
}
private boolean getCruzControl(){
  return cruzControlOn;
}


}


 


