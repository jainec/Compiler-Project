/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladores.node;

import compiladores.analysis.*;

@SuppressWarnings("nls")
public final class AIndexVar extends PVar
{
    private TId _id_;
    private TNum _num_;

    public AIndexVar()
    {
        // Constructor
    }

    public AIndexVar(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TNum _num_)
    {
        // Constructor
        setId(_id_);

        setNum(_num_);

    }

    @Override
    public Object clone()
    {
        return new AIndexVar(
            cloneNode(this._id_),
            cloneNode(this._num_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIndexVar(this);
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public TNum getNum()
    {
        return this._num_;
    }

    public void setNum(TNum node)
    {
        if(this._num_ != null)
        {
            this._num_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._num_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._num_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._num_ == child)
        {
            this._num_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._num_ == oldChild)
        {
            setNum((TNum) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
