package br.com.caelum.stella.boleto.bancos.cnab.bancoob;

import br.com.caelum.stella.boleto.bancos.cnab.CnabRemessaDetail;
import org.coury.jfilehelpers.annotations.FieldAlign;
import org.coury.jfilehelpers.annotations.FieldConverter;
import org.coury.jfilehelpers.annotations.FieldFixedLength;
import org.coury.jfilehelpers.annotations.FixedLengthRecord;
import org.coury.jfilehelpers.enums.AlignMode;
import org.coury.jfilehelpers.enums.ConverterKind;

import java.util.Date;

/**
 * Created by rafaeldalbosco on 12/03/15.
 */
@FixedLengthRecord
public class CnabRemessaDetail400Bancoob extends CnabRemessaDetail {

    @FieldFixedLength(1)
    public Integer idRegistro = 1;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(2)
    public Integer InscricaoBeneficiario = 0;

    @FieldFixedLength(14)
    public String numeroCpfCnpj = "";

    @FieldFixedLength(9)
    public Integer agencia = 0;

    @FieldFixedLength(1)
    public Integer digitoAgencia = 0;

    @FieldFixedLength(8)
    public Integer conta = 0;

    @FieldFixedLength(1)
    public String digitoConta = "";

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(6)
    public Integer numeroConvenioCobranca = 0;

    @FieldFixedLength(25)
    public String numeroControleParticipante = "";

    @FieldFixedLength(12)
    public Integer nossoNumero = 0;

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
    public String prefixoTitulos = "";

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(3)
    public Integer variacaoCarteira = 0;

    @FieldFixedLength(1)
    public Integer contaCaucao = 0;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(0)
    public Integer numeroContratoGarantia = 0;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(1)
    public String digitoContrato = "0";

    @FieldFixedLength(6)
    public Integer numeroBordero = 0;

    @FieldFixedLength(4)
    public String complementoRegistro = "";

    @FieldFixedLength(1)
    public Integer tipoEmissao = 1;

    @FieldFixedLength(2)
    public Integer carteiraModalidade = 0;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(2)
    public Integer comandoMovimento = 0;

    @FieldFixedLength(10)
    public String seuNumero = "";

    @FieldConverter(converter = ConverterKind.Date, format = "ddMMyy")
    @FieldFixedLength(6)
    public Date dataVencimento = new Date();

    @FieldConverter(converter = ConverterKind.Double, format = "00000000000.00")
    @FieldFixedLength(13)
    public Double valorTitulo = 0.0;

    @FieldFixedLength(3)
    public Integer banco = 756;

    @FieldFixedLength(4)
    public Integer prefixoAgencia = 0;

    @FieldFixedLength(1)
    public String digitoPreferenciaAgencia = "";

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(2)
    public Integer especieTitulo = 0;

    @FieldFixedLength(1)
    public String aceiteTitulo = "";

    @FieldConverter(converter = ConverterKind.Date, format = "ddMMyy")
    @FieldFixedLength(6)
    public Date dataEmissaoTitulo = new Date();

    @FieldFixedLength(2)
    public Integer primeiraInstrucao = 0;

    @FieldFixedLength(2)
    public Integer segundaInstrucao = 0;

    @FieldConverter(converter = ConverterKind.Double, format = "00.0000")
    @FieldFixedLength(6)
    public Double taxaMoraMes = 0.0;

    @FieldConverter(converter = ConverterKind.Double, format = "00.0000")
    @FieldFixedLength(6)
    public Double taxaMulta = 0.0;

    @FieldFixedLength(1)
    public Integer tipoDistribuicao = 0;

    @FieldConverter(converter = ConverterKind.Date, format = "ddMMyy")
    @FieldFixedLength(6)
    public Date dataPrimeiroDesconto = new Date();

    @FieldConverter(converter = ConverterKind.Double, format = "00000000000.00")
    @FieldFixedLength(13)
    public Double valorPrimeiroDesconto = 0.0;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(13)
    public Integer codigoMoeda = 0;

    @FieldConverter(converter = ConverterKind.Double, format = "00000000000.00")
    @FieldFixedLength(13)
    public Double valorAbatimento = 0.0;

    @FieldFixedLength(1)
    public Integer tipoInscricaoPagador = 0;

    @FieldFixedLength(14)
    public String cnpjCpf = "";

    @FieldFixedLength(40)
    public String nomePagador = "";

    @FieldFixedLength(37)
    public String enderecoPagador = "";

    @FieldFixedLength(15)
    public String bairroPagador = "";

    @FieldFixedLength(8)
    public String cepPagador = "";

    @FieldFixedLength(15)
    public String cidadePagador = "";

    @FieldFixedLength(2)
    public String ufPagador = "";

    @FieldFixedLength(40)
    public String observacao = "";

    @FieldFixedLength(2)
    public String numeroDiasProteto = "0";
    
    @FieldFixedLength(0)
    public String complementoRegistro2 = "";
    
    @FieldFixedLength(6)
    public Integer sequencialRegistro = 0;

    public CnabRemessaDetail400Bancoob comIdRegistro(Integer idRegistro) {
        this.idRegistro = idRegistro;
        return this;
    }

    public CnabRemessaDetail400Bancoob comInscricaoBeneficiario(Integer inscricaoBeneficiario) {
        InscricaoBeneficiario = inscricaoBeneficiario;
        return this;
    }

    public CnabRemessaDetail400Bancoob comNumeroCpfCnpj(String numeroCpfCnpj) {
        this.numeroCpfCnpj = numeroCpfCnpj;
        return this;
    }

    public CnabRemessaDetail400Bancoob comAgencia(Integer agencia) {
        this.agencia = agencia;
        return this;
    }

    public CnabRemessaDetail400Bancoob comEspecieTitulo(Integer especieTitulo) {
        this.especieTitulo = especieTitulo;
        return this;
    }

    public CnabRemessaDetail400Bancoob comAceiteTitulo(String aceiteTitulo) {
        this.aceiteTitulo = aceiteTitulo;
        return this;
    }

    public CnabRemessaDetail400Bancoob comDataEmissaoTitulo(Date dataEmissaoTitulo) {
        this.dataEmissaoTitulo = dataEmissaoTitulo;
        return this;
    }

    public CnabRemessaDetail400Bancoob comPrimeiraInstrucao(Integer primeiraInstrucao) {
        this.primeiraInstrucao = primeiraInstrucao;
        return this;
    }

    public CnabRemessaDetail400Bancoob comSegundaInstrucao(Integer segundaInstrucao) {
        this.segundaInstrucao = segundaInstrucao;
        return this;
    }

    public CnabRemessaDetail400Bancoob comTaxaMoraMes(Double taxaMoraMes) {
        this.taxaMoraMes = taxaMoraMes;
        return this;
    }

    public CnabRemessaDetail400Bancoob comTaxaMulta(Double taxaMulta) {
        this.taxaMulta = taxaMulta;
        return this;
    }

    public CnabRemessaDetail400Bancoob comTipoDistribuicao(Integer tipoDistribuicao) {
        this.tipoDistribuicao = tipoDistribuicao;
        return this;
    }

    public CnabRemessaDetail400Bancoob comDataPrimeiroDesconto(Date dataPrimeiroDesconto) {
        this.dataPrimeiroDesconto = dataPrimeiroDesconto;
        return this;
    }

    public CnabRemessaDetail400Bancoob comValorPrimeiroDesconto(Double valorPrimeiroDesconto) {
        this.valorPrimeiroDesconto = valorPrimeiroDesconto;
        return this;
    }

    public CnabRemessaDetail400Bancoob comCodigoMoeda(Integer codigoMoeda) {
        this.codigoMoeda = codigoMoeda;
        return this;
    }

    public CnabRemessaDetail400Bancoob comValorAbatimento(Double valorAbatimento) {
        this.valorAbatimento = valorAbatimento;
        return this;
    }

    public CnabRemessaDetail400Bancoob comTipoInscricaoPagador(Integer tipoInscricaoPagador) {
        this.tipoInscricaoPagador = tipoInscricaoPagador;
        return this;
    }

    public CnabRemessaDetail400Bancoob comCnpjCpf(String cnpjCpf) {
        this.cnpjCpf = cnpjCpf;
        return this;
    }

    public CnabRemessaDetail400Bancoob comNomePagador(String nomePagador) {
        this.nomePagador = nomePagador;
        return this;
    }

    public CnabRemessaDetail400Bancoob comEnderecoPagador(String enderecoPagador) {
        this.enderecoPagador = enderecoPagador;
        return this;
    }

    public CnabRemessaDetail400Bancoob comBairroPagador(String bairroPagador) {
        this.bairroPagador = bairroPagador;
        return this;
    }

    public CnabRemessaDetail400Bancoob comCepPagador(String cepPagador) {
        this.cepPagador = cepPagador;
        return this;
    }

    public CnabRemessaDetail400Bancoob comCidadePagador(String cidadePagador) {
        this.cidadePagador = cidadePagador;
        return this;
    }

    public CnabRemessaDetail400Bancoob comUfPagador(String ufPagador) {
        this.ufPagador = ufPagador;
        return this;
    }

    public CnabRemessaDetail400Bancoob comObservacao(String observacao) {
        this.observacao = observacao;
        return this;
    }

    public CnabRemessaDetail400Bancoob comNumeroDiasProteto(String numeroDiasProteto) {
        this.numeroDiasProteto = numeroDiasProteto;
        return this;
    }

    public CnabRemessaDetail400Bancoob comDigitoAgencia(Integer digitoAgencia) {
        this.digitoAgencia = digitoAgencia;
        return this;
    }

    public CnabRemessaDetail400Bancoob comConta(Integer conta) {
        this.conta = conta;
        return this;
    }

    public CnabRemessaDetail400Bancoob comDigitoConta(String digitoConta) {
        this.digitoConta = digitoConta;
        return this;
    }

    public CnabRemessaDetail400Bancoob comNumeroConvenioCobranca(Integer numeroConvenioCobranca) {
        this.numeroConvenioCobranca = numeroConvenioCobranca;
        return this;
    }

    public CnabRemessaDetail400Bancoob comNumeroControleParticipante(String numeroControleParticipante) {
        this.numeroControleParticipante = numeroControleParticipante;
        return this;
    }

    public CnabRemessaDetail400Bancoob comNossoNumero(Integer nossoNumero) {
        this.nossoNumero = nossoNumero;
        return this;
    }

    public CnabRemessaDetail400Bancoob comNumeroParcela(Integer numeroParcela) {
        this.numeroParcela = numeroParcela;
        return this;
    }

    public CnabRemessaDetail400Bancoob comGrupoValor(Integer grupoValor) {
        this.grupoValor = grupoValor;
        return this;
    }

    public CnabRemessaDetail400Bancoob comComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public CnabRemessaDetail400Bancoob comIndicativoMensagem(String indicativoMensagem) {
        this.indicativoMensagem = indicativoMensagem;
        return this;
    }

    public CnabRemessaDetail400Bancoob comPrefixoTitulos(String prefixoTitulos) {
        this.prefixoTitulos = prefixoTitulos;
        return this;
    }

    public CnabRemessaDetail400Bancoob comVariacaoCarteira(Integer variacaoCarteira) {
        this.variacaoCarteira = variacaoCarteira;
        return this;
    }

    public CnabRemessaDetail400Bancoob comContaCaucao(Integer contaCaucao) {
        this.contaCaucao = contaCaucao;
        return this;
    }

    public CnabRemessaDetail400Bancoob comNumeroContratoGarantia(Integer numeroContratoGarantia) {
        this.numeroContratoGarantia = numeroContratoGarantia;
        return this;
    }

    public CnabRemessaDetail400Bancoob comDigitoContrato(String digitoContrato) {
        this.digitoContrato = digitoContrato;
        return this;
    }

    public CnabRemessaDetail400Bancoob comNumeroBordero(Integer numeroBordero) {
        this.numeroBordero = numeroBordero;
        return this;
    }

    public CnabRemessaDetail400Bancoob comComplementoRegistro(String complementoRegistro) {
        this.complementoRegistro = complementoRegistro;
        return this;
    }

    public CnabRemessaDetail400Bancoob comSequencialRegistro(Integer sequencialRegistro) {
        this.sequencialRegistro = sequencialRegistro;
        return this;
    }

    public CnabRemessaDetail400Bancoob comTipoEmissao(Integer tipoEmissao) {
        this.tipoEmissao = tipoEmissao;
        return this;
    }

    public CnabRemessaDetail400Bancoob comCarteiraModalidade(Integer carteiraModalidade) {
        this.carteiraModalidade = carteiraModalidade;
        return this;
    }

    public CnabRemessaDetail400Bancoob comComandoMovimento(Integer comandoMovimento) {
        this.comandoMovimento = comandoMovimento;
        return this;
    }

    public CnabRemessaDetail400Bancoob comSeuNumero(String seuNumero) {
        this.seuNumero = seuNumero;
        return this;
    }

    public CnabRemessaDetail400Bancoob comDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
        return this;
    }

    public CnabRemessaDetail400Bancoob comValorTitulo(Double valorTitulo) {
        this.valorTitulo = valorTitulo;
        return this;
    }

    public CnabRemessaDetail400Bancoob comBanco(Integer banco) {
        this.banco = banco;
        return this;
    }

    public CnabRemessaDetail400Bancoob comPrefixoAgencia(Integer prefixoAgencia) {
        this.prefixoAgencia = prefixoAgencia;
        return this;
    }

    public CnabRemessaDetail400Bancoob comDigitoPreferenciaAgencia(String digitoPreferenciaAgencia) {
        this.digitoPreferenciaAgencia = digitoPreferenciaAgencia;
        return this;
    }

    public CnabRemessaDetail400Bancoob comComplementoRegistro2(String complementoRegistro2) {
        this.complementoRegistro2 = complementoRegistro2;
        return this;
    }
}
