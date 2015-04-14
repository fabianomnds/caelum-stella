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
public class CnabRetornoDetail240SegTBancoob extends CnabRetornoDetail {

    @FieldFixedLength(3)
    public Integer banco = 756;

    @FieldFixedLength(4)
    public Integer lote;

    @FieldFixedLength(1)
    public Integer registro = 3;

    @FieldFixedLength(5)
    public Integer numeroRegistro;

    @FieldFixedLength(1)
    public String segmento = "U";

    @FieldFixedLength(1)
    public String cnab;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(2)
    public Integer codigoMovimentoRetorno;

    @FieldFixedLength(5)
    public Integer agencia;

    @FieldFixedLength(1)
    public Integer digitoAgencia;

    @FieldFixedLength(12)
    public Integer conta;

    @FieldFixedLength(1)
    public Integer digitoConta;

    @FieldFixedLength(1)
    public Integer digitoAgenciaConta;

    @FieldFixedLength(20)
    public String nossoNumero;

    @FieldFixedLength(1)
    public Integer carteira;

    @FieldFixedLength(15)
    public String numeroDocumento;

    @FieldConverter(converter = ConverterKind.Date, format = "ddMMyyyy")
    @FieldFixedLength(8)
    public Date dataVencimento;

    @FieldConverter(converter = ConverterKind.Double, format = "0000000000000.00")
    @FieldFixedLength(15)
    public Double valorTitulo;
    
    @FieldFixedLength(3)
    public Integer bancoCobrador;
    
    @FieldFixedLength(5)
    public Integer agenciaCobrador;
    
    @FieldFixedLength(1)
    public Integer digitoAgenciaCobrador;
    
    @FieldFixedLength(25)
    public String identificacaoTitulo;
    
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(2)
    public Integer codigoMoeda;
    
    @FieldFixedLength(1)
    public Integer tipoInscricaoPagador;
    
    @FieldFixedLength(15)
    public Integer numeroInscricao;
    
    @FieldFixedLength(40)
    public String nomePagador;
    
    @FieldFixedLength(10)
    public String numeroContrato;

    @FieldConverter(converter = ConverterKind.Double, format = "0000000000000.00")
    @FieldFixedLength(15)
    public Double valorTarifasCustas;
    
    @FieldFixedLength(10)
    public String movimentoOcorrencia;
    
    @FieldFixedLength(17)
    public String cnab1;

    public CnabRetornoDetail240SegTBancoob comBanco(Integer banco) {
        this.banco = banco;
        return this;
    }

    public CnabRetornoDetail240SegTBancoob comLote(Integer lote) {
        this.lote = lote;
        return this;
    }

    public CnabRetornoDetail240SegTBancoob comRegistro(Integer registro) {
        this.registro = registro;
        return this;
    }

    public CnabRetornoDetail240SegTBancoob comNumeroRegistro(Integer numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
        return this;
    }

    public CnabRetornoDetail240SegTBancoob comSegmento(String segmento) {
        this.segmento = segmento;
        return this;
    }

    public CnabRetornoDetail240SegTBancoob comCnab(String cnab) {
        this.cnab = cnab;
        return this;
    }

    public CnabRetornoDetail240SegTBancoob comCodigoMovimentoRetorno(Integer codigoMovimentoRetorno) {
        this.codigoMovimentoRetorno = codigoMovimentoRetorno;
        return this;
    }

    public CnabRetornoDetail240SegTBancoob comAgencia(Integer agencia) {
        this.agencia = agencia;
        return this;
    }

    public CnabRetornoDetail240SegTBancoob comDigitoAgencia(Integer digitoAgencia) {
        this.digitoAgencia = digitoAgencia;
        return this;
    }

    public CnabRetornoDetail240SegTBancoob comIdentificacaoTitulo(String identificacaoTitulo) {
        this.identificacaoTitulo = identificacaoTitulo;
        return this;
    }

    public CnabRetornoDetail240SegTBancoob comCodigoMoeda(Integer codigoMoeda) {
        this.codigoMoeda = codigoMoeda;
        return this;
    }

    public CnabRetornoDetail240SegTBancoob comTipoInscricaoPagador(Integer tipoInscricaoPagador) {
        this.tipoInscricaoPagador = tipoInscricaoPagador;
        return this;
    }

    public CnabRetornoDetail240SegTBancoob comNumeroInscricao(Integer numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
        return this;
    }

    public CnabRetornoDetail240SegTBancoob comNomePagador(String nomePagador) {
        this.nomePagador = nomePagador;
        return this;
    }

    public CnabRetornoDetail240SegTBancoob comNumeroContrato(String numeroContrato) {
        this.numeroContrato = numeroContrato;
        return this;
    }

    public CnabRetornoDetail240SegTBancoob comValorTarifasCustas(Double valorTarifasCustas) {
        this.valorTarifasCustas = valorTarifasCustas;
        return this;
    }

    public CnabRetornoDetail240SegTBancoob comMovimentoOcorrencia(String movimentoOcorrencia) {
        this.movimentoOcorrencia = movimentoOcorrencia;
        return this;
    }

    public CnabRetornoDetail240SegTBancoob comCnab1(String cnab1) {
        this.cnab1 = cnab1;
        return this;
    }

    public CnabRetornoDetail240SegTBancoob comConta(Integer conta) {
        this.conta = conta;
        return this;
    }

    public CnabRetornoDetail240SegTBancoob comDigitoConta(Integer digitoConta) {
        this.digitoConta = digitoConta;
        return this;
    }

    public CnabRetornoDetail240SegTBancoob comDigitoAgenciaConta(Integer digitoAgenciaConta) {
        this.digitoAgenciaConta = digitoAgenciaConta;
        return this;
    }

    public CnabRetornoDetail240SegTBancoob comNossoNumero(String nossoNumero) {
        this.nossoNumero = nossoNumero;
        return this;
    }

    public CnabRetornoDetail240SegTBancoob comCarteira(Integer carteira) {
        this.carteira = carteira;
        return this;
    }

    public CnabRetornoDetail240SegTBancoob comNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
        return this;
    }

    public CnabRetornoDetail240SegTBancoob comDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
        return this;
    }

    public CnabRetornoDetail240SegTBancoob comValorTitulo(Double valorTitulo) {
        this.valorTitulo = valorTitulo;
        return this;
    }

    public CnabRetornoDetail240SegTBancoob comBancoCobrador(Integer bancoCobrador) {
        this.bancoCobrador = bancoCobrador;
        return this;
    }
}
