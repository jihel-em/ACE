package org.xtext.example.mydsl.generator

import fr.ice.fsm.model.fsm.FSM
import fr.inria.diverse.k3.al.annotationprocessor.Aspect

@Aspect(className=FSM)
abstract class AspectFSM {
	def void accept(Visitor v){
		v.visitFSM(_self)
	}
}