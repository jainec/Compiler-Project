/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladores.analysis;

import java.util.*;
import compiladores.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPStart().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAStart(AStart node)
    {
        defaultIn(node);
    }

    public void outAStart(AStart node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStart(AStart node)
    {
        inAStart(node);
        if(node.getDeclaracao() != null)
        {
            node.getDeclaracao().apply(this);
        }
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        outAStart(node);
    }

    public void inATipoDeclaracoes(ATipoDeclaracoes node)
    {
        defaultIn(node);
    }

    public void outATipoDeclaracoes(ATipoDeclaracoes node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATipoDeclaracoes(ATipoDeclaracoes node)
    {
        inATipoDeclaracoes(node);
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        {
            List<PVar> copy = new ArrayList<PVar>(node.getVars());
            for(PVar e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outATipoDeclaracoes(node);
    }

    public void inAConstDeclaracoes(AConstDeclaracoes node)
    {
        defaultIn(node);
    }

    public void outAConstDeclaracoes(AConstDeclaracoes node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAConstDeclaracoes(AConstDeclaracoes node)
    {
        inAConstDeclaracoes(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        outAConstDeclaracoes(node);
    }

    public void inADeclaracao(ADeclaracao node)
    {
        defaultIn(node);
    }

    public void outADeclaracao(ADeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclaracao(ADeclaracao node)
    {
        inADeclaracao(node);
        {
            List<PDeclaracoes> copy = new ArrayList<PDeclaracoes>(node.getDeclaracoes());
            for(PDeclaracoes e : copy)
            {
                e.apply(this);
            }
        }
        outADeclaracao(node);
    }

    public void inARealTipo(ARealTipo node)
    {
        defaultIn(node);
    }

    public void outARealTipo(ARealTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARealTipo(ARealTipo node)
    {
        inARealTipo(node);
        if(node.getReal() != null)
        {
            node.getReal().apply(this);
        }
        outARealTipo(node);
    }

    public void inAIntTipo(AIntTipo node)
    {
        defaultIn(node);
    }

    public void outAIntTipo(AIntTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntTipo(AIntTipo node)
    {
        inAIntTipo(node);
        if(node.getInteiro() != null)
        {
            node.getInteiro().apply(this);
        }
        outAIntTipo(node);
    }

    public void inACharTipo(ACharTipo node)
    {
        defaultIn(node);
    }

    public void outACharTipo(ACharTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACharTipo(ACharTipo node)
    {
        inACharTipo(node);
        if(node.getCaractere() != null)
        {
            node.getCaractere().apply(this);
        }
        outACharTipo(node);
    }

    public void inABooleanoTipo(ABooleanoTipo node)
    {
        defaultIn(node);
    }

    public void outABooleanoTipo(ABooleanoTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABooleanoTipo(ABooleanoTipo node)
    {
        inABooleanoTipo(node);
        if(node.getBooleano() != null)
        {
            node.getBooleano().apply(this);
        }
        outABooleanoTipo(node);
    }

    public void inAIdVar(AIdVar node)
    {
        defaultIn(node);
    }

    public void outAIdVar(AIdVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdVar(AIdVar node)
    {
        inAIdVar(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdVar(node);
    }

    public void inAIndexVar(AIndexVar node)
    {
        defaultIn(node);
    }

    public void outAIndexVar(AIndexVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIndexVar(AIndexVar node)
    {
        inAIndexVar(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getNum() != null)
        {
            node.getNum().apply(this);
        }
        outAIndexVar(node);
    }

    public void inAStrValor(AStrValor node)
    {
        defaultIn(node);
    }

    public void outAStrValor(AStrValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStrValor(AStrValor node)
    {
        inAStrValor(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAStrValor(node);
    }

    public void inANumValor(ANumValor node)
    {
        defaultIn(node);
    }

    public void outANumValor(ANumValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumValor(ANumValor node)
    {
        inANumValor(node);
        if(node.getNum() != null)
        {
            node.getNum().apply(this);
        }
        outANumValor(node);
    }

    public void inANumrealValor(ANumrealValor node)
    {
        defaultIn(node);
    }

    public void outANumrealValor(ANumrealValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumrealValor(ANumrealValor node)
    {
        inANumrealValor(node);
        if(node.getNumreal() != null)
        {
            node.getNumreal().apply(this);
        }
        outANumrealValor(node);
    }

    public void inAComando(AComando node)
    {
        defaultIn(node);
    }

    public void outAComando(AComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComando(AComando node)
    {
        inAComando(node);
        {
            List<PComandos> copy = new ArrayList<PComandos>(node.getComandos());
            for(PComandos e : copy)
            {
                e.apply(this);
            }
        }
        outAComando(node);
    }

    public void inASenaoComando(ASenaoComando node)
    {
        defaultIn(node);
    }

    public void outASenaoComando(ASenaoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASenaoComando(ASenaoComando node)
    {
        inASenaoComando(node);
        if(node.getSenao() != null)
        {
            node.getSenao().apply(this);
        }
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        if(node.getComandos() != null)
        {
            node.getComandos().apply(this);
        }
        outASenaoComando(node);
    }

    public void inASenaoComandoDoispontos(ASenaoComandoDoispontos node)
    {
        defaultIn(node);
    }

    public void outASenaoComandoDoispontos(ASenaoComandoDoispontos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASenaoComandoDoispontos(ASenaoComandoDoispontos node)
    {
        inASenaoComandoDoispontos(node);
        if(node.getSenao() != null)
        {
            node.getSenao().apply(this);
        }
        if(node.getDoisPontos() != null)
        {
            node.getDoisPontos().apply(this);
        }
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        if(node.getComandos() != null)
        {
            node.getComandos().apply(this);
        }
        outASenaoComandoDoispontos(node);
    }

    public void inAComandoCasoCasoComandos(AComandoCasoCasoComandos node)
    {
        defaultIn(node);
    }

    public void outAComandoCasoCasoComandos(AComandoCasoCasoComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComandoCasoCasoComandos(AComandoCasoCasoComandos node)
    {
        inAComandoCasoCasoComandos(node);
        if(node.getCaso() != null)
        {
            node.getCaso().apply(this);
        }
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        if(node.getDoisPontos() != null)
        {
            node.getDoisPontos().apply(this);
        }
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        if(node.getComandos() != null)
        {
            node.getComandos().apply(this);
        }
        outAComandoCasoCasoComandos(node);
    }

    public void inACasoComando(ACasoComando node)
    {
        defaultIn(node);
    }

    public void outACasoComando(ACasoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACasoComando(ACasoComando node)
    {
        inACasoComando(node);
        {
            List<PCasoComandos> copy = new ArrayList<PCasoComandos>(node.getCasoComandos());
            for(PCasoComandos e : copy)
            {
                e.apply(this);
            }
        }
        outACasoComando(node);
    }

    public void inAExpExpOuElogica(AExpExpOuElogica node)
    {
        defaultIn(node);
    }

    public void outAExpExpOuElogica(AExpExpOuElogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpExpOuElogica(AExpExpOuElogica node)
    {
        inAExpExpOuElogica(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAExpExpOuElogica(node);
    }

    public void inAElogicaExpOuElogica(AElogicaExpOuElogica node)
    {
        defaultIn(node);
    }

    public void outAElogicaExpOuElogica(AElogicaExpOuElogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAElogicaExpOuElogica(AElogicaExpOuElogica node)
    {
        inAElogicaExpOuElogica(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        outAElogicaExpOuElogica(node);
    }

    public void inAAtribComandos(AAtribComandos node)
    {
        defaultIn(node);
    }

    public void outAAtribComandos(AAtribComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAtribComandos(AAtribComandos node)
    {
        inAAtribComandos(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAAtribComandos(node);
    }

    public void inALeiaComandos(ALeiaComandos node)
    {
        defaultIn(node);
    }

    public void outALeiaComandos(ALeiaComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALeiaComandos(ALeiaComandos node)
    {
        inALeiaComandos(node);
        {
            List<PVar> copy = new ArrayList<PVar>(node.getVars());
            for(PVar e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outALeiaComandos(node);
    }

    public void inAEscrevaComandos(AEscrevaComandos node)
    {
        defaultIn(node);
    }

    public void outAEscrevaComandos(AEscrevaComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEscrevaComandos(AEscrevaComandos node)
    {
        inAEscrevaComandos(node);
        {
            List<PExp> copy = new ArrayList<PExp>(node.getExps());
            for(PExp e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAEscrevaComandos(node);
    }

    public void inASeComandos(ASeComandos node)
    {
        defaultIn(node);
    }

    public void outASeComandos(ASeComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASeComandos(ASeComandos node)
    {
        inASeComandos(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        {
            List<PComandos> copy = new ArrayList<PComandos>(node.getA());
            for(PComandos e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getB() != null)
        {
            node.getB().apply(this);
        }
        if(node.getSenaoComando() != null)
        {
            node.getSenaoComando().apply(this);
        }
        outASeComandos(node);
    }

    public void inAAvalieComandos(AAvalieComandos node)
    {
        defaultIn(node);
    }

    public void outAAvalieComandos(AAvalieComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAvalieComandos(AAvalieComandos node)
    {
        inAAvalieComandos(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getCasoComando() != null)
        {
            node.getCasoComando().apply(this);
        }
        if(node.getSenaoComandoDoispontos() != null)
        {
            node.getSenaoComandoDoispontos().apply(this);
        }
        outAAvalieComandos(node);
    }

    public void inAEnquantoComandos(AEnquantoComandos node)
    {
        defaultIn(node);
    }

    public void outAEnquantoComandos(AEnquantoComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEnquantoComandos(AEnquantoComandos node)
    {
        inAEnquantoComandos(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        {
            List<PComandos> copy = new ArrayList<PComandos>(node.getA());
            for(PComandos e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getB() != null)
        {
            node.getB().apply(this);
        }
        outAEnquantoComandos(node);
    }

    public void inARepitaComandos(ARepitaComandos node)
    {
        defaultIn(node);
    }

    public void outARepitaComandos(ARepitaComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARepitaComandos(ARepitaComandos node)
    {
        inARepitaComandos(node);
        {
            List<PComandos> copy = new ArrayList<PComandos>(node.getA());
            for(PComandos e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getB() != null)
        {
            node.getB().apply(this);
        }
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        outARepitaComandos(node);
    }

    public void inAParaComandos(AParaComandos node)
    {
        defaultIn(node);
    }

    public void outAParaComandos(AParaComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParaComandos(AParaComandos node)
    {
        inAParaComandos(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getA() != null)
        {
            node.getA().apply(this);
        }
        if(node.getB() != null)
        {
            node.getB().apply(this);
        }
        {
            List<PComandos> copy = new ArrayList<PComandos>(node.getComandos());
            for(PComandos e : copy)
            {
                e.apply(this);
            }
        }
        outAParaComandos(node);
    }

    public void inAPassoComandos(APassoComandos node)
    {
        defaultIn(node);
    }

    public void outAPassoComandos(APassoComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPassoComandos(APassoComandos node)
    {
        inAPassoComandos(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getA() != null)
        {
            node.getA().apply(this);
        }
        if(node.getB() != null)
        {
            node.getB().apply(this);
        }
        if(node.getC() != null)
        {
            node.getC().apply(this);
        }
        {
            List<PComandos> copy = new ArrayList<PComandos>(node.getComandos());
            for(PComandos e : copy)
            {
                e.apply(this);
            }
        }
        outAPassoComandos(node);
    }

    public void inAValorExp(AValorExp node)
    {
        defaultIn(node);
    }

    public void outAValorExp(AValorExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAValorExp(AValorExp node)
    {
        inAValorExp(node);
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        outAValorExp(node);
    }

    public void inAVarExp(AVarExp node)
    {
        defaultIn(node);
    }

    public void outAVarExp(AVarExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarExp(AVarExp node)
    {
        inAVarExp(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAVarExp(node);
    }

    public void inAFatorNegativoExp(AFatorNegativoExp node)
    {
        defaultIn(node);
    }

    public void outAFatorNegativoExp(AFatorNegativoExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFatorNegativoExp(AFatorNegativoExp node)
    {
        inAFatorNegativoExp(node);
        if(node.getMenos() != null)
        {
            node.getMenos().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAFatorNegativoExp(node);
    }

    public void inASomaExp(ASomaExp node)
    {
        defaultIn(node);
    }

    public void outASomaExp(ASomaExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASomaExp(ASomaExp node)
    {
        inASomaExp(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outASomaExp(node);
    }

    public void inASubtracaoExp(ASubtracaoExp node)
    {
        defaultIn(node);
    }

    public void outASubtracaoExp(ASubtracaoExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASubtracaoExp(ASubtracaoExp node)
    {
        inASubtracaoExp(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outASubtracaoExp(node);
    }

    public void inAMultExp(AMultExp node)
    {
        defaultIn(node);
    }

    public void outAMultExp(AMultExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultExp(AMultExp node)
    {
        inAMultExp(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAMultExp(node);
    }

    public void inADivExp(ADivExp node)
    {
        defaultIn(node);
    }

    public void outADivExp(ADivExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivExp(ADivExp node)
    {
        inADivExp(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outADivExp(node);
    }

    public void inAIgualExpLogica(AIgualExpLogica node)
    {
        defaultIn(node);
    }

    public void outAIgualExpLogica(AIgualExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIgualExpLogica(AIgualExpLogica node)
    {
        inAIgualExpLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAIgualExpLogica(node);
    }

    public void inADiferenteExpLogica(ADiferenteExpLogica node)
    {
        defaultIn(node);
    }

    public void outADiferenteExpLogica(ADiferenteExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADiferenteExpLogica(ADiferenteExpLogica node)
    {
        inADiferenteExpLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outADiferenteExpLogica(node);
    }

    public void inAMenorigualExpLogica(AMenorigualExpLogica node)
    {
        defaultIn(node);
    }

    public void outAMenorigualExpLogica(AMenorigualExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorigualExpLogica(AMenorigualExpLogica node)
    {
        inAMenorigualExpLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAMenorigualExpLogica(node);
    }

    public void inAMaiorigualExpLogica(AMaiorigualExpLogica node)
    {
        defaultIn(node);
    }

    public void outAMaiorigualExpLogica(AMaiorigualExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorigualExpLogica(AMaiorigualExpLogica node)
    {
        inAMaiorigualExpLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAMaiorigualExpLogica(node);
    }

    public void inAMenorqExpLogica(AMenorqExpLogica node)
    {
        defaultIn(node);
    }

    public void outAMenorqExpLogica(AMenorqExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorqExpLogica(AMenorqExpLogica node)
    {
        inAMenorqExpLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAMenorqExpLogica(node);
    }

    public void inAMaiorqExpLogica(AMaiorqExpLogica node)
    {
        defaultIn(node);
    }

    public void outAMaiorqExpLogica(AMaiorqExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorqExpLogica(AMaiorqExpLogica node)
    {
        inAMaiorqExpLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAMaiorqExpLogica(node);
    }

    public void inANaoElogicaExpLogica(ANaoElogicaExpLogica node)
    {
        defaultIn(node);
    }

    public void outANaoElogicaExpLogica(ANaoElogicaExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANaoElogicaExpLogica(ANaoElogicaExpLogica node)
    {
        inANaoElogicaExpLogica(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        outANaoElogicaExpLogica(node);
    }

    public void inAEExpLogica(AEExpLogica node)
    {
        defaultIn(node);
    }

    public void outAEExpLogica(AEExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEExpLogica(AEExpLogica node)
    {
        inAEExpLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAEExpLogica(node);
    }

    public void inAOuExpLogica(AOuExpLogica node)
    {
        defaultIn(node);
    }

    public void outAOuExpLogica(AOuExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOuExpLogica(AOuExpLogica node)
    {
        inAOuExpLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAOuExpLogica(node);
    }

    public void inAXorExpLogica(AXorExpLogica node)
    {
        defaultIn(node);
    }

    public void outAXorExpLogica(AXorExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAXorExpLogica(AXorExpLogica node)
    {
        inAXorExpLogica(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAXorExpLogica(node);
    }
}
