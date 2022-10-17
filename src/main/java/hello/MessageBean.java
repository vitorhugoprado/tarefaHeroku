package hello;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.Serializable;
import java.time.*;



/**
 *
 * @author viter
 */
public class MessageBean implements Serializable {
     
    private String aut;
    private String lang;
    private String msg;
    private String msg2;
    
        
    public MessageBean() {
    }
    
    public String getAut() {
        return "Vitor Prado";
    }
    
    public void setLang(String value) {
        lang = value;
    }
    public String getMsg() {
        LocalTime time = LocalTime.now();
        int timeNow = 22;
        // diminui a hora por 1 por motivos de fuso horário
        switch (this.lang){
            case "pt":
                if (timeNow>=0 && timeNow<=12){
                    return "Bom Dia";
                }else{
                    if (timeNow>=13 && timeNow<=18){
                        return "Boa Tarde" + timeNow;
                    }else{
                        return "Boa Noite";
                    }
                }
                            
            case "en":
                if (timeNow>=0 && timeNow<=12){
                    return "Good Morning";
                }else{
                    if (timeNow>=13 && timeNow<=18){
                        return "Good Afternoon";
                    }else{
                        return "Good Evening";
                    }
                }
            case "de":
                if (timeNow>=0 && timeNow<=12){
                    return "Guten Morgen";
                }else{
                    if (timeNow>=13 && timeNow<=18){
                        return "Guten Nachmittag";
                    }else{
                        return "Guten Abend";
                    }
                }
            case "fr":
                 if (timeNow>=0 && timeNow<=12){
                    return "Bonjour";
                }else{
                    if (timeNow>=13 && timeNow<=18){
                        return "Bon après-midi";
                    }else{
                        return "Bonsoir";
                    }
                }
        }
        return "";
    }
    public String getMsg2() {
        switch (this.lang){
            case "pt":
                return "Elaborado por";
            case "en":
                return "Created by";
            case "de":
                return "Erstellt von";
            case "fr":
                return "Créé par";
        }
        return "";
    }
}
