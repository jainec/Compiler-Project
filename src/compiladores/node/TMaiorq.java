/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladores.node;

import compiladores.analysis.*;

@SuppressWarnings("nls")
public final class TMaiorq extends Token
{
    public TMaiorq()
    {
        super.setText(">");
    }

    public TMaiorq(int line, int pos)
    {
        super.setText(">");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TMaiorq(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMaiorq(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TMaiorq text.");
    }
}
