package org.xtext.example.mydsl.generator;

import fr.ice.fsm.model.fsm.State;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;

@Aspect(className = State.class)
@SuppressWarnings("all")
public abstract class AspectState {
  public static void accept(final State _self, final Visitor v) {
    final org.xtext.example.mydsl.generator.AspectStateStateAspectProperties _self_ = org.xtext.example.mydsl.generator.AspectStateStateAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void accept(Visitor)
    if (_self instanceof fr.ice.fsm.model.fsm.State){
    	org.xtext.example.mydsl.generator.AspectState._privk3_accept(_self_, (fr.ice.fsm.model.fsm.State)_self,v);
    };
  }
  
  protected static void _privk3_accept(final AspectStateStateAspectProperties _self_, final State _self, final Visitor v) {
    v.visitState(_self);
  }
}
