package br.com.caelum.stella.boleto.bancos.cnab.bancoob;

import br.com.caelum.stella.boleto.bancos.cnab.CnabRemessaHeader;
import org.coury.jfilehelpers.annotations.*;
import org.coury.jfilehelpers.enums.AlignMode;
import org.coury.jfilehelpers.enums.ConverterKind;
import org.coury.jfilehelpers.enums.TrimMode;

import java.util.Date;

/**
 * Created by rafaeldalbosco on 03/03/15.
 */
@FixedLengthRecord()
public class CnabRemessaHeader400Bancoob extends CnabRemessaHeader {

    @FieldFixedLength(1)
    public String idRegistro = "0";

    @FieldFixedLength(1)
    public String tipoOperacao = "1";

    @FieldAlign(alignMode = AlignMode.Left)
    @FieldFixedLength(7)
    public String extensoTipoOperacao = "REMESSA";

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(2)
    public String tipoServico = "01";

    @FieldAlign(alignMode = AlignMode.Left)
    @FieldFixedLength(8)
    public String extensoTipoServico = "COBRANÇA";

    @FieldAlign(alignMode = AlignMode.Left)
    @FieldFixedLength(7)
    public String complementoRegistro = "";

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(4)
    public String agencia;

    @FieldAlign(alignMode = AlignMode.Right)
    @FieldFixedLength(1)
    public String digitoVerificadorAgencia;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldTrim(trimMode = TrimMode.Both)
    @FieldFixedLength(8)
    public String codigoBeneficiario;

    @FieldAlign(alignMode = AlignMode.Right)
    @FieldFixedLength(1)
    public String digitoVerificadorBeneficiario;

    @FieldAlign(alignMode = AlignMode.Right)
    @FieldFixedLength(6)
    public String numeroConvenioLider = "";

    @FieldAlign(alignMode = AlignMode.Left)
    @FieldFixedLength(30)
    public String nomeBeneficiario;

    @FieldAlign(alignMode = AlignMode.Left)
    @FieldFixedLength(18)
    public String identificacaoBanco = "756BANCOOBCED";

    @FieldAlign(alignMode = AlignMode.Left)
    @FieldFixedLength(6)
    @FieldConverter(converter = ConverterKind.Date, format = "ddMMyy")
    public Date dataGravacaoRemessa;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(7)
    public Integer sequenciaRemessa;

    @FieldAlign(alignMode = AlignMode.Right)
    @FieldFixedLength(287)
    public String complementoRegistro2 = "";

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(6)
    public Integer sequencialRegistro;


    public CnabRemessaHeader400Bancoob comIdRegistro(String idRegistro) {
        this.idRegistro = idRegistro.toUpperCase();
        return this;
    }

    public CnabRemessaHeader400Bancoob comTipoOperacao(String tipoOperacao) {
        this.tipoOperacao  = tipoOperacao.toUpperCase();
        return this;
    }

    public CnabRemessaHeader400Bancoob comExtensoTipoOperacao(String extensoTipoOperacao) {
        this.extensoTipoOperacao = extensoTipoOperacao.toUpperCase();
        return this;
    }

    public CnabRemessaHeader400Bancoob comTipoServico(String tipoServico) {
        this.tipoServico = tipoServico.toUpperCase();
        return this;
    }

    public CnabRemessaHeader400Bancoob comExtensoTipoServico(String extensoTipoServico) {
        this.extensoTipoServico = extensoTipoServico.toUpperCase();
        return this;
    }

    public CnabRemessaHeader400Bancoob comComplementoRegistro(String complementoRegistro) {
        this.complementoRegistro = complementoRegistro.toUpperCase();
        return this;
    }

    public CnabRemessaHeader400Bancoob comAgencia(String agencia) {
        this.agencia = agencia.toUpperCase();
        return this;
    }

    public CnabRemessaHeader400Bancoob comDigitoVerificadorAgencia(String digitoVerificadorAgencia) {
        this.digitoVerificadorAgencia = digitoVerificadorAgencia.toUpperCase();
        return this;
    }

    public CnabRemessaHeader400Bancoob comCodigoBeneficiario(String codigoBeneficiario) {
        this.codigoBeneficiario = codigoBeneficiario.toUpperCase();
        return this;
    }

    public CnabRemessaHeader400Bancoob comDigitoVerificadorBeneficiario(String digitoVerificadorBeneficiario) {
        this.digitoVerificadorBeneficiario = digitoVerificadorBeneficiario.toUpperCase();
        return this;
    }

    public CnabRemessaHeader400Bancoob comNumeroConvenioLider(String numeroConvenioLider) {
        this.numeroConvenioLider = numeroConvenioLider.toUpperCase();
        return this;
    }

    public CnabRemessaHeader400Bancoob comNomeBeneficiario(String nomeBeneficiario) {
        this.nomeBeneficiario = nomeBeneficiario.toUpperCase();
        return this;
    }

    public CnabRemessaHeader400Bancoob comIdentificacaoBanco(String identificacaoBanco) {
        this.identificacaoBanco = identificacaoBanco.toUpperCase();
        return this;
    }

    public CnabRemessaHeader400Bancoob comDataGravacaoRemessa(Date dataGravacaoRemessa) {
        this.dataGravacaoRemessa = dataGravacaoRemessa;
        return this;
    }

    public CnabRemessaHeader400Bancoob comSequenciaRemessa(Integer sequenciaRemessa) {
        this.sequenciaRemessa = sequenciaRemessa;
        return this;
    }

    public CnabRemessaHeader400Bancoob comComplementoRegistro2(String complementoRegistro2) {
        this.complementoRegistro2 = complementoRegistro2.toUpperCase();
        return this;
    }

    public CnabRemessaHeader400Bancoob comSequencialRegistro(Integer sequencialRegistro) {
        this.sequencialRegistro = sequencialRegistro;
        return this;
    }
}
