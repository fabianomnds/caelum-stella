package br.com.caelum.stella.boleto.bancos.cnab.bancoob;

import br.com.caelum.stella.boleto.bancos.cnab.CnabRemessaTransacao;
import org.coury.jfilehelpers.annotations.FieldAlign;
import org.coury.jfilehelpers.annotations.FieldConverter;
import org.coury.jfilehelpers.annotations.FieldFixedLength;
import org.coury.jfilehelpers.annotations.FixedLengthRecord;
import org.coury.jfilehelpers.enums.AlignMode;
import org.coury.jfilehelpers.enums.ConverterKind;

import java.util.Date;

/**
 * Created by rafaeldalbosco on 03/03/15.
 */
@FixedLengthRecord
public class CnabRemessaTransacao400Bancoob extends CnabRemessaTransacao {

    @FieldFixedLength(1)
    public String idRegistro = "1";

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(2)
    public String tipoInscricaoBeneficiario = "2";

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(14)
    public String cpfCnpj;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(4)
    public String agencia;

    @FieldFixedLength(1)
    public String digitoVerificadorAgencia;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(8)
    public String conta;

    @FieldFixedLength(1)
    public String digitoVerificadorConta;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(6)
    public String numeroConvenioCobranca = "000000";

    @FieldFixedLength(25)
    public String numeroControleParticipante = "";

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(12)
    public Integer nossoNumero;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(2)
    public Integer numeroParcela = 1;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(2)
    public Integer grupoValor = 0;

    @FieldFixedLength(3)
    public String complemento = "";

    @FieldFixedLength(1)
    public String indicativoMensagem = "";

    @FieldFixedLength(3)
    public String prefixoTitulo = "";

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(3)
    public Integer variacaoCarteira;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(1)
    public Integer contaCaucao;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(5)
    public Integer numeroContratoGarantia;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(5)
    public Integer dvContrato;

    @FieldFixedLength(6)
    public String numeroBordero;

    @FieldFixedLength(4)
    public String complemento2;

    @FieldFixedLength(1)
    public Integer tipoEmissao;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(2)
    public Integer carteiraModalidade;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(2)
    public Integer comandoMovimento;

    @FieldFixedLength(10)
    public String seuNumero;

    @FieldConverter(converter = ConverterKind.Date, format = "ddMMyy")
    @FieldFixedLength(6)
    public Date dataVencimento;

    @FieldConverter(converter = ConverterKind.Double, format = "00000000000.00")
    @FieldFixedLength(13)
    public Double valorTitulo;

    @FieldFixedLength(3)
    public Integer numeroBanco = 756;

    @FieldFixedLength(4)
    public Integer prefixoCooperativa;

    @FieldFixedLength(1)
    public String digitoVerificadorPrefixo;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(2)
    public Integer especieTitulo;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(1)
    public String aceiteTitulo;

    @FieldConverter(converter = ConverterKind.Date, format = "ddMMyy")
    @FieldFixedLength(6)
    public Date dataEmissao;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(2)
    public Integer primeiraInstrucao;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(2)
    public Integer segundaInstrucao;

    @FieldConverter(converter = ConverterKind.Double, format = "00.0000")
    @FieldFixedLength(6)
    public Double taxaMoraMes;

    @FieldConverter(converter = ConverterKind.Double, format = "00.0000")
    @FieldFixedLength(6)
    public Double taxaMulta;

    @FieldFixedLength(1)
    public Integer tipoDistribuicao;

    @FieldConverter(converter = ConverterKind.Date, format = "ddMMyy")
    @FieldFixedLength(6)
    public Date dataPrimeiroDesconto;

    @FieldConverter(converter = ConverterKind.Double, format = "00000000000.00")
    @FieldFixedLength(13)
    public Double valorPrimeiroDesconto;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(13)
    public Integer codigoMoeda;

    @FieldConverter(converter = ConverterKind.Double, format = "00000000000.00")
    @FieldFixedLength(13)
    public Double valorAbatimento;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(2)
    public Integer tipoInstricaoPagador;

    @FieldFixedLength(14)
    public String CnpjCpfPagador;

    @FieldFixedLength(40)
    public String nomePagador;

    @FieldFixedLength(37)
    public String enderecoPagador;

    @FieldFixedLength(15)
    public String bairroPagador;

    @FieldFixedLength(8)
    public String cepPagador;

    @FieldFixedLength(15)
    public String cidadePagador;

    @FieldFixedLength(2)
    public String ufPagador;

    @FieldFixedLength(40)
    public String observacaoMensagem;

    @FieldFixedLength(2)
    public Integer numeroDiasProtesto;
    
    @FieldFixedLength(1)
    public String complemento3;
    
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(6)
    public Integer sequencialRegistro;

    public CnabRemessaTransacao400Bancoob comIdRegistro(String idRegistro) {
        this.idRegistro = idRegistro;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comTipoInscricaoBeneficiario(String tipoInscricaoBeneficiario) {
        this.tipoInscricaoBeneficiario = tipoInscricaoBeneficiario;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comAgencia(String agencia) {
        this.agencia = agencia;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comDigitoVerificadorAgencia(String digitoVerificadorAgencia) {
        this.digitoVerificadorAgencia = digitoVerificadorAgencia;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comConta(String conta) {
        this.conta = conta;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comDigitoVerificadorConta(String digitoVerificadorConta) {
        this.digitoVerificadorConta = digitoVerificadorConta;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comNumeroConvenioCobranca(String numeroConvenioCobranca) {
        this.numeroConvenioCobranca = numeroConvenioCobranca;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comNumeroControleParticipante(String numeroControleParticipante) {
        this.numeroControleParticipante = numeroControleParticipante;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comNossoNumero(Integer nossoNumero) {
        this.nossoNumero = nossoNumero;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comNumeroParcela(Integer numeroParcela) {
        this.numeroParcela = numeroParcela;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comGrupoValor(Integer grupoValor) {
        this.grupoValor = grupoValor;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comIndicativoMensagem(String indicativoMensagem) {
        this.indicativoMensagem = indicativoMensagem;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comPrefixoTitulo(String prefixoTitulo) {
        this.prefixoTitulo = prefixoTitulo;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comVariacaoCarteira(Integer variacaoCarteira) {
        this.variacaoCarteira = variacaoCarteira;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comContaCaucao(Integer contaCaucao) {
        this.contaCaucao = contaCaucao;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comNumeroContratoGarantia(Integer numeroContratoGarantia) {
        this.numeroContratoGarantia = numeroContratoGarantia;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comDvContrato(Integer dvContrato) {
        this.dvContrato = dvContrato;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comNumeroBordero(String numeroBordero) {
        this.numeroBordero = numeroBordero;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comComplemento2(String complemento2) {
        this.complemento2 = complemento2;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comTipoEmissao(Integer tipoEmissao) {
        this.tipoEmissao = tipoEmissao;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comCarteiraModalidade(Integer carteiraModalidade) {
        this.carteiraModalidade = carteiraModalidade;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comComandoMovimento(Integer comandoMovimento) {
        this.comandoMovimento = comandoMovimento;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comSeuNumero(String seuNumero) {
        this.seuNumero = seuNumero;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comValorTitulo(Double valorTitulo) {
        this.valorTitulo = valorTitulo;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comNumeroBanco(Integer numeroBanco) {
        this.numeroBanco = numeroBanco;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comPrefixoCooperativa(Integer prefixoCooperativa) {
        this.prefixoCooperativa = prefixoCooperativa;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comDigitoVerificadorPrefixo(String digitoVerificadorPrefixo) {
        this.digitoVerificadorPrefixo = digitoVerificadorPrefixo;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comEspecieTitulo(Integer especieTitulo) {
        this.especieTitulo = especieTitulo;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comAceiteTitulo(String aceiteTitulo) {
        this.aceiteTitulo = aceiteTitulo;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comPrimeiraInstrucao(Integer primeiraInstrucao) {
        this.primeiraInstrucao = primeiraInstrucao;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comSegundaInstrucao(Integer segundaInstrucao) {
        this.segundaInstrucao = segundaInstrucao;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comTaxaMoraMes(Double taxaMoraMes) {
        this.taxaMoraMes = taxaMoraMes;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comTaxaMulta(Double taxaMulta) {
        this.taxaMulta = taxaMulta;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comTipoDistribuicao(Integer tipoDistribuicao) {
        this.tipoDistribuicao = tipoDistribuicao;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comDataPrimeiroDesconto(Date dataPrimeiroDesconto) {
        this.dataPrimeiroDesconto = dataPrimeiroDesconto;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comValorPrimeiroDesconto(Double valorPrimeiroDesconto) {
        this.valorPrimeiroDesconto = valorPrimeiroDesconto;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comCodigoMoeda(Integer codigoMoeda) {
        this.codigoMoeda = codigoMoeda;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comValorAbatimento(Double valorAbatimento) {
        this.valorAbatimento = valorAbatimento;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comTipoInstricaoPagador(Integer tipoInstricaoPagador) {
        this.tipoInstricaoPagador = tipoInstricaoPagador;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comCnpjCpfPagador(String cnpjCpfPagador) {
        CnpjCpfPagador = cnpjCpfPagador;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comNomePagador(String nomePagador) {
        this.nomePagador = nomePagador;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comEnderecoPagador(String enderecoPagador) {
        this.enderecoPagador = enderecoPagador;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comBairroPagador(String bairroPagador) {
        this.bairroPagador = bairroPagador;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comCepPagador(String cepPagador) {
        this.cepPagador = cepPagador;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comCidadePagador(String cidadePagador) {
        this.cidadePagador = cidadePagador;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comUfPagador(String ufPagador) {
        this.ufPagador = ufPagador;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comObservacaoMensagem(String observacaoMensagem) {
        this.observacaoMensagem = observacaoMensagem;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comNumeroDiasProtesto(Integer numeroDiasProtesto) {
        this.numeroDiasProtesto = numeroDiasProtesto;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comComplemento3(String complemento3) {
        this.complemento3 = complemento3;
        return this;
    }

    public CnabRemessaTransacao400Bancoob comSequencialRegistro(Integer sequencialRegistro) {
        this.sequencialRegistro = sequencialRegistro;
        return this;
    }
}
