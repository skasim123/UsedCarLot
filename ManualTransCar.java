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