package br.com.caelum.stella.boleto.bancos.cnab.bancoob;

import org.coury.jfilehelpers.annotations.FieldFixedLength;
import org.coury.jfilehelpers.annotations.FixedLengthRecord;

/**
 * Created by rafaeldalbosco on 07/03/15.
 */
@FixedLengthRecord
public class CnabRemessaDetail240SegSBancoobImp12 extends CnabRemessaDetail240SegSBancoob {

    @FieldFixedLength(1)
    public Integer tipoImpressao;

    @FieldFixedLength(2)
    public Integer numeroLinha;

    @FieldFixedLength(140)
    public String mensagem;

    @FieldFixedLength(2)
    public Integer tipoDeFonte;

    @FieldFixedLength(78)
    public String cnab2;

    public CnabRemessaDetail240SegSBancoobImp12 comTipoImpressao(Integer tipoImpressao) {
        this.tipoImpressao = tipoImpressao;
        return this;
    }

    public CnabRemessaDetail240SegSBancoobImp12 comNumeroLinha(Integer numeroLinha) {
        this.numeroLinha = numeroLinha;
        return this;
    }

    public CnabRemessaDetail240SegSBancoobImp12 comMensagem(String mensagem) {
        this.mensagem = mensagem;
        return this;
    }

    public CnabRemessaDetail240SegSBancoobImp12 comTipoDeFonte(Integer tipoDeFonte) {
        this.tipoDeFonte = tipoDeFonte;
        return this;
    }

    public CnabRemessaDetail240SegSBancoobImp12 comCnab2(String cnab2) {
        this.cnab2 = cnab2;
        return this;
    }
}
