package src;

public class FirePokemon extends Pokemon {
    private String food;
    private String colour;

    public FirePokemon(String name, String type, int level, String food, String colour) {
        super(name, type, level);
        super.setType("FirePokemon");

        this.food = food;
        this.colour = colour;
    }

    public void inferno(){
        System.out.println(getName() + " uses Inferno!");
    }

    public void pyroBall(){
        System.out.println(getName() + " uses Pyro Ball!");
    }

    @Override
    public void attack(){
        System.out.println(getName() + " attacks with a Fire-type Move");
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}


