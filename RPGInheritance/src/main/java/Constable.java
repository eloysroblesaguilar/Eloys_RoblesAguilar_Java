public class Constable extends Person{

private String jurisdiction;

public Constable() {
    this.strength = 60;
    this.health = 100;
    this.stamina = 60;
    this.speed = 20;
    this.attackPower = 5;
    this.running = false;
    this.arrested = false;
}

public void arrest(Person person) {
    person.setArrested(true);
    System.out.println(this.name + " arrests " + person.name);
}


    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }
}
