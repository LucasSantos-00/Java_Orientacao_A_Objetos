package teste;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteDatas {

    public static void main(String[] args) {


        Date hoje =  new Date();
        System.out.println(hoje);

        DateFormat Formator = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println(Formator.format(hoje));

        String dataAniversario = "20/01/1985";
        DateFormat formatador2 = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date aniversario = formatador2.parse(dataAniversario);
            System.out.println(Formator.format(aniversario));
        } catch (ParseException e) {

            System.out.println("Formato invalido");


        }


    }
}
