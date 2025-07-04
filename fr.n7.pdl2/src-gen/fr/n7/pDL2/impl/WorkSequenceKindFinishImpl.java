/**
 * generated by Xtext 2.38.0
 */
package fr.n7.pDL2.impl;

import fr.n7.pDL2.PDL2Package;
import fr.n7.pDL2.WorkSequenceKindFinish;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Sequence Kind Finish</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.pDL2.impl.WorkSequenceKindFinishImpl#getFinished2Start <em>Finished2 Start</em>}</li>
 *   <li>{@link fr.n7.pDL2.impl.WorkSequenceKindFinishImpl#getFinished2Finish <em>Finished2 Finish</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkSequenceKindFinishImpl extends MinimalEObjectImpl.Container implements WorkSequenceKindFinish
{
  /**
   * The default value of the '{@link #getFinished2Start() <em>Finished2 Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinished2Start()
   * @generated
   * @ordered
   */
  protected static final String FINISHED2_START_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFinished2Start() <em>Finished2 Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinished2Start()
   * @generated
   * @ordered
   */
  protected String finished2Start = FINISHED2_START_EDEFAULT;

  /**
   * The default value of the '{@link #getFinished2Finish() <em>Finished2 Finish</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinished2Finish()
   * @generated
   * @ordered
   */
  protected static final String FINISHED2_FINISH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFinished2Finish() <em>Finished2 Finish</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinished2Finish()
   * @generated
   * @ordered
   */
  protected String finished2Finish = FINISHED2_FINISH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkSequenceKindFinishImpl()
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
    return PDL2Package.Literals.WORK_SEQUENCE_KIND_FINISH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFinished2Start()
  {
    return finished2Start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFinished2Start(String newFinished2Start)
  {
    String oldFinished2Start = finished2Start;
    finished2Start = newFinished2Start;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PDL2Package.WORK_SEQUENCE_KIND_FINISH__FINISHED2_START, oldFinished2Start, finished2Start));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFinished2Finish()
  {
    return finished2Finish;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFinished2Finish(String newFinished2Finish)
  {
    String oldFinished2Finish = finished2Finish;
    finished2Finish = newFinished2Finish;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PDL2Package.WORK_SEQUENCE_KIND_FINISH__FINISHED2_FINISH, oldFinished2Finish, finished2Finish));
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
      case PDL2Package.WORK_SEQUENCE_KIND_FINISH__FINISHED2_START:
        return getFinished2Start();
      case PDL2Package.WORK_SEQUENCE_KIND_FINISH__FINISHED2_FINISH:
        return getFinished2Finish();
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
      case PDL2Package.WORK_SEQUENCE_KIND_FINISH__FINISHED2_START:
        setFinished2Start((String)newValue);
        return;
      case PDL2Package.WORK_SEQUENCE_KIND_FINISH__FINISHED2_FINISH:
        setFinished2Finish((String)newValue);
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
      case PDL2Package.WORK_SEQUENCE_KIND_FINISH__FINISHED2_START:
        setFinished2Start(FINISHED2_START_EDEFAULT);
        return;
      case PDL2Package.WORK_SEQUENCE_KIND_FINISH__FINISHED2_FINISH:
        setFinished2Finish(FINISHED2_FINISH_EDEFAULT);
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
      case PDL2Package.WORK_SEQUENCE_KIND_FINISH__FINISHED2_START:
        return FINISHED2_START_EDEFAULT == null ? finished2Start != null : !FINISHED2_START_EDEFAULT.equals(finished2Start);
      case PDL2Package.WORK_SEQUENCE_KIND_FINISH__FINISHED2_FINISH:
        return FINISHED2_FINISH_EDEFAULT == null ? finished2Finish != null : !FINISHED2_FINISH_EDEFAULT.equals(finished2Finish);
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
    result.append(" (Finished2Start: ");
    result.append(finished2Start);
    result.append(", Finished2Finish: ");
    result.append(finished2Finish);
    result.append(')');
    return result.toString();
  }

} //WorkSequenceKindFinishImpl
