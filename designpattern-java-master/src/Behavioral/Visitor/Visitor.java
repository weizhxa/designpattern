package Behavioral.Visitor;

public interface Visitor {

    public void visit(Son son);

    public void visit(Daughter daughter);
}