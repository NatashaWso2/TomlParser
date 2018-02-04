package org.wso2.toml.parser.manager;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.wso2.toml.parser.antlr4.TomlLexer;
import org.wso2.toml.parser.antlr4.TomlParser;
import org.wso2.toml.parser.model.Manifest;

import java.io.IOException;

public class ManfiestProcessor {
    /*public static void main(String[] args) {
        Manifest manifest = new Manifest();

        CharStream in = CharStreams.fromString("[\"header\"]\n" +
                " key5={dsdsa=\"sadad\"};");
        TomlLexer lexer = new TomlLexer(in);

        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Pass the tokens to the parser
        TomlParser parser = new TomlParser(tokens);

        // Specify the entry point
        ParseTree tree = parser.toml();
        List<Token> tokens1 = tokens.getTokens();
        for (Token token : tokens1) {
            System.out.println(token.getText() + " = "+token.getType());
//            System.out.println(lexer.getRuleNames()[token.getType()]);
//            System.out.println();
        }

        System.out.println(tree.toStringTree(parser));
    }*/
    public static Manifest parseTomlContent(String fileName) throws IOException {
        Manifest manifest = new Manifest();

        CharStream in = CharStreams.fromString(fileName);
        TomlLexer lexer = new TomlLexer(in);

        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Pass the tokens to the parser
        TomlParser parser = new TomlParser(tokens);
        ParseTree tree = parser.toml();

        // Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new TomlLoader(manifest), tree);
        System.out.println(tree.toStringTree(parser));
        return manifest;

    }
}
