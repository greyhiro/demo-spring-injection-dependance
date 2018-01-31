package dev.ihm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoActionsMenu {

    private Map<Integer, Action> actions = new HashMap<>();

    public TwoActionsMenu(Action action1, Action action2) {
        this.actions.put(1, action1);
        this.actions.put(2, action2);
    }

    public void start() {
        actions.forEach((k, v) -> {
            System.out.println(k + ". " + v.getTitle());
        });
        Scanner scanner = new Scanner(System.in);
        int saisie = scanner.nextInt();

        actions.get(saisie).execute();
        scanner.close();
    }


}
