package br.com.caelum.stella.boleto.bancos.cnab.bancoob;

import br.com.caelum.stella.boleto.bancos.cnab.CnabRemessaHeader;
import org.coury.jfilehelpers.annotations.*;
import org.coury.jfilehelpers.annotations.FieldFixedLength;
import org.coury.jfilehelpers.enums.AlignMode;
import org.coury.jfilehelpers.enums.ConverterKind;

import java.util.Date;

/**
 * Created by rafaeldalbosco on 05/03/15.
 */
@FixedLengthRecord
public class CnabRemessaHeaderLote240Bancoob extends CnabRemessaHeader {

    @FieldFixedLength(3)
    public Integer banco = 756;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(4)
    public Integer lote;

    @FieldFixedLength(1)
    public Integer registro = 1;

    @FieldFixedLength(1)
    public String tipoOperacao = "R";

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(2)
    public Integer tipoServico = 1;

    @FieldFixedLength(2)
    public String Cnab;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(3)
    public Integer layoutLote = 40;

    @FieldFixedLength(1)
    public String cnab2;

    @FieldFixedLength(1)
    public Integer tipoInscricao;

    @FieldFixedLength(15)
    public Integer numeroInscricao;

    @FieldFixedLength(20)
    public String codioConvenio;

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
    public String numeroRemessaRetorno;

    @FieldConverter(converter = ConverterKind.Date, format = "ddMMyyyy")
    @FieldFixedLength(8)
    public Date dataGravacao;

    @FieldConverter(converter = ConverterKind.Date, format = "ddMMyyyy")
    @FieldFixedLength(8)
    public Date DataCredito;

    @FieldFixedLength(33)
    public String cnab3;

    public CnabRemessaHeaderLote240Bancoob comBanco(Integer banco) {
        this.banco = banco;
        return this;
    }

    public CnabRemessaHeaderLote240Bancoob comLote(Integer lote) {
        this.lote = lote;
        return this;
    }

    public CnabRemessaHeaderLote240Bancoob comRegistro(Integer registro) {
        this.registro = registro;
        return this;
    }

    public CnabRemessaHeaderLote240Bancoob comTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
        return this;
    }

    public CnabRemessaHeaderLote240Bancoob comTipoServico(Integer tipoServico) {
        this.tipoServico = tipoServico;
        return this;
    }

    public CnabRemessaHeaderLote240Bancoob comCnab(String cnab) {
        Cnab = cnab;
        return this;
    }

    public CnabRemessaHeaderLote240Bancoob comLayoutLote(Integer layoutLote) {
        this.layoutLote = layoutLote;
        return this;
    }

    public CnabRemessaHeaderLote240Bancoob comCnab2(String cnab2) {
        this.cnab2 = cnab2;
        return this;
    }

    public CnabRemessaHeaderLote240Bancoob comTipoInscricao(Integer tipoInscricao) {
        this.tipoInscricao = tipoInscricao;
        return this;
    }

    public CnabRemessaHeaderLote240Bancoob comNumeroInscricao(Integer numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
        return this;
    }

    public CnabRemessaHeaderLote240Bancoob comCodioConvenio(String codioConvenio) {
        this.codioConvenio = codioConvenio;
        return this;
    }

    public CnabRemessaHeaderLote240Bancoob comAgencia(Integer agencia) {
        this.agencia = agencia;
        return this;
    }

    public CnabRemessaHeaderLote240Bancoob comDigitoAgencia(String digitoAgencia) {
        this.digitoAgencia = digitoAgencia;
        return this;
    }

    public CnabRemessaHeaderLote240Bancoob comConta(Integer conta) {
        this.conta = conta;
        return this;
    }

    public CnabRemessaHeaderLote240Bancoob comDigitoConta(String digitoConta) {
        this.digitoConta = digitoConta;
        return this;
    }

    public CnabRemessaHeaderLote240Bancoob comDigitoAgenciaConta(String digitoAgenciaConta) {
        this.digitoAgenciaConta = digitoAgenciaConta;
        return this;
    }

    public CnabRemessaHeaderLote240Bancoob comNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        return this;
    }

    public CnabRemessaHeaderLote240Bancoob comInformacao1(String informacao1) {
        this.informacao1 = informacao1;
        return this;
    }

    public CnabRemessaHeaderLote240Bancoob comInformacao2(String informacao2) {
        this.informacao2 = informacao2;
        return this;
    }

    public CnabRemessaHeaderLote240Bancoob comNumeroRemessaRetorno(String numeroRemessaRetorno) {
        this.numeroRemessaRetorno = numeroRemessaRetorno;
        return this;
    }

    public CnabRemessaHeaderLote240Bancoob comDataGravacao(Date dataGravacao) {
        this.dataGravacao = dataGravacao;
        return this;
    }

    public CnabRemessaHeaderLote240Bancoob comDataCredito(Date dataCredito) {
        DataCredito = dataCredito;
        return this;
    }

    public CnabRemessaHeaderLote240Bancoob comCnab3(String cnab3) {
        this.cnab3 = cnab3;
        return this;
    }
}
