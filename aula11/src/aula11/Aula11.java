package aula11;

import java.util.HashMap;
import java.util.Map;

public class Aula11 {


    public static void main(String[] args) {
        
        //CRIANDO UM MAP GENERICO, ONDE NÃO É DEFINIDO NENHUM TIPO, TUDO COMO OBJECT GUARDANDO NO MAP
        Map mapaUm = new HashMap();
        
        //CRIANDO UM MAP GENERICO, ONDE NÃO É DEFINIDO NENHUM TIPO, TUDO COMO OBJECT GUARDANDO NO HASHMAP
        HashMap mapaDois = new HashMap();
        
        //CRIANDO UM MAP TIPANDO VALOR E KEY COM MAP
        Map<Integer,String> mapaTres = new HashMap<>();
        
        //CRIANDO UM MAP TIPANDO VALOR E KEY COM HASHMAP
        HashMap<Integer, String> mapaQuatro = new HashMap();
        
        //ADICIONA UM ELEMENTO
        mapaQuatro.put(1, "Teste");
        mapaQuatro.put(2, "Teste");
        
        //BUSCA UM ELEMENTO PELA KEY
        mapaQuatro.get(1);        
        
        //RETORNA TODOS AS KEYS
        System.out.println(mapaQuatro.keySet());
        
    }
    
}
