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
 * Created by rafaeldalbosco on 05/03/15.
 */
@FixedLengthRecord
public class CnabRemessaDetail240SegPBancoob extends CnabRemessaDetail {

    @FieldFixedLength(3)
    public Integer banco = 756;

    @FieldFixedLength(4)
    public Integer lote;

    @FieldFixedLength(1)
    public Integer registro = 3;

    @FieldFixedLength(5)
    public Integer numeroRegistro;

    @FieldFixedLength(1)
    public String segmento = "P";

    @FieldFixedLength(1)
    public String cnab;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(2)
    public Integer codigoMovimento = 1;

    @FieldFixedLength(3)
    public Integer agencia;

    @FieldFixedLength(1)
    public String digitoAgencia;

    @FieldFixedLength(12)
    public Integer conta;

    @FieldFixedLength(1)
    public String digitoConta;

    @FieldFixedLength(1)
    public String digitoAgenciaConta;

    @FieldFixedLength(20)
    public String nossoNumero;

    @FieldFixedLength(1)
    public Integer codigoCarteira;

    @FieldFixedLength(1)
    public Integer formaCadastroTitulo = 0;

    @FieldFixedLength(1)
    public String tipoDocumento;

    @FieldFixedLength(1)
    public Integer emissaoBoleto;

    @FieldFixedLength(1)
    public String distribuicaoBoleto;

    @FieldFixedLength(3)
    public String numeroDocumento;

    @FieldConverter(converter = ConverterKind.Date, format = "ddMMyyyy")
    @FieldFixedLength(8)
    public Date dataVencimento;

    @FieldConverter(converter = ConverterKind.Double, format = "00000000000.00")
    @FieldFixedLength(13)
    public Double valorTitulo;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(5)
    public Integer agenciaCobradora;

    @FieldFixedLength(1)
    public String digitoAgenciaCobradora;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(2)
    public Integer especieTitulo;

    @FieldFixedLength(1)
    public String aceite;

    @FieldConverter(converter = ConverterKind.Date, format = "ddMMyyyy")
    @FieldFixedLength(8)
    public Date dataEmissao;

    @FieldFixedLength(1)
    public Integer codigoJuroMora;

    @FieldConverter(converter = ConverterKind.Date, format = "ddMMyyyy")
    @FieldFixedLength(8)
    public Date dataJuroMora;

    @FieldConverter(converter = ConverterKind.Double, format = "00000000000.00")
    @FieldFixedLength(13)
    public Double juroMora;

    @FieldFixedLength(1)
    public Integer codigoDesconto;

    @FieldConverter(converter = ConverterKind.Date, format = "ddMMyyyy")
    @FieldFixedLength(8)
    public Date dataDesconto;

    @FieldConverter(converter = ConverterKind.Double, format = "00000000000.00")
    @FieldFixedLength(13)
    public Double desconto;

    @FieldConverter(converter = ConverterKind.Double, format = "00000000000.00")
    @FieldFixedLength(13)
    public Double valorIof;

    @FieldConverter(converter = ConverterKind.Double, format = "00000000000.00")
    @FieldFixedLength(13)
    public Double valorAbatimento;

    @FieldFixedLength(25)
    public String usoEmpresaBeneficiario;

    @FieldFixedLength(1)
    public Integer codigoProteste = 1;

    @FieldFixedLength(2)
    public Integer prazoProtesto;

    @FieldFixedLength(1)
    public Integer codigoBaixaDevolucao = 0;

    @FieldFixedLength(3)
    public String prazoBaixaDevolucao;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(2)
    public Integer codigoMoeda;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(10)
    public Integer numeroContrato;

    @FieldFixedLength(1)
    public String cnab1;

    public CnabRemessaDetail240SegPBancoob comBanco(Integer banco) {
        this.banco = banco;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comLote(Integer lote) {
        this.lote = lote;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comRegistro(Integer registro) {
        this.registro = registro;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comNumeroRegistro(Integer numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comSegmento(String segmento) {
        this.segmento = segmento;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comCnab(String cnab) {
        this.cnab = cnab;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comCodigoMovimento(Integer codigoMovimento) {
        this.codigoMovimento = codigoMovimento;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comAgencia(Integer agencia) {
        this.agencia = agencia;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comDigitoAgencia(String digitoAgencia) {
        this.digitoAgencia = digitoAgencia;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comConta(Integer conta) {
        this.conta = conta;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comDigitoConta(String digitoConta) {
        this.digitoConta = digitoConta;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comDigitoAgenciaConta(String digitoAgenciaConta) {
        this.digitoAgenciaConta = digitoAgenciaConta;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comNossoNumero(String nossoNumero) {
        this.nossoNumero = nossoNumero;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comCodigoCarteira(Integer codigoCarteira) {
        this.codigoCarteira = codigoCarteira;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comFormaCadastroTitulo(Integer formaCadastroTitulo) {
        this.formaCadastroTitulo = formaCadastroTitulo;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comEmissaoBoleto(Integer emissaoBoleto) {
        this.emissaoBoleto = emissaoBoleto;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comDistribuicaoBoleto(String distribuicaoBoleto) {
        this.distribuicaoBoleto = distribuicaoBoleto;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comValorTitulo(Double valorTitulo) {
        this.valorTitulo = valorTitulo;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comAgenciaCobradora(Integer agenciaCobradora) {
        this.agenciaCobradora = agenciaCobradora;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comDigitoAgenciaCobradora(String digitoAgenciaCobradora) {
        this.digitoAgenciaCobradora = digitoAgenciaCobradora;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comEspecieTitulo(Integer especieTitulo) {
        this.especieTitulo = especieTitulo;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comAceite(String aceite) {
        this.aceite = aceite;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comCodigoJuroMora(Integer codigoJuroMora) {
        this.codigoJuroMora = codigoJuroMora;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comDataJuroMora(Date dataJuroMora) {
        this.dataJuroMora = dataJuroMora;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comJuroMora(Double juroMora) {
        this.juroMora = juroMora;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comCodigoDesconto(Integer codigoDesconto) {
        this.codigoDesconto = codigoDesconto;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comDataDesconto(Date dataDesconto) {
        this.dataDesconto = dataDesconto;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comDesconto(Double desconto) {
        this.desconto = desconto;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comValorIof(Double valorIof) {
        this.valorIof = valorIof;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comValorAbatimento(Double valorAbatimento) {
        this.valorAbatimento = valorAbatimento;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comUsoEmpresaBeneficiario(String usoEmpresaBeneficiario) {
        this.usoEmpresaBeneficiario = usoEmpresaBeneficiario;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comCodigoProteste(Integer codigoProteste) {
        this.codigoProteste = codigoProteste;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comPrazoProtesto(Integer prazoProtesto) {
        this.prazoProtesto = prazoProtesto;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comCodigoBaixaDevolucao(Integer codigoBaixaDevolucao) {
        this.codigoBaixaDevolucao = codigoBaixaDevolucao;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comPrazoBaixaDevolucao(String prazoBaixaDevolucao) {
        this.prazoBaixaDevolucao = prazoBaixaDevolucao;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comCodigoMoeda(Integer codigoMoeda) {
        this.codigoMoeda = codigoMoeda;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comNumeroContrato(Integer numeroContrato) {
        this.numeroContrato = numeroContrato;
        return this;
    }

    public CnabRemessaDetail240SegPBancoob comCnab1(String cnab1) {
        this.cnab1 = cnab1;
        return this;
    }
}
