package HarryPotterCode.composants.Levels;

import HarryPotterCode.composants.Characters.Wizard;
import HarryPotterCode.composants.Spells.Spell;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class Level2 {
    @NonNull private static Wizard wizard;
    public static void level2(Wizard wizard) throws InterruptedException {
        System.out.println("* You are now in the second grade at Hogwards. Here is your first class of the year. *\n" +
                "- Teacher - Welcome to class every one, let's learn your second easy spell : Accio. Say 'Accio' and bring your book into your hand.");
        Spell.learnAccio(wizard.getKnownSpells());
        Thread.sleep(1500);
        System.out.println("* You return in your room, and you find Tom Jedusor's book on your bed... *");
        Thread.sleep(1500);
        System.out.println("* Looking for answers you directly go to the secret chamber and... face the terrible Basilic !!! *");
        System.out.println("* You need to fight him ! The battle start... *");

    }
}
