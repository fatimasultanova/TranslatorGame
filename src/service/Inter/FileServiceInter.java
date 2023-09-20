package service.Inter;

import model.Word;

public interface FileServiceInter {
    Word[] readFile();
    boolean writeFile(Word word);
}
