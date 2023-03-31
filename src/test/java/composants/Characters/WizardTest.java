package composants.Characters;

import HarryPotterCode.composants.Characters.Wizard;
import HarryPotterCode.composants.Potions.Potion;
import HarryPotterCode.composants.Spells.Spell;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class WizardTest {

    @Test
    public void testChooseSpell() {
        List<Spell> spells = new ArrayList<>();
        Spell spell1 = new Spell("spell1", 80,20);
        Spell spell2 = new Spell("spell2", 50, 40);
        spells.add(spell1);
        spells.add(spell2);
        Wizard wizard = new Wizard(100, 20, 10, 80, 5, "firstName", "lastName", null, null, null, spells, null);
        Spell chosenSpell = wizard.chooseSpell(spells);
        Assertions.assertTrue(spells.contains(chosenSpell));
    }

    @Test
    public void testChoosePotion() {
        List<Potion> potions = new ArrayList<>();
        Potion potion1 = new Potion("potion1", 10);
        Potion potion2 = new Potion("potion2", 5);
        potions.add(potion1);
        potions.add(potion2);
        Wizard wizard = new Wizard(100, 20, 10, 80, 5, "firstName", "lastName", null, null, null, null, potions);
        Potion chosenPotion = wizard.choosePotion(potions);
        Assertions.assertTrue(potions.contains(chosenPotion));
    }

    @Test
    public void testAddPotion() {
        Potion potion = new Potion("potion", 10);
        Wizard wizard = new Wizard(100, 20, 10, 80, 5, "firstName", "lastName", null, null, null, null, new ArrayList<>());
        int initialPotionCount = wizard.getPotions().size();
        int quantityToAdd = 5;
        wizard.addPotion(potion, quantityToAdd);
        Assertions.assertEquals(initialPotionCount + quantityToAdd, wizard.getPotions().size());
    }
}

