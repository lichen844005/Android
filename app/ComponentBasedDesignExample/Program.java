import DataStorageAPI.*;
public class Program
{
    public static void main (String[] args) 
    {
        Class<?> theClass;
        
         try {
            theClass = Class.forName("ClassLibrary1.DataStorageImp");
            IDataStore myDataStore = (IDataStore)theClass.newInstance(); 
            String gameState = "Scene 2 Frame 300";
            myDataStore.putState(gameState);
            System.out.println(myDataStore.getState());     
         } catch (Exception ex) {
             System.out.println(ex); 
         }        
    }   
}