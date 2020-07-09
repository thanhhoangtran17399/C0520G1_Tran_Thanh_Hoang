package clean_code_and_refactoring.bai_tap;


public class TennisGame {

    public static final int LOVE = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRDTY = 2;
    public static final int FOURTY = 3;

    public static String getScore(String player1Name, String player2Name, int playerScore1, int playerScore2) {
        String score = "";
        int tempScore = 0;
        if (playerScore1 == playerScore2) {
            score = checkResult(playerScore1);
        } else if (playerScore1 >= 4 || playerScore2 >= 4) {
            score = checkWin(playerScore1, playerScore2);
        } else {
            score = checkScore(playerScore1, playerScore2, score);
        }
        return score;
    }

    private static String checkResult(int playerScore1) {
        String score;
        switch (playerScore1) {
            case LOVE:
                score = "Love-All";
                break;
            case FIFTEEN:
                score = "Fifteen-All";
                break;
            case THIRDTY:
                score = "Thirty-All";
                break;
            case FOURTY:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }

    private static String checkScore(int playerScore1, int playerScore2, String score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = playerScore1;
            else {
                score += "-";
                tempScore = playerScore2;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }

    private static String checkWin(int playerScore1, int playerScore2) {
        String score;
        int minusResult = playerScore1 - playerScore2;
        boolean checkAvandtagePlayer1 = minusResult == 1;
        boolean checkAvandtagePlayer2 = minusResult == -1;
        boolean checkWinPlayer1 = minusResult >= 2;
        if (checkAvandtagePlayer1) {
            score = "Advantage player1";
        } else if (checkAvandtagePlayer2) {
            score = "Advantage player2";
        } else if (checkWinPlayer1) {
            score = "Win for player1";
        } else {
            score = "Win for player2";
        }
        return score;
    }
}