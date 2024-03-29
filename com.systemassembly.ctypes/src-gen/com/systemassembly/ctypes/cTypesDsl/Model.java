/**
 * generated by Xtext 2.18.0.M3
 */
package com.systemassembly.ctypes.cTypesDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.systemassembly.ctypes.cTypesDsl.Model#getDataTypeDefinitions <em>Data Type Definitions</em>}</li>
 * </ul>
 *
 * @see com.systemassembly.ctypes.cTypesDsl.CTypesDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Data Type Definitions</b></em>' containment reference list.
   * The list contents are of type {@link com.systemassembly.ctypes.cTypesDsl.DataTypeDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Type Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Type Definitions</em>' containment reference list.
   * @see com.systemassembly.ctypes.cTypesDsl.CTypesDslPackage#getModel_DataTypeDefinitions()
   * @model containment="true"
   * @generated
   */
  EList<DataTypeDef> getDataTypeDefinitions();

} // Model
