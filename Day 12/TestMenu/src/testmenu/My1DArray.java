package testmenu;

public class My1DArray {
    public double getTotal(double arr[]) {
        double sum = 0;
        for(int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        return sum;
    }
    
    public double getAverage(double arr[]) {
        double sum = 0, avg = 0;
        for(int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        avg = sum / 5;
        return avg;
    }
    
    public double getHighestInRow(double arr[], int rowNumber) {
        return 0;
    }
}
