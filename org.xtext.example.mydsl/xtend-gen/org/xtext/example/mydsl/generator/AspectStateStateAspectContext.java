package org.xtext.example.mydsl.generator;

import fr.ice.fsm.model.fsm.State;
import java.util.Map;

@SuppressWarnings("all")
public class AspectStateStateAspectContext {
  public static final AspectStateStateAspectContext INSTANCE = new AspectStateStateAspectContext();
  
  public static AspectStateStateAspectProperties getSelf(final State _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.xtext.example.mydsl.generator.AspectStateStateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<State, AspectStateStateAspectProperties> map = new java.util.WeakHashMap<fr.ice.fsm.model.fsm.State, org.xtext.example.mydsl.generator.AspectStateStateAspectProperties>();
  
  public Map<State, AspectStateStateAspectProperties> getMap() {
    return map;
  }
}
