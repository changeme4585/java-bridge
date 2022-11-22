package bridge;
import camp.nextstep.edu.missionutils.Console;
/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    CheckInput check  = new CheckInput();
    public String readSize() {
        System.out.println("다리의 길이를 입력해주세요.");
        return  Console.readLine();
    }
    public int readBridgeSize() {
        int flag=0;
        String bridgeSize="";
        while(flag!=1) {
            bridgeSize = readSize();
            flag = check.checkInput(bridgeSize);
            if (flag == 0)
                sizeError();
        }
        System.out.println(bridgeSize+"\n");
        return Integer.valueOf(bridgeSize);
    }
    public void sizeError() {
        try {
            throw new IllegalArgumentException("[ERROR]");
        } catch (IllegalArgumentException e) {   //이거 Exception 하면 안되고 명확히 해야함
            System.out.println(e);
        } catch (IllegalStateException e) {
            System.out.println(e);
        }
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        return null;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }
}
