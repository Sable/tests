public class test206 
{
}

interface ITest<C extends test206>
{ 
}

abstract class Test<C extends test206> implements ITest<C>
{
  protected Manager<C> m_manager;
  
  public ITest<C> get()
  {
    return m_manager.getById(getClass(), new Integer(1));
  }
    
  public static class Manager<C extends test206>
  {
    public <T extends ITest<C>> T getById(Class<T> cls, Integer id)
    {
      return null;
    }
  }
}
