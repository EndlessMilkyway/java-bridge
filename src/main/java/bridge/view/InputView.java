package bridge.view;

import bridge.constant.BridgeLengthRule;
import bridge.constant.BridgePattern;
import camp.nextstep.edu.missionutils.Console;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        String bridgeSize = Console.readLine();
        /*if (bridgeSize < BridgeLengthRule.MIN_LENGTH.getValue() || bridgeSize > BridgeLengthRule.MAX_LENGTH.getValue()) {
            throw new IllegalArgumentException("다리 길이는 3 이상 20 이하여야 합니다!");
        }*/

        return convertToInteger(bridgeSize);
    }

    private int convertToInteger(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("입력하신 값은 정수가 아닙니다.");
        }
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public BridgePattern readMoving() {
        String move = Console.readLine();

        return BridgePattern.searchBridgeType(move);
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    /*public String readGameCommand() {
        String command = readValue();
        if (command.equals(Command.DO_QUIT.getCommand()) || command.equals(Command.DO_RETRY.getCommand())) {
            return command;
        }
        throw new IllegalArgumentException("허용되지 않는 값! R(재시작) Q(종료) 중 하나를 입력하셔야 합니다!");
    }*/
}
