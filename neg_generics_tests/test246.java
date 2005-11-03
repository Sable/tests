public class test246 
{
Zork z;
}

interface ITest<C extends test246>
{ 
}

abstract class Test<C extends test246> implements ITest<C>
{
  protected Manager<C> m_manager;
  
  public ITest<C> get()
  {
    return m_manager.getById(getClass(), new Integer(1));
  }
    
  public static class Manager<C extends test246>
  {
    public <T extends ITest<C>> T getById(Class<T> cls, Integer id)
    {
      return null;
    }
  }
}
