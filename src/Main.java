class Main{
    public static void main(String[] args) {
    Boss Boss1 = new Boss();
    Boss1.setBossHealth(700);
    Boss1.setBossDamage(100);
    Boss1.setDefenceType("No Defence");
        System.out.println("Boss health :" +Boss1.getBossHealth());
        System.out.println("Boss demage :" +Boss1.getBossDamage());
        System.out.println("Boss defence type :"+Boss1.getDefenceType());


        Hero[] rep = createHeroes();
        for (Hero info: rep){
            System.out.println("\nHERO :  "+info.getNameHero()+"\nHealth :"+info.getHeroHealth()+"\nDamage :"+info.getHeroDamage()+"\nSuper trick :"+info.getHeroSuperTrick());

        }

    }
public static Hero[] createHeroes(){
        Hero fireMan  = new Hero("Fire man",300,40,"fire ball");
        Hero ironMan  = new Hero("Iron man",400,25);
        Hero aquaMan  = new Hero("Aqua man",400,25, "Tsunami");
    return new Hero[]{fireMan,ironMan,aquaMan};



    }
}
