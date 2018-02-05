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

/**
 * Manifest Processor which processes the toml file parsed and populate the Manifest POJO
 */
public class ManfiestProcessor {
    /**
     * Generates the Manifest object by parsing the toml config file
     * @param fileName toml file name
     * @return manifest object
     * @throws IOException
     */
    public static Manifest parseTomlContent(String fileName) throws IOException {
        Manifest manifest = new Manifest();

        CharStream in = CharStreams.fromFileName(fileName);
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
