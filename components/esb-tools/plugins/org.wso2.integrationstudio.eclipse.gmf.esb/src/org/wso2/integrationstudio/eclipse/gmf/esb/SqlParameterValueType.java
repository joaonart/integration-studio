/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.integrationstudio.eclipse.gmf.esb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sql Parameter Value Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.wso2.integrationstudio.eclipse.gmf.esb.EsbPackage#getSqlParameterValueType()
 * @model
 * @generated
 */
public enum SqlParameterValueType implements Enumerator {
    /**
     * The '<em><b>LITERAL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LITERAL_VALUE
     * @generated
     * @ordered
     */
    LITERAL(0, "LITERAL", "LITERAL"),

    /**
     * The '<em><b>EXPRESSION</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EXPRESSION_VALUE
     * @generated
     * @ordered
     */
    EXPRESSION(1, "EXPRESSION", "EXPRESSION");

    /**
     * The '<em><b>LITERAL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>LITERAL</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LITERAL
     * @model
     * @generated
     * @ordered
     */
    public static final int LITERAL_VALUE = 0;

    /**
     * The '<em><b>EXPRESSION</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>EXPRESSION</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #EXPRESSION
     * @model
     * @generated
     * @ordered
     */
    public static final int EXPRESSION_VALUE = 1;

    /**
     * An array of all the '<em><b>Sql Parameter Value Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final SqlParameterValueType[] VALUES_ARRAY = new SqlParameterValueType[] {
            LITERAL,
            EXPRESSION,
        };

    /**
     * A public read-only list of all the '<em><b>Sql Parameter Value Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<SqlParameterValueType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Sql Parameter Value Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static SqlParameterValueType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SqlParameterValueType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Sql Parameter Value Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static SqlParameterValueType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SqlParameterValueType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Sql Parameter Value Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static SqlParameterValueType get(int value) {
        switch (value) {
            case LITERAL_VALUE: return LITERAL;
            case EXPRESSION_VALUE: return EXPRESSION;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private SqlParameterValueType(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getValue() {
      return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
      return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLiteral() {
      return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */

    @Override
    public String toString() {
        return literal;
    }

} // SqlParameterValueType
