package br.com.caelum.stella.boleto.bancos.cnab.bancoob;

import br.com.caelum.stella.boleto.bancos.cnab.CnabRemessaDetail;
import org.coury.jfilehelpers.annotations.FieldAlign;
import org.coury.jfilehelpers.annotations.FieldConverter;
import org.coury.jfilehelpers.annotations.FieldFixedLength;
import org.coury.jfilehelpers.annotations.FixedLengthRecord;
import org.coury.jfilehelpers.enums.AlignMode;
import org.coury.jfilehelpers.enums.ConverterKind;

import java.util.Date;

/**
 * Created by rafaeldalbosco on 06/03/15.
 */
@FixedLengthRecord
public class CnabRemessaDetail240SegRBancoob extends CnabRemessaDetail {

    @FieldFixedLength(3)
    public Integer banco = 756;

    @FieldFixedLength(4)
    public Integer lote;

    @FieldFixedLength(1)
    public Integer idRegistro = 3;

    @FieldFixedLength(5)
    public Integer numeroRegistro;

    @FieldFixedLength(1)
    public String segmento = "R";

    @FieldFixedLength(1)
    public String cnab;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(2)
    public Integer codigoMovimento = 1;

    @FieldFixedLength(1)
    public Integer codigoDesconto2;

    @FieldConverter(converter = ConverterKind.Date, format = "ddMMyyyy")
    @FieldFixedLength(8)
    public Date dataDesconto2;

    @FieldConverter(converter = ConverterKind.Double, format = "00000000000.00")
    @FieldFixedLength(13)
    public Double valorDesconto2;

    @FieldFixedLength(1)
    public Integer codigoDesconto3;

    @FieldConverter(converter = ConverterKind.Date, format = "ddMMyyyy")
    @FieldFixedLength(8)
    public Date dataDesconto3;

    @FieldConverter(converter = ConverterKind.Double, format = "00000000000.00")
    @FieldFixedLength(13)
    public Double valorDesconto3;

    @FieldFixedLength(1)
    public String codigoMulta;

    @FieldConverter(converter = ConverterKind.Date, format = "ddMMyyyy")
    @FieldFixedLength(8)
    public Date dataMulta;

    @FieldConverter(converter = ConverterKind.Double, format = "00000000000.00")
    @FieldFixedLength(13)
    public Double valorMulta;

    @FieldFixedLength(10)
    public String informacaoPagador;

    @FieldFixedLength(40)
    public String informacao3;

    @FieldFixedLength(40)
    public String informacao4;

    @FieldFixedLength(20)
    public String cnab2;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(8)
    public Integer codigoOcorrenciaPagador = 0;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(3)
    public Integer bancoContaDebito = 0;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(5)
    public Integer agenciaDebito = 0;

    @FieldFixedLength(1)
    public String digitoAgenciaDebito;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(12)
    public Integer contaDebito = 0;

    @FieldFixedLength(1)
    public String digitoContaDebito;

    @FieldFixedLength(1)
    public Integer avisoDebitoAutomatico = 0;

    @FieldFixedLength(9)
    public String cnab3;

    public CnabRemessaDetail240SegRBancoob comBanco(Integer banco) {
        this.banco = banco;
        return this;
    }

    public CnabRemessaDetail240SegRBancoob comLote(Integer lote) {
        this.lote = lote;
        return this;
    }

    public CnabRemessaDetail240SegRBancoob comIdRegistro(Integer idRegistro) {
        this.idRegistro = idRegistro;
        return this;
    }

    public CnabRemessaDetail240SegRBancoob comNumeroRegistro(Integer numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
        return this;
    }

    public CnabRemessaDetail240SegRBancoob comSegmento(String segmento) {
        this.segmento = segmento;
        return this;
    }

    public CnabRemessaDetail240SegRBancoob comCnab(String cnab) {
        this.cnab = cnab;
        return this;
    }

    public CnabRemessaDetail240SegRBancoob comCodigoMovimento(Integer codigoMovimento) {
        this.codigoMovimento = codigoMovimento;
        return this;
    }

    public CnabRemessaDetail240SegRBancoob comCodigoDesconto2(Integer codigoDesconto2) {
        this.codigoDesconto2 = codigoDesconto2;
        return this;
    }

    public CnabRemessaDetail240SegRBancoob comDataDesconto2(Date dataDesconto2) {
        this.dataDesconto2 = dataDesconto2;
        return this;
    }

    public CnabRemessaDetail240SegRBancoob comValorDesconto2(Double valorDesconto2) {
        this.valorDesconto2 = valorDesconto2;
        return this;
    }

    public CnabRemessaDetail240SegRBancoob comCodigoDesconto3(Integer codigoDesconto3) {
        this.codigoDesconto3 = codigoDesconto3;
        return this;
    }

    public CnabRemessaDetail240SegRBancoob comDataDesconto3(Date dataDesconto3) {
        this.dataDesconto3 = dataDesconto3;
        return this;
    }

    public CnabRemessaDetail240SegRBancoob comInformacaoPagador(String informacaoPagador) {
        this.informacaoPagador = informacaoPagador;
        return this;
    }

    public CnabRemessaDetail240SegRBancoob comInformacao3(String informacao3) {
        this.informacao3 = informacao3;
        return this;
    }

    public CnabRemessaDetail240SegRBancoob comInformacao4(String informacao4) {
        this.informacao4 = informacao4;
        return this;
    }

    public CnabRemessaDetail240SegRBancoob comCnab2(String cnab2) {
        this.cnab2 = cnab2;
        return this;
    }

    public CnabRemessaDetail240SegRBancoob comCodigoOcorrenciaPagador(Integer codigoOcorrenciaPagador) {
        this.codigoOcorrenciaPagador = codigoOcorrenciaPagador;
        return this;
    }

    public CnabRemessaDetail240SegRBancoob comBancoContaDebito(Integer bancoContaDebito) {
        this.bancoContaDebito = bancoContaDebito;
        return this;
    }

    public CnabRemessaDetail240SegRBancoob comAgenciaDebito(Integer agenciaDebito) {
        this.agenciaDebito = agenciaDebito;
        return this;
    }

    public CnabRemessaDetail240SegRBancoob comDigitoAgenciaDebito(String digitoAgenciaDebito) {
        this.digitoAgenciaDebito = digitoAgenciaDebito;
        return this;
    }

    public CnabRemessaDetail240SegRBancoob comContaDebito(Integer contaDebito) {
        this.contaDebito = contaDebito;
        return this;
    }

    public CnabRemessaDetail240SegRBancoob comDigitoContaDebito(String digitoContaDebito) {
        this.digitoContaDebito = digitoContaDebito;
        return this;
    }

    public CnabRemessaDetail240SegRBancoob comAvisoDebitoAutomatico(Integer avisoDebitoAutomatico) {
        this.avisoDebitoAutomatico = avisoDebitoAutomatico;
        return this;
    }

    public CnabRemessaDetail240SegRBancoob comCnab3(String cnab3) {
        this.cnab3 = cnab3;
        return this;
    }

    public CnabRemessaDetail240SegRBancoob comValorDesconto3(Double valorDesconto3) {
        this.valorDesconto3 = valorDesconto3;
        return this;
    }

    public CnabRemessaDetail240SegRBancoob comCodigoMulta(String codigoMulta) {
        this.codigoMulta = codigoMulta;
        return this;
    }

    public CnabRemessaDetail240SegRBancoob comDataMulta(Date dataMulta) {
        this.dataMulta = dataMulta;
        return this;
    }

    public CnabRemessaDetail240SegRBancoob comValorMulta(Double valorMulta) {
        this.valorMulta = valorMulta;
        return this;
    }
}
