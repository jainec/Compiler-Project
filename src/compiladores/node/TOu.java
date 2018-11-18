/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladores.node;

import compiladores.analysis.*;

@SuppressWarnings("nls")
public final class TOu extends Token
{
    public TOu()
    {
        super.setText("ou");
    }

    public TOu(int line, int pos)
    {
        super.setText("ou");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TOu(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTOu(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TOu text.");
    }
}
