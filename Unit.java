public class Unit {


    String name;

    int maxHp;
    int hp;
    int attack;
    int defense;
    float critMultiplier;
    float critChance;

    public Unit(String name,int maxHp,int attack,int defense,float critMultiplier,float critChance)
    {
        this.name=name;
        this.maxHp=maxHp;
        this.hp=maxHp;
        this.attack=attack;
        this.defense=defense;
        this.critMultiplier=critMultiplier;
        this.critChance=critChance;
    }

    public String getName()
    { return this.name; }
    public int getHp()
    { return this.hp; }
    public int getMaxHp()
    { return this.maxHp; }
    public int getAttack()
    { return this.attack; }
    public int getDefense()
    { return this.defense; }
    public float getCritMultiplier()
    { return this.critMultiplier; }
    public float getCritChance()
    { return this.critChance; }

    public void setAttack(int attack) {
        this.attack = attack;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }
    public void setCritMultiplier(float critMultiplier) {
        this.critMultiplier = critMultiplier;
    }
    public void setCritChance(float critChance) {
        this.critChance = critChance;
    }

    public void changeHp(float hp)
    {
        this.hp = (int)Math.min(Math.max(this.hp+hp,0),maxHp);
    }
}
