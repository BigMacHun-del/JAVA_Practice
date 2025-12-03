package chapter1;

public class One_9 {
    public static void main(String[] args) {
        //TODO: 배열
        int[] arr = new int[5]; //// ✅ 선언과 동시에 길이를 설정합니다.
        int arrLength = arr.length;
        System.out.println("arrLength = " + arrLength); // arrLength = 5

        int[] arr2 = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("numbers[" + i + "] = " + arr2[i]);
        }

        //2차원 배열
        boolean[][] board = {
                {true, false}, // 0행의 0열, 0행의 1열,
                {false, true}  // 1행의 0열, 1행의 1열
        };

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j]) {
                    System.out.println("검은돌(●) 위치: (" + i + "," + j + ")");
                }
            }
        }
    }





}
