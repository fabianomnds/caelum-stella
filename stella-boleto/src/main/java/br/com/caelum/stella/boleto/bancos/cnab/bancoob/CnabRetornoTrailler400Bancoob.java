package br.com.caelum.stella.boleto.bancos.cnab.bancoob;

import br.com.caelum.stella.boleto.bancos.cnab.CnabRetornoTrailler;
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
public class CnabRetornoTrailler400Bancoob extends CnabRetornoTrailler {

    @FieldFixedLength(1)
    public Integer idRegistro = 9;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(2)
    public Integer tipoServico = 2;

    @FieldFixedLength(3)
    public Integer numeroBanco = 756;

    @FieldFixedLength(4)
    public Integer agenciaRemetente;

    @FieldFixedLength(25)
    public String siglaAgenciaRemetente;

    @FieldFixedLength(50)
    public String enderecoAgenciaRemetente;

    @FieldFixedLength(30)
    public String bairroAgenciaRemetente;

    @FieldFixedLength(8)
    public String cepAgenciaRemente;

    @FieldFixedLength(30)
    public String cidadeAgenciaRemetente;

    @FieldFixedLength(2)
    public String ufAgenciaRemetente;

    @FieldConverter(converter = ConverterKind.Date, format = "ddMMyyyy")
    @FieldFixedLength(8)
    public Date dataMovimento;
    
    @FieldFixedLength(8)
    public Integer quanitadeRegistrosDeletalhe;
    
    @FieldFixedLength(11)
    public Integer ultimoNossoNumeroBeneficiario;
    
    @FieldFixedLength(212)
    public String complemento;
    
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(6)
    public Integer sequencialRegistro;

    public CnabRetornoTrailler400Bancoob comIdRegistro(Integer idRegistro) {
        this.idRegistro = idRegistro;
        return this;
    }

    public CnabRetornoTrailler400Bancoob comTipoServico(Integer tipoServico) {
        this.tipoServico = tipoServico;
        return this;
    }

    public CnabRetornoTrailler400Bancoob comNumeroBanco(Integer numeroBanco) {
        this.numeroBanco = numeroBanco;
        return this;
    }

    public CnabRetornoTrailler400Bancoob comAgenciaRemetente(Integer agenciaRemetente) {
        this.agenciaRemetente = agenciaRemetente;
        return this;
    }

    public CnabRetornoTrailler400Bancoob comSiglaAgenciaRemetente(String siglaAgenciaRemetente) {
        this.siglaAgenciaRemetente = siglaAgenciaRemetente;
        return this;
    }

    public CnabRetornoTrailler400Bancoob comEnderecoAgenciaRemetente(String enderecoAgenciaRemetente) {
        this.enderecoAgenciaRemetente = enderecoAgenciaRemetente;
        return this;
    }

    public CnabRetornoTrailler400Bancoob comBairroAgenciaRemetente(String bairroAgenciaRemetente) {
        this.bairroAgenciaRemetente = bairroAgenciaRemetente;
        return this;
    }

    public CnabRetornoTrailler400Bancoob comCepAgenciaRemente(String cepAgenciaRemente) {
        this.cepAgenciaRemente = cepAgenciaRemente;
        return this;
    }

    public CnabRetornoTrailler400Bancoob comCidadeAgenciaRemetente(String cidadeAgenciaRemetente) {
        this.cidadeAgenciaRemetente = cidadeAgenciaRemetente;
        return this;
    }

    public CnabRetornoTrailler400Bancoob comUfAgenciaRemetente(String ufAgenciaRemetente) {
        this.ufAgenciaRemetente = ufAgenciaRemetente;
        return this;
    }

    public CnabRetornoTrailler400Bancoob comDataMovimento(Date dataMovimento) {
        this.dataMovimento = dataMovimento;
        return this;
    }

    public CnabRetornoTrailler400Bancoob comQuanitadeRegistrosDeletalhe(Integer quanitadeRegistrosDeletalhe) {
        this.quanitadeRegistrosDeletalhe = quanitadeRegistrosDeletalhe;
        return this;
    }

    public CnabRetornoTrailler400Bancoob comUltimoNossoNumeroBeneficiario(Integer ultimoNossoNumeroBeneficiario) {
        this.ultimoNossoNumeroBeneficiario = ultimoNossoNumeroBeneficiario;
        return this;
    }

    public CnabRetornoTrailler400Bancoob comComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public CnabRetornoTrailler400Bancoob comSequencialRegistro(Integer sequencialRegistro) {
        this.sequencialRegistro = sequencialRegistro;
        return this;
    }
}
