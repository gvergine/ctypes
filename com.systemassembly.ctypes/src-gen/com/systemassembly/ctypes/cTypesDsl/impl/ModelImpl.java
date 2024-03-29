/**
 * generated by Xtext 2.18.0.M3
 */
package com.systemassembly.ctypes.cTypesDsl.impl;

import com.systemassembly.ctypes.cTypesDsl.CTypesDslPackage;
import com.systemassembly.ctypes.cTypesDsl.DataTypeDef;
import com.systemassembly.ctypes.cTypesDsl.Model;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.systemassembly.ctypes.cTypesDsl.impl.ModelImpl#getDataTypeDefinitions <em>Data Type Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getDataTypeDefinitions() <em>Data Type Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataTypeDefinitions()
   * @generated
   * @ordered
   */
  protected EList<DataTypeDef> dataTypeDefinitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CTypesDslPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DataTypeDef> getDataTypeDefinitions()
  {
    if (dataTypeDefinitions == null)
    {
      dataTypeDefinitions = new EObjectContainmentEList<DataTypeDef>(DataTypeDef.class, this, CTypesDslPackage.MODEL__DATA_TYPE_DEFINITIONS);
    }
    return dataTypeDefinitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CTypesDslPackage.MODEL__DATA_TYPE_DEFINITIONS:
        return ((InternalEList<?>)getDataTypeDefinitions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CTypesDslPackage.MODEL__DATA_TYPE_DEFINITIONS:
        return getDataTypeDefinitions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CTypesDslPackage.MODEL__DATA_TYPE_DEFINITIONS:
        getDataTypeDefinitions().clear();
        getDataTypeDefinitions().addAll((Collection<? extends DataTypeDef>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CTypesDslPackage.MODEL__DATA_TYPE_DEFINITIONS:
        getDataTypeDefinitions().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CTypesDslPackage.MODEL__DATA_TYPE_DEFINITIONS:
        return dataTypeDefinitions != null && !dataTypeDefinitions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
