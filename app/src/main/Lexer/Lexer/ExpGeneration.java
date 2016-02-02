package Lexer;
@SuppressWarnings("rawtypes")
public class ExpGeneration extends exprBaseVisitor{
	
	
	public String visitBinary(exprParser.BinaryContext ctx)
	{
		String result = null;
		if (ctx.getChildCount() == 3)
		{
			String leftExpr = visit(ctx.getChild(0)).toString();
			String op = ctx.getChild(1).toString();
			String rightExpr = visit(ctx.getChild(2)).toString();

			double left = Float.parseFloat(leftExpr);
			double right = Float.parseFloat(rightExpr);
			double out = 0.0;
			switch (op)
			{
				case "-": out = left - right; break;
				case "+": out = left + right; break;
				default: break;
			}
			if (out%1 == 0.0) result = String.valueOf(Math.round(out));
			else result = String.valueOf(out);
		}
		else if (ctx.getChildCount() == 1)
		{
			result = visit(ctx.getChild(0)).toString();
		}
		else result = "0.0";
		return result;	
	}
	public String visitBinary2(exprParser.Binary2Context ctx){
		String result = null;
		if (ctx.getChildCount() == 3)
		{
			String leftExpr = visit(ctx.getChild(0)).toString();
			String op = ctx.getChild(1).toString();
			String rightExpr = visit(ctx.getChild(2)).toString();

			double left = Float.parseFloat(leftExpr);
			double right = Float.parseFloat(rightExpr);
			double out = 0.0;
			switch (op)
			{
				case "*": out = left * right; break;
				case "/": out = left / right; break;
				default: break;
			}
			if (out%1 == 0.0) result = String.valueOf(Math.round(out));
			else result = String.valueOf(out);
		}
		else if (ctx.getChildCount() == 1)
		{
			result = visit(ctx.getChild(0)).toString();
		}
		else result = "0.0";
		return result;	
	}
	public String visitUnary(exprParser.UnaryContext ctx){
		String result = null;
		String una = visit(ctx.op()).toString();
		
		if (ctx.getChildCount() != 1)
		{
			String op = ctx.getChild(0).toString();
			
			if (op == "+") result = una;
			else if (op == "-") result = "-" + una;
		}
		else result = una;
		
		return result;
	}
	
	public String visitOp(exprParser.OpContext ctx){
		String result = null;
		
		result = ctx.getChild(0).toString();
		
		return result;
	}
}
