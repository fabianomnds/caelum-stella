package br.com.caelum.stella.boleto.bancos.cnab.bancoob;

import br.com.caelum.stella.boleto.bancos.cnab.CnabRetornoDetail;
import org.coury.jfilehelpers.annotations.FieldAlign;
import org.coury.jfilehelpers.annotations.FieldConverter;
import org.coury.jfilehelpers.annotations.FieldFixedLength;
import org.coury.jfilehelpers.annotations.FixedLengthRecord;
import org.coury.jfilehelpers.enums.AlignMode;
import org.coury.jfilehelpers.enums.ConverterKind;

import java.util.Date;

/**
 * Created by rafaeldalbosco on 10/03/15.
 */
@FixedLengthRecord
public class CnabRetornoDetail240SegUBancoob extends CnabRetornoDetail{

    @FieldFixedLength(3)
    public Integer banco = 756;

    @FieldFixedLength(4)
    public Integer lote;

    @FieldFixedLength(1)
    public Integer registro = 3;

    @FieldFixedLength(5)
    public Integer numeroRemessa;

    @FieldFixedLength(1)
    public String segmento = "U";

    @FieldFixedLength(1)
    public String cnab;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(2)
    public Integer codigoMovimentoRetorno;

    @FieldConverter(converter = ConverterKind.Double, format = "0000000000000.00")
    @FieldFixedLength(15)
    public Double acrescimo;

    @FieldConverter(converter = ConverterKind.Double, format = "0000000000000.00")
    @FieldFixedLength(15)
    public Double desconto;

    @FieldConverter(converter = ConverterKind.Double, format = "0000000000000.00")
    @FieldFixedLength(15)
    public Double abatimento;

    @FieldConverter(converter = ConverterKind.Double, format = "0000000000000.00")
    @FieldFixedLength(15)
    public Double valorIOF;

    @FieldConverter(converter = ConverterKind.Double, format = "0000000000000.00")
    @FieldFixedLength(15)
    public Double valorPago;

    @FieldConverter(converter = ConverterKind.Double, format = "0000000000000.00")
    @FieldFixedLength(15)
    public Double valorLiquido;

    @FieldConverter(converter = ConverterKind.Double, format = "0000000000000.00")
    @FieldFixedLength(15)
    public Double outrasDespesas;

    @FieldConverter(converter = ConverterKind.Double, format = "0000000000000.00")
    @FieldFixedLength(15)
    public Double outrosCreditos;

    @FieldConverter(converter = ConverterKind.Date, format = "ddMMyyyy")
    @FieldFixedLength(8)
    public Date dataOcorrencia;

    @FieldConverter(converter = ConverterKind.Date, format = "ddMMyyyy")
    @FieldFixedLength(8)
    public Date dataCredito;

    @FieldFixedLength(4)
    public String codigoOcorrencia;

    @FieldConverter(converter = ConverterKind.Date, format = "ddMMyyyy")
    @FieldFixedLength(8)
    public Date dataOcorrenciaPagador;

    @FieldConverter(converter = ConverterKind.Double, format = "0000000000000.00")
    @FieldFixedLength(15)
    public Double valorOcorrenciaPagador;

    @FieldFixedLength(30)
    public String complementoOcorrenciaPagador;

    @FieldFixedLength(3)
    public Integer codigoBancoCorrespondente = 756;

    @FieldFixedLength(20)
    public String nNumeroBancoCorrespondente;

    @FieldFixedLength(7)
    public String cnab1;

    public CnabRetornoDetail240SegUBancoob comBanco(Integer banco) {
        this.banco = banco;
        return this;
    }

    public CnabRetornoDetail240SegUBancoob comLote(Integer lote) {
        this.lote = lote;
        return this;
    }

    public CnabRetornoDetail240SegUBancoob comRegistro(Integer registro) {
        this.registro = registro;
        return this;
    }

    public CnabRetornoDetail240SegUBancoob comNumeroRemessa(Integer numeroRemessa) {
        this.numeroRemessa = numeroRemessa;
        return this;
    }

    public CnabRetornoDetail240SegUBancoob comSegmento(String segmento) {
        this.segmento = segmento;
        return this;
    }

    public CnabRetornoDetail240SegUBancoob comCnab(String cnab) {
        this.cnab = cnab;
        return this;
    }

    public CnabRetornoDetail240SegUBancoob comCodigoMovimentoRetorno(Integer codigoMovimentoRetorno) {
        this.codigoMovimentoRetorno = codigoMovimentoRetorno;
        return this;
    }

    public CnabRetornoDetail240SegUBancoob comAcrescimo(Double acrescimo) {
        this.acrescimo = acrescimo;
        return this;
    }

    public CnabRetornoDetail240SegUBancoob comDesconto(Double desconto) {
        this.desconto = desconto;
        return this;
    }

    public CnabRetornoDetail240SegUBancoob comAbatimento(Double abatimento) {
        this.abatimento = abatimento;
        return this;
    }

    public CnabRetornoDetail240SegUBancoob comValorIOF(Double valorIOF) {
        this.valorIOF = valorIOF;
        return this;
    }

    public CnabRetornoDetail240SegUBancoob comValorPago(Double valorPago) {
        this.valorPago = valorPago;
        return this;
    }

    public CnabRetornoDetail240SegUBancoob comValorLiquido(Double valorLiquido) {
        this.valorLiquido = valorLiquido;
        return this;
    }

    public CnabRetornoDetail240SegUBancoob comOutrasDespesas(Double outrasDespesas) {
        this.outrasDespesas = outrasDespesas;
        return this;
    }

    public CnabRetornoDetail240SegUBancoob comOutrosCreditos(Double outrosCreditos) {
        this.outrosCreditos = outrosCreditos;
        return this;
    }

    public CnabRetornoDetail240SegUBancoob comDataOcorrencia(Date dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
        return this;
    }

    public CnabRetornoDetail240SegUBancoob comDataCredito(Date dataCredito) {
        this.dataCredito = dataCredito;
        return this;
    }

    public CnabRetornoDetail240SegUBancoob comCodigoOcorrencia(String codigoOcorrencia) {
        this.codigoOcorrencia = codigoOcorrencia;
        return this;
    }

    public CnabRetornoDetail240SegUBancoob comDataOcorrenciaPagador(Date dataOcorrenciaPagador) {
        this.dataOcorrenciaPagador = dataOcorrenciaPagador;
        return this;
    }

    public CnabRetornoDetail240SegUBancoob comValorOcorrenciaPagador(Double valorOcorrenciaPagador) {
        this.valorOcorrenciaPagador = valorOcorrenciaPagador;
        return this;
    }

    public CnabRetornoDetail240SegUBancoob comComplementoOcorrenciaPagador(String complementoOcorrenciaPagador) {
        this.complementoOcorrenciaPagador = complementoOcorrenciaPagador;
        return this;
    }

    public CnabRetornoDetail240SegUBancoob comCodigoBancoCorrespondente(Integer codigoBancoCorrespondente) {
        this.codigoBancoCorrespondente = codigoBancoCorrespondente;
        return this;
    }

    public CnabRetornoDetail240SegUBancoob comnNumeroBancoCorrespondente(String nNumeroBancoCorrespondente) {
        this.nNumeroBancoCorrespondente = nNumeroBancoCorrespondente;
        return this;
    }

    public CnabRetornoDetail240SegUBancoob comCnab1(String cnab1) {
        this.cnab1 = cnab1;
        return this;
    }
}
