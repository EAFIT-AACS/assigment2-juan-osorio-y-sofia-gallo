[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/gjhNPQOm)
# Formal Languages Project

## Group Members
- Juan Jose Osorio
- Sofia Gallo
- Emmanuel Cortes (Estudiante de la clase del lunes)

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

## Program Operation

This program implements three interrelated algorithms for the analysis of the context-free grammar S → aSb | ε, which generates the language {aⁿbⁿ | n ≥ 0}.

### Execution Process

1. **String Generation (Algorithm 1)**:
   - The program generates 5 valid strings using the pattern a^n b^n, where each string has the same number of 'a' characters followed by the same number of 'b' characters.
   - It also generates 5 invalid strings using three different methods: different number of 'a's and 'b's, reversed order (b^n a^n), or interleaved characters (ab)^n.

2. **Verification with Push-Down Automaton (Algorithm 2)**:
   - Each generated string is processed with a push-down automaton (PDA) that:
     - Reads 'a' characters and pushes them onto the stack
     - Reads 'b' characters and pops an 'a' character for each 'b'
     - Accepts the string if at the end the stack contains only the initial symbol Z₀
   - The program shows each step of the automaton's execution, including the state, remaining input, and stack contents.

3. **Construction of Derivation Trees (Algorithm 3)**:
   - For valid strings, the program:
     - Generates the leftmost derivation, showing each step from the initial symbol S to the final string
     - Constructs and visualizes the derivation tree using ASCII characters to represent the hierarchical structure

### Main Features

- **Step-by-step analysis**: Shows in detail each transition and state change
- **Visual representation**: Uses ASCII characters to draw derivation trees
- **Complete validation**: Verifies both valid and invalid strings
- **Integration of concepts**: Demonstrates the equivalence between context-free grammars and push-down automata
- **Handling of special cases**: Correctly processes the empty string (ε)

The program provides a practical demonstration of the theoretical concepts of formal languages, specifically the relationship between context-free grammars and push-down automata for language recognition.
