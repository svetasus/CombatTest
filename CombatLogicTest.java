import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CombatLogicTest
{
    @Test
    void testZeroAttackShouldGiveZeroDamage()
    {
        Unit weakUnit = new Unit ("weekUnit",10,0,3,2,0.5f);
        Unit targetUnit = new Unit ("targetUnit",10,2,3,2,0.5f);

        float damage = CombatLogic.calculateDamage(weakUnit,targetUnit,true);

        assertEquals(0, damage, "Damage should be 0 when attack is 0");
    }

    @Test
    void testHpShouldNotBeLessThanZero()
    {
        int massiveAttack = 100000000;
        Unit targetUnit = new Unit ("targetUnit",5,5,2,2,0.5f);
        Unit strongUnit = new Unit ("strongUnit",10,massiveAttack,2,2,0.5f);

        CombatLogic.calculateTurn(strongUnit,targetUnit,true);

        assertEquals(0, targetUnit.getHp(), "HP should not be less than 0");
    }

    @Test
    void testHighDefenceShouldNotHeal()
    {
        Unit attackerUnit = new Unit ("attackerUnit",5,5,2,2,0.5f);
        Unit  defenderUnit = new Unit ("defenderUnit",15,5,20,2,0.5f);

        int defenderUnitDeltaHp = -10;
        defenderUnit.changeHp(defenderUnitDeltaHp);

        CombatLogic.calculateTurn(attackerUnit,defenderUnit,true);

        assertTrue(defenderUnit.getHp()<=(defenderUnit.getMaxHp()+defenderUnitDeltaHp));

    }

    @Test
    void testAttackShouldNotDealSelfDamage()
    {
        Unit attackerUnit = new Unit ("attackerUnit",5,5,2,2,0.5f);
        Unit  defenderUnit = new Unit ("defenderUnit",15,5,20,2,0.5f);

        CombatLogic.calculateTurn(attackerUnit,defenderUnit,true);

        assertEquals(attackerUnit.getMaxHp(),attackerUnit.getHp());

    }

}