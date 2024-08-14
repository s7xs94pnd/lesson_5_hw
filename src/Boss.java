class Boss {
    private int bossHealth;
    private int bossDamage;
    private String defenceType;

    // Getter methods
    public int getBossHealth() {
        return bossHealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public String getDefenceType() {
        return defenceType;
    }

    // Setter methods with if-else for validation
    public void setBossHealth(int bossHealth) {
        if (bossHealth < 0) {
            System.out.println("Error: Health cant be negative");
        } else {
            this.bossHealth = bossHealth;
        }
    }

    public void setBossDamage(int bossDamage) {
        if (bossDamage < 0) {
            System.out.println("Error: Damage cant be negativ");
        } else {
            this.bossDamage = bossDamage;
        }
    }

    public void setDefenceType(String defenceType) {
        if (defenceType == null) {
            System.out.println("Error: Defence type cant be epmty");
        } else {
            this.defenceType = defenceType;
        }
    }
}