package compiler;

import compiler.errorHandler.ErrorHandler;
import gen.CLexer;
import gen.CListener;
import gen.CParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.IterativeParseTreeWalker;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import compiler.ProgramIndexer;
import compiler.Test;

import java.io.IOException;

public class Compiler {
    public static void main(String[] args) throws IOException{
        CharStream stream= CharStreams.fromFileName("./Sample/input.c");
        CLexer lexer = new CLexer(stream);
        TokenStream tokens = new CommonTokenStream(lexer);
        CParser parser = new CParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.externalDeclaration();
        ParseTreeWalker walker = new IterativeParseTreeWalker();
//        phase 1
        CListener listener = new ProgramPrinter();
        walker.walk(listener, tree);

//        phase 2
        CListener indexer = new ProgramIndexer();
        walker.walk(indexer,tree);

//        phase 3
//        CListener errorHandler = new ErrorHandler();
//        walker.walk(errorHandler, tree);

    }
}
