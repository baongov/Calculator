package Lexer;
/**
 * Created by OKATA on 1/21/2016.
 */
import java.util.regex.Pattern;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;


public class CalculateExpression {
    public  String MyCalculator(String exp)
    {
        CharStream chars = (CharStream) new ANTLRInputStream(exp);
        exprLexer lexer = new exprLexer(chars);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        exprParser parser = new exprParser(tokens);

        try {
            exprParser.BinaryContext tree = parser.binary();
            ExpGeneration visitExp = new ExpGeneration();
            String result = (String) visitExp.visit(tree);

            return result;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return "";
        }
    }
}

