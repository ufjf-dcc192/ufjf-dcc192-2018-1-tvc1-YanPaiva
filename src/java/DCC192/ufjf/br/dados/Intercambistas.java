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
public class Intercambistas {
    private static ArrayList<Pessoas> intercambistas;
    public static ArrayList<Pessoas> getInstances() {
        if (intercambistas == null) {
            intercambistas = new ArrayList<>();
        }
        return intercambistas;
    }

    public static void atualizaID() {
        for (int i = 0; i < intercambistas.size(); i++) {
            intercambistas.get(i).setId(i);
        }
    }
     public static Pessoas getInstanceById(Integer id) {
        if(intercambistas == null) {
            getInstances();
        }
        return intercambistas.get(id);
    }
}
