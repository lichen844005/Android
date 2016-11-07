package ClassLibrary1;
import DataStorageAPI.*;
public class DataStorageImp implements IDataStore
{
   String state = null;
   public void putState(String state)
   {
      this.state = state;
   }
   public String getState() 
   {
      return state;
   }
}