package Tarea.Switch1;

public class Switch1 {

    public  int option;
    public  String showOption(){
        switch (option){
            case 1 :{
                return "su premio es una gorra..";
            }
            case 2 :{
                return "su premio es un bombon";
            }
            default:{
                return "option incorrecta";

            }
        }
    }
}
