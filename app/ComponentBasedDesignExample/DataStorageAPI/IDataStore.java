package DataStorageAPI;
public interface IDataStore
{
   String getState();
   void putState(String state);
}