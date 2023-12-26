package compiler.scpopeManager;

import java.util.HashMap;

public class ScopeMap {
    private static HashMap<String, Scope> scopes = new HashMap<String, Scope>();
    public void addToScopes(String key, Scope value) {
        scopes.put(key, value);
    }
    public Scope getScope(String key) {
        return scopes.get(key);
    }

}
