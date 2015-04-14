package br.com.caelum.stella.boleto.transformer;

import br.com.caelum.stella.boleto.bancos.cnab.Cnab;
import br.com.caelum.stella.boleto.bancos.cnab.CnabRemessaDetail;
import br.com.caelum.stella.boleto.bancos.cnab.CnabRemessaHeader;
import org.coury.jfilehelpers.engines.FileHelperEngine;
import org.coury.jfilehelpers.masterdetail.MasterDetailEngine;
import org.coury.jfilehelpers.masterdetail.MasterDetailSelector;
import org.coury.jfilehelpers.masterdetail.MasterDetails;
import org.coury.jfilehelpers.masterdetail.RecordAction;

import java.io.*;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rafaeldalbosco on 30/03/15.
 */
public class GeradorRemessaCnab<T extends CnabRemessaHeader, D extends CnabRemessaDetail> {

    private Cnab<T,D> cnab;
    private Class<T> classHeader;
    private Class<D> classDetail;

    public GeradorRemessaCnab(Class<T> classHeader, Class<D> classDetail) {
        this.classHeader = classHeader;
        this.classDetail = classDetail;
    }

    public GeradorRemessaCnab comCnab(Cnab<T,D> cnab) {
        this.cnab = cnab;
        return this;
    }

    public ByteArrayOutputStream gerarArquivo() throws IOException {
        MasterDetailEngine<T, D> engine = new MasterDetailEngine<T, D>(classHeader, classDetail,
                new MasterDetailSelector() {
                    @Override
                    public RecordAction getRecordAction(String s) {
                        if (Character.isLetter(s.charAt(0))) {
                            return RecordAction.Master;
                        } else {
                            return RecordAction.Detail;
                        }
                    }
                });

        List<MasterDetails<T, D>> res = new ArrayList<MasterDetails<T, D>>();
        res.add(new MasterDetails<T, D>(cnab.getCnabRemessaHeader(), cnab.getCnabRemessaDetails()));


        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(baos);
        engine.writeStream(osw, res);
        return baos;
    }
}
