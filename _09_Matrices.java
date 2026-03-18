public class _09_Matrices {

    public static boolean search(int matrix [][], int key) {
        for(int i = 0; i < matrix.length; i++) {
            for( int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    System.out.println("Found at cell (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Not Found");
        return false;
    }

    //largest number in a matrix
    public static void largest(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("Largest Number in a matrix : " + largest);
    }

    //smallest number in a matrix
    public static void smallest(int matrix[][]) {
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("Smallest Number in a matrix : " + smallest);
    }

    //Print Matrix in Spiral fashion
    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol) {
            //top
            for(int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            //right
            for(int i = startRow+1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            //bottom
            for(int j = endCol-1; j >= startCol; j--) {
                if(startCol == endCol) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            //left
            for(int i = endRow-1; i >= startRow+1; i--) {
                if(startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }

    //Diagonal Sum
    public static void diagonalSum(int matrix[][]) {
        int sum = 0;
        //Way - 1 (Time Complexity - O(n^2))
        // for(int i = 0; i < matrix.length; i++) {
        //     for(int j = 0; j < matrix[0].length; j++) {
        //         //Primary diagonal Sum
        //         if(i == j) {
        //             sum += matrix[i][j];
        //         }
        //         //Secondary Diagonal Sum 
        //         else if((i + j) == matrix.length-1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        //Way - 2 (Time Complexity - O(n))
        for(int i = 0 ; i < matrix.length; i++) {
            sum += matrix[i][i]; //Primary diagonal Sum
            if(i != matrix.length-1-i) //Covering odd length matrix too
                sum += matrix[i][matrix.length-1-i]; //secondary diagonal sum
        }



        System.out.println("Total Diagonal Sum : " + sum);
    }

    //Search in Sorted Matrix (Staircase Search)
    public static boolean stairCaseSearch(int matrix[][], int key) {
        int row = 0, col = matrix[0].length-1;

        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == key) {
                System.out.println("Found at (" + row + "," + col + ")");
                return true;
            } else if(key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Not Found!");
        return false;
    }


    public static void main(String args[]) {
        //Scanner sc = new Scanner(System.in);
        //2D Array
        // int matrix [][] = new int [3][3];
        // int n = 3; //row
        // int m = 3; //col
        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j < m; j++) {
        //         matrix[i][j] = sc.nextInt();
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        int matrix [][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int key = 15;
        // printSpiral(matrix);
        // diagonalSum(matrix);
        stairCaseSearch(matrix, key);

        // search(matrix, 80);
        // largest(matrix);
        // smallest(matrix);
        
    }
}