package br.com.caelum.stella.boleto.bancos.cnab.bancoob;

import br.com.caelum.stella.boleto.bancos.cnab.CnabRemessaTrailler;
import org.coury.jfilehelpers.annotations.FieldAlign;
import org.coury.jfilehelpers.annotations.FieldFixedLength;
import org.coury.jfilehelpers.annotations.FixedLengthRecord;
import org.coury.jfilehelpers.enums.AlignMode;

/**
 * Created by rafaeldalbosco on 04/03/15.
 */
@FixedLengthRecord
public class CnabRemessaTrailler400Bancoob extends CnabRemessaTrailler {

    @FieldFixedLength(1)
    public Integer idRegistro;

    @FieldFixedLength(193)
    public String complemento;

    @FieldFixedLength(40)
    public String mensagemResponsabilidadeBenificiario1;

    @FieldFixedLength(40)
    public String mensagemResponsabilidadeBenificiario2;

    @FieldFixedLength(40)
    public String mensagemResponsabilidadeBenificiario3;

    @FieldFixedLength(40)
    public String mensagemResponsabilidadeBenificiario4;

    @FieldFixedLength(40)
    public String mensagemResponsabilidadeBenificiario5;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(6)
    public String sequenciaRegistro;

    public CnabRemessaTrailler400Bancoob comIdRegistro(Integer idRegistro) {
        this.idRegistro = idRegistro;
        return this;
    }

    public CnabRemessaTrailler400Bancoob comComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public CnabRemessaTrailler400Bancoob comMensagemResponsabilidadeBenificiario1(String mensagemResponsabilidadeBenificiario1) {
        this.mensagemResponsabilidadeBenificiario1 = mensagemResponsabilidadeBenificiario1;
        return this;
    }

    public CnabRemessaTrailler400Bancoob comMensagemResponsabilidadeBenificiario2(String mensagemResponsabilidadeBenificiario2) {
        this.mensagemResponsabilidadeBenificiario2 = mensagemResponsabilidadeBenificiario2;
        return this;
    }

    public CnabRemessaTrailler400Bancoob comMensagemResponsabilidadeBenificiario3(String mensagemResponsabilidadeBenificiario3) {
        this.mensagemResponsabilidadeBenificiario3 = mensagemResponsabilidadeBenificiario3;
        return this;
    }

    public CnabRemessaTrailler400Bancoob comMensagemResponsabilidadeBenificiario4(String mensagemResponsabilidadeBenificiario4) {
        this.mensagemResponsabilidadeBenificiario4 = mensagemResponsabilidadeBenificiario4;
        return this;
    }

    public CnabRemessaTrailler400Bancoob comMensagemResponsabilidadeBenificiario5(String mensagemResponsabilidadeBenificiario5) {
        this.mensagemResponsabilidadeBenificiario5 = mensagemResponsabilidadeBenificiario5;
        return this;
    }

    public CnabRemessaTrailler400Bancoob comSequenciaRegistro(String sequenciaRegistro) {
        this.sequenciaRegistro = sequenciaRegistro;
        return this;
    }
}
