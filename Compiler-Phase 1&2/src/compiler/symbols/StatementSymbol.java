package compiler.symbols;

public class StatementSymbol extends SymbolItem {
    private String name;
    private int row;
    private int column;
    public StatementSymbol(String name, int row, int column) {
        this.name = name;
        this.row = row;
        this.column = column;
    }
    public String toString() {
        return "statement : " + name;
    }
}
