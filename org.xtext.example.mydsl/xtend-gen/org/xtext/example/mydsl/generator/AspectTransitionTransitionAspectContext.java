package org.xtext.example.mydsl.generator;

import fr.ice.fsm.model.fsm.Transition;
import java.util.Map;

@SuppressWarnings("all")
public class AspectTransitionTransitionAspectContext {
  public static final AspectTransitionTransitionAspectContext INSTANCE = new AspectTransitionTransitionAspectContext();
  
  public static AspectTransitionTransitionAspectProperties getSelf(final Transition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.xtext.example.mydsl.generator.AspectTransitionTransitionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Transition, AspectTransitionTransitionAspectProperties> map = new java.util.WeakHashMap<fr.ice.fsm.model.fsm.Transition, org.xtext.example.mydsl.generator.AspectTransitionTransitionAspectProperties>();
  
  public Map<Transition, AspectTransitionTransitionAspectProperties> getMap() {
    return map;
  }
}
