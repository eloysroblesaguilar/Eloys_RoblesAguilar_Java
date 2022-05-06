public class Farmer extends Person{
    protected boolean plowing;
    protected boolean harvesting;


    public Farmer() {
        this.strength = 75;
        this.health = 100;
        this.stamina = 75;
        this.speed = 10;
        this.attackPower = 1;
        this.running = false;
        this.arrested = false;
        this.plowing= false;
        this.harvesting= false;
    }




    @Override
    public boolean isPlowing() {
        return plowing;
    }

    @Override
    public void setPlowing(boolean plowing) {
        this.plowing = plowing;
    }

    @Override
    public boolean isHarvesting() {
        return harvesting;
    }

    @Override
    public void setHarvesting(boolean harvesting) {
        this.harvesting = harvesting;
    }
}
