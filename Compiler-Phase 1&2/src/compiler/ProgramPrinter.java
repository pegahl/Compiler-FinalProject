package compiler;


import gen.CListener;
import gen.CParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.lang.reflect.Array;
import java.util.Vector;

public class ProgramPrinter implements CListener {

    final String TAB="  ";
    Boolean isMain=false;
    int tabCounter=1;
    Vector functionNames=new Vector();
    Vector paramNames=new Vector();
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
//        func call
        for(int i=0;i<functionNames.size();i++){
            String a=functionNames.get(i).toString();
            if(ctx.start.getText().equalsIgnoreCase(a)){
                funcCall=true;
//                System.out.println(ctx.start.getText());
            }
        }
        if (funcCall){
            tabCounter++;
            for (int i = 0; i <tabCounter-1 ; i++) {
                System.out.print(TAB);
            }
            tabCounter--;
            System.out.print(TAB+"function cal: name: "+ctx.start.getText()+"/ params: ");

//func call param
            String s = ctx.getText();
            String newS=s.replace(ctx.start.getText().toString(),"");
            String str = newS.substring(1, newS.length() - 1);
            String[] param = str.split(",");
            for(int i=0;i<param.length;i++){
                if(i<param.length-1) {
                    System.out.print(param[i]+" (index:"+i+"), ");
                }
                else{
                    System.out.println(param[i]+" (index:"+i+")");
                }
            }

        }

//        System.out.println(ctx.start.getText());
    }

    @Override
    public void exitExpression(CParser.ExpressionContext ctx) {

//        if (funcCall){
//            tabCounter--;
//            for (int i = 0; i <tabCounter ; i++) {
//                System.out.print(TAB);
//            }
//        }
        funcCall=false;
    }

    @Override
    public void enterConstantExpression(CParser.ConstantExpressionContext ctx) {


    }

    @Override
    public void exitConstantExpression(CParser.ConstantExpressionContext ctx) {

    }

    @Override
    public void enterDeclaration(CParser.DeclarationContext ctx) {
//        field
        String fieldType=ctx.declarationSpecifiers().getText();
        String fieldName=ctx.initDeclaratorList().start.getText();
        for (int i = 0; i <tabCounter ; i++) {
            System.out.print(TAB);
        }
        System.out.print(TAB+"field : "+fieldName+"/ type: "+fieldType);
//        find length
        char len = 0;
        int index = ctx.initDeclaratorList().getText().indexOf('[');
        if (index != -1 && index < ctx.initDeclaratorList().getText().length() - 1) {
            len= ctx.initDeclaratorList().getText().charAt(index + 1);
        }
        if (len!=0){
            System.out.print("/ length: "+len);
        }
        System.out.println();
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
//        System.out.println(ctx.getText());

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
//        imp
//        System.out.println("this is enterPointer "+ctx.getText());
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
//        System.out.println("this is ypeQualifierList "+ctx.getText());
//        ?
    }

    @Override
    public void exitTypeQualifierList(CParser.TypeQualifierListContext ctx) {

    }

    @Override
    public void enterParameterTypeList(CParser.ParameterTypeListContext ctx) {
//        System.out.println("this is ypeQualifierList "+ctx.getText());
//it doesn't use
    }

    @Override
    public void exitParameterTypeList(CParser.ParameterTypeListContext ctx) {



        }

    @Override
    public void enterParameterList(CParser.ParameterListContext ctx) {
//        tabCounter++;
        for (int i = 0; i <tabCounter ; i++) {
            System.out.print(TAB);
        }
        System.out.print(TAB+"parameter list: "+"[");
        int size=ctx.parameterDeclaration().size();
        String paramType, paramName;
//        type
        for(int i=0;i<size;i++) {
            paramType=ctx.parameterDeclaration().get(i).declarationSpecifiers().getText();
            paramName=ctx.parameterDeclaration().get(i).declarator().start.getText();
            System.out.print(paramType+" "+paramName);
//            print "," after parameter name
            if(i<size-1) {
                System.out.print(" ,");
            }

        }
        System.out.print("]");
    }

    @Override
    public void exitParameterList(CParser.ParameterListContext ctx) {
        System.out.println();

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

    }

    @Override
    public void exitSelectionStatement(CParser.SelectionStatementContext ctx) {

    }

    @Override
    public void enterIterationStatement(CParser.IterationStatementContext ctx) {
        tabCounter++;
        String forCond=ctx.getText().toString();

        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) {

            lastIndex = forCond.indexOf("{", lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += "{".length();
            }
        }
        if(count>1){
            for (int i = 0; i < tabCounter-1; i++) {
                System.out.print(TAB);
            }
            System.out.println(TAB+"nested statement : {");
            for (int i = 0; i <tabCounter-1 ; i++) {
                System.out.print(TAB);
            }
            System.out.println("}");
        }


    }

    @Override
    public void exitIterationStatement(CParser.IterationStatementContext ctx) {
        tabCounter--;


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
        System.out.println("program start{");}
    @Override
    public void exitExternalDeclaration(CParser.ExternalDeclarationContext ctx) {System.out.println("}");}

    @Override
    public void enterFunctionDefinition(CParser.FunctionDefinitionContext ctx) {
        for (int i = 0; i <tabCounter ; i++) {
            System.out.print(TAB);
        }
        String type=ctx.typeSpecifier().getText();
        String methodName=ctx.declarator().getStart().getText();

//        System.out.println("row"+ ctx.getStart().getLine());
        functionNames.add(methodName);

        if (methodName.equals("main")) {
            isMain=true;
            System.out.println(TAB+"main method"+"{");
        }
        else{
            System.out.println(TAB+"normal method: name: "+ methodName+"/ return type: "+type+ " {");
        }
        tabCounter++;

    }

    @Override
    public void exitFunctionDefinition(CParser.FunctionDefinitionContext ctx) {
        tabCounter--;
        for (int i = 0; i <tabCounter ; i++) {
            System.out.print(TAB);
        }
        System.out.println("}");

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
}
