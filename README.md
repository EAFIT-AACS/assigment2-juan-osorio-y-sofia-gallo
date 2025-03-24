[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/gjhNPQOm)
# Formal Languages Project

## Group Members
- Juan Jose Osorio
- Sofia Gallo
- Emmanuel Cortes

## Environment
- **Operating System:** Windows 10
- **Programming Language:** Java (version 17)
- **Tools:** Visual Studio Code (version 1.64.0)

## Instructions for Running the Implementation

1. **Clone the Repository:**
   ```sh
   git clone <repository-url>
   cd <repository-directory>

2. **Ensure the following files are in the same directory:**
   - `Main.java`
   - `StringGenerator.java`
   - `PDA.java`
   - `DerivationTree.java`

3. **Compile the Java files:**
   Open a terminal in the directory containing the files and run:
   ```sh
   javac Main.java StringGenerator.java PDA.java DerivationTree.java
   ```

4. **Run the Main class:**
   ```sh
   java Main
   ```

5. **Expected Output:**
   The program will generate valid and invalid strings, verify them using a PDA, and construct derivation trees for valid strings. The output will be displayed in the terminal.

## Detailed Description

### Algorithm 1: String Generation
- **StringGenerator.java:** Contains methods to generate valid and invalid strings based on the grammar `S → aSb | ε`.

### Algorithm 2: Pushdown Automaton (PDA)
- **PDA.java:** Implements a PDA to verify if the generated strings are accepted by the grammar.

### Algorithm 3: Derivation Tree Construction
- **DerivationTree.java:** Generates the leftmost derivation and constructs the derivation tree for valid strings.

### Main Program
- **Main.java:** Integrates the three algorithms, generates strings, verifies them using the PDA, and constructs derivation trees for valid strings.
