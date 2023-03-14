package HarryPotterCode.composants.Levels;

import HarryPotterCode.composants.Characters.Enemy;
import HarryPotterCode.composants.Characters.Wizard;
import HarryPotterCode.composants.Spells.Spell;
import lombok.AllArgsConstructor;
import lombok.Data;

import static HarryPotterCode.composants.Characters.Wizard.levelUp;

@Data
@AllArgsConstructor
public class Level1 {
    private static Wizard wizard;
    public Level1(Wizard wizard) {
        this.wizard = wizard;
    }
    public static void start(String[] args) throws InterruptedException {
        System.out.println("* You are now in the first grade at Poudlard. Here is your first class. *\n"+
                "- Teacher - Welcome to class every one, let's learn your first easy spell : Wingardium Leviosa.");
        Spell.learnWingardium(wizard.getKnownSpells());
        Thread.sleep(1000);
        System.out.println("* Your know have a need to pee. So you go to the bathroom of the school next to the Dungeon... *");
        Thread.sleep(3000);
        System.out.println(" . . . ");
        Thread.sleep(1000);
        Enemy troll = Enemy.Troll();
        System.out.println("- Troll - Rooooarrrrghh !!!");
        Thread.sleep(1500);
        System.out.println("* You need to fight him ! The battle start... *");
        Thread.sleep(1500);
        wizard.attack(troll);
        Thread.sleep(1000);
        System.out.println("* Well done you have defeated the troll ! + 50 points for " + wizard.getHouse() +". *");
        Thread.sleep(2000);
        //I have not made points for houses, this is just roleplay
        System.out.println("* You know have finished your first year in Hogwards,choose a characteristic to level up : *");
        levelUp(wizard);
    }
}

