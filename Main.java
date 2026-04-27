//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Unit unit1 = new Unit("Attacker", 5, 5, 2, 0.2f, 0.5f);
        Unit unit2 = new Unit("Defender", 5, 3, 3, 0.3f, 0.2f);

        CombatLogic.battleSimulation(unit1,unit2);

    }
}