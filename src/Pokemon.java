package src;

public class Pokemon {
    private String name;
    private String sound;
    private String type;
    private int level;
    private int hp;
    private int xp;

    public Pokemon(String name, String sound, String type, int level, int hp, int xp) {
        this.name = name;
        this.sound = sound;
        this.type = type;
        this.level = level;
        this.hp = hp;
        this.xp = xp;
    }

    public void attack(){
        System.out.println(name + "attacks");
    }

    public void defense(){
        System.out.println(name + "defends itself");
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType() {
        this.type = type;
    }

    public int getXp() {
        return this.xp;
    }

    public void setXp() {
        this.xp = xp;
    }


}


