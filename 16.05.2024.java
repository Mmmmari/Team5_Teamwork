public class Main {
    public static void main(String[] args) { 
        int size = 11;
        int[][] grid = new int[size][size];
        int bombColumn = 5;
        int bombRow = 5;


        grid[bombRow][bombColumn] = 5; // Center
        if(bombRow != 0) {
            grid[bombRow - 2][bombColumn] = 8; 
            grid[bombRow - 2][bombColumn+1] = 8; 

            if(bombColumn != 0){
                grid[bombRow - 2][bombColumn - 2] = 8; 
                grid[bombRow - 2][bombColumn - 1] = 8; 

            }

            if(bombColumn != size - 1){
                grid[bombRow - 2][bombColumn + 2] = 8; 
                grid[bombRow - 1][bombColumn + 2] = 8; 
                grid[bombRow - 1][bombColumn - 2] = 8; 



            }
        }

        if(bombRow != size - 1){
            grid[bombRow + 2][bombColumn] = 8; 
            grid[bombRow + 2][bombColumn -1] = 8; 

            if(bombColumn != 0){
                grid[bombRow + 2][bombColumn - 2] = 8; 
                grid[bombRow + 1][bombColumn - 2] = 8; 

            }
            if(bombColumn != size - 1){
                grid[bombRow + 2][bombColumn + 2] = 8; 
                grid[bombRow + 2][bombColumn + 1] = 8;
                grid[bombRow + 1][bombColumn + 2] = 8; 

            }

        }

        if(bombColumn != 0){
            grid[bombRow][bombColumn - 2] = 8; 
        }
        if(bombColumn != size - 1){
            grid[bombRow][bombColumn + 2] = 8; 
        }


        printArray(grid, size);
    }

    public static void printArray(int[][] array, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
