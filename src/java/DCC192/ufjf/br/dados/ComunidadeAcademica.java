/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DCC192.ufjf.br.dados;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YanNotebook
 */
public class ComunidadeAcademica {

    private static ArrayList<Pessoas> comunidade;

    public static ArrayList<Pessoas> getInstances() {
        if (comunidade == null) {
            comunidade = new ArrayList<>();
        }
        return comunidade;
    }

    public static void atualizaID() {
        for (int i = 0; i < comunidade.size(); i++) {
            comunidade.get(i).setId(i);
        }
    }

    public static Pessoas getInstanceById(Integer id) {
        if (comunidade == null) {
            getInstances();
        }
        return comunidade.get(id);
    }

    public static Pessoas verificaSeCadastrado(String nome, String senha) {
        for (Pessoas p : comunidade) {
            if (nome.equals(p.getNome()) && senha.equals(p.getSenha())) {
                return p;
            }
        }
        return null;
    }

    public static ArrayList<Pessoas> match(Pessoas p) {
        ArrayList<Pessoas> aux = new ArrayList<>();
        for (Pessoas p2 : comunidade) {
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date date1 = sdf1.parse(p2.getDataDisponivelInicio());
                Date date2 = sdf2.parse(p.getDataDisponivelInicio());
                if (date1.before(date2)) {
                    aux.add(p2);
                }
            } catch (ParseException ex) {
                Logger.getLogger(ComunidadeAcademica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return aux;

    }
}
