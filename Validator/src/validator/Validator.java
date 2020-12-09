package validator;

public class Validator {

    public static void main(String[] args) {
        String t = "09937032911";
        int resultadoSomaLoca = 0;
        int indiceContrario = 10;
        for(int i = 0; i < 9; i++){
           resultadoSomaLoca += Integer.parseInt(String.valueOf(t.charAt(i))) * indiceContrario;
           indiceContrario--;
        }             
            
        int validacaoUm = (resultadoSomaLoca * 10) % t.length();
        if(validacaoUm == Integer.parseInt(String.valueOf(t.charAt(9)))){
            System.out.println("VALIDOU PRIMEIRO DIGITO");
        }
        
        int resultadoSomaLoca2 = 0;
        int indiceContrario2 = 11;
        for(int i = 0; i < 10; i++){
           resultadoSomaLoca2 += Integer.parseInt(String.valueOf(t.charAt(i))) * indiceContrario2;
           indiceContrario2--;
        }             
            
        int validacaoDois = (resultadoSomaLoca2 * 10) % t.length();
        if(validacaoDois == Integer.parseInt(String.valueOf(t.charAt(10)))){
            System.out.println("VALIDOU SEGUNDO DIGITO");
        }
    }
    
}
