package util;

import service.FileService;

import java.util.Random;

public class RandomUtil {
    public static int RandomIndex(int size){
        Random random = new Random();
        return random.nextInt(size);
    }
}
