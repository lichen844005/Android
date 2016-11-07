import ClassLibrary1.*;
public class Program1
{
    public static void main (String[] args) 
    {
        try {
            DataStorageImp myDataStore = new DataStorageImp();; 
            String gameState = "Scene 2 Frame 300";
            myDataStore.putState(gameState);
            System.out.println(myDataStore.getState());     
         } catch (Exception ex) {
             System.out.println(ex); 
         }        
    }   
}