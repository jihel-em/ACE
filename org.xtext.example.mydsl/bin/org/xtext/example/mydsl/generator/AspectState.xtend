package org.xtext.example.mydsl.generator

import fr.ice.fsm.model.fsm.State
import fr.inria.diverse.k3.al.annotationprocessor.Aspect

@Aspect(className=State)
abstract class AspectState {
	def void accept(Visitor v){
		v.visitState(_self)
	}
}