package dev.store;

import java.util.Arrays;
import java.util.List;

public class StoreLetter implements Store {

    @Override
    public List<String> list() {
        return Arrays.asList("A", "B", "C");
    }
}
