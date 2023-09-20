package util;

import enums.Options;

import static enums.Options.*;

public class MenuUtil {
    public static int showMenu(){
        System.out.println("--------------> Translator App <--------------\n"+
                EXIT.getVal()+PLAY.getVal()+ADD.getVal()+SHOW.getVal());
        return InputUtil.inputInt("Choose option: ");

    }
}
