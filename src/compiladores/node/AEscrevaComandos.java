/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladores.node;

import java.util.*;
import compiladores.analysis.*;

@SuppressWarnings("nls")
public final class AEscrevaComandos extends PComandos
{
    private final LinkedList<PExp> _exps_ = new LinkedList<PExp>();
    private PExp _exp_;

    public AEscrevaComandos()
    {
        // Constructor
    }

    public AEscrevaComandos(
        @SuppressWarnings("hiding") List<?> _exps_,
        @SuppressWarnings("hiding") PExp _exp_)
    {
        // Constructor
        setExps(_exps_);

        setExp(_exp_);

    }

    @Override
    public Object clone()
    {
        return new AEscrevaComandos(
            cloneList(this._exps_),
            cloneNode(this._exp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEscrevaComandos(this);
    }

    public LinkedList<PExp> getExps()
    {
        return this._exps_;
    }

    public void setExps(List<?> list)
    {
        for(PExp e : this._exps_)
        {
            e.parent(null);
        }
        this._exps_.clear();

        for(Object obj_e : list)
        {
            PExp e = (PExp) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._exps_.add(e);
        }
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exps_)
            + toString(this._exp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exps_.remove(child))
        {
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PExp> i = this._exps_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PExp) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
