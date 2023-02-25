package HarryPotterCode.composants;

import java.beans.ConstructorProperties;
import java.util.List;

public class Wizard extends Character{
    private Pet pet;
    private Wand wand;
    private House house;
    private List<Spell> knownSpells;
    private List<Potion> potions;
    public Wizard(Pet pet, Wand wand, House house, List<Spell> knownSpells, List<Potion> potions) {
        this.pet = pet;
        this.wand = wand;
        this.house = house;
        this.knownSpells = knownSpells;
        this.potions = potions;
    }

    public void defend() {

    }
}
