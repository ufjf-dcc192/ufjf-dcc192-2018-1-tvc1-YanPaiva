/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DCC192.ufjf.br.dados;

import java.util.ArrayList;

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
        if(comunidade == null) {
            getInstances();
        }
        return comunidade.get(id);
    }
}
