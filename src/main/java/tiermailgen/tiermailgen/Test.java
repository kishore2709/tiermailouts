package tiermailgen.tiermailgen;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import tiermailgen.tiermailgen.dao.impl.TierMailoutsDaoImpl;
import tiermailgen.tiermailgen.model.TierMailouts;

public class Test {

	/**
	 * @param args
	 */
	public static void getTierMailouts() {
		 TierMailoutsDaoImpl mailoutsDao = new TierMailoutsDaoImpl();
		 List<TierMailouts> mailouts = mailoutsDao.findByStatus('N');
		 System.out.println(">>>>>>> TierMailouts Size "+mailouts.size());
		 Set uniqueAppNos = new HashSet<String>();
		 Map uniqueAppCount = new HashMap<String,Integer>();
		 for(TierMailouts mailout:mailouts ){
			 uniqueAppNos.add(mailout.getAppno());
		 }
		 Iterator<String> it = uniqueAppNos.iterator();
		 while(it.hasNext()){
			 int appcount=0;
			 String appno=it.next();
			 for(TierMailouts mailout:mailouts ){
				 if(appno.equals(mailout.getAppno()))
				 ++appcount;
				 //uniqueApps.add(mailout.getAppno());
			 }
			 uniqueAppCount.put(appno, appcount);
		 }
		 System.out.println(">>>>>>> Uniq App Map Size "+uniqueAppCount.size());
		 System.out.println(">>>>>>> Uniq App Size "+uniqueAppNos.size());
		 for (Object  entry : uniqueAppCount.keySet()) {
			    System.out.println(entry+" : "+uniqueAppCount.get(entry));
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getTierMailouts();
	}

}
