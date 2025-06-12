/**
 */
package simplepdl.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import simplepdl.Need;
import simplepdl.SimplepdlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Need</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NeedTest extends TestCase {

	/**
	 * The fixture for this Need test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Need fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NeedTest.class);
	}

	/**
	 * Constructs a new Need test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeedTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Need test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Need fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Need test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Need getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SimplepdlFactory.eINSTANCE.createNeed());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //NeedTest
