package bridge.constant;

import java.util.Arrays;

public enum BridgeManagement {
    MOVE_UP("U", "위", 1),
    MOVE_DOWN("D", "아래", 0);

    private final String move;
    private final String detail;
    private final int number;

    BridgeManagement(String move, String detail, int number) {
        this.move = move;
        this.detail = detail;
        this.number = number;
    }

    public String getMove() {
        return move;
    }

    public String getDetail() {
        return detail;
    }

    public static String convertNumberToMove(int randomNumber) {
        return Arrays.stream(BridgeManagement.values())
                .filter(bridge -> bridge.number == randomNumber)
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("입력이 지정된 숫자가 아닙니다! 난수 생성 모듈을 확인하세요."))
                .move;
    }

    public static BridgeManagement searchBridgeType(String move) {
        return Arrays.stream(BridgeManagement.values())
                .filter(bridge -> move.equals(bridge.move))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("허용되지 않는 값! U(위쪽) D(아래쪽) 중 하나를 입력하셔야 합니다!"));
    }
}
