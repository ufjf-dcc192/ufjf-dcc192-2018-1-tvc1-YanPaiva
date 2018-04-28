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
            Pessoas teste1 = new Pessoas("a", "a", true);
            teste1.setDataDisponivelInicio("27/04/2018");
            teste1.setDataDisponivelTermino("05/06/2018");
            comunidade.add(teste1);
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
        for (int i=0 ;i<comunidade.size();i++) {
            if (nome.equals(comunidade.get(i).getNome()) && senha.equals(comunidade.get(i).getSenha())) {
                return comunidade.get(i);
            }
        }
        return null;
    }

    public static ArrayList<Pessoas> match(Pessoas p) {
        ArrayList<Pessoas> aux = new ArrayList<>();
        for (int i =0;i< comunidade.size();i++) {
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date date1 = sdf1.parse(comunidade.get(i).getDataDisponivelInicio());
                Date date2 = sdf2.parse(p.getDataDisponivelInicio());
                if (date1.before(date2)) {
                    aux.add(comunidade.get(i));
                }
            } catch (ParseException ex) {
                Logger.getLogger(ComunidadeAcademica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return aux;

    }
}
