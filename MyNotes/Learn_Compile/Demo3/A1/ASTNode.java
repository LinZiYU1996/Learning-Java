package Learn_Compile.Demo3.A1;

import java.util.List;

public interface ASTNode {

    //父节点
    public ASTNode getParent();

    //子节点
    public List<ASTNode> getChildren();

    //AST类型
    public ASTNodeType getType();

    //文本值
    public String getText();


}
