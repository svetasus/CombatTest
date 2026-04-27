
**Overview**

The "Battle Engine Core" is a Java-based module designed to calculate combat outcomes between two units based on their stats. 

**Functional Requirements**

FR-1: Damage Calculation. Base damage is calculated as: Attacker Attack - (Defender Defense / 2).

FR-2: Critical Hits. If a critical hit occurs, the damage is multiplied by the critMultiplier.

FR-3: Damage Threshold. The minimum damage resulting from any hit must be 0. Damage cannot be negative.

FR-4: HP Management. A unit's health points (HP) cannot drop below 0. If damage exceeds current HP, HP must be set to 0 (Unit is "Dead").




**Data Constraints**

DC-1: All combat stats (HP, Attack, Defense) must be positive integer numbers.

DC-2: critChance must be a value between 0.0 and 1.0.