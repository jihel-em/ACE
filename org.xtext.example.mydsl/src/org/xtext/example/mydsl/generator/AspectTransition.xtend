package org.xtext.example.mydsl.generator

import fr.ice.fsm.model.fsm.Transition
import fr.inria.diverse.k3.al.annotationprocessor.Aspect

@Aspect(className=Transition)
abstract class AspectTransition {
	def void accept(Visitor v){
		v.visitTransition(_self)
	}
}