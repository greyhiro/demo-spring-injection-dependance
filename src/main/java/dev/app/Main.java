package dev.app;

import dev.ihm.PrintAppVersionAction;
import dev.ihm.StoreListAction;
import dev.ihm.TwoActionsMenu;
import dev.store.Store;
import dev.store.StoreLetter;
import dev.store.StoreNumber;

public class Main {

    public static void main(String[] args) {
    	
    	// à déléguer à Spring
        Store store = new StoreLetter();
        PrintAppVersionAction action1 = new PrintAppVersionAction();
        StoreListAction action2 = new StoreListAction(store);
        TwoActionsMenu menu = new TwoActionsMenu(action1, action2);
        
        
        
        menu.start();
    }
}
