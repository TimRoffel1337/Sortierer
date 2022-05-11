public class Sortierer {
  
    public int[] bubblesort(int[] pZuSortierer) {
        int temp;
        for(int i=1; i< pZuSortierer.length;i++) {
            for(int j=0; j< pZuSortierer.length; j++) {
                if(pZuSortierer[j]> pZuSortierer[j+1]) {
                    temp = pZuSortierer[j];
                    pZuSortierer[j]=pZuSortierer[j+1];
                    pZuSortierer[j+1]= temp; 
                }
            }
        }
        return pZuSortierer;
    } 
}

// Habe diese Aufgabe aus ihren "Toturial kopiert, da ich es eigenständig nicht hinbekommen habe"