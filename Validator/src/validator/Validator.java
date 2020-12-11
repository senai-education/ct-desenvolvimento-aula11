package validator;

public class Validator {

    public static void main(String[] args) {
          String cpf = "50119166003";
        int primeiroDigitoVerificador = Integer.parseInt(String.valueOf(cpf.charAt(9)));
        int seqValidaPrimeiroDigito = 10;
        int somaValidaPrimeiroDigito = 0;
        int restoDivisaoPrimeiroDigito;
        for(int i = 0; i < 9; i++){
            somaValidaPrimeiroDigito += (Integer.parseInt(String.valueOf(cpf.charAt(i))) * seqValidaPrimeiroDigito);
            seqValidaPrimeiroDigito--;
        }
        restoDivisaoPrimeiroDigito = (somaValidaPrimeiroDigito * 10) % cpf.length();
        if(restoDivisaoPrimeiroDigito == 10){
            restoDivisaoPrimeiroDigito = 0;
        }
        System.out.println(restoDivisaoPrimeiroDigito);
        if(restoDivisaoPrimeiroDigito == primeiroDigitoVerificador){
            System.out.println("PRIMEIRO DIGITO FOI VALIDADO");
        }else {
            System.out.println("PRIMEIRO DIGITO NÃO É VALIDO E CONSEQUENTEMENTE CPF TAMBÉM É");
        }
        
        /*----------------------------------*/
        int segundoDigitoVerificador = Integer.parseInt(String.valueOf(cpf.charAt(10)));
        int seqValidaSegundoDigito = 11;
        int somaValidaSegundoDigito = 0;
        int restoDivisaoSegundoDigito;
        for(int i = 0; i < 10; i++){
            somaValidaSegundoDigito += (Integer.parseInt(String.valueOf(cpf.charAt(i))) * seqValidaSegundoDigito);
            seqValidaSegundoDigito--;
        }
        restoDivisaoSegundoDigito = (somaValidaSegundoDigito * 10) % cpf.length();
        if(restoDivisaoSegundoDigito == 10){
            restoDivisaoSegundoDigito = 0;
        }
        System.out.println(restoDivisaoSegundoDigito);
        if(restoDivisaoSegundoDigito == segundoDigitoVerificador){
            System.out.println("SEGUNDO DIGITO FOI VALIDADO");
        }else {
            System.out.println("SEGUNDO DIGITO NÃO É VALIDO E CONSEQUENTEMENTE CPF TAMBÉM É");
        }
        
    }
    
}
