package dev.ihm;

import java.time.LocalDate;

public class PrintAppVersionAction extends Action {
    @Override
    String getTitle() {
        return "A propos de l'application";
    }

    @Override
    void execute() {
        System.out.println("********* Application Démo *********");
        System.out.println("Date de création " + LocalDate.now());
    }
}
