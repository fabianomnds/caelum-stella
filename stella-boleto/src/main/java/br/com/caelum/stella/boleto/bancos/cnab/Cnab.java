package br.com.caelum.stella.boleto.bancos.cnab;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by rafaeldalbosco on 03/03/15.
 */
public class Cnab<T extends CnabRemessaHeader, D extends CnabRemessaDetail> {

    private T cnabRemessaHeader;
    private List<D> cnabRemessaDetails;

    public Cnab<T, D> comCnabRemessaHeader(T cnabRemessaHeader) {
        this.cnabRemessaHeader = cnabRemessaHeader;
        return this;
    }

    public Cnab<T, D> comCnabRemessaDetails(List<D> cnabRemessaDetails) {
        this.cnabRemessaDetails = cnabRemessaDetails;
        return this;
    }

    public T getCnabRemessaHeader() {
        return cnabRemessaHeader;
    }

    public List<D> getCnabRemessaDetails() {
        return cnabRemessaDetails;
    }
}
