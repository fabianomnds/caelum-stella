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
 * Created by rafaeldalbosco on 04/03/15.
 */
@FixedLengthRecord
public class CnabRetornoHeader400Bancoob extends CnabRetornoHeader {

    @FieldFixedLength(1)
    public Integer idRegistro = 0;

    @FieldFixedLength(1)
    public Integer tipoOperacao = 2;

    @FieldFixedLength(7)
    public String extensoTipoOperacao = "RETORNO";

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(2)
    public Integer tipoServico = 1;

    @FieldFixedLength(8)
    public String extensoTipoServico = "COBRANÇA";

    @FieldFixedLength(7)
    public String complemento;

    @FieldFixedLength(4)
    public Integer agencia;

    @FieldFixedLength(1)
    public Integer digitoVerificadorAgencia;

    @FieldFixedLength(8)
    public Integer codigoBeneficiario;

    @FieldFixedLength(1)
    public String digitoVerificadorBeneficiario;

    @FieldFixedLength(6)
    public Integer numeroConvenioLider;

    @FieldFixedLength(30)
    public String nomeBeneficiario;

    @FieldFixedLength(18)
    public String identificacaoBanco = "756BANCOOBCED";

    @FieldConverter(converter = ConverterKind.Date, format = "ddMMyy")
    @FieldFixedLength(6)
    public Date dataGravacaoRetorno;

    @FieldFixedLength(7)
    public Integer sequenciaRetorno;

    @FieldFixedLength(287)
    public String complemento2;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(6)
    public Integer sequencialRegistro;

    public CnabRetornoHeader400Bancoob comIdRegistro(Integer idRegistro) {
        this.idRegistro = idRegistro;
        return this;
    }

    public CnabRetornoHeader400Bancoob comTipoOperacao(Integer tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
        return this;
    }

    public CnabRetornoHeader400Bancoob comExtensoTipoOperacao(String extensoTipoOperacao) {
        this.extensoTipoOperacao = extensoTipoOperacao;
        return this;
    }

    public CnabRetornoHeader400Bancoob comTipoServico(Integer tipoServico) {
        this.tipoServico = tipoServico;
        return this;
    }

    public CnabRetornoHeader400Bancoob comExtensoTipoServico(String extensoTipoServico) {
        this.extensoTipoServico = extensoTipoServico;
        return this;
    }

    public CnabRetornoHeader400Bancoob comComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public CnabRetornoHeader400Bancoob comAgencia(Integer agencia) {
        this.agencia = agencia;
        return this;
    }

    public CnabRetornoHeader400Bancoob comDigitoVerificadorAgencia(Integer digitoVerificadorAgencia) {
        this.digitoVerificadorAgencia = digitoVerificadorAgencia;
        return this;
    }

    public CnabRetornoHeader400Bancoob comCodigoBeneficiario(Integer codigoBeneficiario) {
        this.codigoBeneficiario = codigoBeneficiario;
        return this;
    }

    public CnabRetornoHeader400Bancoob comDigitoVerificadorBeneficiario(String digitoVerificadorBeneficiario) {
        this.digitoVerificadorBeneficiario = digitoVerificadorBeneficiario;
        return this;
    }

    public CnabRetornoHeader400Bancoob comNumeroConvenioLider(Integer numeroConvenioLider) {
        this.numeroConvenioLider = numeroConvenioLider;
        return this;
    }

    public CnabRetornoHeader400Bancoob comNomeBeneficiario(String nomeBeneficiario) {
        this.nomeBeneficiario = nomeBeneficiario;
        return this;
    }

    public CnabRetornoHeader400Bancoob comIdentificacaoBanco(String identificacaoBanco) {
        this.identificacaoBanco = identificacaoBanco;
        return this;
    }

    public CnabRetornoHeader400Bancoob comDataGravacaoRetorno(Date dataGravacaoRetorno) {
        this.dataGravacaoRetorno = dataGravacaoRetorno;
        return this;
    }

    public CnabRetornoHeader400Bancoob comSequenciaRetorno(Integer sequenciaRetorno) {
        this.sequenciaRetorno = sequenciaRetorno;
        return this;
    }

    public CnabRetornoHeader400Bancoob comComplemento2(String complemento2) {
        this.complemento2 = complemento2;
        return this;
    }

    public CnabRetornoHeader400Bancoob comSequencialRegistro(Integer sequencialRegistro) {
        this.sequencialRegistro = sequencialRegistro;
        return this;
    }
}
