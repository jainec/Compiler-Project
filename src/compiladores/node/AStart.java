/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladores.node;

import compiladores.analysis.*;

@SuppressWarnings("nls")
public final class AStart extends PStart
{
    private PDeclaracao _declaracao_;
    private PComando _comando_;

    public AStart()
    {
        // Constructor
    }

    public AStart(
        @SuppressWarnings("hiding") PDeclaracao _declaracao_,
        @SuppressWarnings("hiding") PComando _comando_)
    {
        // Constructor
        setDeclaracao(_declaracao_);

        setComando(_comando_);

    }

    @Override
    public Object clone()
    {
        return new AStart(
            cloneNode(this._declaracao_),
            cloneNode(this._comando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStart(this);
    }

    public PDeclaracao getDeclaracao()
    {
        return this._declaracao_;
    }

    public void setDeclaracao(PDeclaracao node)
    {
        if(this._declaracao_ != null)
        {
            this._declaracao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._declaracao_ = node;
    }

    public PComando getComando()
    {
        return this._comando_;
    }

    public void setComando(PComando node)
    {
        if(this._comando_ != null)
        {
            this._comando_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comando_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._declaracao_)
            + toString(this._comando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._declaracao_ == child)
        {
            this._declaracao_ = null;
            return;
        }

        if(this._comando_ == child)
        {
            this._comando_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._declaracao_ == oldChild)
        {
            setDeclaracao((PDeclaracao) newChild);
            return;
        }

        if(this._comando_ == oldChild)
        {
            setComando((PComando) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
