/**
 */
package fr.ice.fsm.model.fsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ice.fsm.model.fsm.State#getName <em>Name</em>}</li>
 *   <li>{@link fr.ice.fsm.model.fsm.State#getEntry <em>Entry</em>}</li>
 *   <li>{@link fr.ice.fsm.model.fsm.State#isIsInitState <em>Is Init State</em>}</li>
 * </ul>
 *
 * @see fr.ice.fsm.model.fsm.FsmPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.ice.fsm.model.fsm.FsmPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.ice.fsm.model.fsm.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' attribute.
	 * @see #setEntry(String)
	 * @see fr.ice.fsm.model.fsm.FsmPackage#getState_Entry()
	 * @model
	 * @generated
	 */
	String getEntry();

	/**
	 * Sets the value of the '{@link fr.ice.fsm.model.fsm.State#getEntry <em>Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' attribute.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(String value);

	/**
	 * Returns the value of the '<em><b>Is Init State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Init State</em>' attribute.
	 * @see #setIsInitState(boolean)
	 * @see fr.ice.fsm.model.fsm.FsmPackage#getState_IsInitState()
	 * @model
	 * @generated
	 */
	boolean isIsInitState();

	/**
	 * Sets the value of the '{@link fr.ice.fsm.model.fsm.State#isIsInitState <em>Is Init State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Init State</em>' attribute.
	 * @see #isIsInitState()
	 * @generated
	 */
	void setIsInitState(boolean value);

} // State
