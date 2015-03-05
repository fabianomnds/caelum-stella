package br.com.caelum.stella.boleto.bancos.cnab.bancoob;

import br.com.caelum.stella.boleto.bancos.cnab.CnabRetornoDetail;
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
public class CnabRetornoDetail400Bancoob extends CnabRetornoDetail {

    @FieldFixedLength(1)
    public Integer idRegistro = 1;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(2)
    public Integer tipoInstricaoBeneficiario = 2;

    @FieldFixedLength(14)
    public Integer cnpjCpfBeneficiario;

    @FieldFixedLength(4)
    public Integer agencia;

    @FieldFixedLength(1)
    public Integer digitoAgencia;

    @FieldFixedLength(8)
    public Integer conta;

    @FieldFixedLength(1)
    public String digitoConta;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(6)
    public Integer numeroConvenioCobranca;

    @FieldFixedLength(25)
    public String numeroControleParticipante;

    @FieldAlign(alignMode = AlignMode.Right)
    @FieldFixedLength(11)
    public Integer nossoNumero;

    @FieldFixedLength(1)
    public String digitoNossoNumero;

    @FieldFixedLength(2)
    public Integer numeroParcela;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(4)
    public Integer grupoValor;

    @FieldFixedLength(2)
    public Integer codigoBaixaRecusa;

    @FieldFixedLength(3)
    public String prefixoTitulo;

    @FieldFixedLength(3)
    public Integer varicaoCarteira;

    @FieldFixedLength(1)
    public Integer contaCaucao;

    @FieldFixedLength(5)
    public Integer codigoReponsabilidade;

    @FieldFixedLength(1)
    public Integer digitoCodigoResponsabilidade;

    @FieldConverter(converter = ConverterKind.Double, format = "000.00")
    @FieldFixedLength(5)
    public Double taxaDesconto;

    @FieldConverter(converter = ConverterKind.Double, format = "0.0000")
    @FieldFixedLength(5)
    public Double taxaIOF;

    @FieldFixedLength(1)
    public String complemento;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(2)
    public Integer carteiraModadalidade;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(2)
    public Integer comandoMovimento;

    @FieldConverter(converter = ConverterKind.Date, format = "ddMMyy")
    @FieldFixedLength(6)
    public Date dataEntrada;

    @FieldFixedLength(10)
    public String seuNumero;

    @FieldFixedLength(20)
    public String complemento2;

    @FieldConverter(converter = ConverterKind.Date, format = "ddMMyy")
    @FieldFixedLength(6)
    public Date dataVencimento;

    @FieldConverter(converter = ConverterKind.Double, format = "00000000000.00")
    @FieldFixedLength(13)
    public Double valorTitulo;

    @FieldFixedLength(3)
    public Integer codigoBancoRecebedor;

    @FieldFixedLength(4)
    public Integer agenciaRecebedora;

    @FieldFixedLength(1)
    public String digitoAgenciaRecebdora;

    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(2)
    public Integer especieTitulo;

    @FieldConverter(converter = ConverterKind.Date, format = "ddMMyy")
    @FieldFixedLength(6)
    public Date dataCredito;

    @FieldConverter(converter = ConverterKind.Double, format = "00000.00")
    @FieldFixedLength(7)
    public Double valorTarifa;

    @FieldConverter(converter = ConverterKind.Double, format = "00000000000.00")
    @FieldFixedLength(13)
    public Double outrasDespesas;

    @FieldConverter(converter = ConverterKind.Double, format = "00000000000.00")
    @FieldFixedLength(13)
    public Double jurosDoDesconto;

    @FieldConverter(converter = ConverterKind.Double, format = "00000000000.00")
    @FieldFixedLength(13)
    public Double iofDesconto;

    @FieldConverter(converter = ConverterKind.Double, format = "00000000000.00")
    @FieldFixedLength(13)
    public Double valorAbatimento;

    @FieldConverter(converter = ConverterKind.Double, format = "00000000000.00")
    @FieldFixedLength(13)
    public Double descontoConcedido;

    @FieldConverter(converter = ConverterKind.Double, format = "00000000000.00")
    @FieldFixedLength(13)
    public Double valorRecebido;

    @FieldConverter(converter = ConverterKind.Double, format = "00000000000.00")
    @FieldFixedLength(13)
    public Double juroMora;

    @FieldConverter(converter = ConverterKind.Double, format = "00000000000.00")
    @FieldFixedLength(13)
    public Double outrosRecebimentos;

    @FieldConverter(converter = ConverterKind.Double, format = "00000000000.00")
    @FieldFixedLength(13)
    public Double abatimentoNaoAproveitadoPagador;

    @FieldConverter(converter = ConverterKind.Double, format = "00000000000.00")
    @FieldFixedLength(13)
    public Double valorLancamento;

    @FieldFixedLength(1)
    public Integer indicativoDebitoCredito;
    
    @FieldFixedLength(1)
    public Integer indicativoValor;
    
    @FieldConverter(converter = ConverterKind.Double, format = "0000000000.00")
    @FieldFixedLength(12)
    public Double valorAjuste;
    
    @FieldFixedLength(10)
    public String complemento3;
    
    @FieldFixedLength(14)
    public Integer cpfCnpjPagador;
    
    @FieldFixedLength(38)
    public String complemento4;
    
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    @FieldFixedLength(6)
    public Integer sequencialRegistor;

    public CnabRetornoDetail400Bancoob comIdRegistro(Integer idRegistro) {
        this.idRegistro = idRegistro;
        return this;
    }

    public CnabRetornoDetail400Bancoob comTipoInstricaoBeneficiario(Integer tipoInstricaoBeneficiario) {
        this.tipoInstricaoBeneficiario = tipoInstricaoBeneficiario;
        return this;
    }

    public CnabRetornoDetail400Bancoob comCnpjCpfBeneficiario(Integer cnpjCpfBeneficiario) {
        this.cnpjCpfBeneficiario = cnpjCpfBeneficiario;
        return this;
    }

    public CnabRetornoDetail400Bancoob comAgencia(Integer agencia) {
        this.agencia = agencia;
        return this;
    }

    public CnabRetornoDetail400Bancoob comDigitoAgencia(Integer digitoAgencia) {
        this.digitoAgencia = digitoAgencia;
        return this;
    }

    public CnabRetornoDetail400Bancoob comConta(Integer conta) {
        this.conta = conta;
        return this;
    }

    public CnabRetornoDetail400Bancoob comDigitoConta(String digitoConta) {
        this.digitoConta = digitoConta;
        return this;
    }

    public CnabRetornoDetail400Bancoob comNumeroConvenioCobranca(Integer numeroConvenioCobranca) {
        this.numeroConvenioCobranca = numeroConvenioCobranca;
        return this;
    }

    public CnabRetornoDetail400Bancoob comNumeroControleParticipante(String numeroControleParticipante) {
        this.numeroControleParticipante = numeroControleParticipante;
        return this;
    }

    public CnabRetornoDetail400Bancoob comNossoNumero(Integer nossoNumero) {
        this.nossoNumero = nossoNumero;
        return this;
    }

    public CnabRetornoDetail400Bancoob comDigitoNossoNumero(String digitoNossoNumero) {
        this.digitoNossoNumero = digitoNossoNumero;
        return this;
    }

    public CnabRetornoDetail400Bancoob comNumeroParcela(Integer numeroParcela) {
        this.numeroParcela = numeroParcela;
        return this;
    }

    public CnabRetornoDetail400Bancoob comGrupoValor(Integer grupoValor) {
        this.grupoValor = grupoValor;
        return this;
    }

    public CnabRetornoDetail400Bancoob comCodigoBaixaRecusa(Integer codigoBaixaRecusa) {
        this.codigoBaixaRecusa = codigoBaixaRecusa;
        return this;
    }

    public CnabRetornoDetail400Bancoob comPrefixoTitulo(String prefixoTitulo) {
        this.prefixoTitulo = prefixoTitulo;
        return this;
    }

    public CnabRetornoDetail400Bancoob comVaricaoCarteira(Integer varicaoCarteira) {
        this.varicaoCarteira = varicaoCarteira;
        return this;
    }

    public CnabRetornoDetail400Bancoob comContaCaucao(Integer contaCaucao) {
        this.contaCaucao = contaCaucao;
        return this;
    }

    public CnabRetornoDetail400Bancoob comCodigoReponsabilidade(Integer codigoReponsabilidade) {
        this.codigoReponsabilidade = codigoReponsabilidade;
        return this;
    }

    public CnabRetornoDetail400Bancoob comDigitoCodigoResponsabilidade(Integer digitoCodigoResponsabilidade) {
        this.digitoCodigoResponsabilidade = digitoCodigoResponsabilidade;
        return this;
    }

    public CnabRetornoDetail400Bancoob comTaxaDesconto(Double taxaDesconto) {
        this.taxaDesconto = taxaDesconto;
        return this;
    }

    public CnabRetornoDetail400Bancoob comTaxaIOF(Double taxaIOF) {
        this.taxaIOF = taxaIOF;
        return this;
    }

    public CnabRetornoDetail400Bancoob comComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public CnabRetornoDetail400Bancoob comCarteiraModadalidade(Integer carteiraModadalidade) {
        this.carteiraModadalidade = carteiraModadalidade;
        return this;
    }

    public CnabRetornoDetail400Bancoob comComandoMovimento(Integer comandoMovimento) {
        this.comandoMovimento = comandoMovimento;
        return this;
    }

    public CnabRetornoDetail400Bancoob comDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
        return this;
    }

    public CnabRetornoDetail400Bancoob comSeuNumero(String seuNumero) {
        this.seuNumero = seuNumero;
        return this;
    }

    public CnabRetornoDetail400Bancoob comComplemento2(String complemento2) {
        this.complemento2 = complemento2;
        return this;
    }

    public CnabRetornoDetail400Bancoob comDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
        return this;
    }

    public CnabRetornoDetail400Bancoob comValorTitulo(Double valorTitulo) {
        this.valorTitulo = valorTitulo;
        return this;
    }

    public CnabRetornoDetail400Bancoob comCodigoBancoRecebedor(Integer codigoBancoRecebedor) {
        this.codigoBancoRecebedor = codigoBancoRecebedor;
        return this;
    }

    public CnabRetornoDetail400Bancoob comAgenciaRecebedora(Integer agenciaRecebedora) {
        this.agenciaRecebedora = agenciaRecebedora;
        return this;
    }

    public CnabRetornoDetail400Bancoob comDigitoAgenciaRecebdora(String digitoAgenciaRecebdora) {
        this.digitoAgenciaRecebdora = digitoAgenciaRecebdora;
        return this;
    }

    public CnabRetornoDetail400Bancoob comEspecieTitulo(Integer especieTitulo) {
        this.especieTitulo = especieTitulo;
        return this;
    }

    public CnabRetornoDetail400Bancoob comDataCredito(Date dataCredito) {
        this.dataCredito = dataCredito;
        return this;
    }

    public CnabRetornoDetail400Bancoob comValorTarifa(Double valorTarifa) {
        this.valorTarifa = valorTarifa;
        return this;
    }

    public CnabRetornoDetail400Bancoob comOutrasDespesas(Double outrasDespesas) {
        this.outrasDespesas = outrasDespesas;
        return this;
    }

    public CnabRetornoDetail400Bancoob comJurosDoDesconto(Double jurosDoDesconto) {
        this.jurosDoDesconto = jurosDoDesconto;
        return this;
    }

    public CnabRetornoDetail400Bancoob comIofDesconto(Double iofDesconto) {
        this.iofDesconto = iofDesconto;
        return this;
    }

    public CnabRetornoDetail400Bancoob comValorAbatimento(Double valorAbatimento) {
        this.valorAbatimento = valorAbatimento;
        return this;
    }

    public CnabRetornoDetail400Bancoob comDescontoConcedido(Double descontoConcedido) {
        this.descontoConcedido = descontoConcedido;
        return this;
    }

    public CnabRetornoDetail400Bancoob comValorRecebido(Double valorRecebido) {
        this.valorRecebido = valorRecebido;
        return this;
    }

    public CnabRetornoDetail400Bancoob comJuroMora(Double juroMora) {
        this.juroMora = juroMora;
        return this;
    }

    public CnabRetornoDetail400Bancoob comOutrosRecebimentos(Double outrosRecebimentos) {
        this.outrosRecebimentos = outrosRecebimentos;
        return this;
    }

    public CnabRetornoDetail400Bancoob comAbatimentoNaoAproveitadoPagador(Double abatimentoNaoAproveitadoPagador) {
        this.abatimentoNaoAproveitadoPagador = abatimentoNaoAproveitadoPagador;
        return this;
    }

    public CnabRetornoDetail400Bancoob comValorLancamento(Double valorLancamento) {
        this.valorLancamento = valorLancamento;
        return this;
    }

    public CnabRetornoDetail400Bancoob comIndicativoDebitoCredito(Integer indicativoDebitoCredito) {
        this.indicativoDebitoCredito = indicativoDebitoCredito;
        return this;
    }

    public CnabRetornoDetail400Bancoob comIndicativoValor(Integer indicativoValor) {
        this.indicativoValor = indicativoValor;
        return this;
    }

    public CnabRetornoDetail400Bancoob comValorAjuste(Double valorAjuste) {
        this.valorAjuste = valorAjuste;
        return this;
    }

    public CnabRetornoDetail400Bancoob comComplemento3(String complemento3) {
        this.complemento3 = complemento3;
        return this;
    }

    public CnabRetornoDetail400Bancoob comCpfCnpjPagador(Integer cpfCnpjPagador) {
        this.cpfCnpjPagador = cpfCnpjPagador;
        return this;
    }

    public CnabRetornoDetail400Bancoob comComplemento4(String complemento4) {
        this.complemento4 = complemento4;
        return this;
    }

    public CnabRetornoDetail400Bancoob comSequencialRegistor(Integer sequencialRegistor) {
        this.sequencialRegistor = sequencialRegistor;
        return this;
    }
}
