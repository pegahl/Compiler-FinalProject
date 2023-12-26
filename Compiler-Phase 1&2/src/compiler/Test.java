package compiler;

import compiler.scpopeManager.Scope;
import compiler.scpopeManager.ScopeMap;
import compiler.symbols.SymbolItem;
import gen.CListener;
import gen.CParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Map;
import java.util.Vector;

public class Test implements CListener {

    private ScopeMap scopeMap = new ScopeMap();
    private Scope currentScope = new Scope("program","program", 0, null);
    private int depth = 0;

//    old code
    final String TAB="  ";
    Boolean isMain=false;
    int tabCounter=1;
    Vector functionNames=new Vector();
    boolean funcCall=false;

    @Override
    public void enterPrimaryExpression(CParser.PrimaryExpressionContext ctx) {

    }

    @Override
    public void exitPrimaryExpression(CParser.PrimaryExpressionContext ctx) {
//        System.out.println("program start{");

    }

    @Override
    public void enterPostfixExpression(CParser.PostfixExpressionContext ctx) {
//        System.out.println(ctx.start.getText());


    }

    @Override
    public void exitPostfixExpression(CParser.PostfixExpressionContext ctx) {

    }

    @Override
    public void enterArgumentExpressionList(CParser.ArgumentExpressionListContext ctx) {

    }

    @Override
    public void exitArgumentExpressionList(CParser.ArgumentExpressionListContext ctx) {

    }

    @Override
    public void enterUnaryExpression(CParser.UnaryExpressionContext ctx) {

    }

    @Override
    public void exitUnaryExpression(CParser.UnaryExpressionContext ctx) {

    }

    @Override
    public void enterUnaryOperator(CParser.UnaryOperatorContext ctx) {

    }

    @Override
    public void exitUnaryOperator(CParser.UnaryOperatorContext ctx) {

    }

    @Override
    public void enterCastExpression(CParser.CastExpressionContext ctx) {

    }

    @Override
    public void exitCastExpression(CParser.CastExpressionContext ctx) {

    }

    @Override
    public void enterMultiplicativeExpression(CParser.MultiplicativeExpressionContext ctx) {

    }

    @Override
    public void exitMultiplicativeExpression(CParser.MultiplicativeExpressionContext ctx) {

    }

    @Override
    public void enterAdditiveExpression(CParser.AdditiveExpressionContext ctx) {

    }

    @Override
    public void exitAdditiveExpression(CParser.AdditiveExpressionContext ctx) {

    }

    @Override
    public void enterShiftExpression(CParser.ShiftExpressionContext ctx) {

    }

    @Override
    public void exitShiftExpression(CParser.ShiftExpressionContext ctx) {

    }

    @Override
    public void enterRelationalExpression(CParser.RelationalExpressionContext ctx) {

    }

    @Override
    public void exitRelationalExpression(CParser.RelationalExpressionContext ctx) {

    }

    @Override
    public void enterEqualityExpression(CParser.EqualityExpressionContext ctx) {

    }

    @Override
    public void exitEqualityExpression(CParser.EqualityExpressionContext ctx) {

    }

    @Override
    public void enterAndExpression(CParser.AndExpressionContext ctx) {

    }

    @Override
    public void exitAndExpression(CParser.AndExpressionContext ctx) {

    }

    @Override
    public void enterExclusiveOrExpression(CParser.ExclusiveOrExpressionContext ctx) {

    }

    @Override
    public void exitExclusiveOrExpression(CParser.ExclusiveOrExpressionContext ctx) {

    }

    @Override
    public void enterInclusiveOrExpression(CParser.InclusiveOrExpressionContext ctx) {

    }

    @Override
    public void exitInclusiveOrExpression(CParser.InclusiveOrExpressionContext ctx) {

    }

    @Override
    public void enterLogicalAndExpression(CParser.LogicalAndExpressionContext ctx) {

    }

    @Override
    public void exitLogicalAndExpression(CParser.LogicalAndExpressionContext ctx) {

    }

    @Override
    public void enterLogicalOrExpression(CParser.LogicalOrExpressionContext ctx) {

    }

    @Override
    public void exitLogicalOrExpression(CParser.LogicalOrExpressionContext ctx) {

    }

    @Override
    public void enterConditionalExpression(CParser.ConditionalExpressionContext ctx) {


    }

    @Override
    public void exitConditionalExpression(CParser.ConditionalExpressionContext ctx) {

    }

    @Override
    public void enterAssignmentExpression(CParser.AssignmentExpressionContext ctx) {

    }

    @Override
    public void exitAssignmentExpression(CParser.AssignmentExpressionContext ctx) {

    }

    @Override
    public void enterAssignmentOperator(CParser.AssignmentOperatorContext ctx) {

    }

    @Override
    public void exitAssignmentOperator(CParser.AssignmentOperatorContext ctx) {

    }

    @Override
    public void enterExpression(CParser.ExpressionContext ctx) {

    }

    @Override
    public void exitExpression(CParser.ExpressionContext ctx) {

    }

    @Override
    public void enterConstantExpression(CParser.ConstantExpressionContext ctx) {


    }

    @Override
    public void exitConstantExpression(CParser.ConstantExpressionContext ctx) {

    }

    @Override
    public void enterDeclaration(CParser.DeclarationContext ctx) {
//        field -edited
//        String symbolKey = "";
////edited: you deleted for loop
//
////            String name = ctx.OBJECTID(i).toString();
//            String name = ctx.initDeclaratorList().start.getText();
//            String type = ctx.declarationSpecifiers().getText();
//
//            int row = ctx.getStart().getLine();
//            int column = ctx.getStart().getCharPositionInLine();
//            if(lookUpScopes(currentScope, name, "field")) {
//                symbolKey = name + "_field_" + row + "_" + column;
//            } else {
//                symbolKey = name + "_field";
//            }
//            VariableSymbol symbol = new VariableSymbol(name, type, row, column);
//            currentScope.insert(symbolKey, symbol);


    }

    @Override
    public void exitDeclaration(CParser.DeclarationContext ctx) {

    }

    @Override
    public void enterDeclarationSpecifiers(CParser.DeclarationSpecifiersContext ctx) {

    }

    @Override
    public void exitDeclarationSpecifiers(CParser.DeclarationSpecifiersContext ctx) {

    }

    @Override
    public void enterDeclarationSpecifier(CParser.DeclarationSpecifierContext ctx) {


    }

    @Override
    public void exitDeclarationSpecifier(CParser.DeclarationSpecifierContext ctx) {

    }

    @Override
    public void enterInitDeclaratorList(CParser.InitDeclaratorListContext ctx) {


    }

    @Override
    public void exitInitDeclaratorList(CParser.InitDeclaratorListContext ctx) {

    }

    @Override
    public void enterInitDeclarator(CParser.InitDeclaratorContext ctx) {
    }

    @Override
    public void exitInitDeclarator(CParser.InitDeclaratorContext ctx) {

    }

    @Override
    public void enterStorageClassSpecifier(CParser.StorageClassSpecifierContext ctx) {


    }

    @Override
    public void exitStorageClassSpecifier(CParser.StorageClassSpecifierContext ctx) {

    }

    @Override
    public void enterTypeSpecifier(CParser.TypeSpecifierContext ctx) {

    }

    @Override
    public void exitTypeSpecifier(CParser.TypeSpecifierContext ctx) {

    }

    @Override
    public void enterStructOrUnionSpecifier(CParser.StructOrUnionSpecifierContext ctx) {

    }

    @Override
    public void exitStructOrUnionSpecifier(CParser.StructOrUnionSpecifierContext ctx) {

    }

    @Override
    public void enterStructOrUnion(CParser.StructOrUnionContext ctx) {

    }

    @Override
    public void exitStructOrUnion(CParser.StructOrUnionContext ctx) {

    }

    @Override
    public void enterStructDeclarationList(CParser.StructDeclarationListContext ctx) {

    }

    @Override
    public void exitStructDeclarationList(CParser.StructDeclarationListContext ctx) {

    }

    @Override
    public void enterStructDeclaration(CParser.StructDeclarationContext ctx) {

    }

    @Override
    public void exitStructDeclaration(CParser.StructDeclarationContext ctx) {

    }

    @Override
    public void enterSpecifierQualifierList(CParser.SpecifierQualifierListContext ctx) {

    }

    @Override
    public void exitSpecifierQualifierList(CParser.SpecifierQualifierListContext ctx) {

    }

    @Override
    public void enterStructDeclaratorList(CParser.StructDeclaratorListContext ctx) {

    }

    @Override
    public void exitStructDeclaratorList(CParser.StructDeclaratorListContext ctx) {

    }

    @Override
    public void enterStructDeclarator(CParser.StructDeclaratorContext ctx) {

    }

    @Override
    public void exitStructDeclarator(CParser.StructDeclaratorContext ctx) {

    }

    @Override
    public void enterEnumSpecifier(CParser.EnumSpecifierContext ctx) {

    }

    @Override
    public void exitEnumSpecifier(CParser.EnumSpecifierContext ctx) {

    }

    @Override
    public void enterEnumeratorList(CParser.EnumeratorListContext ctx) {

    }

    @Override
    public void exitEnumeratorList(CParser.EnumeratorListContext ctx) {

    }

    @Override
    public void enterEnumerator(CParser.EnumeratorContext ctx) {

    }

    @Override
    public void exitEnumerator(CParser.EnumeratorContext ctx) {

    }

    @Override
    public void enterEnumerationConstant(CParser.EnumerationConstantContext ctx) {

    }

    @Override
    public void exitEnumerationConstant(CParser.EnumerationConstantContext ctx) {

    }

    @Override
    public void enterTypeQualifier(CParser.TypeQualifierContext ctx) {

    }

    @Override
    public void exitTypeQualifier(CParser.TypeQualifierContext ctx) {

    }

    @Override
    public void enterDeclarator(CParser.DeclaratorContext ctx) {

    }

    @Override
    public void exitDeclarator(CParser.DeclaratorContext ctx) {

    }

    @Override
    public void enterDirectDeclarator(CParser.DirectDeclaratorContext ctx) {

//        impo
    }

    @Override
    public void exitDirectDeclarator(CParser.DirectDeclaratorContext ctx) {

    }

    @Override
    public void enterNestedParenthesesBlock(CParser.NestedParenthesesBlockContext ctx) {
    }

    @Override
    public void exitNestedParenthesesBlock(CParser.NestedParenthesesBlockContext ctx) {

    }

    @Override
    public void enterPointer(CParser.PointerContext ctx) {

    }

    @Override
    public void exitPointer(CParser.PointerContext ctx) {

    }

    @Override
    public void enterTypeQualifierList(CParser.TypeQualifierListContext ctx) {

    }

    @Override
    public void exitTypeQualifierList(CParser.TypeQualifierListContext ctx) {

    }

    @Override
    public void enterParameterTypeList(CParser.ParameterTypeListContext ctx) {

    }

    @Override
    public void exitParameterTypeList(CParser.ParameterTypeListContext ctx) {



        }

    @Override
    public void enterParameterList(CParser.ParameterListContext ctx) {
//        parameter - edited
//        String symbolKey = "";
//        int size=ctx.parameterDeclaration().size();
//
//        for(int i = 0; i < size; i++) {
//
//            String name = ctx.parameterDeclaration().get(i).declarator().start.getText();
//            String type = ctx.parameterDeclaration().get(i).declarationSpecifiers().getText();
//            int row = ctx.getStart().getLine();
//            int column = ctx.getStart().getCharPositionInLine();
//            if(lookUpScopes(currentScope, name, "parameter")) {
//                symbolKey = name + "_parameter_" + row + "_" + column;
//            } else {
//                symbolKey = name + "_parameter";
//            }
//            VariableSymbol symbol = new VariableSymbol(name, type, row, column);
//            currentScope.insert(symbolKey, symbol);
//        }

    }

    @Override
    public void exitParameterList(CParser.ParameterListContext ctx) {

    }

    @Override
    public void enterParameterDeclaration(CParser.ParameterDeclarationContext ctx) {
    }

    @Override
    public void exitParameterDeclaration(CParser.ParameterDeclarationContext ctx) {

    }

    @Override
    public void enterIdentifierList(CParser.IdentifierListContext ctx) {

    }

    @Override
    public void exitIdentifierList(CParser.IdentifierListContext ctx) {

    }

    @Override
    public void enterTypeName(CParser.TypeNameContext ctx) {

    }

    @Override
    public void exitTypeName(CParser.TypeNameContext ctx) {

    }

    @Override
    public void enterTypedefName(CParser.TypedefNameContext ctx) {

    }

    @Override
    public void exitTypedefName(CParser.TypedefNameContext ctx) {

    }

    @Override
    public void enterInitializer(CParser.InitializerContext ctx) {

    }

    @Override
    public void exitInitializer(CParser.InitializerContext ctx) {

    }

    @Override
    public void enterInitializerList(CParser.InitializerListContext ctx) {

    }

    @Override
    public void exitInitializerList(CParser.InitializerListContext ctx) {

    }

    @Override
    public void enterDesignation(CParser.DesignationContext ctx) {

    }

    @Override
    public void exitDesignation(CParser.DesignationContext ctx) {

    }

    @Override
    public void enterDesignatorList(CParser.DesignatorListContext ctx) {

    }

    @Override
    public void exitDesignatorList(CParser.DesignatorListContext ctx) {

    }

    @Override
    public void enterDesignator(CParser.DesignatorContext ctx) {

    }

    @Override
    public void exitDesignator(CParser.DesignatorContext ctx) {

    }

    @Override
    public void enterStatement(CParser.StatementContext ctx) {

    }

    @Override
    public void exitStatement(CParser.StatementContext ctx) {

    }

    @Override
    public void enterLabeledStatement(CParser.LabeledStatementContext ctx) {

    }

    @Override
    public void exitLabeledStatement(CParser.LabeledStatementContext ctx) {

    }

    @Override
    public void enterCompoundStatement(CParser.CompoundStatementContext ctx) {
//everything
    }

    @Override
    public void exitCompoundStatement(CParser.CompoundStatementContext ctx) {

    }

    @Override
    public void enterBlockItemList(CParser.BlockItemListContext ctx) {

    }

    @Override
    public void exitBlockItemList(CParser.BlockItemListContext ctx) {

    }

    @Override
    public void enterBlockItem(CParser.BlockItemContext ctx) {

    }

    @Override
    public void exitBlockItem(CParser.BlockItemContext ctx) {

    }

    @Override
    public void enterExpressionStatement(CParser.ExpressionStatementContext ctx) {


    }

    @Override
    public void exitExpressionStatement(CParser.ExpressionStatementContext ctx) {

    }

//    if statement
    @Override
    public void enterSelectionStatement(CParser.SelectionStatementContext ctx) {

//        int row = ctx.getStart().getLine();
//        int column = ctx.getStart().getCharPositionInLine();
//
//        String ifName = "if_" + row + "_" + column;
//
//        StatementSymbol ifSymbol  = new StatementSymbol("if", row , column);
//        currentScope.insert(ifName, ifSymbol);
//        depth++;
//
//        Scope newifScope  = new Scope(ifName,"statement", depth, currentScope);
//        currentScope.AddChild(newifScope);
//        currentScope = newifScope;
//        scopeMap.addToScopes(ifName, currentScope);

    }

    @Override
    public void exitSelectionStatement(CParser.SelectionStatementContext ctx) {
//        depth--;
//        currentScope = currentScope.getParent();
    }

    @Override
    public void enterIterationStatement(CParser.IterationStatementContext ctx) {
    }

    @Override
    public void exitIterationStatement(CParser.IterationStatementContext ctx) {


    }

    @Override
    public void enterForCondition(CParser.ForConditionContext ctx) {


//just condition state of for
    }

    @Override
    public void exitForCondition(CParser.ForConditionContext ctx) {

    }

    @Override
    public void enterForDeclaration(CParser.ForDeclarationContext ctx) {

    }

    @Override
    public void exitForDeclaration(CParser.ForDeclarationContext ctx) {

    }

    @Override
    public void enterForExpression(CParser.ForExpressionContext ctx) {

    }

    @Override
    public void exitForExpression(CParser.ForExpressionContext ctx) {

    }

    @Override
    public void enterJumpStatement(CParser.JumpStatementContext ctx) {

    }

    @Override
    public void exitJumpStatement(CParser.JumpStatementContext ctx) {

    }
//start rule is externalDeclaration
    @Override
    public void enterExternalDeclaration(CParser.ExternalDeclarationContext ctx) {
//        scopeMap.addToScopes("program", currentScope);
    }
    @Override
    public void exitExternalDeclaration(CParser.ExternalDeclarationContext ctx) {

//        printScopes(currentScope);
    }

    @Override
    public void enterFunctionDefinition(CParser.FunctionDefinitionContext ctx) {
//        String methodSymbolName = "";
//
//        String returnType=ctx.typeSpecifier().getText();
//        String methodName=ctx.declarator().getStart().getText();
////
//        int row = ctx.getStart().getLine();
//        int column = ctx.getStart().getCharPositionInLine();
////
//        if(lookUpScopes(currentScope, methodName, "method")) {
//            methodSymbolName = methodName + "_method_" + row + "_" + column;
//        } else {
//            methodSymbolName = methodName +"_method";
//        }
//        MethodSymbol symbol = new MethodSymbol(methodName, returnType, row, column);
//
//        String parameterName = ctx.formal().get(i).OBJECTID().toString();
//
//                int size=ctx.parameterDeclaration().size();
//            String name = ctx.parameterDeclaration().get(i).declarator().start.getText();
//            String type = ctx.parameterDeclaration().get(i).declarationSpecifiers().getText();
//

//        this is where you need to uncommand
//        for (int i = 0; i < ctx.formal().size(); i++) {
//            symbol.AddParameters(ctx.formal().get(i).OBJECTID().toString());
//        }
//
//        currentScope.insert(methodSymbolName, symbol);
//        depth++;
//        Scope newScope = new Scope(methodSymbolName,"method", depth, currentScope);
//
//        String symbolKey = "";
//        for (int i = 0; i < ctx.formal().size(); i++) {
//
//            String parameterName = ctx.formal().get(i).OBJECTID().toString();
//            String parameterType = ctx.formal().get(i).TYPEID().toString();
//
//            if(lookUpScopes(currentScope, parameterName, "parameter")) {
//                symbolKey = parameterName + "_parameter_" + row + "_" + column;
//            } else{
//                symbolKey = parameterName + "_parameter";
//            }
//            ParameterSymbol parameterSymbol = new ParameterSymbol(parameterName, parameterType, row, column);
//            newScope.insert(symbolKey, parameterSymbol);
//        }
//
//        currentScope.AddChild(newScope);
//        currentScope = newScope;
//        scopeMap.addToScopes(methodSymbolName + "_" + currentScope.getParent().getName(), currentScope);
//

    }

    @Override
    public void exitFunctionDefinition(CParser.FunctionDefinitionContext ctx) {
//        depth--;
//        currentScope = currentScope.getParent();

    }

    @Override
    public void enterDeclarationList(CParser.DeclarationListContext ctx) {



    }

    @Override
    public void exitDeclarationList(CParser.DeclarationListContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {


    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }

//    edit(it's for print)
    private void printScopes(Scope scope) {
        System.out.println("--------------------scope-name : " + scope.getName() + " | scope-type : " + scope.getType()  + "------------------\n");
        String itemsStr = "";
        for (Map.Entry<String,SymbolItem> entry : scope.getSymbolTable().getTable().entrySet()) {
            System.out.println("Key = " + entry.getKey() + "  | Value = " + entry.getValue().toString() );
            System.out.println("\n");
        }
        if (scope.getChildren().size() == 0) {
            return;
        }
        for (Scope s : scope.getChildren()) {
            printScopes(s);
        }
    }

    private boolean lookUpScopes(Scope scope, String key, String type) {
        if (scope == null) {
            return false;
        }


        if ("method".equals(type)) {
            if (scope.LookUp(key + "_method")) {
                return true;
            }
        } else if ("field".equals(type)) {
            if (scope.LookUp(key + "_field")) {
                return true;
            }
        }
        return lookUpScopes(currentScope, key, type);
    }
}
