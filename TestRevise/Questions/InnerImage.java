package TestRevise.Questions;

class Image {
    int width;
    int height;
    int[][] arr;

    Image(int width, int height){
        this.width = width;
        this.height = height;
        arr = new int[height][width];
    }

    void input(Scanner sc){
        for(int i = 0; i<this.height; i++){
            for(int j = 0; j<this.width; j++){
                arr[i][j ] = sc.nextInt();
            }
        }
    }

    
}

public class InnerImage {
    public static void main(String[] args) {
        
    }
}
