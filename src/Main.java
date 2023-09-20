import service.FileService;
import service.Inter.FileServiceInter;
import service.Inter.ManagementInter;
import service.Management;

public class Main {
    public static void main(String[] args) {
        ManagementInter management = new Management();
        management.manage();
    }
}