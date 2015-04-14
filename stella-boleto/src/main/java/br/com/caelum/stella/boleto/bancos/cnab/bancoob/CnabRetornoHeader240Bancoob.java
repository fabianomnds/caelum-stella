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
 * Created by rafaeldalbosco on 09/03/15.
 */
@FixedLengthRecord
public class CnabRetornoHeader240Bancoob extends CnabRetornoHeader {

    @FieldFixedLength(3)
    public Integer banco = 756;

    @FieldFixedLength(4)
    public Integer lote;

    @FieldFixedLength(1)
    public Integer idRegistro = 0;

    @FieldFixedLength(9)
    public String cnab;

    @FieldFixedLength(1)
    public Integer tipoInscricaoEmpresa;

    @FieldFixedLength(14)
    public Integer numeroInscricaoEmpresa;

    @FieldFixedLength(20)
    public String convenio;

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

    @FieldFixedLength(30)
    public String nomeBanco;

    @FieldFixedLength(10)
    public String cnab1;
    
    @FieldFixedLength(1)
    public Integer codigoRemessa = 2;
    
    @FieldConverter(converter = ConverterKind.Date, format = "ddMMyyyy")
    @FieldFixedLength(8)
    public Date dataGeracao;

    @FieldConverter(converter = ConverterKind.Date, format = "hhmmss")
    @FieldFixedLength(6)
    public Date horaGeracao;
    
    @FieldFixedLength(6)
    public Integer sequenciaNSA;
    
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(3)
    public Integer layoutArquivo = 81;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(5)
    public Integer densidade = 0;

    @FieldFixedLength(20)
    public String resenvadobanco;

    @FieldFixedLength(20)
    public String reservadoEmpresa;

    @FieldFixedLength(29)
    public Integer cnab2;

    public CnabRetornoHeader240Bancoob comBanco(Integer banco) {
        this.banco = banco;
        return this;
    }

    public CnabRetornoHeader240Bancoob comLote(Integer lote) {
        this.lote = lote;
        return this;
    }

    public CnabRetornoHeader240Bancoob comIdRegistro(Integer idRegistro) {
        this.idRegistro = idRegistro;
        return this;
    }

    public CnabRetornoHeader240Bancoob comCnab(String cnab) {
        this.cnab = cnab;
        return this;
    }

    public CnabRetornoHeader240Bancoob comTipoInscricaoEmpresa(Integer tipoInscricaoEmpresa) {
        this.tipoInscricaoEmpresa = tipoInscricaoEmpresa;
        return this;
    }

    public CnabRetornoHeader240Bancoob comNumeroInscricaoEmpresa(Integer numeroInscricaoEmpresa) {
        this.numeroInscricaoEmpresa = numeroInscricaoEmpresa;
        return this;
    }

    public CnabRetornoHeader240Bancoob comConvenio(String convenio) {
        this.convenio = convenio;
        return this;
    }

    public CnabRetornoHeader240Bancoob comAgencia(Integer agencia) {
        this.agencia = agencia;
        return this;
    }

    public CnabRetornoHeader240Bancoob comDigitoAgencia(String digitoAgencia) {
        this.digitoAgencia = digitoAgencia;
        return this;
    }

    public CnabRetornoHeader240Bancoob comConta(Integer conta) {
        this.conta = conta;
        return this;
    }

    public CnabRetornoHeader240Bancoob comDigitoConta(String digitoConta) {
        this.digitoConta = digitoConta;
        return this;
    }

    public CnabRetornoHeader240Bancoob comDigitoAgenciaConta(String digitoAgenciaConta) {
        this.digitoAgenciaConta = digitoAgenciaConta;
        return this;
    }

    public CnabRetornoHeader240Bancoob comNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        return this;
    }

    public CnabRetornoHeader240Bancoob comNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
        return this;
    }

    public CnabRetornoHeader240Bancoob comCnab1(String cnab1) {
        this.cnab1 = cnab1;
        return this;
    }

    public CnabRetornoHeader240Bancoob comCodigoRemessa(Integer codigoRemessa) {
        this.codigoRemessa = codigoRemessa;
        return this;
    }

    public CnabRetornoHeader240Bancoob comDataGeracao(Date dataGeracao) {
        this.dataGeracao = dataGeracao;
        return this;
    }

    public CnabRetornoHeader240Bancoob comHoraGeracao(Date horaGeracao) {
        this.horaGeracao = horaGeracao;
        return this;
    }

    public CnabRetornoHeader240Bancoob comSequenciaNSA(Integer sequenciaNSA) {
        this.sequenciaNSA = sequenciaNSA;
        return this;
    }

    public CnabRetornoHeader240Bancoob comLayoutArquivo(Integer layoutArquivo) {
        this.layoutArquivo = layoutArquivo;
        return this;
    }

    public CnabRetornoHeader240Bancoob comDensidade(Integer densidade) {
        this.densidade = densidade;
        return this;
    }

    public CnabRetornoHeader240Bancoob comResenvadobanco(String resenvadobanco) {
        this.resenvadobanco = resenvadobanco;
        return this;
    }

    public CnabRetornoHeader240Bancoob comReservadoEmpresa(String reservadoEmpresa) {
        this.reservadoEmpresa = reservadoEmpresa;
        return this;
    }

    public CnabRetornoHeader240Bancoob comCnab2(Integer cnab2) {
        this.cnab2 = cnab2;
        return this;
    }
}
