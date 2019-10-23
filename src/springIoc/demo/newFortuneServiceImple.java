package springIoc.demo;

import java.util.Random;

public class newFortuneServiceImple implements FortuneService {
    @Override
    public String getFortune() {
        Random random = new Random();
        String[] arrays = new String[5];

        arrays[0] = "1";
        arrays[1] = "2";
        arrays[2] = "3";
        arrays[3] = "4";
        arrays[4] = "5";

        return String.valueOf(random.nextInt(arrays.length));



    }
}
