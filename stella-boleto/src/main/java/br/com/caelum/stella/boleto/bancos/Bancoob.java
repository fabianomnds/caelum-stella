package br.com.caelum.stella.boleto.bancos;

import br.com.caelum.stella.boleto.Banco;
import br.com.caelum.stella.boleto.Beneficiario;
import br.com.caelum.stella.boleto.Boleto;
import br.com.caelum.stella.boleto.exception.CriacaoBoletoException;

import static br.com.caelum.stella.boleto.utils.StellaStringUtils.leftPadWithZeros;

/**
 * Gera dados de um boleto relativos ao Banco Bancoob/Sicoob.
 *
 * Created by rafaeldalbosco on 23/02/15.
 */
public class Bancoob extends AbstractBanco implements Banco {

    private static final long serialVersionUID = 1L;

    private static final String NUMERO_BANCOOB = "756";
    private static final String DIGITO_NUMERO_BANCOOB = "0";
    private static final String CARTEIRA_1 = "1";
    private static final String CARTEIRA_3 = "3";
    private static final String NUMERO_PARCELA = "001";

    @Override
    public String geraCodigoDeBarrasPara(Boleto boleto) {
        StringBuilder campoLivre = new StringBuilder();
        Beneficiario beneficiario = boleto.getBeneficiario();

        if (beneficiario.getCarteira().equals(CARTEIRA_1) || beneficiario.getCarteira().equals(CARTEIRA_3)) {
            campoLivre.append(boleto.getBanco().getCarteiraFormatado(beneficiario));
            campoLivre.append(boleto.getBanco().getAgencia(beneficiario));
            campoLivre.append(boleto.getBanco().getModalidade(beneficiario));
            campoLivre.append(boleto.getBanco().getCodigoBeneficiarioFormatado(beneficiario));
            campoLivre.append(boleto.getBanco().getNossoNumeroFormatado(beneficiario));
            campoLivre.append(NUMERO_PARCELA);
        } else {
            throw new CriacaoBoletoException(
                    "Erro na geração do código de barras. Nenhuma regra se aplica. " +
                            "Verifique carteira e demais dados.");
        }
        return new CodigoDeBarrasBuilder(boleto).comCampoLivre(campoLivre);
    }

    @Override
    public String getAgencia(Beneficiario beneficiario) {
        return leftPadWithZeros(beneficiario.getAgencia(), 4);
    }

    @Override
    public String getNumeroFormatado() {
        return NUMERO_BANCOOB;
    }

    @Override
    public java.net.URL getImage() {
        String arquivo = "/br/com/caelum/stella/boleto/img/%s.png";
        String imagem = String.format(arquivo, getNumeroFormatado());
        return getClass().getResource(imagem);
    }

    @Override
    public String getCodigoBeneficiarioFormatado(Beneficiario beneficiario) {
        return leftPadWithZeros(beneficiario.getCodigoBeneficiario(), 7);
    }

    @Override
    public String getCarteiraFormatado(Beneficiario beneficiario) {
        return leftPadWithZeros(beneficiario.getCarteira(),1);
    }

    @Override
    public String getNossoNumeroFormatado(Beneficiario beneficiario) {
        return leftPadWithZeros(beneficiario.getNossoNumero(), 8);
    }

    @Override
    public String getNumeroFormatadoComDigito() {
        return NUMERO_BANCOOB + "-" + DIGITO_NUMERO_BANCOOB;
    }

    @Override
    public String getNossoNumeroECodigoDocumento(Boleto boleto) {
        return getNossoNumeroFormatado(boleto.getBeneficiario());
    }

    @Override
    public String getModalidade(Beneficiario beneficiario) {
        return leftPadWithZeros(beneficiario.getModalidade(), 2);
    }
}
