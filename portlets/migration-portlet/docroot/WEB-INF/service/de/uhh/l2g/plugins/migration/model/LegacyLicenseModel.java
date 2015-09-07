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

package de.uhh.l2g.plugins.migration.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the LegacyLicense service. Represents a row in the &quot;license&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link de.uhh.l2g.plugins.migration.model.impl.LegacyLicenseModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link de.uhh.l2g.plugins.migration.model.impl.LegacyLicenseImpl}.
 * </p>
 *
 * @author unihh
 * @see LegacyLicense
 * @see de.uhh.l2g.plugins.migration.model.impl.LegacyLicenseImpl
 * @see de.uhh.l2g.plugins.migration.model.impl.LegacyLicenseModelImpl
 * @generated
 */
public interface LegacyLicenseModel extends BaseModel<LegacyLicense> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a legacy license model instance should use the {@link LegacyLicense} interface instead.
	 */

	/**
	 * Returns the primary key of this legacy license.
	 *
	 * @return the primary key of this legacy license
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this legacy license.
	 *
	 * @param primaryKey the primary key of this legacy license
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this legacy license.
	 *
	 * @return the ID of this legacy license
	 */
	public long getId();

	/**
	 * Sets the ID of this legacy license.
	 *
	 * @param id the ID of this legacy license
	 */
	public void setId(long id);

	/**
	 * Returns the video ID of this legacy license.
	 *
	 * @return the video ID of this legacy license
	 */
	public long getVideoId();

	/**
	 * Sets the video ID of this legacy license.
	 *
	 * @param videoId the video ID of this legacy license
	 */
	public void setVideoId(long videoId);

	/**
	 * Returns the ccby of this legacy license.
	 *
	 * @return the ccby of this legacy license
	 */
	public int getCcby();

	/**
	 * Sets the ccby of this legacy license.
	 *
	 * @param ccby the ccby of this legacy license
	 */
	public void setCcby(int ccby);

	/**
	 * Returns the ccbybc of this legacy license.
	 *
	 * @return the ccbybc of this legacy license
	 */
	public int getCcbybc();

	/**
	 * Sets the ccbybc of this legacy license.
	 *
	 * @param ccbybc the ccbybc of this legacy license
	 */
	public void setCcbybc(int ccbybc);

	/**
	 * Returns the ccbyncnd of this legacy license.
	 *
	 * @return the ccbyncnd of this legacy license
	 */
	public int getCcbyncnd();

	/**
	 * Sets the ccbyncnd of this legacy license.
	 *
	 * @param ccbyncnd the ccbyncnd of this legacy license
	 */
	public void setCcbyncnd(int ccbyncnd);

	/**
	 * Returns the ccbyncsa of this legacy license.
	 *
	 * @return the ccbyncsa of this legacy license
	 */
	public int getCcbyncsa();

	/**
	 * Sets the ccbyncsa of this legacy license.
	 *
	 * @param ccbyncsa the ccbyncsa of this legacy license
	 */
	public void setCcbyncsa(int ccbyncsa);

	/**
	 * Returns the ccbysa of this legacy license.
	 *
	 * @return the ccbysa of this legacy license
	 */
	public int getCcbysa();

	/**
	 * Sets the ccbysa of this legacy license.
	 *
	 * @param ccbysa the ccbysa of this legacy license
	 */
	public void setCcbysa(int ccbysa);

	/**
	 * Returns the ccbync of this legacy license.
	 *
	 * @return the ccbync of this legacy license
	 */
	public int getCcbync();

	/**
	 * Sets the ccbync of this legacy license.
	 *
	 * @param ccbync the ccbync of this legacy license
	 */
	public void setCcbync(int ccbync);

	/**
	 * Returns the l2go of this legacy license.
	 *
	 * @return the l2go of this legacy license
	 */
	public int getL2go();

	/**
	 * Sets the l2go of this legacy license.
	 *
	 * @param l2go the l2go of this legacy license
	 */
	public void setL2go(int l2go);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(LegacyLicense legacyLicense);

	@Override
	public int hashCode();

	@Override
	public CacheModel<LegacyLicense> toCacheModel();

	@Override
	public LegacyLicense toEscapedModel();

	@Override
	public LegacyLicense toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}