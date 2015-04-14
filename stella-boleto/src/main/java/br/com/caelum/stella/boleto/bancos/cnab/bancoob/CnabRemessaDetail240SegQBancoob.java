package br.com.caelum.stella.boleto.bancos.cnab.bancoob;

import br.com.caelum.stella.boleto.bancos.cnab.CnabRemessaDetail;
import org.coury.jfilehelpers.annotations.FieldAlign;
import org.coury.jfilehelpers.annotations.FieldFixedLength;
import org.coury.jfilehelpers.annotations.FixedLengthRecord;
import org.coury.jfilehelpers.enums.AlignMode;

/**
 * Created by rafaeldalbosco on 05/03/15.
 */
@FixedLengthRecord
public class CnabRemessaDetail240SegQBancoob extends CnabRemessaDetail {

    @FieldFixedLength(3)
    public Integer banco = 756;

    @FieldFixedLength(4)
    public Integer loteServico;

    @FieldFixedLength(1)
    public Integer idRegistro = 3;

    @FieldFixedLength(5)
    public Integer sequenciaRegistro;

    @FieldFixedLength(1)
    public String codigoSegmento;

    @FieldFixedLength(1)
    public String usoExclusivo;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(2)
    public Integer codigoMovimento;

    @FieldFixedLength(1)
    public Integer tipoInscricaoPagador;

    @FieldFixedLength(14)
    public Integer numeroInscricao;

    @FieldFixedLength(40)
    public String nome;

    @FieldFixedLength(40)
    public String endereco;

    @FieldFixedLength(15)
    public String bairro;

    @FieldFixedLength(5)
    public Integer cep;

    @FieldFixedLength(3)
    public String sufixoCep;

    @FieldFixedLength(15)
    public String cidade;

    @FieldFixedLength(2)
    public String uf;

    @FieldFixedLength(1)
    public Integer tipoInscricaoSacado;

    @FieldAlign(alignMode = AlignMode.Right)
    @FieldFixedLength(15)
    public Integer numeroInscricaoSacado;

    @FieldFixedLength(40)
    public String nomeSacado;

    @FieldFixedLength(3)
    public Integer codigoBancoCorrespondente;

    @FieldFixedLength(20)
    public String nossoNumeroBancoCorrespondente;

    @FieldFixedLength(8)
    public String Cnab;

    public CnabRemessaDetail240SegQBancoob comBanco(Integer banco) {
        this.banco = banco;
        return this;
    }

    public CnabRemessaDetail240SegQBancoob comLoteServico(Integer loteServico) {
        this.loteServico = loteServico;
        return this;
    }

    public CnabRemessaDetail240SegQBancoob comIdRegistro(Integer idRegistro) {
        this.idRegistro = idRegistro;
        return this;
    }

    public CnabRemessaDetail240SegQBancoob comSequenciaRegistro(Integer sequenciaRegistro) {
        this.sequenciaRegistro = sequenciaRegistro;
        return this;
    }

    public CnabRemessaDetail240SegQBancoob comCodigoSegmento(String codigoSegmento) {
        this.codigoSegmento = codigoSegmento;
        return this;
    }

    public CnabRemessaDetail240SegQBancoob comUsoExclusivo(String usoExclusivo) {
        this.usoExclusivo = usoExclusivo;
        return this;
    }

    public CnabRemessaDetail240SegQBancoob comCodigoMovimento(Integer codigoMovimento) {
        this.codigoMovimento = codigoMovimento;
        return this;
    }

    public CnabRemessaDetail240SegQBancoob comTipoInscricaoPagador(Integer tipoInscricaoPagador) {
        this.tipoInscricaoPagador = tipoInscricaoPagador;
        return this;
    }

    public CnabRemessaDetail240SegQBancoob comNumeroInscricao(Integer numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
        return this;
    }

    public CnabRemessaDetail240SegQBancoob comNomeSacado(String nomeSacado) {
        this.nomeSacado = nomeSacado;
        return this;
    }

    public CnabRemessaDetail240SegQBancoob comCodigoBancoCorrespondente(Integer codigoBancoCorrespondente) {
        this.codigoBancoCorrespondente = codigoBancoCorrespondente;
        return this;
    }

    public CnabRemessaDetail240SegQBancoob comNossoNumeroBancoCorrespondente(String nossoNumeroBancoCorrespondente) {
        this.nossoNumeroBancoCorrespondente = nossoNumeroBancoCorrespondente;
        return this;
    }

    public CnabRemessaDetail240SegQBancoob comCnab(String cnab) {
        Cnab = cnab;
        return this;
    }

    public CnabRemessaDetail240SegQBancoob comNome(String nome) {
        this.nome = nome;
        return this;
    }

    public CnabRemessaDetail240SegQBancoob comEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public CnabRemessaDetail240SegQBancoob comBairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public CnabRemessaDetail240SegQBancoob comCep(Integer cep) {
        this.cep = cep;
        return this;
    }

    public CnabRemessaDetail240SegQBancoob comSufixoCep(String sufixoCep) {
        this.sufixoCep = sufixoCep;
        return this;
    }

    public CnabRemessaDetail240SegQBancoob comCidade(String cidade) {
        this.cidade = cidade;
        return this;
    }

    public CnabRemessaDetail240SegQBancoob comUf(String uf) {
        this.uf = uf;
        return this;
    }

    public CnabRemessaDetail240SegQBancoob comTipoInscricaoSacado(Integer tipoInscricaoSacado) {
        this.tipoInscricaoSacado = tipoInscricaoSacado;
        return this;
    }

    public CnabRemessaDetail240SegQBancoob comNumeroInscricaoSacado(Integer numeroInscricaoSacado) {
        this.numeroInscricaoSacado = numeroInscricaoSacado;
        return this;
    }
}
