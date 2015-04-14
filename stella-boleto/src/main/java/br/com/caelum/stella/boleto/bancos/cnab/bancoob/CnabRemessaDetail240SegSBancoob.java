package br.com.caelum.stella.boleto.bancos.cnab.bancoob;

import br.com.caelum.stella.boleto.bancos.cnab.CnabRemessaDetail;
import org.coury.jfilehelpers.annotations.FieldAlign;
import org.coury.jfilehelpers.annotations.FieldFixedLength;
import org.coury.jfilehelpers.annotations.FixedLengthRecord;
import org.coury.jfilehelpers.enums.AlignMode;

/**
 * Created by rafaeldalbosco on 06/03/15.
 */
@FixedLengthRecord
public class CnabRemessaDetail240SegSBancoob extends CnabRemessaDetail {

    @FieldFixedLength(3)
    public Integer banco = 756;

    @FieldFixedLength(4)
    public Integer lote;

    @FieldFixedLength(1)
    public Integer idRegistro = 3;

    @FieldFixedLength(5)
    public Integer numeroRegistro;

    @FieldFixedLength(1)
    public String segmento = "S";

    @FieldFixedLength(1)
    public String cnab;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(2)
    public Integer codigoMovimento = 1;

    public CnabRemessaDetail240SegSBancoob comBanco(Integer banco) {
        this.banco = banco;
        return this;
    }

    public CnabRemessaDetail240SegSBancoob comLote(Integer lote) {
        this.lote = lote;
        return this;
    }

    public CnabRemessaDetail240SegSBancoob comIdRegistro(Integer idRegistro) {
        this.idRegistro = idRegistro;
        return this;
    }

    public CnabRemessaDetail240SegSBancoob comNumeroRegistro(Integer numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
        return this;
    }

    public CnabRemessaDetail240SegSBancoob comSegmento(String segmento) {
        this.segmento = segmento;
        return this;
    }

    public CnabRemessaDetail240SegSBancoob comCnab(String cnab) {
        this.cnab = cnab;
        return this;
    }

    public CnabRemessaDetail240SegSBancoob comCodigoMovimento(Integer codigoMovimento) {
        this.codigoMovimento = codigoMovimento;
        return this;
    }
}
