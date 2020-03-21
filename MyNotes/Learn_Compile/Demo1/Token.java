package Learn_Compile.Demo1;

public interface Token {


    /**
     * Token的类型
     * @return
     */
    public TokenType getType();

    /**
     * Token的文本值
     * @return
     */
    public String getText();

}
