//Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica
// (Addizione, sottrazione, moltiplicazione e divisione, min e max)
// definita in un enum, crei un metodo per calcolare l'operazione richiesta e e ritorni il risultato.
//Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a scherm

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // creo due variabile BigDecimal

        BigDecimal number1 =  new BigDecimal(20.6);
        BigDecimal number2 =  new BigDecimal(2.2);

        //Creo una istanza con il nome di OperazioneAritmetica

        OperazioneAritmetica operazioneAritmetica= new OperazioneAritmetica(CalcolOperazione.SUMMA);

        operazioneAritmetica.operazione(number1,number2);
        // Continuo a cambiare ogni operazione
        operazioneAritmetica.setTipoOperazione(CalcolOperazione.SOTTRAZIONE);
        operazioneAritmetica.operazione(number1, number2);









    }
}