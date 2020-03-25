package Learn_Compile.Demo1.A1;

import java.io.CharArrayReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/24
 * \* Time: 11:40
 * \* Description:
 * \
 */
public class SimpleLexicalAnalyzer {


    private StringBuilder tokenText = null;

    private List<Token> tokens = null;

    private SimpleToken current_token = null;




    private final class SimpleToken implements Token {

        private TokenType tokenType = null;

        private String text = null;

        @Override
        public TokenType getTokenType() {
            return tokenType;
        }

        @Override
        public String getText() {
            return text;
        }

        @Override
        public String toString() {
            return "SimpleToken{" +
                    "tokenType=" + tokenType +
                    ", text='" + text + '\'' +
                    '}';
        }
    }

    private class SimpleTokens {

        private List<Token> tokens = null;

        public SimpleTokens(List<Token> tokens) {
            this.tokens = tokens;
        }


    }

    /**
     * 有限状态机的各种状态。
     */
    private enum DfaState {
        Initial,

        If, Id_if1, Id_if2, Else, Id_else1, Id_else2, Id_else3, Id_else4, Int, Id_int1, Id_int2, Id_int3, Id, GT, GE,

        Assignment,

        Plus, Minus, Star, Slash,

        SemiColon,
        LeftParen,
        RightParen,

        IntLiteral
    }



    //是否是字母
    private boolean isAlpha(int ch) {
        return ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z';
    }

    //是否是数字
    private boolean isDigit(int ch) {
        return ch >= '0' && ch <= '9';
    }

    //是否是空白字符
    private boolean isBlank(int ch) {
        return ch == ' ' || ch == '\t' || ch == '\n';
    }



    // 开始解析 进入初始化状态
    // 解析完一个Token 也进入初始化状态
    private DfaState initToken(char ch) {

        if (tokenText.length() > 0) {

            current_token.text = tokenText.toString();

            tokens.add(current_token);


            tokenText = new StringBuilder();

            current_token = new SimpleToken();



        }

        //初始状态
        DfaState dfaState = DfaState.Initial;

        if (isAlpha(ch)) {              //第一个字符是字母
            // 出现了字符 'i'
            if (ch == 'i') {
                dfaState = DfaState.Id_int1;
            } else {
                dfaState = DfaState.Id; //进入Id状态
            }
            current_token.tokenType = TokenType.Identifier;
            tokenText.append(ch);
        } else if (isDigit(ch)) {   //第一个字符是数字


            dfaState = DfaState.IntLiteral;

            current_token.tokenType = TokenType.IntLiteral;

            tokenText.append(ch);

        } else if (ch == '=') {
            dfaState = DfaState.Assignment;
            current_token.tokenType = TokenType.Assignment;
            tokenText.append(ch);
        } else {
            dfaState = DfaState.Initial;
        }

        return dfaState;


    }


    public SimpleTokens lexicalanalyz(String resource) throws IOException {


        tokens = new ArrayList<>();

        CharArrayReader reader = new CharArrayReader(resource.toCharArray());

        tokenText = new StringBuilder();

        current_token = new SimpleToken();

        int int_for_char = 0;

        char char_for_int = 0;

        DfaState dfaState = DfaState.Initial;

        while ( (int_for_char = reader.read()) != -1 ) {

            char_for_int = (char) int_for_char;

            switch (dfaState) {



                case Initial:

                    dfaState = initToken(char_for_int);
                    break;

                case Id:
                    if (isDigit(char_for_int) || isAlpha(char_for_int)) {
                        tokenText.append(char_for_int);
                    } else {
                        dfaState = initToken(char_for_int);
                    }
                    break;

                case GT:
                    if (char_for_int == '=') {

                        current_token.tokenType = TokenType.GE;

                        dfaState = DfaState.GE;

                        tokenText.append(char_for_int);
                    } else {

                        dfaState = initToken(char_for_int);

                    }

                    break;

                case GE:
                case Assignment:
                case IntLiteral:

                    if (isDigit(char_for_int)) {

                        tokenText.append(char_for_int);

                    } else {

                        dfaState = initToken(char_for_int);

                    }

                    break;
                case Id_int1:

                    if (char_for_int == 'n') {

                        dfaState = DfaState.Id_int2;

                        tokenText.append(char_for_int);

                    } else if (isDigit(char_for_int) || isAlpha(char_for_int)) {

                        dfaState = DfaState.Id;

                        tokenText.append(char_for_int);
                    } else {

                        dfaState = initToken(char_for_int);

                    }

                    break;

                case Id_int2:
                    if (char_for_int == 't') {
                        dfaState = DfaState.Id_int3;
                        tokenText.append(char_for_int);
                    }
                    else if (isDigit(char_for_int) || isAlpha(char_for_int)){
                        dfaState = DfaState.Id;    //切换回id状态
                        tokenText.append(char_for_int);
                    }
                    else {

                        dfaState = initToken(char_for_int);

                    }
                    break;
                case Id_int3:
                    if (isBlank(char_for_int)) {
                        current_token.tokenType = TokenType.Int;
                        dfaState = initToken(char_for_int);
                    }
                    else{
                        dfaState = DfaState.Id;    //切换回Id状态
                        tokenText.append(char_for_int);
                    }
                    break;

                default:

            }




        }


        if (tokenText.length() > 0) {
            initToken(char_for_int);
        }

        return new SimpleTokens(tokens);
    }


    public static void main(String[] args) throws IOException {


        SimpleLexicalAnalyzer simpleLexicalAnalyzer = new SimpleLexicalAnalyzer();

        SimpleTokens simpleTokens  = simpleLexicalAnalyzer.lexicalanalyz("int x = 45");

        for (Token token : simpleTokens.tokens) {

                System.out.println(token.getTokenType() + "             " + token.getText());

        }



    }






}
