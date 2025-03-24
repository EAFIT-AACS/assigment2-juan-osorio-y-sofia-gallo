import java.util.List;
import java.util.Stack;
import java.util.ArrayList;

public class ALGORITHM_2_LFCO_2025_JJOA_SG_EFCR {
    private static final char Z0 = 'Z';

    public static boolean accepts(String input, List<String> steps) {
        Stack<Character> stack = new Stack<>();
        stack.push(Z0);
        String config = "q0, " + input + ", Z";
        steps.add(config);
        if (input.isEmpty()) {
            steps.add("q0, ε, Z → ACEPTADA (por vacío)");
            return true;
        }

        int index = 0;
        while (index < input.length() && input.charAt(index) == 'a') {
            stack.push('a');
            steps.add("q0, " + input.substring(index + 1) + ", " + stackToString(stack) + 
                      " (Leer 'a', apilar 'a')");
            index++;
        }
        while (index < input.length() && input.charAt(index) == 'b') {
            if (stack.isEmpty() || stack.peek() != 'a') {
                steps.add("q0, " + input.substring(index) + ", " + stackToString(stack) + 
                          " → RECHAZADA (No hay 'a' para desapilar)");
                return false;
            }
            stack.pop();
            steps.add("q0, " + input.substring(index + 1) + ", " + stackToString(stack) + 
                      " (Leer 'b', desapilar 'a')");
            index++;
        }
        if (index == input.length() && stack.size() == 1 && stack.peek() == Z0) {
            steps.add("q0, ε, Z → ACEPTADA");
            return true;
        } else {
            String reason = index < input.length() ? 
                "Caracteres no procesados: " + input.substring(index) :
                "Pila incorrecta: " + stackToString(stack);
            steps.add("q0, " + (index < input.length() ? input.substring(index) : "ε") + 
                      ", " + stackToString(stack) + " → RECHAZADA (" + reason + ")");
            return false;
        }
    }

    private static String stackToString(Stack<Character> stack) {
        StringBuilder sb = new StringBuilder();
        for (Character c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}
