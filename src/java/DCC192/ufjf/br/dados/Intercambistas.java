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
public class Intercambistas {

    private static ArrayList<Pessoas> intercambistas;

    public static ArrayList<Pessoas> getInstances() {
        if (intercambistas == null) {
            intercambistas = new ArrayList<>();
            
            Pessoas teste1 = new Pessoas("b", "b", false);
            teste1.setDataDisponivelInicio("28/04/2018");
            teste1.setDataDisponivelTermino("05/06/2018");
            intercambistas.add(teste1);
        }
        return intercambistas;
    }

    public static void atualizaID() {
        for (int i = 0; i < intercambistas.size(); i++) {
            intercambistas.get(i).setId(i);
        }
    }

    public static Pessoas getInstanceById(Integer id) {
        if (intercambistas == null) {
            getInstances();
        }
        return intercambistas.get(id);
    }
public static Pessoas verificaSeCadastrado(String nome, String senha) {
        for (int i=0 ;i<intercambistas.size();i++) {
            if (nome.equals(intercambistas.get(i).getNome()) && senha.equals(intercambistas.get(i).getSenha())) {
                return intercambistas.get(i);
            }
        }
        return null;
    }
    public static ArrayList<Pessoas> match(Pessoas p) {
        ArrayList<Pessoas> aux = new ArrayList<>();
        for (int i =0;i< intercambistas.size();i++) {
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date date1 = sdf1.parse(intercambistas.get(i).getDataDisponivelInicio());
                Date date2 = sdf2.parse(p.getDataDisponivelInicio());
                if (date1.before(date2)) {
                    aux.add(intercambistas.get(i));
                }
            } catch (ParseException ex) {
                Logger.getLogger(ComunidadeAcademica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return aux;

    }
}