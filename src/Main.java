package src;

public class Main {
    public static void main(String[] args) {
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", "Electric Pokemon", 3, 6, 40);
        FirePokemon charmander = new FirePokemon("Charmander", "Fire Pokemon", 5, "fruit", "orange");
        GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur", "Grass Pokemon", 11, 45, 49);
        WaterPokemon squirtle = new WaterPokemon("Squirtle", "Water Pokemon", 13, "freshwater", "Wartortle");

        System.out.println(pikachu.getName() + " is an " + pikachu.getType());
        pikachu.attack();
        pikachu.electroBall();
        pikachu.thunderPunch();

        System.out.println(charmander.getName() + " is a " + charmander.getType());
        charmander.defense();
        charmander.attack();
        charmander.inferno();
        charmander.pyroBall();

        System.out.println(bulbasaur.getName() + " is a " + bulbasaur.getType());
        System.out.println(bulbasaur.getName() + " loses " + 5 + "XP!");
        bulbasaur.setXp(44);
        System.out.println("Current XP = " + bulbasaur.getXp());
        bulbasaur.attack();
        bulbasaur.leafStorm();
        bulbasaur.leechSeed();

        System.out.println(squirtle.getName() + " is a " + squirtle.getType());
        squirtle.defense();
        squirtle.attack();
        squirtle.hydroCannon();
        squirtle.surf();

    }
}
