package br.com.caelum.stella.boleto.bancos.cnab.bancoob;

import org.coury.jfilehelpers.annotations.FieldFixedLength;
import org.coury.jfilehelpers.annotations.FixedLengthRecord;

/**
 * Created by rafaeldalbosco on 07/03/15.
 */
@FixedLengthRecord
public class CnabRemessaDetail240SegSBancoobImp3 extends CnabRemessaDetail240SegSBancoob {
    
    @FieldFixedLength(1)
    public Integer tipoImpressao;

    @FieldFixedLength(40)
    public String informacao5;

    @FieldFixedLength(40)
    public String informacao6;

    @FieldFixedLength(40)
    public String informacao7;

    @FieldFixedLength(40)
    public String informacao8;

    @FieldFixedLength(40)
    public String informacao9;

    @FieldFixedLength(22)
    public String cnab2;

    public CnabRemessaDetail240SegSBancoobImp3 comTipoImpressao(Integer tipoImpressao) {
        this.tipoImpressao = tipoImpressao;
        return this;
    }

    public CnabRemessaDetail240SegSBancoobImp3 comInformacao5(String informacao5) {
        this.informacao5 = informacao5;
        return this;
    }

    public CnabRemessaDetail240SegSBancoobImp3 comInformacao6(String informacao6) {
        this.informacao6 = informacao6;
        return this;
    }

    public CnabRemessaDetail240SegSBancoobImp3 comInformacao7(String informacao7) {
        this.informacao7 = informacao7;
        return this;
    }

    public CnabRemessaDetail240SegSBancoobImp3 comInformacao8(String informacao8) {
        this.informacao8 = informacao8;
        return this;
    }

    public CnabRemessaDetail240SegSBancoobImp3 comInformacao9(String informacao9) {
        this.informacao9 = informacao9;
        return this;
    }

    public CnabRemessaDetail240SegSBancoobImp3 comCnab2(String cnab2) {
        this.cnab2 = cnab2;
        return this;
    }
}
