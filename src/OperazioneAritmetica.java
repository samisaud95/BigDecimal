import java.math.BigDecimal;
//Creo una clase chiamatta OperazioneAritmetica
public class OperazioneAritmetica {
    //Facciamo un fill che me permette chiamare il tipo di Operazione
    public CalcolOperazione tipoOperazione;

    //facciamo getters e setters del costruttore
    public OperazioneAritmetica(CalcolOperazione tipoOperazione) {
        this.tipoOperazione = tipoOperazione;
    }
    public CalcolOperazione getTipoOperazione() {
        return tipoOperazione;
    }
// faccio anche il metodo
    public void setTipoOperazione(CalcolOperazione tipoOperazione) {
        this.tipoOperazione = tipoOperazione;
    }
// creo anche altro metodo che me permette gestionare tutti gli operazione
    public void operazione(BigDecimal number1,BigDecimal number2){
        //Usiamo switch per ogni operazione
        switch (tipoOperazione){
            case SUMMA :
              System.out.println("La summa di 2 BigDecimal è :" + number1.add(number2));
              break;
            case SOTTRAZIONE:
                System.out.println("La sottrazione di 2 BigDecimal è :" + number1.subtract(number2));
                break;
            case MOLTIPLICAZIONE:
                System.out.println("La moltiplicazione di 2 BigDecimal è :" + number1.multiply(number2));
                break;
            case DIVISIONE:
                System.out.println("La divisione di 2 BigDecimal è :" + number1.divide(number2));
                break;
            case MIN:
                System.out.println("Il min di 2 BigDecimal è :" + number1.min(number2));
                break;
            case MAX:
                System.out.println("Il max di 2 BigDecimal è :" + number1.max(number2));
                break;
            default:
                System.out.println("La operazione non è nell programma");


        }
    }
}

