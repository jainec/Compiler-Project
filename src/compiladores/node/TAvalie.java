/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladores.node;

import compiladores.analysis.*;

@SuppressWarnings("nls")
public final class TAvalie extends Token
{
    public TAvalie()
    {
        super.setText("avalie");
    }

    public TAvalie(int line, int pos)
    {
        super.setText("avalie");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TAvalie(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTAvalie(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TAvalie text.");
    }
}
