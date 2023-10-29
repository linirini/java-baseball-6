package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class NumberGenerator{

    public List<Integer> createRandomNumber(){
        /*
        List<Integer>computer = new ArrayList<>();
        while(computer.size()<3){
            int number = new Random().nextInt(9)+1;
            if(!computer.contains(number)){
                computer.add(number);
            }
        }
         */
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return computer;
    }
}
