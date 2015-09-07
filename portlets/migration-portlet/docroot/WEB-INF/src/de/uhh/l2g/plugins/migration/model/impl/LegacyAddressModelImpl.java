/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package de.uhh.l2g.plugins.migration.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import de.uhh.l2g.plugins.migration.model.LegacyAddress;
import de.uhh.l2g.plugins.migration.model.LegacyAddressModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the LegacyAddress service. Represents a row in the &quot;Address&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link de.uhh.l2g.plugins.migration.model.LegacyAddressModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LegacyAddressImpl}.
 * </p>
 *
 * @author unihh
 * @see LegacyAddressImpl
 * @see de.uhh.l2g.plugins.migration.model.LegacyAddress
 * @see de.uhh.l2g.plugins.migration.model.LegacyAddressModel
 * @generated
 */
public class LegacyAddressModelImpl extends BaseModelImpl<LegacyAddress>
	implements LegacyAddressModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a legacy address model instance should use the {@link de.uhh.l2g.plugins.migration.model.LegacyAddress} interface instead.
	 */
	public static final String TABLE_NAME = "Address";
	public static final Object[][] TABLE_COLUMNS = {
			{ "addressId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "classNameId", Types.BIGINT },
			{ "classPK", Types.BIGINT },
			{ "street1", Types.VARCHAR },
			{ "street2", Types.VARCHAR },
			{ "street3", Types.VARCHAR },
			{ "city", Types.VARCHAR },
			{ "zip", Types.VARCHAR },
			{ "regionId", Types.BIGINT },
			{ "countryId", Types.BIGINT },
			{ "typeId", Types.INTEGER },
			{ "mailing", Types.BOOLEAN },
			{ "primary_", Types.BOOLEAN }
		};
	public static final String TABLE_SQL_CREATE = "create table Address (addressId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,classNameId LONG,classPK LONG,street1 VARCHAR(75) null,street2 VARCHAR(75) null,street3 VARCHAR(75) null,city VARCHAR(75) null,zip VARCHAR(75) null,regionId LONG,countryId LONG,typeId INTEGER,mailing BOOLEAN,primary_ BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table Address";
	public static final String ORDER_BY_JPQL = " ORDER BY legacyAddress.createDate ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Address.createDate ASC";
	public static final String DATA_SOURCE = "anotherDataSource";
	public static final String SESSION_FACTORY = "anotherSessionFactory";
	public static final String TX_MANAGER = "anotherTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.de.uhh.l2g.plugins.migration.model.LegacyAddress"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.de.uhh.l2g.plugins.migration.model.LegacyAddress"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.de.uhh.l2g.plugins.migration.model.LegacyAddress"),
			true);
	public static long CLASSNAMEID_COLUMN_BITMASK = 1L;
	public static long CLASSPK_COLUMN_BITMASK = 2L;
	public static long COMPANYID_COLUMN_BITMASK = 4L;
	public static long MAILING_COLUMN_BITMASK = 8L;
	public static long PRIMARY_COLUMN_BITMASK = 16L;
	public static long USERID_COLUMN_BITMASK = 32L;
	public static long CREATEDATE_COLUMN_BITMASK = 64L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.de.uhh.l2g.plugins.migration.model.LegacyAddress"));

	public LegacyAddressModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _addressId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAddressId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _addressId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return LegacyAddress.class;
	}

	@Override
	public String getModelClassName() {
		return LegacyAddress.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("addressId", getAddressId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("classNameId", getClassNameId());
		attributes.put("classPK", getClassPK());
		attributes.put("street1", getStreet1());
		attributes.put("street2", getStreet2());
		attributes.put("street3", getStreet3());
		attributes.put("city", getCity());
		attributes.put("zip", getZip());
		attributes.put("regionId", getRegionId());
		attributes.put("countryId", getCountryId());
		attributes.put("typeId", getTypeId());
		attributes.put("mailing", getMailing());
		attributes.put("primary", getPrimary());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long addressId = (Long)attributes.get("addressId");

		if (addressId != null) {
			setAddressId(addressId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long classNameId = (Long)attributes.get("classNameId");

		if (classNameId != null) {
			setClassNameId(classNameId);
		}

		Long classPK = (Long)attributes.get("classPK");

		if (classPK != null) {
			setClassPK(classPK);
		}

		String street1 = (String)attributes.get("street1");

		if (street1 != null) {
			setStreet1(street1);
		}

		String street2 = (String)attributes.get("street2");

		if (street2 != null) {
			setStreet2(street2);
		}

		String street3 = (String)attributes.get("street3");

		if (street3 != null) {
			setStreet3(street3);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String zip = (String)attributes.get("zip");

		if (zip != null) {
			setZip(zip);
		}

		Long regionId = (Long)attributes.get("regionId");

		if (regionId != null) {
			setRegionId(regionId);
		}

		Long countryId = (Long)attributes.get("countryId");

		if (countryId != null) {
			setCountryId(countryId);
		}

		Integer typeId = (Integer)attributes.get("typeId");

		if (typeId != null) {
			setTypeId(typeId);
		}

		Boolean mailing = (Boolean)attributes.get("mailing");

		if (mailing != null) {
			setMailing(mailing);
		}

		Boolean primary = (Boolean)attributes.get("primary");

		if (primary != null) {
			setPrimary(primary);
		}
	}

	@Override
	public long getAddressId() {
		return _addressId;
	}

	@Override
	public void setAddressId(long addressId) {
		_addressId = addressId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_columnBitmask = -1L;

		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public String getClassName() {
		if (getClassNameId() <= 0) {
			return StringPool.BLANK;
		}

		return PortalUtil.getClassName(getClassNameId());
	}

	@Override
	public void setClassName(String className) {
		long classNameId = 0;

		if (Validator.isNotNull(className)) {
			classNameId = PortalUtil.getClassNameId(className);
		}

		setClassNameId(classNameId);
	}

	@Override
	public long getClassNameId() {
		return _classNameId;
	}

	@Override
	public void setClassNameId(long classNameId) {
		_columnBitmask |= CLASSNAMEID_COLUMN_BITMASK;

		if (!_setOriginalClassNameId) {
			_setOriginalClassNameId = true;

			_originalClassNameId = _classNameId;
		}

		_classNameId = classNameId;
	}

	public long getOriginalClassNameId() {
		return _originalClassNameId;
	}

	@Override
	public long getClassPK() {
		return _classPK;
	}

	@Override
	public void setClassPK(long classPK) {
		_columnBitmask |= CLASSPK_COLUMN_BITMASK;

		if (!_setOriginalClassPK) {
			_setOriginalClassPK = true;

			_originalClassPK = _classPK;
		}

		_classPK = classPK;
	}

	public long getOriginalClassPK() {
		return _originalClassPK;
	}

	@Override
	public String getStreet1() {
		if (_street1 == null) {
			return StringPool.BLANK;
		}
		else {
			return _street1;
		}
	}

	@Override
	public void setStreet1(String street1) {
		_street1 = street1;
	}

	@Override
	public String getStreet2() {
		if (_street2 == null) {
			return StringPool.BLANK;
		}
		else {
			return _street2;
		}
	}

	@Override
	public void setStreet2(String street2) {
		_street2 = street2;
	}

	@Override
	public String getStreet3() {
		if (_street3 == null) {
			return StringPool.BLANK;
		}
		else {
			return _street3;
		}
	}

	@Override
	public void setStreet3(String street3) {
		_street3 = street3;
	}

	@Override
	public String getCity() {
		if (_city == null) {
			return StringPool.BLANK;
		}
		else {
			return _city;
		}
	}

	@Override
	public void setCity(String city) {
		_city = city;
	}

	@Override
	public String getZip() {
		if (_zip == null) {
			return StringPool.BLANK;
		}
		else {
			return _zip;
		}
	}

	@Override
	public void setZip(String zip) {
		_zip = zip;
	}

	@Override
	public long getRegionId() {
		return _regionId;
	}

	@Override
	public void setRegionId(long regionId) {
		_regionId = regionId;
	}

	@Override
	public long getCountryId() {
		return _countryId;
	}

	@Override
	public void setCountryId(long countryId) {
		_countryId = countryId;
	}

	@Override
	public int getTypeId() {
		return _typeId;
	}

	@Override
	public void setTypeId(int typeId) {
		_typeId = typeId;
	}

	@Override
	public boolean getMailing() {
		return _mailing;
	}

	@Override
	public boolean isMailing() {
		return _mailing;
	}

	@Override
	public void setMailing(boolean mailing) {
		_columnBitmask |= MAILING_COLUMN_BITMASK;

		if (!_setOriginalMailing) {
			_setOriginalMailing = true;

			_originalMailing = _mailing;
		}

		_mailing = mailing;
	}

	public boolean getOriginalMailing() {
		return _originalMailing;
	}

	@Override
	public boolean getPrimary() {
		return _primary;
	}

	@Override
	public boolean isPrimary() {
		return _primary;
	}

	@Override
	public void setPrimary(boolean primary) {
		_columnBitmask |= PRIMARY_COLUMN_BITMASK;

		if (!_setOriginalPrimary) {
			_setOriginalPrimary = true;

			_originalPrimary = _primary;
		}

		_primary = primary;
	}

	public boolean getOriginalPrimary() {
		return _originalPrimary;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			LegacyAddress.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public LegacyAddress toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (LegacyAddress)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		LegacyAddressImpl legacyAddressImpl = new LegacyAddressImpl();

		legacyAddressImpl.setAddressId(getAddressId());
		legacyAddressImpl.setCompanyId(getCompanyId());
		legacyAddressImpl.setUserId(getUserId());
		legacyAddressImpl.setUserName(getUserName());
		legacyAddressImpl.setCreateDate(getCreateDate());
		legacyAddressImpl.setModifiedDate(getModifiedDate());
		legacyAddressImpl.setClassNameId(getClassNameId());
		legacyAddressImpl.setClassPK(getClassPK());
		legacyAddressImpl.setStreet1(getStreet1());
		legacyAddressImpl.setStreet2(getStreet2());
		legacyAddressImpl.setStreet3(getStreet3());
		legacyAddressImpl.setCity(getCity());
		legacyAddressImpl.setZip(getZip());
		legacyAddressImpl.setRegionId(getRegionId());
		legacyAddressImpl.setCountryId(getCountryId());
		legacyAddressImpl.setTypeId(getTypeId());
		legacyAddressImpl.setMailing(getMailing());
		legacyAddressImpl.setPrimary(getPrimary());

		legacyAddressImpl.resetOriginalValues();

		return legacyAddressImpl;
	}

	@Override
	public int compareTo(LegacyAddress legacyAddress) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(),
				legacyAddress.getCreateDate());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LegacyAddress)) {
			return false;
		}

		LegacyAddress legacyAddress = (LegacyAddress)obj;

		long primaryKey = legacyAddress.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		LegacyAddressModelImpl legacyAddressModelImpl = this;

		legacyAddressModelImpl._originalCompanyId = legacyAddressModelImpl._companyId;

		legacyAddressModelImpl._setOriginalCompanyId = false;

		legacyAddressModelImpl._originalUserId = legacyAddressModelImpl._userId;

		legacyAddressModelImpl._setOriginalUserId = false;

		legacyAddressModelImpl._originalClassNameId = legacyAddressModelImpl._classNameId;

		legacyAddressModelImpl._setOriginalClassNameId = false;

		legacyAddressModelImpl._originalClassPK = legacyAddressModelImpl._classPK;

		legacyAddressModelImpl._setOriginalClassPK = false;

		legacyAddressModelImpl._originalMailing = legacyAddressModelImpl._mailing;

		legacyAddressModelImpl._setOriginalMailing = false;

		legacyAddressModelImpl._originalPrimary = legacyAddressModelImpl._primary;

		legacyAddressModelImpl._setOriginalPrimary = false;

		legacyAddressModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<LegacyAddress> toCacheModel() {
		LegacyAddressCacheModel legacyAddressCacheModel = new LegacyAddressCacheModel();

		legacyAddressCacheModel.addressId = getAddressId();

		legacyAddressCacheModel.companyId = getCompanyId();

		legacyAddressCacheModel.userId = getUserId();

		legacyAddressCacheModel.userName = getUserName();

		String userName = legacyAddressCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			legacyAddressCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			legacyAddressCacheModel.createDate = createDate.getTime();
		}
		else {
			legacyAddressCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			legacyAddressCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			legacyAddressCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		legacyAddressCacheModel.classNameId = getClassNameId();

		legacyAddressCacheModel.classPK = getClassPK();

		legacyAddressCacheModel.street1 = getStreet1();

		String street1 = legacyAddressCacheModel.street1;

		if ((street1 != null) && (street1.length() == 0)) {
			legacyAddressCacheModel.street1 = null;
		}

		legacyAddressCacheModel.street2 = getStreet2();

		String street2 = legacyAddressCacheModel.street2;

		if ((street2 != null) && (street2.length() == 0)) {
			legacyAddressCacheModel.street2 = null;
		}

		legacyAddressCacheModel.street3 = getStreet3();

		String street3 = legacyAddressCacheModel.street3;

		if ((street3 != null) && (street3.length() == 0)) {
			legacyAddressCacheModel.street3 = null;
		}

		legacyAddressCacheModel.city = getCity();

		String city = legacyAddressCacheModel.city;

		if ((city != null) && (city.length() == 0)) {
			legacyAddressCacheModel.city = null;
		}

		legacyAddressCacheModel.zip = getZip();

		String zip = legacyAddressCacheModel.zip;

		if ((zip != null) && (zip.length() == 0)) {
			legacyAddressCacheModel.zip = null;
		}

		legacyAddressCacheModel.regionId = getRegionId();

		legacyAddressCacheModel.countryId = getCountryId();

		legacyAddressCacheModel.typeId = getTypeId();

		legacyAddressCacheModel.mailing = getMailing();

		legacyAddressCacheModel.primary = getPrimary();

		return legacyAddressCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{addressId=");
		sb.append(getAddressId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", classNameId=");
		sb.append(getClassNameId());
		sb.append(", classPK=");
		sb.append(getClassPK());
		sb.append(", street1=");
		sb.append(getStreet1());
		sb.append(", street2=");
		sb.append(getStreet2());
		sb.append(", street3=");
		sb.append(getStreet3());
		sb.append(", city=");
		sb.append(getCity());
		sb.append(", zip=");
		sb.append(getZip());
		sb.append(", regionId=");
		sb.append(getRegionId());
		sb.append(", countryId=");
		sb.append(getCountryId());
		sb.append(", typeId=");
		sb.append(getTypeId());
		sb.append(", mailing=");
		sb.append(getMailing());
		sb.append(", primary=");
		sb.append(getPrimary());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(58);

		sb.append("<model><model-name>");
		sb.append("de.uhh.l2g.plugins.migration.model.LegacyAddress");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>addressId</column-name><column-value><![CDATA[");
		sb.append(getAddressId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classNameId</column-name><column-value><![CDATA[");
		sb.append(getClassNameId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classPK</column-name><column-value><![CDATA[");
		sb.append(getClassPK());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>street1</column-name><column-value><![CDATA[");
		sb.append(getStreet1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>street2</column-name><column-value><![CDATA[");
		sb.append(getStreet2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>street3</column-name><column-value><![CDATA[");
		sb.append(getStreet3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>city</column-name><column-value><![CDATA[");
		sb.append(getCity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>zip</column-name><column-value><![CDATA[");
		sb.append(getZip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>regionId</column-name><column-value><![CDATA[");
		sb.append(getRegionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>countryId</column-name><column-value><![CDATA[");
		sb.append(getCountryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>typeId</column-name><column-value><![CDATA[");
		sb.append(getTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mailing</column-name><column-value><![CDATA[");
		sb.append(getMailing());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>primary</column-name><column-value><![CDATA[");
		sb.append(getPrimary());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = LegacyAddress.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			LegacyAddress.class
		};
	private long _addressId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userUuid;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _classNameId;
	private long _originalClassNameId;
	private boolean _setOriginalClassNameId;
	private long _classPK;
	private long _originalClassPK;
	private boolean _setOriginalClassPK;
	private String _street1;
	private String _street2;
	private String _street3;
	private String _city;
	private String _zip;
	private long _regionId;
	private long _countryId;
	private int _typeId;
	private boolean _mailing;
	private boolean _originalMailing;
	private boolean _setOriginalMailing;
	private boolean _primary;
	private boolean _originalPrimary;
	private boolean _setOriginalPrimary;
	private long _columnBitmask;
	private LegacyAddress _escapedModel;
}