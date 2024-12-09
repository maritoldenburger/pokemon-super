package src;

public class ElectricPokemon extends Pokemon {
    private int weight;
    private int height;

    public ElectricPokemon(String name, String type, int level, int weight, int height) {
        super(name, type, level);
        super.setType("ElectricPokemon");

        this.weight = weight;
        this.height = height;
    }

    public void thunderPunch(){
        System.out.println(getName() + " uses Thunder Punch!");
    }

    public void electroBall(){
        System.out.println(getName() + " uses Electro Ball!");
    }

    @Override
    public void attack(){
        System.out.println(getName() + " attacks with an Electric-type Move");
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }










}
