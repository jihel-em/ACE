package org.xtext.example.mydsl.generator;

import fr.ice.fsm.model.fsm.FSM;
import java.util.Map;

@SuppressWarnings("all")
public class AspectFSMFSMAspectContext {
  public static final AspectFSMFSMAspectContext INSTANCE = new AspectFSMFSMAspectContext();
  
  public static AspectFSMFSMAspectProperties getSelf(final FSM _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.xtext.example.mydsl.generator.AspectFSMFSMAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<FSM, AspectFSMFSMAspectProperties> map = new java.util.WeakHashMap<fr.ice.fsm.model.fsm.FSM, org.xtext.example.mydsl.generator.AspectFSMFSMAspectProperties>();
  
  public Map<FSM, AspectFSMFSMAspectProperties> getMap() {
    return map;
  }
}
