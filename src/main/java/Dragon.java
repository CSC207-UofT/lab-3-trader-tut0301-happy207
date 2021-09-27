public class Dragon implements Tradable, Drivable{
    private int maxSpeed;

    public Dragon() {
        this.maxSpeed = 200;
    }
    @Override
    public int getPrice(){return 100;}

    @Override
    public void upgradeSpeed(){ this.maxSpeed += 10;}

    @Override
    public void downgradeSpeed(){ this.maxSpeed -= 10;}

    @Override
    public int getMaxSpeed(){ return this.maxSpeed;}

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
