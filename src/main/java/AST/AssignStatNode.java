package AST;

import visitors.Visitor;

public class AssignStatNode extends Node {

    public AssignStatNode() {
        super("=");
    }

    public AssignStatNode(Node p_parent) {
        super("=", p_parent);
    }

    public AssignStatNode(Node p_leftChild, Node p_rightChild) {
        super("=");
        this.addChild(p_leftChild);
        this.addChild(p_rightChild);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
