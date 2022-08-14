import java.util.Arrays;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i=0; i<9; i++) {
            boolean[] numbers = new boolean[10];
            Arrays.fill(numbers, false);
            for (int j=0; j<9; j++) {
                if (board[i][j] != '.') {
                    if (numbers[board[i][j] - '0'] == true) {
                        return false;
                    } else {
                        numbers[board[i][j] - '0'] = true;
                    }
                }
            }
        }
        
        for (int i=0; i<9; i++) {
            boolean[] numbers = new boolean[10];
            Arrays.fill(numbers, false);
            for (int j=0; j<9; j++) {
                if (board[j][i] != '.') {
                    if (numbers[board[j][i] - '0'] == true) {
                        return false;
                    } else {
                        numbers[board[j][i] - '0'] = true;
                    }
                }
            }
        }
        
        for (int a=0; a<3; a++) {
            for (int b=0; b<3; b++) {
                boolean[] numbers = new boolean[10];
                Arrays.fill(numbers, false);
                for (int i=0; i<3; i++) {
                    for (int j=0; j<3; j++) {
                        if (board[i+a*3][j+b*3] != '.') {
                             if (numbers[board[i+a*3][j+b*3] - '0'] == true) {
                                return false;
                            } else {
                                numbers[board[i+a*3][j+b*3] - '0'] = true;
                            }
                        }
                    }
                }
            }
        }
        
        return true;
    }
}