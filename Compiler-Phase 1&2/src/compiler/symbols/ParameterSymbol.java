package compiler.symbols;

public class ParameterSymbol extends SymbolItem {
    private String name;
    private String type;
    private int row;
    private int column;
    public ParameterSymbol(String name, String type, int row, int column) {
        this.name = name;
        this.type = type;
        this.row = row;
        this.column = column;
    }
    public String toString() {
        return "parameter name : " + name + " type : " + type;
    }

    public String getType() {
        return type;
    }
}
