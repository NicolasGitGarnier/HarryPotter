package HarryPotterCode.composants.Levels;

import HarryPotterCode.composants.Characters.Wizard;
import HarryPotterCode.composants.Spells.Spell;

public class Level4 {
    private Wizard wizard;

    public void run4(Wizard wizard) throws InterruptedException {
        System.out.println("* Welcome in 4th grade ! This year will be quite difficult you'll participate to the tree wizard tournament... *");
        System.out.println("* You go to your first class... *");
        Thread.sleep(1000);
        System.out.println("* The year has been charge in exams but you succeed them and finally the tournament arrived... *");
        System.out.println("* You're in the finalist however, this tournament is a trap !! *");
        Thread.sleep(1000);
        System.out.println("* You have been teleport in a graveyard... Whatchout you're in the presence of Voldemort and Petter Pettigrew !!!!! *");
        System.out.println("* Catch the Portkey with a spell to escape ! *");
        Thread.sleep(1000);
        CastSpellLevel4();

    }
    private void CastSpellLevel4(){
        boolean escape = false;
        while (!escape){
            Spell spell = wizard.chooseSpell(wizard.getKnownSpells());// Wizard need to choose a spell in his list of spells.
            boolean castSucces = Spell.castSpell(spell, wizard);// We defined if the wizard succed to cast his spell.
            if (castSucces) {// If he succes to cast the spell he attack.

                switch (spell.getName()) {
                    case "Wingardium Leviosa" -> {
                        System.out.println("* This spell can't get you the Portkey... *");
                        System.out.println(" <> Your Health : " + wizard.getMaxHealth() + ".");
                        System.out.println("* You loose 10 Max Health point... *");
                        wizard.setMaxHealth(wizard.getMaxHealth() - 10);
                        System.out.println(" >>> Your Health : " + wizard.getMaxHealth() + ".");
                    }
                    case "Accio" -> {
                        System.out.println("* Congrats you quickly drag the Portkey to you and escape ! *");
                        escape = true;
                    }
                    case "Expecto Patronum" -> {
                        System.out.println("* This spell can't get you the Portkey... But you cast a bright shield between you and the enemies ! *");
                        System.out.println("* Try another spell *");
                    }
                }
            } else {
                System.out.println("* You missed your spell ... *");
                System.out.println(" <> Your Health : " + wizard.getMaxHealth() + ".");
                System.out.println("* You loose 10 Max Health point... *");
                wizard.setMaxHealth(wizard.getMaxHealth() - 10);
                System.out.println(" >>> Your Health : " + wizard.getMaxHealth() + ".");
            }
        }
    }
}
