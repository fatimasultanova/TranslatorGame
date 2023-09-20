package service;

import model.Word;
import service.Inter.FileServiceInter;
import service.Inter.GameServiceInter;
import util.InputUtil;
import util.RandomUtil;

public class GameService implements GameServiceInter {
    private final FileServiceInter fileService;

    public GameService(){
        fileService= new FileService();
    }
    @Override
    public void add() {
        System.out.println("---------------------------------");
        String key = InputUtil.inputString("English: ");
        String value = InputUtil.inputString("Azebaijan: ");

        boolean isAdded= fileService.writeFile(new Word(key,value));

        System.out.println(isAdded ? "Successfully added!" : "Fail");
        System.out.println("---------------------------------");
    }

    @Override
    public void play() {
        Word [] words = fileService.readFile();
        int point = 0;

        for (int i = 0; i < 10; i++) {
            int randomIndex = RandomUtil.RandomIndex(words.length);
            Word word = words[randomIndex];

            if (!word.isShowed()){
               String value = InputUtil.inputString(word.getKey()+ "=>");
               if(word.getValue().equalsIgnoreCase(value)){
                   point++;
               }
                word.setShowed(true);
            }else {
                i--;
            }
            
        }
        System.out.println("Congratulations!\n" + "Your point is " + point + "!");
    }


    @Override
    public void show() {
        Word[] words = fileService.readFile();
        System.out.println("------------> Words <------------");

        for (Word word: words) {
            System.out.println(word);
        }
        System.out.println("---------------------------------");

    }
}
