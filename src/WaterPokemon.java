package src;

public class WaterPokemon extends Pokemon {
    private String habitat;
    private String evolution;

    public WaterPokemon(String name, String type, int level, String habitat, String evolution) {
        super(name, type, level);
        super.setType("WaterPokemon");

        this.habitat = habitat;
        this.evolution = evolution;
    }

    public void surf(){
        System.out.println(super.getName() + " uses Surf!");
    }

    public void hydroCannon(){
        System.out.println(super.getName() + " uses Hydro Cannon!");
    }

    @Override
    public void attack(){
        System.out.println(super.getName() + " attacks with a Water-type Move");
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setEvolution(String evolution) {
        this.evolution = evolution;
    }

    public String getEvolution() {
        return evolution;
    }

}
