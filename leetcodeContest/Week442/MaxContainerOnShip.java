public class MaxContainerOnShip {
   public static int maxContainers(int n, int w, int maxWeight) {
      int deck = n * n;
      int maxW = maxWeight / w;
      // we have to find min either of deck or maxweight it can handle
      return Math.min(deck, maxW); 
      
   }
   public static void main(String[] args) {
      maxContainers(2,3,15);
   }
   
}
