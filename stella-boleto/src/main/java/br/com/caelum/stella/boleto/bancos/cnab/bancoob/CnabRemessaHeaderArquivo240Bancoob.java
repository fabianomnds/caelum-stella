package br.com.caelum.stella.boleto.bancos.cnab.bancoob;

import br.com.caelum.stella.boleto.bancos.cnab.CnabRemessaHeader400Bancoob_;
import org.coury.jfilehelpers.annotations.*;
import org.coury.jfilehelpers.annotations.FieldFixedLength;
import org.coury.jfilehelpers.enums.AlignMode;
import org.coury.jfilehelpers.enums.ConverterKind;

import java.sql.Time;
import java.util.Date;

/**
 * Created by rafaeldalbosco on 05/03/15.
 */
@FixedLengthRecord
public class CnabRemessaHeaderArquivo240Bancoob extends CnabRemessaHeader400Bancoob_ {

    @FieldFixedLength(3)
    public Integer banco = 756;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(4)
    public Integer lote = 0;

    @FieldFixedLength(1)
    public Integer registro = 0;

    @FieldFixedLength(9)
    public String cnab;

    @FieldFixedLength(1)
    public Integer tipoInscricao;

    @FieldFixedLength(14)
    public Integer numeroInscricaoEmpresa;

    @FieldFixedLength(20)
    public String codigoConvenio;

    @FieldFixedLength(5)
    public Integer codigoAgencia;

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

    @FieldFixedLength(30)
    public String nomeBanco;

    @FieldFixedLength(10)
    public String cnab2;

    @FieldFixedLength(1)
    public Integer codigoRemessa = 1;

    @FieldConverter(converter = ConverterKind.Date, format = "ddMMyyyy")
    @FieldFixedLength(8)
    public Date dataGeracao;

    @FieldConverter(converter = ConverterKind.Date, format = "hhmmss")
    @FieldFixedLength(6)
    public Time horaGeracao;

    @FieldFixedLength(6)
    public Integer sequencial;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(3)
    public Integer layoutArquivo = 81;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(5)
    public Integer densidade;

    @FieldFixedLength(20)
    public String reservadoBanco;

    @FieldFixedLength(20)
    public String resenvadoEmpresa;

    @FieldFixedLength(29)
    public String cnab3;

    public CnabRemessaHeaderArquivo240Bancoob comBanco(Integer banco) {
        this.banco = banco;
        return this;
    }

    public CnabRemessaHeaderArquivo240Bancoob comLote(Integer lote) {
        this.lote = lote;
        return this;
    }

    public CnabRemessaHeaderArquivo240Bancoob comRegistro(Integer registro) {
        this.registro = registro;
        return this;
    }

    public CnabRemessaHeaderArquivo240Bancoob comCnab(String cnab) {
        this.cnab = cnab;
        return this;
    }

    public CnabRemessaHeaderArquivo240Bancoob comTipoInscricao(Integer tipoInscricao) {
        this.tipoInscricao = tipoInscricao;
        return this;
    }

    public CnabRemessaHeaderArquivo240Bancoob comNumeroInscricaoEmpresa(Integer numeroInscricaoEmpresa) {
        this.numeroInscricaoEmpresa = numeroInscricaoEmpresa;
        return this;
    }

    public CnabRemessaHeaderArquivo240Bancoob comCodigoConvenio(String codigoConvenio) {
        this.codigoConvenio = codigoConvenio;
        return this;
    }

    public CnabRemessaHeaderArquivo240Bancoob comCodigoAgencia(Integer codigoAgencia) {
        this.codigoAgencia = codigoAgencia;
        return this;
    }

    public CnabRemessaHeaderArquivo240Bancoob comDigitoAgencia(String digitoAgencia) {
        this.digitoAgencia = digitoAgencia;
        return this;
    }

    public CnabRemessaHeaderArquivo240Bancoob comConta(Integer conta) {
        this.conta = conta;
        return this;
    }

    public CnabRemessaHeaderArquivo240Bancoob comDigitoConta(String digitoConta) {
        this.digitoConta = digitoConta;
        return this;
    }

    public CnabRemessaHeaderArquivo240Bancoob comDigitoAgenciaConta(String digitoAgenciaConta) {
        this.digitoAgenciaConta = digitoAgenciaConta;
        return this;
    }

    public CnabRemessaHeaderArquivo240Bancoob comNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        return this;
    }

    public CnabRemessaHeaderArquivo240Bancoob comNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
        return this;
    }

    public CnabRemessaHeaderArquivo240Bancoob comCnab2(String cnab2) {
        this.cnab2 = cnab2;
        return this;
    }

    public CnabRemessaHeaderArquivo240Bancoob comCodigoRemessa(Integer codigoRemessa) {
        this.codigoRemessa = codigoRemessa;
        return this;
    }

    public CnabRemessaHeaderArquivo240Bancoob comDataGeracao(Date dataGeracao) {
        this.dataGeracao = dataGeracao;
        return this;
    }

    public CnabRemessaHeaderArquivo240Bancoob comHoraGeracao(Time horaGeracao) {
        this.horaGeracao = horaGeracao;
        return this;
    }

    public CnabRemessaHeaderArquivo240Bancoob comSequencial(Integer sequencial) {
        this.sequencial = sequencial;
        return this;
    }

    public CnabRemessaHeaderArquivo240Bancoob comLayoutArquivo(Integer layoutArquivo) {
        this.layoutArquivo = layoutArquivo;
        return this;
    }

    public CnabRemessaHeaderArquivo240Bancoob comDensidade(Integer densidade) {
        this.densidade = densidade;
        return this;
    }

    public CnabRemessaHeaderArquivo240Bancoob comReservadoBanco(String reservadoBanco) {
        this.reservadoBanco = reservadoBanco;
        return this;
    }

    public CnabRemessaHeaderArquivo240Bancoob comResenvadoEmpresa(String resenvadoEmpresa) {
        this.resenvadoEmpresa = resenvadoEmpresa;
        return this;
    }

    public CnabRemessaHeaderArquivo240Bancoob comCnab3(String cnab3) {
        this.cnab3 = cnab3;
        return this;
    }
}
