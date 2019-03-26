package tiermailgen.tiermailgen.dao;

import java.io.Serializable;
import java.util.Collection;

public abstract interface BaseDao
{
  public abstract Serializable save(Object paramObject);
  
  public abstract void update(Object paramObject);
  
  public abstract void delete(Object paramObject);
  
  public abstract void saveOrUpdateAll(Collection paramCollection);
  
  public abstract void saveOrUpdate(Object paramObject);
  
  public abstract void deleteAll(Collection paramCollection);
}
