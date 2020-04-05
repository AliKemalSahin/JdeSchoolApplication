package model.eo;

import java.math.BigDecimal;

import java.sql.Timestamp;

import model.common.ModelUtil;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Sep 14 22:52:37 BST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TeachersImpl
  extends EntityImpl
{
  /**
   * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
   */
  protected enum AttributesEnum
  {
    TeacherId,
    TeacherName,
    TeacherPhone,
    TeacherAddress,
    TeacherDateOfBirth,
    TeacherGendar;
    private static AttributesEnum[] vals = null;
    private static final int firstIndex = 0;

    protected int index()
    {
      return AttributesEnum.firstIndex() + ordinal();
    }

    protected static final int firstIndex()
    {
      return firstIndex;
    }

    protected static int count()
    {
      return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
    }

    protected static final AttributesEnum[] staticValues()
    {
      if (vals == null)
      {
        vals = AttributesEnum.values();
      }
      return vals;
    }
  }

  public static final int TEACHERID = AttributesEnum.TeacherId.index();
  public static final int TEACHERNAME = AttributesEnum.TeacherName.index();
  public static final int TEACHERPHONE = AttributesEnum.TeacherPhone.index();
  public static final int TEACHERADDRESS = AttributesEnum.TeacherAddress.index();
  public static final int TEACHERDATEOFBIRTH = AttributesEnum.TeacherDateOfBirth.index();
  public static final int TEACHERGENDAR = AttributesEnum.TeacherGendar.index();

  /**
   * This is the default constructor (do not remove).
   */
  public TeachersImpl()
  {
  }

  /**
   * @return the definition object for this instance class.
   */
  public static synchronized EntityDefImpl getDefinitionObject()
  {
    return EntityDefImpl.findDefObject("model.eo.Teachers");
  }

  /**
   * Gets the attribute value for TeacherId, using the alias name TeacherId.
   * @return the value of TeacherId
   */
  public BigDecimal getTeacherId()
  {
    return (BigDecimal) getAttributeInternal(TEACHERID);
  }

  /**
   * Sets <code>value</code> as the attribute value for TeacherId.
   * @param value value to set the TeacherId
   */
  public void setTeacherId(BigDecimal value)
  {
    setAttributeInternal(TEACHERID, value);
  }

  /**
   * Gets the attribute value for TeacherName, using the alias name TeacherName.
   * @return the value of TeacherName
   */
  public String getTeacherName()
  {
    return (String) getAttributeInternal(TEACHERNAME);
  }

  /**
   * Sets <code>value</code> as the attribute value for TeacherName.
   * @param value value to set the TeacherName
   */
  public void setTeacherName(String value)
  {
    setAttributeInternal(TEACHERNAME, value);
  }

  /**
   * Gets the attribute value for TeacherPhone, using the alias name TeacherPhone.
   * @return the value of TeacherPhone
   */
  public String getTeacherPhone()
  {
    return (String) getAttributeInternal(TEACHERPHONE);
  }

  /**
   * Sets <code>value</code> as the attribute value for TeacherPhone.
   * @param value value to set the TeacherPhone
   */
  public void setTeacherPhone(String value)
  {
    setAttributeInternal(TEACHERPHONE, value);
  }

  /**
   * Gets the attribute value for TeacherAddress, using the alias name TeacherAddress.
   * @return the value of TeacherAddress
   */
  public String getTeacherAddress()
  {
    return (String) getAttributeInternal(TEACHERADDRESS);
  }

  /**
   * Sets <code>value</code> as the attribute value for TeacherAddress.
   * @param value value to set the TeacherAddress
   */
  public void setTeacherAddress(String value)
  {
    setAttributeInternal(TEACHERADDRESS, value);
  }

  /**
   * Gets the attribute value for TeacherDateOfBirth, using the alias name TeacherDateOfBirth.
   * @return the value of TeacherDateOfBirth
   */
  public Timestamp getTeacherDateOfBirth()
  {
    return (Timestamp) getAttributeInternal(TEACHERDATEOFBIRTH);
  }

  /**
   * Sets <code>value</code> as the attribute value for TeacherDateOfBirth.
   * @param value value to set the TeacherDateOfBirth
   */
  public void setTeacherDateOfBirth(Timestamp value)
  {
    setAttributeInternal(TEACHERDATEOFBIRTH, value);
  }

  /**
   * Gets the attribute value for TeacherGendar, using the alias name TeacherGendar.
   * @return the value of TeacherGendar
   */
  public String getTeacherGendar()
  {
    return (String) getAttributeInternal(TEACHERGENDAR);
  }

  /**
   * Sets <code>value</code> as the attribute value for TeacherGendar.
   * @param value value to set the TeacherGendar
   */
  public void setTeacherGendar(String value)
  {
    setAttributeInternal(TEACHERGENDAR, value);
  }


  /**
   * @param teacherId key constituent

   * @return a Key object based on given key constituents.
   */
  public static Key createPrimaryKey(BigDecimal teacherId)
  {
    return new Key(new Object[] { teacherId });
  }

  /**
   * Add attribute defaulting logic in this method.
   * @param attributeList list of attribute names/values to initialize the row
   */
  protected void create(AttributeList attributeList)
  {
    super.create(attributeList);
    setTeacherId(ModelUtil.getSequaenceNextVal(getDBTransaction()));
    setTeacherGendar("M");
  }
}
