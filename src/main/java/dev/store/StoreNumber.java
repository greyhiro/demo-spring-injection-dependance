package dev.store;

import java.util.Arrays;
import java.util.List;

public class StoreNumber implements Store {

    @Override
    public List<String> list() {
        return Arrays.asList("1", "2", "3");
    }
}
