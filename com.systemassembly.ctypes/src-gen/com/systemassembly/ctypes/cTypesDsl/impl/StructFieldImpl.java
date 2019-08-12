/**
 * generated by Xtext 2.18.0.M3
 */
package com.systemassembly.ctypes.cTypesDsl.impl;

import com.systemassembly.ctypes.cTypesDsl.CTypesDslPackage;
import com.systemassembly.ctypes.cTypesDsl.DataTypeDef;
import com.systemassembly.ctypes.cTypesDsl.StructField;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.systemassembly.ctypes.cTypesDsl.impl.StructFieldImpl#getBasicType <em>Basic Type</em>}</li>
 *   <li>{@link com.systemassembly.ctypes.cTypesDsl.impl.StructFieldImpl#getDerivedType <em>Derived Type</em>}</li>
 *   <li>{@link com.systemassembly.ctypes.cTypesDsl.impl.StructFieldImpl#getArraySize <em>Array Size</em>}</li>
 *   <li>{@link com.systemassembly.ctypes.cTypesDsl.impl.StructFieldImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructFieldImpl extends MinimalEObjectImpl.Container implements StructField
{
  /**
   * The default value of the '{@link #getBasicType() <em>Basic Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasicType()
   * @generated
   * @ordered
   */
  protected static final String BASIC_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBasicType() <em>Basic Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasicType()
   * @generated
   * @ordered
   */
  protected String basicType = BASIC_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDerivedType() <em>Derived Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDerivedType()
   * @generated
   * @ordered
   */
  protected DataTypeDef derivedType;

  /**
   * The default value of the '{@link #getArraySize() <em>Array Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArraySize()
   * @generated
   * @ordered
   */
  protected static final int ARRAY_SIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getArraySize() <em>Array Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArraySize()
   * @generated
   * @ordered
   */
  protected int arraySize = ARRAY_SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StructFieldImpl()
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
    return CTypesDslPackage.Literals.STRUCT_FIELD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBasicType()
  {
    return basicType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBasicType(String newBasicType)
  {
    String oldBasicType = basicType;
    basicType = newBasicType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CTypesDslPackage.STRUCT_FIELD__BASIC_TYPE, oldBasicType, basicType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataTypeDef getDerivedType()
  {
    if (derivedType != null && derivedType.eIsProxy())
    {
      InternalEObject oldDerivedType = (InternalEObject)derivedType;
      derivedType = (DataTypeDef)eResolveProxy(oldDerivedType);
      if (derivedType != oldDerivedType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CTypesDslPackage.STRUCT_FIELD__DERIVED_TYPE, oldDerivedType, derivedType));
      }
    }
    return derivedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeDef basicGetDerivedType()
  {
    return derivedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDerivedType(DataTypeDef newDerivedType)
  {
    DataTypeDef oldDerivedType = derivedType;
    derivedType = newDerivedType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CTypesDslPackage.STRUCT_FIELD__DERIVED_TYPE, oldDerivedType, derivedType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getArraySize()
  {
    return arraySize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setArraySize(int newArraySize)
  {
    int oldArraySize = arraySize;
    arraySize = newArraySize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CTypesDslPackage.STRUCT_FIELD__ARRAY_SIZE, oldArraySize, arraySize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CTypesDslPackage.STRUCT_FIELD__NAME, oldName, name));
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
      case CTypesDslPackage.STRUCT_FIELD__BASIC_TYPE:
        return getBasicType();
      case CTypesDslPackage.STRUCT_FIELD__DERIVED_TYPE:
        if (resolve) return getDerivedType();
        return basicGetDerivedType();
      case CTypesDslPackage.STRUCT_FIELD__ARRAY_SIZE:
        return getArraySize();
      case CTypesDslPackage.STRUCT_FIELD__NAME:
        return getName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CTypesDslPackage.STRUCT_FIELD__BASIC_TYPE:
        setBasicType((String)newValue);
        return;
      case CTypesDslPackage.STRUCT_FIELD__DERIVED_TYPE:
        setDerivedType((DataTypeDef)newValue);
        return;
      case CTypesDslPackage.STRUCT_FIELD__ARRAY_SIZE:
        setArraySize((Integer)newValue);
        return;
      case CTypesDslPackage.STRUCT_FIELD__NAME:
        setName((String)newValue);
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
      case CTypesDslPackage.STRUCT_FIELD__BASIC_TYPE:
        setBasicType(BASIC_TYPE_EDEFAULT);
        return;
      case CTypesDslPackage.STRUCT_FIELD__DERIVED_TYPE:
        setDerivedType((DataTypeDef)null);
        return;
      case CTypesDslPackage.STRUCT_FIELD__ARRAY_SIZE:
        setArraySize(ARRAY_SIZE_EDEFAULT);
        return;
      case CTypesDslPackage.STRUCT_FIELD__NAME:
        setName(NAME_EDEFAULT);
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
      case CTypesDslPackage.STRUCT_FIELD__BASIC_TYPE:
        return BASIC_TYPE_EDEFAULT == null ? basicType != null : !BASIC_TYPE_EDEFAULT.equals(basicType);
      case CTypesDslPackage.STRUCT_FIELD__DERIVED_TYPE:
        return derivedType != null;
      case CTypesDslPackage.STRUCT_FIELD__ARRAY_SIZE:
        return arraySize != ARRAY_SIZE_EDEFAULT;
      case CTypesDslPackage.STRUCT_FIELD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (basicType: ");
    result.append(basicType);
    result.append(", arraySize: ");
    result.append(arraySize);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //StructFieldImpl