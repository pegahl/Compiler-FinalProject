package compiler;

import compiler.symbols.SymbolItem;

import java.util.HashMap;

public class SymbolTable {
    private HashMap<String, SymbolItem> table = new HashMap<String, SymbolItem>();
    public HashMap<String, SymbolItem> getTable() {
        return table;
    }
    public void insert(String key, SymbolItem value) {
        table.put(key, value);
    }
    public boolean LookUp(String key) {
        return table.containsKey(key);
    }
}
