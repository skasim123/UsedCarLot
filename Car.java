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

/** getters and setters needed for gears and cc.**/
}

