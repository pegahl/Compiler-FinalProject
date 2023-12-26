package compiler.symbols;

public class FieldSymbol extends SymbolItem {
    private String name;
    private String type;
    private int row;
    private int column;
    public FieldSymbol(String name, String type, int row, int column) {
        this.name = name;
        this.type = type;
        this.row = row;
        this.column = column;
    }
    public String toString() {
        return "Field name : " + name + " type : " + type;
    }

    public String getType() {
        return type;
    }
}
