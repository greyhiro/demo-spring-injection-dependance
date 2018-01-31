package dev.ihm;

import dev.store.Store;

public class StoreListAction extends Action {

    private Store store;

    public StoreListAction(Store store) {
        this.store = store;
    }

    @Override
    String getTitle() {
        return "Lister les données";
    }

    @Override
    void execute() {
        System.out.println("********* Lister *********");
        System.out.println(this.store.list());
    }
}