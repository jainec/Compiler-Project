/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladores.node;

import compiladores.analysis.*;

@SuppressWarnings("nls")
public final class TRepita extends Token
{
    public TRepita()
    {
        super.setText("repita");
    }

    public TRepita(int line, int pos)
    {
        super.setText("repita");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TRepita(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTRepita(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TRepita text.");
    }
}
