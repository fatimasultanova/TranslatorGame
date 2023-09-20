package service;

import service.Inter.GameServiceInter;
import service.Inter.ManagementInter;
import util.MenuUtil;

public class Management implements ManagementInter {
    private final GameServiceInter gameService;

    public Management(){
        gameService= new GameService();
    }
    @Override
    public void manage() {

        while (true) {
            int option = MenuUtil.showMenu();

            switch (option) {
                case 0:
                    System.exit(0);
                case 1:
                    gameService.play();
                    break;
                case 2:
                    gameService.add();
                    break;
                case 3:
                    gameService.show();
                    break;
                default:
                    System.out.println("Option is invalid!");

            }
        }
    }
}
