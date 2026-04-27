public class CombatLogic
    {
        static float calculateDamage(Unit attacker, Unit defender, boolean isCrit)
        {
            float calcAttack = isCrit? attacker.getAttack()* attacker.getCritMultiplier():attacker.getAttack();
            //System.out.println(calcAttack);
            return Math.max(0f,calcAttack - (defender.getDefense() / 2.0f));
        }

        static void calculateTurn(Unit attacker, Unit defender, boolean isCrit)
        {
            defender.changeHp(-1 * (int) calculateDamage(attacker, defender, isCrit));
        }


        static void performAttack(Unit attacker, Unit defender)
        {
            boolean isCrit = Math.random() < attacker.getCritChance();

            calculateTurn(attacker, defender, isCrit);
            System.out.println("attacker hp: " + attacker.getHp() + " defender hp: " + defender.getHp());
        }


        static boolean isEndOfBattle (Unit defender)
        {
            return defender.getHp() <= 0;
        }


        static void battleSimulation(Unit unit1, Unit unit2)
        {
            int turn = 0;
            while((!isEndOfBattle(unit1))  && (!isEndOfBattle(unit2)))
            {
                if (turn%2 == 0)
                {
                    System.out.println("unit 1 attacks:");
                    performAttack(unit1, unit2);

                }
                else
                {
                    System.out.println("unit 2 attacks:");
                    performAttack(unit2, unit1);

                }
                turn++;
            }

            System.out.println("Battle simulation finished!");
            System.out.println("Turns: " + turn);
            System.out.println("Winner: " + (isEndOfBattle(unit1)?unit2.getName():unit1.getName()));
        }
    }
