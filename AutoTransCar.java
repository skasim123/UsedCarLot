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


 