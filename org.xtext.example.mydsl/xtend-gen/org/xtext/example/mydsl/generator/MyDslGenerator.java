/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.generator;

import com.google.common.collect.Iterables;
import fr.ice.fsm.model.fsm.FSM;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MyDslGenerator extends AbstractGenerator {
  private Boolean COMPILE = Boolean.valueOf(false);
  
  private Visitor v;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<FSM> _filter = Iterables.<FSM>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), FSM.class);
    for (final FSM f : _filter) {
      if ((this.COMPILE).booleanValue()) {
        System.out.println("Lancement du compilateur.");
        VisitorCompil _visitorCompil = new VisitorCompil();
        this.v = _visitorCompil;
        String _name = f.getName();
        String _plus = (_name + ".java");
        fsa.generateFile(_plus, this.v.visitFSM(f));
      } else {
        System.out.println("Lancement de l\'interpréteur.");
        VisitorInterp _visitorInterp = new VisitorInterp();
        this.v = _visitorInterp;
        this.v.visitFSM(f);
      }
    }
  }
}
