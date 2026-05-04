# 🎮 Number Guessing Game (Java)

A simple console-based number guessing game built with Java.

---

## 🚀 Features

- Random number generation
- Custom range input
- Limited / unlimited attempts mode
- Input validation (no crashes)
- Attempts tracking
- Replay system

---

## 🧠 How it works

1. User enters a number range
2. Program generates a random number
3. User tries to guess it
4. Program gives hints:
   - LOW
   - HIGH
   - CORRECT
5. Game ends when:
   - number is guessed
   - or attempts run out

---

## ▶️ Example
Enter range:
10 50

Enter max attempts (0 = unlimited):
5

Attempts: 0 | Remaining: 5
Enter guess:
30
LOW

---

## 🛠️ Tech Stack

- Java
- Scanner
- Random
- Loops & Conditions

---

## 📦 How to run

```bash
javac src/number_guessing_game.java
java -cp src number_guessing_game