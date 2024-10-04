public class Rocket {
    String name;
    int fuelWeight;
    public Rocket(String name, int fuelWeight){
        this.name = name;
        this.fuelWeight = fuelWeight;
    }
    public void refuel(){
        fuelWeight += (int)(Math.random() *100 + 100);
        System.out.println("weight after : " + fuelWeight);
    }
    public void start() throws Exception {
        if(fuelWeight < 1000)
            throw new Exception("Launch cancelled - insufficient fuel level");
    }
}
