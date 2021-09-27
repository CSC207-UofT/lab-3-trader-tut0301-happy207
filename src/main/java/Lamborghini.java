public class Lamborghini implements Drivable, Domesticatable, Tradable {

    private int maxSpeed;

    public Lamborghini() {
        this.maxSpeed = 350;
    }

    @Override
    public String sound() { return "VROOM!"; }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 10;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed -= 10;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 2000000;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }

}

