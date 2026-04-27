# Combat System: Logic Engine & Unit Test Suite

## Project Overview
This repository contains a modular Java-based combat engine designed for turn-based simulations. The project demonstrates a "Testing First" mindset by isolating business logic from the UI and ensuring 100% reliability of the core math and state transitions.

## Key Technical Features
Defensive Programming: Implemented strict constructor validation to prevent "Garbage In, Garbage Out." The system uses `IllegalArgumentException` to block invalid unit states (e.g., negative HP or invalid critical chances) before they enter the engine.
Stateless Logic Engine: All combat calculations are handled through a static `CombatLogic` class, ensuring that the math is pure, predictable, and easy to unit test.
Requirement-Driven Development: Every method and test case is mapped directly to the `Requirements.md` file, ensuring full coverage of the combat rules.

## Testing Strategy
I utilized JUnit 5 to validate the core engine through the following test categories:
1. Positive Logic Tests: Verifying that standard attacks, critical hits, and defense mitigations result in mathematically correct values.
2. Boundary Value Analysis: Ensuring that "Overkill" damage correctly clamps HP at 0 and that high defense never results in "negative damage" (accidental healing).
3. Negative Testing: Validating that the system correctly rejects invalid data using `assertThrows` to guarantee data integrity during unit initialization.

## Tech Stack
Language: Java 21 (LTS)
Testing Framework: JUnit 5 (Jupiter)
Build Tool: Maven
