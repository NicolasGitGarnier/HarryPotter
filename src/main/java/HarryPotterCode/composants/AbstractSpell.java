package HarryPotterCode.composants;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AbstractSpell {
    private String name;
    private int sc; /* sc stand for succes chance */

    public int sp() { /* sp stand for : succes pourcentage */
        sc = new Random().nextInt(21)+80; /* random number between 20 and 100 */
        return sc;
    }
}
