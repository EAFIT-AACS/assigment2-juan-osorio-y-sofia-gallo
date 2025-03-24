import java.util.ArrayList;
import java.util.List;

public class DerivationTree {
    public static List<String> generateLeftmostDerivation(String input) {
        List<String> steps = new ArrayList<>();
        steps.add("S");
        if (input.isEmpty()) {
            steps.add("ε");
            return steps;
        }
        StringBuilder current = new StringBuilder("S");
        for (int i = 0; i < input.length() / 2; i++) {
            current = new StringBuilder(current.toString().replaceFirst("S", "aSb"));
            steps.add(current.toString());
        }
        current = new StringBuilder(current.toString().replaceFirst("S", "ε"));
        steps.add(current.toString());
        current = new StringBuilder(current.toString().replaceFirst("ε", ""));
        if (!current.toString().equals(steps.get(steps.size() - 1))) {
            steps.add(current.toString());
        }

        return steps;
    }

    public static void drawDerivationTree(String input) {
        if (input.isEmpty()) {
            System.out.println("S");
            System.out.println("└── ε");
            return;
        }
        int depth = input.length() / 2;
        System.out.println("S");
        drawTreeNode(depth, "", "└── ");
    }

    private static void drawTreeNode(int depth, String prefix, String connector) {
        if (depth == 0) {
            System.out.println(prefix + connector + "ε");
            return;
        }
        System.out.println(prefix + connector + "aSb");
        System.out.println(prefix + "    ├── a");
        drawTreeNode(depth - 1, prefix + "    ", "├── ");
        System.out.println(prefix + "    └── b");
    }
}