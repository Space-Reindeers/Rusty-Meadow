public class Statistics {

    private double strength;
    private double agility;
    private double intelligence;
    private double luck;
    private double health;
    private double damage;
    private double block;
    private double dodge;
    private double armor;
    private double spellRes;
    private double spellAmp;
    private double critChance;

    public Statistics(double strength, double agility, double intelligence, double luck, double health, double damage, 
        double block, double dodge, double armor, double spellRes, double spellAmp, double critChance) {
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.luck = luck;
        this.health = health;
        this.damage = damage;
        this.block = block;
        this.dodge = dodge;
        this.armor = armor;
        this.spellRes = spellRes;
        this.spellAmp = spellAmp;
        this.critChance = critChance;
    }

    private double getStrength() {
        return this.strength;
    }

    private double getAgility() {
        return this.strength;
    }

    private double getIntelligence() {
        return this.intelligence;
    }

    private double getLuck() {
        return this.luck;
    }

    private double getHealth() {
        return this.health;
    }

    private double getDamage() {
        return this.damage;
    }

    private double getBlock() {
        return this.block;
    }

    private double getDodge() {
        return this.dodge;
    }

    private double getArmor() {
        return this.armor;
    }

    private double getSpellRes() {
        return this.spellRes;
    }

    private double getSpellAmp() {
        return this.spellAmp;
    }

    private double getCritChance() {
        return this.critChance;
    }

    private double setStrength(double strength) {
        strength = this.strength;
    }

    private void setAgility(double agility) {
        agility = this.agility;
    }

    private void setIntelligence(double intelligence) {
        intelligence = this.intelligence;
    }

    private void setLuck(double luck) {
        luck = this.luck;
    }

    private void setHealth(double health) {
        health = this.health;
    }

    private void setDamage(double damage) {
        damage = this.damage;
    }

    private void setBlock(double block) {
        block = this.block;
    }

    private void setDodge(double dodge) {
        dodge = this.dodge;
    }

    private void setArmor(double armor) {
        armor = this.armor;
    }

    private void setSpellRes(double spellRes) {
        spellRes = this.spellRes;
    }

    private void setSpellAmp(double spellAmp) {
        spellAmp = this.spellAmp;
    }

    private void setCritChance(double critChance) {
        critChance = this.critChance;
}