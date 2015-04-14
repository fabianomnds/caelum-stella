package br.com.caelum.stella.boleto.bancos.cnab.bancoob;

import br.com.caelum.stella.boleto.bancos.cnab.CnabRetornoTrailler;
import org.coury.jfilehelpers.annotations.FieldConverter;
import org.coury.jfilehelpers.annotations.FieldFixedLength;
import org.coury.jfilehelpers.annotations.FixedLengthRecord;
import org.coury.jfilehelpers.enums.ConverterKind;

/**
 * Created by rafaeldalbosco on 10/03/15.
 */
@FixedLengthRecord
public class CnabRetornoTrailler240LoteBancoob extends CnabRetornoTrailler {

    @FieldFixedLength(3)
    public Integer banco = 756;

    @FieldFixedLength(4)
    public Integer lote;

    @FieldFixedLength(1)
    public Integer registro = 5;

    @FieldFixedLength(9)
    public String cnab;

    @FieldFixedLength(6)
    public Integer quantidadeRegistros;

    @FieldFixedLength(6)
    public Integer quantidadeTitulosCobSimples;

    @FieldConverter(converter = ConverterKind.Double, format = "0000000000000.00")
    @FieldFixedLength(15)
    public Double valorTitulosCobSimples;

    @FieldFixedLength(6)
    public Integer quantidadeTitulosCobVinculada;

    @FieldConverter(converter = ConverterKind.Double, format = "0000000000000.00")
    @FieldFixedLength(15)
    public Double valorTitulosCobVinculada;

    @FieldFixedLength(6)
    public Integer quantidadeTitulosCobCausionada;

    @FieldConverter(converter = ConverterKind.Double, format = "0000000000000.00")
    @FieldFixedLength(15)
    public Double valorTitulosCobCausionada;

    @FieldFixedLength(6)
    public Integer quantidadeTitulosCobDescontada;

    @FieldConverter(converter = ConverterKind.Double, format = "0000000000000.00")
    @FieldFixedLength(15)
    public Double valorTitulosCobDescontada;

    @FieldFixedLength(8)
    public String numeroAviso;

    @FieldFixedLength(117)
    public String cnab1;

    public CnabRetornoTrailler240LoteBancoob comBanco(Integer banco) {
        this.banco = banco;
        return this;
    }

    public CnabRetornoTrailler240LoteBancoob comLote(Integer lote) {
        this.lote = lote;
        return this;
    }

    public CnabRetornoTrailler240LoteBancoob comRegistro(Integer registro) {
        this.registro = registro;
        return this;
    }

    public CnabRetornoTrailler240LoteBancoob comCnab(String cnab) {
        this.cnab = cnab;
        return this;
    }

    public CnabRetornoTrailler240LoteBancoob comQuantidadeRegistros(Integer quantidadeRegistros) {
        this.quantidadeRegistros = quantidadeRegistros;
        return this;
    }

    public CnabRetornoTrailler240LoteBancoob comQuantidadeTitulosCobSimples(Integer quantidadeTitulosCobSimples) {
        this.quantidadeTitulosCobSimples = quantidadeTitulosCobSimples;
        return this;
    }

    public CnabRetornoTrailler240LoteBancoob comValorTitulosCobSimples(Double valorTitulosCobSimples) {
        this.valorTitulosCobSimples = valorTitulosCobSimples;
        return this;
    }

    public CnabRetornoTrailler240LoteBancoob comQuantidadeTitulosCobVinculada(Integer quantidadeTitulosCobVinculada) {
        this.quantidadeTitulosCobVinculada = quantidadeTitulosCobVinculada;
        return this;
    }

    public CnabRetornoTrailler240LoteBancoob comValorTitulosCobVinculada(Double valorTitulosCobVinculada) {
        this.valorTitulosCobVinculada = valorTitulosCobVinculada;
        return this;
    }

    public CnabRetornoTrailler240LoteBancoob comQuantidadeTitulosCobCausionada(Integer quantidadeTitulosCobCausionada) {
        this.quantidadeTitulosCobCausionada = quantidadeTitulosCobCausionada;
        return this;
    }

    public CnabRetornoTrailler240LoteBancoob comValorTitulosCobCausionada(Double valorTitulosCobCausionada) {
        this.valorTitulosCobCausionada = valorTitulosCobCausionada;
        return this;
    }

    public CnabRetornoTrailler240LoteBancoob comQuantidadeTitulosCobDescontada(Integer quantidadeTitulosCobDescontada) {
        this.quantidadeTitulosCobDescontada = quantidadeTitulosCobDescontada;
        return this;
    }

    public CnabRetornoTrailler240LoteBancoob comValorTitulosCobDescontada(Double valorTitulosCobDescontada) {
        this.valorTitulosCobDescontada = valorTitulosCobDescontada;
        return this;
    }

    public CnabRetornoTrailler240LoteBancoob comNumeroAviso(String numeroAviso) {
        this.numeroAviso = numeroAviso;
        return this;
    }

    public CnabRetornoTrailler240LoteBancoob comCnab1(String cnab1) {
        this.cnab1 = cnab1;
        return this;
    }
}
