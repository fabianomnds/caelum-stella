package br.com.caelum.stella.boleto.bancos.cnab.bancoob;

import br.com.caelum.stella.boleto.bancos.cnab.CnabRemessaTrailler;
import org.coury.jfilehelpers.annotations.FieldAlign;
import org.coury.jfilehelpers.annotations.FieldConverter;
import org.coury.jfilehelpers.annotations.FieldFixedLength;
import org.coury.jfilehelpers.annotations.FixedLengthRecord;
import org.coury.jfilehelpers.enums.AlignMode;
import org.coury.jfilehelpers.enums.ConverterKind;

/**
 * Created by rafaeldalbosco on 09/03/15.
 */
@FixedLengthRecord
public class CnabRemessaTraillerLote240Bancoob extends CnabRemessaTrailler {

    @FieldFixedLength(3)
    public Integer banco = 756;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(4)
    public Integer lote;

    @FieldFixedLength(1)
    public Integer idRegistro = 5;

    @FieldFixedLength(9)
    public String cnab;

    @FieldFixedLength(6)
    public Integer quantidadeRegistros;

    @FieldFixedLength(6)
    public Integer quantidadeTitulosCobrancaSimples;

    @FieldConverter(converter = ConverterKind.Double, format = "0000000000000.00")
    @FieldFixedLength(15)
    public Double valorTotalTitulosCobrancaSimples;

    @FieldFixedLength(6)
    public Integer quantidadeTitulosCobrancaVinculada;

    @FieldConverter(converter = ConverterKind.Double, format = "0000000000000.00")
    @FieldFixedLength(15)
    public Double valorTotalTitulosCobrancaVinculada;

    @FieldFixedLength(6)
    public Integer quantidadeTitulosCobrancaCaucionada;

    @FieldConverter(converter = ConverterKind.Double, format = "0000000000000.00")
    @FieldFixedLength(15)
    public Double valorTotalTitulosCobrancaCaucionada;

    @FieldFixedLength(6)
    public Integer quantidadeTitulosCobrancaDescontada;

    @FieldConverter(converter = ConverterKind.Double, format = "0000000000000.00")
    @FieldFixedLength(15)
    public Double valorTotalTitulosCobrancaDescontada;

    @FieldFixedLength(8)
    public String nroAviso;

    @FieldFixedLength(117)
    public String cnab1;

    public CnabRemessaTraillerLote240Bancoob comBanco(Integer banco) {
        this.banco = banco;
        return this;
    }

    public CnabRemessaTraillerLote240Bancoob comLote(Integer lote) {
        this.lote = lote;
        return this;
    }

    public CnabRemessaTraillerLote240Bancoob comIdRegistro(Integer idRegistro) {
        this.idRegistro = idRegistro;
        return this;
    }

    public CnabRemessaTraillerLote240Bancoob comCnab(String cnab) {
        this.cnab = cnab;
        return this;
    }

    public CnabRemessaTraillerLote240Bancoob comQuantidadeRegistros(Integer quantidadeRegistros) {
        this.quantidadeRegistros = quantidadeRegistros;
        return this;
    }

    public CnabRemessaTraillerLote240Bancoob comQuantidadeTitulosCobrancaSimples(Integer quantidadeTitulosCobrancaSimples) {
        this.quantidadeTitulosCobrancaSimples = quantidadeTitulosCobrancaSimples;
        return this;
    }

    public CnabRemessaTraillerLote240Bancoob comValorTotalTitulosCobrancaSimples(Double valorTotalTitulosCobrancaSimples) {
        this.valorTotalTitulosCobrancaSimples = valorTotalTitulosCobrancaSimples;
        return this;
    }

    public CnabRemessaTraillerLote240Bancoob comQuantidadeTitulosCobrancaVinculada(Integer quantidadeTitulosCobrancaVinculada) {
        this.quantidadeTitulosCobrancaVinculada = quantidadeTitulosCobrancaVinculada;
        return this;
    }

    public CnabRemessaTraillerLote240Bancoob comValorTotalTitulosCobrancaVinculada(Double valorTotalTitulosCobrancaVinculada) {
        this.valorTotalTitulosCobrancaVinculada = valorTotalTitulosCobrancaVinculada;
        return this;
    }

    public CnabRemessaTraillerLote240Bancoob comQuantidadeTitulosCobrancaCaucionada(Integer quantidadeTitulosCobrancaCaucionada) {
        this.quantidadeTitulosCobrancaCaucionada = quantidadeTitulosCobrancaCaucionada;
        return this;
    }

    public CnabRemessaTraillerLote240Bancoob comValorTotalTitulosCobrancaCaucionada(Double valorTotalTitulosCobrancaCaucionada) {
        this.valorTotalTitulosCobrancaCaucionada = valorTotalTitulosCobrancaCaucionada;
        return this;
    }

    public CnabRemessaTraillerLote240Bancoob comQuantidadeTitulosCobrancaDescontada(Integer quantidadeTitulosCobrancaDescontada) {
        this.quantidadeTitulosCobrancaDescontada = quantidadeTitulosCobrancaDescontada;
        return this;
    }

    public CnabRemessaTraillerLote240Bancoob comValorTotalTitulosCobrancaDescontada(Double valorTotalTitulosCobrancaDescontada) {
        this.valorTotalTitulosCobrancaDescontada = valorTotalTitulosCobrancaDescontada;
        return this;
    }

    public CnabRemessaTraillerLote240Bancoob comNroAviso(String nroAviso) {
        this.nroAviso = nroAviso;
        return this;
    }

    public CnabRemessaTraillerLote240Bancoob comCnab1(String cnab1) {
        this.cnab1 = cnab1;
        return this;
    }

}
