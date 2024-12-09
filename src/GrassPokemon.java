package src;

public class GrassPokemon extends Pokemon {
    private int hp;
    private int xp;

    public GrassPokemon(String name, String type, int level, int hp, int xp) {
        super(name, type, level);
        super.setType("GrassPokemon");

        this.hp = hp;
        this.xp = xp;
    }

    public void leechSeed(){
        System.out.println(getName() + " uses Leech Seed!");
    }

    public void leafStorm(){
        System.out.println(getName() + " uses Leef Storm!");
    }

    @Override
    public void attack(){
        System.out.println(getName() + " attacks with a Grass-type Move");
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getXp() {
        return xp;
    }
}
