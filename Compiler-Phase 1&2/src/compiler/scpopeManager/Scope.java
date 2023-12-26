package compiler.scpopeManager;

import compiler.SymbolTable;
import compiler.symbols.SymbolItem;

import java.util.ArrayList;

public class Scope {
    private String name;
    private String type;
    private int depth;
    private Scope parent;
    private SymbolTable symbolTable;
    private ArrayList<Scope> children = new ArrayList<Scope>();

    public Scope(String name, String type, int depth , Scope parent) {
        this.name = name;
        this.type = type;
        this.depth = depth;
        this.parent = parent;
        this.symbolTable = new SymbolTable();
    }
    public String getName() {
        return name;
    }

    public String getType() { return type; }

    public int getDepth() {
        return depth;
    }

    public Scope getParent() {
        return parent;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public ArrayList<Scope> getChildren() {
        return children;
    }
    public void AddChild(Scope child) {
        children.add(child);
    }


    public void insert(String key, SymbolItem value) {
        symbolTable.insert(key, value);
    }
    public boolean LookUp(String key) {
        return symbolTable.LookUp(key);
    }
}
