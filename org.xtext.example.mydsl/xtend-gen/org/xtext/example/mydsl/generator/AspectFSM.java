package org.xtext.example.mydsl.generator;

import fr.ice.fsm.model.fsm.FSM;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;

@Aspect(className = FSM.class)
@SuppressWarnings("all")
public abstract class AspectFSM {
  public static void accept(final FSM _self, final Visitor v) {
    final org.xtext.example.mydsl.generator.AspectFSMFSMAspectProperties _self_ = org.xtext.example.mydsl.generator.AspectFSMFSMAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void accept(Visitor)
    if (_self instanceof fr.ice.fsm.model.fsm.FSM){
    	org.xtext.example.mydsl.generator.AspectFSM._privk3_accept(_self_, (fr.ice.fsm.model.fsm.FSM)_self,v);
    };
  }
  
  protected static void _privk3_accept(final AspectFSMFSMAspectProperties _self_, final FSM _self, final Visitor v) {
    v.visitFSM(_self);
  }
}
