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
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import de.uhh.l2g.plugins.migration.model.LegacyFacilityHost;
import de.uhh.l2g.plugins.migration.model.LegacyFacilityHostModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the LegacyFacilityHost service. Represents a row in the &quot;facility_host&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link de.uhh.l2g.plugins.migration.model.LegacyFacilityHostModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LegacyFacilityHostImpl}.
 * </p>
 *
 * @author unihh
 * @see LegacyFacilityHostImpl
 * @see de.uhh.l2g.plugins.migration.model.LegacyFacilityHost
 * @see de.uhh.l2g.plugins.migration.model.LegacyFacilityHostModel
 * @generated
 */
public class LegacyFacilityHostModelImpl extends BaseModelImpl<LegacyFacilityHost>
	implements LegacyFacilityHostModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a legacy facility host model instance should use the {@link de.uhh.l2g.plugins.migration.model.LegacyFacilityHost} interface instead.
	 */
	public static final String TABLE_NAME = "facility_host";
	public static final Object[][] TABLE_COLUMNS = {
			{ "facilityHostId", Types.BIGINT },
			{ "facilityId", Types.BIGINT },
			{ "hostId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table facility_host (facilityHostId LONG not null primary key,facilityId LONG,hostId LONG)";
	public static final String TABLE_SQL_DROP = "drop table facility_host";
	public static final String ORDER_BY_JPQL = " ORDER BY legacyFacilityHost.facilityHostId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY facility_host.facilityHostId ASC";
	public static final String DATA_SOURCE = "anotherDataSource";
	public static final String SESSION_FACTORY = "anotherSessionFactory";
	public static final String TX_MANAGER = "anotherTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.de.uhh.l2g.plugins.migration.model.LegacyFacilityHost"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.de.uhh.l2g.plugins.migration.model.LegacyFacilityHost"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.de.uhh.l2g.plugins.migration.model.LegacyFacilityHost"));

	public LegacyFacilityHostModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _facilityHostId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setFacilityHostId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _facilityHostId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return LegacyFacilityHost.class;
	}

	@Override
	public String getModelClassName() {
		return LegacyFacilityHost.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("facilityHostId", getFacilityHostId());
		attributes.put("facilityId", getFacilityId());
		attributes.put("hostId", getHostId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long facilityHostId = (Long)attributes.get("facilityHostId");

		if (facilityHostId != null) {
			setFacilityHostId(facilityHostId);
		}

		Long facilityId = (Long)attributes.get("facilityId");

		if (facilityId != null) {
			setFacilityId(facilityId);
		}

		Long hostId = (Long)attributes.get("hostId");

		if (hostId != null) {
			setHostId(hostId);
		}
	}

	@Override
	public long getFacilityHostId() {
		return _facilityHostId;
	}

	@Override
	public void setFacilityHostId(long facilityHostId) {
		_facilityHostId = facilityHostId;
	}

	@Override
	public long getFacilityId() {
		return _facilityId;
	}

	@Override
	public void setFacilityId(long facilityId) {
		_facilityId = facilityId;
	}

	@Override
	public long getHostId() {
		return _hostId;
	}

	@Override
	public void setHostId(long hostId) {
		_hostId = hostId;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			LegacyFacilityHost.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public LegacyFacilityHost toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (LegacyFacilityHost)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		LegacyFacilityHostImpl legacyFacilityHostImpl = new LegacyFacilityHostImpl();

		legacyFacilityHostImpl.setFacilityHostId(getFacilityHostId());
		legacyFacilityHostImpl.setFacilityId(getFacilityId());
		legacyFacilityHostImpl.setHostId(getHostId());

		legacyFacilityHostImpl.resetOriginalValues();

		return legacyFacilityHostImpl;
	}

	@Override
	public int compareTo(LegacyFacilityHost legacyFacilityHost) {
		long primaryKey = legacyFacilityHost.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LegacyFacilityHost)) {
			return false;
		}

		LegacyFacilityHost legacyFacilityHost = (LegacyFacilityHost)obj;

		long primaryKey = legacyFacilityHost.getPrimaryKey();

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
	}

	@Override
	public CacheModel<LegacyFacilityHost> toCacheModel() {
		LegacyFacilityHostCacheModel legacyFacilityHostCacheModel = new LegacyFacilityHostCacheModel();

		legacyFacilityHostCacheModel.facilityHostId = getFacilityHostId();

		legacyFacilityHostCacheModel.facilityId = getFacilityId();

		legacyFacilityHostCacheModel.hostId = getHostId();

		return legacyFacilityHostCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{facilityHostId=");
		sb.append(getFacilityHostId());
		sb.append(", facilityId=");
		sb.append(getFacilityId());
		sb.append(", hostId=");
		sb.append(getHostId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("de.uhh.l2g.plugins.migration.model.LegacyFacilityHost");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>facilityHostId</column-name><column-value><![CDATA[");
		sb.append(getFacilityHostId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>facilityId</column-name><column-value><![CDATA[");
		sb.append(getFacilityId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hostId</column-name><column-value><![CDATA[");
		sb.append(getHostId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = LegacyFacilityHost.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			LegacyFacilityHost.class
		};
	private long _facilityHostId;
	private long _facilityId;
	private long _hostId;
	private LegacyFacilityHost _escapedModel;
}