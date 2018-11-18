import compiladores.lexer.*;
import java.io.FileReader;
import java.io.PushbackReader;
import compiladores.node.* ;
import compiladores.parser.Parser;

public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                /* Form our AST */
       
                ComentarioAninhado lexer = new ComentarioAninhado (new PushbackReader(
                  new FileReader(args[0]), 1024));
                Parser p = new Parser(lexer);
                Start tree = p.parse();
                LineNumbers lineNumbers = new LineNumbers();
                tree.apply(lineNumbers);
                AnaliseSemantica a = new AnaliseSemantica(lineNumbers);
                tree.apply(a);
                //tree.apply(new ASTDisplay());
                a.valoresFinaisVariaveis();
                
                
                //System.out.println(tree.toString());
                //System.out.println("\nAnálise Sintática realizada com sucesso!");
                /*while (true) {
                    Token token = lexer.next();
                    if (token instanceof EOF) {
                        break;
                    } else if (token instanceof TBlank || token instanceof TNovaLinha) {
                        System.out.print(token.getText());
                    } else {
                        System.out.print(token.getClass().getSimpleName());
                    }
                }*/
                
            } catch (Exception e) {
              System.out.println (e) ;
           }
        } else {
           System.err.println("usage: java simpleAdder inputFile");
           System.exit(1);
        }
    }
}
