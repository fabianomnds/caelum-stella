package br.com.caelum.stella.boleto.bancos.cnab.bancoob;

import br.com.caelum.stella.boleto.bancos.cnab.CnabRemessaTrailler;
import org.coury.jfilehelpers.annotations.FieldFixedLength;
import org.coury.jfilehelpers.annotations.FixedLengthRecord;

/**
 * Created by rafaeldalbosco on 09/03/15.
 */
@FixedLengthRecord
public class CnabRemessaTraillerArquivo240Bancoob extends CnabRemessaTrailler {
    
    @FieldFixedLength(3)
    public Integer banco = 756;
    
    @FieldFixedLength(4)
    public Integer lote = 999;
    
    @FieldFixedLength(1)
    public Integer idRegistro = 9;
    
    @FieldFixedLength(9)
    public String cnab;
    
    @FieldFixedLength(6)
    public Integer quantidadeLotes;
    
    @FieldFixedLength(6)
    public Integer quantidadeRegistros;
    
    @FieldFixedLength(6)
    public Integer quantidadeContas;
    
    @FieldFixedLength(205)
    public String cnab1;

    public CnabRemessaTraillerArquivo240Bancoob comBanco(Integer banco) {
        this.banco = banco;
        return this;
    }

    public CnabRemessaTraillerArquivo240Bancoob comLote(Integer lote) {
        this.lote = lote;
        return this;
    }

    public CnabRemessaTraillerArquivo240Bancoob comIdRegistro(Integer idRegistro) {
        this.idRegistro = idRegistro;
        return this;
    }

    public CnabRemessaTraillerArquivo240Bancoob comCnab(String cnab) {
        this.cnab = cnab;
        return this;
    }

    public CnabRemessaTraillerArquivo240Bancoob comQuantidadeLotes(Integer quantidadeLotes) {
        this.quantidadeLotes = quantidadeLotes;
        return this;
    }

    public CnabRemessaTraillerArquivo240Bancoob comQuantidadeRegistros(Integer quantidadeRegistros) {
        this.quantidadeRegistros = quantidadeRegistros;
        return this;
    }

    public CnabRemessaTraillerArquivo240Bancoob comQuantidadeContas(Integer quantidadeContas) {
        this.quantidadeContas = quantidadeContas;
        return this;
    }

    public CnabRemessaTraillerArquivo240Bancoob comCnab1(String cnab1) {
        this.cnab1 = cnab1;
        return this;
    }

}
