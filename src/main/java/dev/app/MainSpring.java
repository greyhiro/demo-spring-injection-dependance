package dev.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dev.ihm.PrintAppVersionAction;
import dev.ihm.StoreListAction;
import dev.ihm.TwoActionsMenu;
import dev.store.Store;
import dev.store.StoreLetter;
import dev.store.StoreNumber;

public class MainSpring {

    public static void main(String[] args) {
    	
    	// création du contexte Spring
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");

    	// récupération de l'objet de départ de l'application
        TwoActionsMenu menu = context.getBean(TwoActionsMenu.class);
        menu.start();
        
        // fermeture du contexte
        context.close();
    }
}
