import java.util.*;

public class spiral {
    public static void printspiral(int matrix[][]){
        int startrow=0;
        int endrow=matrix.length-1;
        int startcolumn=0;
        int endcolumn=matrix[0].length-1;
        while(startrow<=endrow && startcolumn<=endcolumn){
            //top
            for(int j=startcolumn;j<=endcolumn;j++){
                System.out.println(matrix[startrow][j]);
            }
            //right
            for(int i =startrow+1;i<=endrow;i++){
                System.out.println(matrix[i][endrow]);
            
            }
            //bottom
            for(int j=endcolumn-1;j>=startcolumn;j--){
                if(startrow==endrow){
                   break;
                }
                System.out.println(matrix[endrow][j]);
            }
            //left
            for(int i=endrow-1;i>startrow;i--){
                if(startcolumn==endcolumn){
                   break;
                }
                System.out.println(matrix[i][startcolumn]);
            }
            startrow++;
            endrow--;
            startcolumn++;
            endcolumn--;
        }


    }
    public static void main(String[] args){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printspiral(matrix);
    }
}
