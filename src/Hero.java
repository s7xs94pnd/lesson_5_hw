class  Hero{
private int heroHealth;
private int heroDamage;
private String heroSuperTrick;
private String nameHero;


public Hero(String nameHero, int heroHealth, int heroDamage, String heroSuperTrick){
    this.nameHero=nameHero;
    this.heroHealth=heroHealth;
    this.heroDamage=heroDamage;
    this.heroSuperTrick=heroSuperTrick;
}

public Hero(String nameHero, int heroHealth, int heroDamage){
    this.nameHero=nameHero;
    this.heroHealth=heroHealth;
    this.heroDamage=heroDamage;
    this.heroSuperTrick = "No super trick";
}


    public String getNameHero() {
        return nameHero;
    }

    public int getHeroHealth() {
        return heroHealth;
    }
    public int getHeroDamage() {
        return heroDamage;
    }
    public String getHeroSuperTrick() {
        return heroSuperTrick;
    }


}
