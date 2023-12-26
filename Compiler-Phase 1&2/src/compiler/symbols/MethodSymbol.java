package compiler.symbols;

import java.util.ArrayList;

public class MethodSymbol extends SymbolItem {
    private String name;
    private String returnType;
    private int row;
    private int column;
    private ArrayList<String> parameters = new ArrayList<String>();
    private ArrayList<String> parametersType = new ArrayList<String>();
    public MethodSymbol(String name, String returnType, int row, int column) {
        this.name = name;
        this.returnType = returnType;
        this.row = row;
        this.column = column;
    }
    public void AddParameters(String parameter) {
        parameters.add(parameter);
    }
    public String toString(){
        String params = "";
        for (String str: parameters) {
            params += str + " ";
        }
        return "method name : " + name + " return type : " + returnType + " parameters : " + params;
    }
}
