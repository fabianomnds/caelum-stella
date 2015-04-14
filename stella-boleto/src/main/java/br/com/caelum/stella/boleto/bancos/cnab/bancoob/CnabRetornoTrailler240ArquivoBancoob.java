package br.com.caelum.stella.boleto.bancos.cnab.bancoob;

import br.com.caelum.stella.boleto.bancos.cnab.CnabRetornoTrailler;
import org.coury.jfilehelpers.annotations.FieldFixedLength;
import org.coury.jfilehelpers.annotations.FixedLengthRecord;

/**
 * Created by rafaeldalbosco on 10/03/15.
 */
@FixedLengthRecord
public class CnabRetornoTrailler240ArquivoBancoob extends CnabRetornoTrailler {

    @FieldFixedLength(3)
    public Integer banco = 756;

    @FieldFixedLength(4)
    public Integer lote = 9999;

    @FieldFixedLength(1)
    public Integer registro = 9;

    @FieldFixedLength(9)
    public String cnab;

    @FieldFixedLength(6)
    public Integer quantidadeLotes;

    @FieldFixedLength(6)
    public Integer quantidadeRegistro;

    @FieldFixedLength(6)
    public Integer quantidadeContas;

    @FieldFixedLength(205)
    public String cnab1;

    public CnabRetornoTrailler240ArquivoBancoob comBanco(Integer banco) {
        this.banco = banco;
        return this;
    }

    public CnabRetornoTrailler240ArquivoBancoob comLote(Integer lote) {
        this.lote = lote;
        return this;
    }

    public CnabRetornoTrailler240ArquivoBancoob comRegistro(Integer registro) {
        this.registro = registro;
        return this;
    }

    public CnabRetornoTrailler240ArquivoBancoob comCnab(String cnab) {
        this.cnab = cnab;
        return this;
    }

    public CnabRetornoTrailler240ArquivoBancoob comQuantidadeLotes(Integer quantidadeLotes) {
        this.quantidadeLotes = quantidadeLotes;
        return this;
    }

    public CnabRetornoTrailler240ArquivoBancoob comQuantidadeRegistro(Integer quantidadeRegistro) {
        this.quantidadeRegistro = quantidadeRegistro;
        return this;
    }

    public CnabRetornoTrailler240ArquivoBancoob comQuantidadeContas(Integer quantidadeContas) {
        this.quantidadeContas = quantidadeContas;
        return this;
    }

    public CnabRetornoTrailler240ArquivoBancoob comCnab1(String cnab1) {
        this.cnab1 = cnab1;
        return this;
    }
}
