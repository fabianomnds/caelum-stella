package br.com.caelum.stella.boleto.bancos.cnab.bancoob;

import br.com.caelum.stella.boleto.bancos.cnab.CnabRetornoHeader;
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
public class CnabRetornoHeaderLote240Bancoob extends CnabRetornoHeader {

    @FieldFixedLength(3)
    public Integer banco = 756;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(4)
    public Integer lote;

    @FieldFixedLength(1)
    public Integer tipoRegistro = 1;

    @FieldFixedLength(1)
    public String tipoOperacao = "T";

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(2)
    public Integer tipoServico = 1;

    @FieldFixedLength(1)
    public String cnab;

    @FieldFixedLength(1)
    public Integer tipoInscricao;

    @FieldFixedLength(15)
    public Integer numeroInscricao;

    @FieldFixedLength(15)
    public Integer convenio;

    @FieldFixedLength(5)
    public Integer agencia;

    @FieldFixedLength(1)
    public String digitoAgencia;

    @FieldFixedLength(12)
    public Integer conta;

    @FieldFixedLength(1)
    public String digitoConta;

    @FieldFixedLength(1)
    public String digitoAgenciaConta;

    @FieldFixedLength(30)
    public String nomeEmpresa;

    @FieldFixedLength(40)
    public String informacao1;
    
    @FieldFixedLength(40)
    public String informacao2;
    
    @FieldFixedLength(8)
    public Integer numeroRemessaRetorno;
    
    @FieldConverter(converter = ConverterKind.Date, format = "ddMMyyyy")
    @FieldFixedLength(8)
    public Date dataGeracao;

    @FieldConverter(converter = ConverterKind.Date, format = "ddMMyyyy")
    @FieldFixedLength(8)
    public Date dataCredito;
    
    public String cnab2;

    public CnabRetornoHeaderLote240Bancoob comBanco(Integer banco) {
        this.banco = banco;
        return this;
    }

    public CnabRetornoHeaderLote240Bancoob comLote(Integer lote) {
        this.lote = lote;
        return this;
    }

    public CnabRetornoHeaderLote240Bancoob comTipoRegistro(Integer tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
        return this;
    }

    public CnabRetornoHeaderLote240Bancoob comTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
        return this;
    }

    public CnabRetornoHeaderLote240Bancoob comTipoServico(Integer tipoServico) {
        this.tipoServico = tipoServico;
        return this;
    }

    public CnabRetornoHeaderLote240Bancoob comCnab(String cnab) {
        this.cnab = cnab;
        return this;
    }

    public CnabRetornoHeaderLote240Bancoob comTipoInscricao(Integer tipoInscricao) {
        this.tipoInscricao = tipoInscricao;
        return this;
    }

    public CnabRetornoHeaderLote240Bancoob comNumeroInscricao(Integer numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
        return this;
    }

    public CnabRetornoHeaderLote240Bancoob comConvenio(Integer convenio) {
        this.convenio = convenio;
        return this;
    }

    public CnabRetornoHeaderLote240Bancoob comAgencia(Integer agencia) {
        this.agencia = agencia;
        return this;
    }

    public CnabRetornoHeaderLote240Bancoob comDigitoAgencia(String digitoAgencia) {
        this.digitoAgencia = digitoAgencia;
        return this;
    }

    public CnabRetornoHeaderLote240Bancoob comConta(Integer conta) {
        this.conta = conta;
        return this;
    }

    public CnabRetornoHeaderLote240Bancoob comDigitoConta(String digitoConta) {
        this.digitoConta = digitoConta;
        return this;
    }

    public CnabRetornoHeaderLote240Bancoob comDigitoAgenciaConta(String digitoAgenciaConta) {
        this.digitoAgenciaConta = digitoAgenciaConta;
        return this;
    }

    public CnabRetornoHeaderLote240Bancoob comNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        return this;
    }

    public CnabRetornoHeaderLote240Bancoob comInformacao1(String informacao1) {
        this.informacao1 = informacao1;
        return this;
    }

    public CnabRetornoHeaderLote240Bancoob comInformacao2(String informacao2) {
        this.informacao2 = informacao2;
        return this;
    }

    public CnabRetornoHeaderLote240Bancoob comNumeroRemessaRetorno(Integer numeroRemessaRetorno) {
        this.numeroRemessaRetorno = numeroRemessaRetorno;
        return this;
    }

    public CnabRetornoHeaderLote240Bancoob comDataGeracao(Date dataGeracao) {
        this.dataGeracao = dataGeracao;
        return this;
    }

    public CnabRetornoHeaderLote240Bancoob comDataCredito(Date dataCredito) {
        this.dataCredito = dataCredito;
        return this;
    }

    public CnabRetornoHeaderLote240Bancoob comCnab2(String cnab2) {
        this.cnab2 = cnab2;
        return this;
    }
}