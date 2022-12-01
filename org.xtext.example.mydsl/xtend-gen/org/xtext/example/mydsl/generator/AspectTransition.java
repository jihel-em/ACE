package org.xtext.example.mydsl.generator;

import fr.ice.fsm.model.fsm.Transition;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public abstract class AspectTransition {
  public static void accept(final Transition _self, final Visitor v) {
    final org.xtext.example.mydsl.generator.AspectTransitionTransitionAspectProperties _self_ = org.xtext.example.mydsl.generator.AspectTransitionTransitionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void accept(Visitor)
    if (_self instanceof fr.ice.fsm.model.fsm.Transition){
    	org.xtext.example.mydsl.generator.AspectTransition._privk3_accept(_self_, (fr.ice.fsm.model.fsm.Transition)_self,v);
    };
  }
  
  protected static void _privk3_accept(final AspectTransitionTransitionAspectProperties _self_, final Transition _self, final Visitor v) {
    v.visitTransition(_self);
  }
}
