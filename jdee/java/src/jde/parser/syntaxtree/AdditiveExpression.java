//
// Generated by JTB 1.1.2
//

package jde.parser.syntaxtree;

/**
 * Grammar production:
 * <PRE>
 * f0 -> MultiplicativeExpression()
 * f1 -> ( ( "+" | "-" ) MultiplicativeExpression() )*
 * </PRE>
 */
public class AdditiveExpression implements Node {
   public MultiplicativeExpression f0;
   public NodeListOptional f1;

   public AdditiveExpression(MultiplicativeExpression n0, NodeListOptional n1) {
      f0 = n0;
      f1 = n1;
   }

   public void accept(jde.parser.visitor.Visitor v) {
      v.visit(this);
   }
}

