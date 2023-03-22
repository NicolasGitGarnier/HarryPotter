package HarryPotterCode.composants.Levels;

import HarryPotterCode.composants.Characters.Wizard;
import HarryPotterCode.composants.Spells.Spell;

public class Level6 {
    private Wizard wizard;
    public void run6(Wizard wizard) throws InterruptedException {
        System.out.println("");
        System.out.println("-------------------- Astronomy tower ---------------------");
        System.out.println("");
        System.out.println("* Dumbledor feels this summer that terrible things are going to happened so he decided to learn you Sectumsempra, a deadly spell...  *");
        Spell.learnSectumsempra(wizard.getKnownSpells());
        System.out.println("* Mangemort are attacking Hogwards !! You need to defend your school !");
    }
}
