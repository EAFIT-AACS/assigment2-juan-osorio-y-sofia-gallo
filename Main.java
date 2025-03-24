import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== PRUEBA INTEGRADA DE LOS TRES ALGORITMOS =====\n");
        System.out.println("Gramática: S → aSb | ε\n");
        String[] validStrings = new String[5];
        String[] invalidStrings = new String[5];
        System.out.println("ALGORITMO 1: GENERACIÓN DE CADENAS");
        System.out.println("----------------------------------");
        System.out.println("Cadenas válidas generadas:");
        for (int i = 0; i < 5; i++) {
            validStrings[i] = ALGORITHM_1_LFCO_2025_JJOA_SG_EFCR.generateValidString();
            System.out.println((i+1) + ". '" + validStrings[i] + "'");
        }
        System.out.println("\nCadenas inválidas generadas:");
        for (int i = 0; i < 5; i++) {
            invalidStrings[i] = ALGORITHM_1_LFCO_2025_JJOA_SG_EFCR.generateInvalidString();
            System.out.println((i+1) + ". '" + invalidStrings[i] + "'");
        }

        System.out.println("\nALGORITMO 2: IMPLEMENTACIÓN DEL PDA");
        System.out.println("----------------------------------");
        System.out.println("Verificación de cadenas válidas:");
        for (int i = 0; i < validStrings.length; i++) {
            List<String> steps = new ArrayList<>();
            boolean accepted = ALGORITHM_2_LFCO_2025_JJOA_SG_EFCR.accepts(validStrings[i], steps);
            System.out.println("\nCadena: '" + validStrings[i] + "' - " + 
                              (accepted ? "ACEPTADA ✓" : "RECHAZADA ✗"));
            System.out.println("Pasos del PDA:");
            for (String step : steps) {
                System.out.println("  " + step);
            }
        }
        System.out.println("\nVerificación de cadenas inválidas:");
        for (int i = 0; i < invalidStrings.length; i++) {
            List<String> steps = new ArrayList<>();
            boolean accepted = ALGORITHM_2_LFCO_2025_JJOA_SG_EFCR.accepts(invalidStrings[i], steps);
            System.out.println("\nCadena: '" + invalidStrings[i] + "' - " + 
                              (accepted ? "ACEPTADA ✓" : "RECHAZADA ✗"));
            System.out.println("Pasos del PDA:");
            for (String step : steps) {
                System.out.println("  " + step);
            }
        }

        System.out.println("\nALGORITMO 3: CONSTRUCCIÓN DEL ÁRBOL DE DERIVACIÓN");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < validStrings.length; i++) {
            List<String> steps = new ArrayList<>();
            boolean accepted = ALGORITHM_2_LFCO_2025_JJOA_SG_EFCR.accepts(validStrings[i], steps);

            if (accepted) {
                System.out.println("\nCadena válida: '" + validStrings[i] + "'");
                System.out.println("Derivación por la izquierda:");

                List<String> derivation = ALGORITHM_3_LFCO_2025_JJOA_SG_EFCR.generateLeftmostDerivation(validStrings[i]);
                for (int j = 0; j < derivation.size(); j++) {
                    System.out.println((j+1) + ". " + derivation.get(j));
                }

                System.out.println("\nÁrbol de derivación:");
                ALGORITHM_3_LFCO_2025_JJOA_SG_EFCR.drawDerivationTree(validStrings[i]);
            }
        }
    }
}
