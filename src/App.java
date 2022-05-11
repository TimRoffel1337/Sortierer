public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = {4,56,74,373};

        Sortierer sr = new Sortierer();

        int[] ret = sr.bubblesort(arr);

        for(int a: ret){    // Guck dir die Videos nochmal an von herr Winands 
            System.out.println(a);
        }
    }
}
