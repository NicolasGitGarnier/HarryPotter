package HarryPotterCode.composants;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Spell extends AbstractSpell{
    public Spell(String name, int energyCost) {
        super(name, energyCost);
    }
}
