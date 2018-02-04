package org.wso2.toml.parser.manager;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.wso2.toml.parser.antlr4.TomlBaseListener;
import org.wso2.toml.parser.antlr4.TomlParser;
import org.wso2.toml.parser.model.Dependency;
import org.wso2.toml.parser.model.DependencyFields;
import org.wso2.toml.parser.model.Headers;
import org.wso2.toml.parser.model.Manifest;
import org.wso2.toml.parser.model.ManifestFields;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class TomlLoader extends TomlBaseListener {
    private final Manifest manifest;
    List<String> packageAttributeList = Arrays.asList(ManifestFields.NAME.name(), ManifestFields.DESCRIPTION.name(),
            ManifestFields.DOCUMENTATION.name(), ManifestFields.VERSION.name(), ManifestFields.HOMEPAGE.name(),
            ManifestFields.README.name(), ManifestFields.REPOSITORY.name(), ManifestFields.LICENSE.name(),
            ManifestFields.AUTHORS.name(), ManifestFields.KEYWORDS.name());
    List<String> dependancyAttributeList = Arrays.asList(DependencyFields.NAME.name(), DependencyFields.VERSION.name(),
            DependencyFields.LOCATION.name());
    private Dependency dependency;
    private String headerProcessed;
    private String keyProcessed;

    public TomlLoader(Manifest context) {
        this.manifest = context;
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterToml(TomlParser.TomlContext ctx) {
        super.enterToml(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitToml(TomlParser.TomlContext ctx) {
        super.exitToml(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterExpression(TomlParser.ExpressionContext ctx) {
        super.enterExpression(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitExpression(TomlParser.ExpressionContext ctx) {
        super.exitExpression(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterWs(TomlParser.WsContext ctx) {
        super.enterWs(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitWs(TomlParser.WsContext ctx) {
        super.exitWs(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterWschar(TomlParser.WscharContext ctx) {
        super.enterWschar(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitWschar(TomlParser.WscharContext ctx) {
        super.exitWschar(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterNewline(TomlParser.NewlineContext ctx) {
        super.enterNewline(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitNewline(TomlParser.NewlineContext ctx) {
        super.exitNewline(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterCommentStartSymbol(TomlParser.CommentStartSymbolContext ctx) {
        super.enterCommentStartSymbol(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitCommentStartSymbol(TomlParser.CommentStartSymbolContext ctx) {
        super.exitCommentStartSymbol(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterNonEol(TomlParser.NonEolContext ctx) {
        super.enterNonEol(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitNonEol(TomlParser.NonEolContext ctx) {
        super.exitNonEol(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterComment(TomlParser.CommentContext ctx) {
        super.enterComment(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitComment(TomlParser.CommentContext ctx) {
        super.exitComment(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterKeyval(TomlParser.KeyvalContext ctx) {
        keyProcessed = ctx.key().getText();
        addKeyValPair(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitKeyval(TomlParser.KeyvalContext ctx) {
        setDependancyAndPatches();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterKey(TomlParser.KeyContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitKey(TomlParser.KeyContext ctx) {
        super.exitKey(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterUnquotedKey(TomlParser.UnquotedKeyContext ctx) {
        super.enterUnquotedKey(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitUnquotedKey(TomlParser.UnquotedKeyContext ctx) {
        super.exitUnquotedKey(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterQuotedKey(TomlParser.QuotedKeyContext ctx) {
        super.enterQuotedKey(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitQuotedKey(TomlParser.QuotedKeyContext ctx) {
        super.exitQuotedKey(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterKeyvalSep(TomlParser.KeyvalSepContext ctx) {
        super.enterKeyvalSep(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitKeyvalSep(TomlParser.KeyvalSepContext ctx) {
        super.exitKeyvalSep(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterVal(TomlParser.ValContext ctx) {
        super.enterVal(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitVal(TomlParser.ValContext ctx) {
        super.exitVal(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterString(TomlParser.StringContext ctx) {
        super.enterString(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitString(TomlParser.StringContext ctx) {
        super.exitString(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterBasicString(TomlParser.BasicStringContext ctx) {
        super.enterBasicString(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitBasicString(TomlParser.BasicStringContext ctx) {
        super.exitBasicString(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterBasicChar(TomlParser.BasicCharContext ctx) {
        super.enterBasicChar(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitBasicChar(TomlParser.BasicCharContext ctx) {
        super.exitBasicChar(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterEscaped(TomlParser.EscapedContext ctx) {
        super.enterEscaped(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitEscaped(TomlParser.EscapedContext ctx) {
        super.exitEscaped(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterEscapeSeqChar(TomlParser.EscapeSeqCharContext ctx) {
        super.enterEscapeSeqChar(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitEscapeSeqChar(TomlParser.EscapeSeqCharContext ctx) {
        super.exitEscapeSeqChar(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterMlBasicString(TomlParser.MlBasicStringContext ctx) {
        super.enterMlBasicString(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitMlBasicString(TomlParser.MlBasicStringContext ctx) {
        super.exitMlBasicString(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterMlBasicStringDelim(TomlParser.MlBasicStringDelimContext ctx) {
        super.enterMlBasicStringDelim(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitMlBasicStringDelim(TomlParser.MlBasicStringDelimContext ctx) {
        super.exitMlBasicStringDelim(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterMlBasicBody(TomlParser.MlBasicBodyContext ctx) {
        super.enterMlBasicBody(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitMlBasicBody(TomlParser.MlBasicBodyContext ctx) {
        super.exitMlBasicBody(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterMlBasicChar(TomlParser.MlBasicCharContext ctx) {
        super.enterMlBasicChar(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitMlBasicChar(TomlParser.MlBasicCharContext ctx) {
        super.exitMlBasicChar(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterLiteralString(TomlParser.LiteralStringContext ctx) {
        super.enterLiteralString(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitLiteralString(TomlParser.LiteralStringContext ctx) {
        super.exitLiteralString(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterMlLiteralString(TomlParser.MlLiteralStringContext ctx) {
        super.enterMlLiteralString(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitMlLiteralString(TomlParser.MlLiteralStringContext ctx) {
        super.exitMlLiteralString(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterMlLiteralStringDelim(TomlParser.MlLiteralStringDelimContext ctx) {
        super.enterMlLiteralStringDelim(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitMlLiteralStringDelim(TomlParser.MlLiteralStringDelimContext ctx) {
        super.exitMlLiteralStringDelim(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterMlLiteralBody(TomlParser.MlLiteralBodyContext ctx) {
        super.enterMlLiteralBody(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitMlLiteralBody(TomlParser.MlLiteralBodyContext ctx) {
        super.exitMlLiteralBody(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterInteger(TomlParser.IntegerContext ctx) {
        super.enterInteger(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitInteger(TomlParser.IntegerContext ctx) {
        super.exitInteger(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterMinus(TomlParser.MinusContext ctx) {
        super.enterMinus(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitMinus(TomlParser.MinusContext ctx) {
        super.exitMinus(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterHexPrefix(TomlParser.HexPrefixContext ctx) {
        super.enterHexPrefix(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitHexPrefix(TomlParser.HexPrefixContext ctx) {
        super.exitHexPrefix(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterOctPrefix(TomlParser.OctPrefixContext ctx) {
        super.enterOctPrefix(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitOctPrefix(TomlParser.OctPrefixContext ctx) {
        super.exitOctPrefix(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterBinPrefix(TomlParser.BinPrefixContext ctx) {
        super.enterBinPrefix(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitBinPrefix(TomlParser.BinPrefixContext ctx) {
        super.exitBinPrefix(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterDecInt(TomlParser.DecIntContext ctx) {
        super.enterDecInt(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitDecInt(TomlParser.DecIntContext ctx) {
        super.exitDecInt(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterUnsignedDecInt(TomlParser.UnsignedDecIntContext ctx) {
        super.enterUnsignedDecInt(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitUnsignedDecInt(TomlParser.UnsignedDecIntContext ctx) {
        super.exitUnsignedDecInt(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterHexInt(TomlParser.HexIntContext ctx) {
        super.enterHexInt(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitHexInt(TomlParser.HexIntContext ctx) {
        super.exitHexInt(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterOctInt(TomlParser.OctIntContext ctx) {
        super.enterOctInt(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitOctInt(TomlParser.OctIntContext ctx) {
        super.exitOctInt(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterBinInt(TomlParser.BinIntContext ctx) {
        super.enterBinInt(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitBinInt(TomlParser.BinIntContext ctx) {
        super.exitBinInt(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterFloatingPoint(TomlParser.FloatingPointContext ctx) {
        super.enterFloatingPoint(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitFloatingPoint(TomlParser.FloatingPointContext ctx) {
        super.exitFloatingPoint(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterFloatIntPart(TomlParser.FloatIntPartContext ctx) {
        super.enterFloatIntPart(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitFloatIntPart(TomlParser.FloatIntPartContext ctx) {
        super.exitFloatIntPart(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterFrac(TomlParser.FracContext ctx) {
        super.enterFrac(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitFrac(TomlParser.FracContext ctx) {
        super.exitFrac(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterDecimalPoint(TomlParser.DecimalPointContext ctx) {
        super.enterDecimalPoint(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitDecimalPoint(TomlParser.DecimalPointContext ctx) {
        super.exitDecimalPoint(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterZeroPrefixableInt(TomlParser.ZeroPrefixableIntContext ctx) {
        super.enterZeroPrefixableInt(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitZeroPrefixableInt(TomlParser.ZeroPrefixableIntContext ctx) {
        super.exitZeroPrefixableInt(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterExp(TomlParser.ExpContext ctx) {
        super.enterExp(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitExp(TomlParser.ExpContext ctx) {
        super.exitExp(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterSpecialFloat(TomlParser.SpecialFloatContext ctx) {
        super.enterSpecialFloat(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitSpecialFloat(TomlParser.SpecialFloatContext ctx) {
        super.exitSpecialFloat(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterInf(TomlParser.InfContext ctx) {
        super.enterInf(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitInf(TomlParser.InfContext ctx) {
        super.exitInf(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterNan(TomlParser.NanContext ctx) {
        super.enterNan(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitNan(TomlParser.NanContext ctx) {
        super.exitNan(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterBool(TomlParser.BoolContext ctx) {
        super.enterBool(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitBool(TomlParser.BoolContext ctx) {
        super.exitBool(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterDateTime(TomlParser.DateTimeContext ctx) {
        super.enterDateTime(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitDateTime(TomlParser.DateTimeContext ctx) {
        super.exitDateTime(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterDateFullyear(TomlParser.DateFullyearContext ctx) {
        super.enterDateFullyear(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitDateFullyear(TomlParser.DateFullyearContext ctx) {
        super.exitDateFullyear(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterDateMonth(TomlParser.DateMonthContext ctx) {
        super.enterDateMonth(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitDateMonth(TomlParser.DateMonthContext ctx) {
        super.exitDateMonth(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterDateMday(TomlParser.DateMdayContext ctx) {
        super.enterDateMday(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitDateMday(TomlParser.DateMdayContext ctx) {
        super.exitDateMday(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterTimeDelim(TomlParser.TimeDelimContext ctx) {
        super.enterTimeDelim(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitTimeDelim(TomlParser.TimeDelimContext ctx) {
        super.exitTimeDelim(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterTimeHour(TomlParser.TimeHourContext ctx) {
        super.enterTimeHour(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitTimeHour(TomlParser.TimeHourContext ctx) {
        super.exitTimeHour(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterTimeMinute(TomlParser.TimeMinuteContext ctx) {
        super.enterTimeMinute(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitTimeMinute(TomlParser.TimeMinuteContext ctx) {
        super.exitTimeMinute(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterTimeSecond(TomlParser.TimeSecondContext ctx) {
        super.enterTimeSecond(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitTimeSecond(TomlParser.TimeSecondContext ctx) {
        super.exitTimeSecond(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterTimeSecfrac(TomlParser.TimeSecfracContext ctx) {
        super.enterTimeSecfrac(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitTimeSecfrac(TomlParser.TimeSecfracContext ctx) {
        super.exitTimeSecfrac(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterTimeNumoffset(TomlParser.TimeNumoffsetContext ctx) {
        super.enterTimeNumoffset(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitTimeNumoffset(TomlParser.TimeNumoffsetContext ctx) {
        super.exitTimeNumoffset(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterTimeOffset(TomlParser.TimeOffsetContext ctx) {
        super.enterTimeOffset(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterArrayvalsNonEmpty(TomlParser.ArrayvalsNonEmptyContext ctx) {
        super.enterArrayvalsNonEmpty(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitArrayvalsNonEmpty(TomlParser.ArrayvalsNonEmptyContext ctx) {
        super.exitArrayvalsNonEmpty(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitTimeOffset(TomlParser.TimeOffsetContext ctx) {
        super.exitTimeOffset(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterPartialTime(TomlParser.PartialTimeContext ctx) {
        super.enterPartialTime(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitPartialTime(TomlParser.PartialTimeContext ctx) {
        super.exitPartialTime(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterFullDate(TomlParser.FullDateContext ctx) {
        super.enterFullDate(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitFullDate(TomlParser.FullDateContext ctx) {
        super.exitFullDate(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterFullTime(TomlParser.FullTimeContext ctx) {
        super.enterFullTime(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitFullTime(TomlParser.FullTimeContext ctx) {
        super.exitFullTime(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterOffsetDateTime(TomlParser.OffsetDateTimeContext ctx) {
        super.enterOffsetDateTime(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitOffsetDateTime(TomlParser.OffsetDateTimeContext ctx) {
        super.exitOffsetDateTime(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterLocalDateTime(TomlParser.LocalDateTimeContext ctx) {
        super.enterLocalDateTime(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitLocalDateTime(TomlParser.LocalDateTimeContext ctx) {
        super.exitLocalDateTime(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterLocalDate(TomlParser.LocalDateContext ctx) {
        super.enterLocalDate(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitLocalDate(TomlParser.LocalDateContext ctx) {
        super.exitLocalDate(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterLocalTime(TomlParser.LocalTimeContext ctx) {
        super.enterLocalTime(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitLocalTime(TomlParser.LocalTimeContext ctx) {
        super.exitLocalTime(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterArray(TomlParser.ArrayContext ctx) {
        addArrayElements(ctx.arrayValues());
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitArray(TomlParser.ArrayContext ctx) {
        super.exitArray(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterArrayOpen(TomlParser.ArrayOpenContext ctx) {
        super.enterArrayOpen(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitArrayOpen(TomlParser.ArrayOpenContext ctx) {
        super.exitArrayOpen(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterArrayClose(TomlParser.ArrayCloseContext ctx) {
        super.enterArrayClose(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitArrayClose(TomlParser.ArrayCloseContext ctx) {
        super.exitArrayClose(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterArrayValues(TomlParser.ArrayValuesContext ctx) {
        super.enterArrayValues(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitArrayValues(TomlParser.ArrayValuesContext ctx) {
        super.exitArrayValues(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterArraySep(TomlParser.ArraySepContext ctx) {
        super.enterArraySep(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitArraySep(TomlParser.ArraySepContext ctx) {
        super.exitArraySep(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterWsCommentNewline(TomlParser.WsCommentNewlineContext ctx) {
        super.enterWsCommentNewline(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitWsCommentNewline(TomlParser.WsCommentNewlineContext ctx) {
        super.exitWsCommentNewline(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterTable(TomlParser.TableContext ctx) {
        // ctx.stdTable().key().get(0).getText()
        super.enterTable(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitTable(TomlParser.TableContext ctx) {
        super.exitTable(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterStdTable(TomlParser.StdTableContext ctx) {
        addHeader(ctx.key());
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitStdTable(TomlParser.StdTableContext ctx) {
        super.exitStdTable(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterStdTableOpen(TomlParser.StdTableOpenContext ctx) {
        super.enterStdTableOpen(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitStdTableOpen(TomlParser.StdTableOpenContext ctx) {
        super.exitStdTableOpen(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterStdTableClose(TomlParser.StdTableCloseContext ctx) {
        super.enterStdTableClose(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitStdTableClose(TomlParser.StdTableCloseContext ctx) {
        super.exitStdTableClose(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterTableKeySep(TomlParser.TableKeySepContext ctx) {
        super.enterTableKeySep(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitTableKeySep(TomlParser.TableKeySepContext ctx) {
        super.exitTableKeySep(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterInlineTable(TomlParser.InlineTableContext ctx) {
        addInlineTableContent(ctx.inlineTableKeyvals());
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitInlineTable(TomlParser.InlineTableContext ctx) {
        setDependancyAndPatches();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterInlineTableOpen(TomlParser.InlineTableOpenContext ctx) {
        super.enterInlineTableOpen(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitInlineTableOpen(TomlParser.InlineTableOpenContext ctx) {
        super.exitInlineTableOpen(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterInlineTableClose(TomlParser.InlineTableCloseContext ctx) {
        super.enterInlineTableClose(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitInlineTableClose(TomlParser.InlineTableCloseContext ctx) {
        super.exitInlineTableClose(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterInlineTableSep(TomlParser.InlineTableSepContext ctx) {
        super.enterInlineTableSep(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitInlineTableSep(TomlParser.InlineTableSepContext ctx) {
        super.exitInlineTableSep(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterInlineTableKeyvals(TomlParser.InlineTableKeyvalsContext ctx) {
        super.enterInlineTableKeyvals(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitInlineTableKeyvals(TomlParser.InlineTableKeyvalsContext ctx) {
        super.exitInlineTableKeyvals(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterInlineTableKeyvalsNonEmpty(TomlParser.InlineTableKeyvalsNonEmptyContext ctx) {
        super.enterInlineTableKeyvalsNonEmpty(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitInlineTableKeyvalsNonEmpty(TomlParser.InlineTableKeyvalsNonEmptyContext ctx) {
        super.exitInlineTableKeyvalsNonEmpty(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterArrayTable(TomlParser.ArrayTableContext ctx) {
        super.enterArrayTable(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitArrayTable(TomlParser.ArrayTableContext ctx) {
        super.exitArrayTable(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterArrayTableOpen(TomlParser.ArrayTableOpenContext ctx) {
        super.enterArrayTableOpen(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitArrayTableOpen(TomlParser.ArrayTableOpenContext ctx) {
        super.exitArrayTableOpen(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterArrayTableClose(TomlParser.ArrayTableCloseContext ctx) {
        super.enterArrayTableClose(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitArrayTableClose(TomlParser.ArrayTableCloseContext ctx) {
        super.exitArrayTableClose(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param node
     */
    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param node
     */
    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }

    public void setDependancyAndPatches() {
        if (headerProcessed.contains(Headers.DEPENDENCIES.getValue())) {
            this.manifest.addDependancy(dependency);
        } else if (headerProcessed.contains(Headers.PATCHES.getValue())) {
            this.manifest.addPatches(dependency);
        }
    }

    public void addKeyValPair(TomlParser.KeyvalContext ctx) {
        if (headerProcessed.equals(Headers.PACKAGE.getValue())) {
            if (packageAttributeList.contains(keyProcessed.toUpperCase())) {
                ManifestFields.valueOf(keyProcessed.toUpperCase()).setValue(this.manifest, ctx);
            }
        } else if (headerProcessed.equals(Headers.DEPENDENCIES.getValue()) ||
                headerProcessed.equals(Headers.PATCHES.getValue())) {
            if (dependancyAttributeList.contains(keyProcessed.toUpperCase())) {
                DependencyFields.valueOf(keyProcessed.toUpperCase()).setValue(dependency, ctx.val().getText());
            }
        }
    }

    public void addArrayElements(TomlParser.ArrayValuesContext arrayValuesContext) {
        List<Object> arrayElements = new ArrayList<>();
        if (arrayValuesContext.arrayvalsNonEmpty().size() > 0) {
            for (TomlParser.ArrayvalsNonEmptyContext valueContext : arrayValuesContext.arrayvalsNonEmpty()) {
                arrayElements.add(valueContext.getText());
            }
        }
        if (packageAttributeList.contains(keyProcessed.toUpperCase())) {
            ManifestFields.valueOf(keyProcessed.toUpperCase()).setArrayElements(this.manifest, arrayElements);
        }
    }

    public void addHeader(List<TomlParser.KeyContext> keyContextList) {
        headerProcessed = keyContextList.get(0).getText();

        if (keyContextList.size() > 1) {
            dependency = new Dependency();
            String pkgName = keyContextList.stream()
                    .map(i -> i.getText().equals(headerProcessed) ? "" : i.getText())
                    .collect(Collectors.joining(".")).replaceFirst(".", "");
            // Add the package name
            DependencyFields.valueOf(DependencyFields.NAME.name()).setValue(dependency, pkgName);
        }
    }

    public void addInlineTableContent(TomlParser.InlineTableKeyvalsContext ctx) {
        // Add the package name
        dependency = new Dependency();
        DependencyFields.valueOf(DependencyFields.NAME.name()).setValue(dependency, keyProcessed);

        if (ctx.inlineTableKeyvalsNonEmpty().size() > 0) {
            for (TomlParser.InlineTableKeyvalsNonEmptyContext valueContext : ctx.inlineTableKeyvalsNonEmpty()) {
                String name = valueContext.key().getText();
                if (dependancyAttributeList.contains(name.toUpperCase())) {
                    DependencyFields.valueOf(name.toUpperCase()).setValue(dependency, valueContext.val().getText());
                }
            }
        }
    }
}
