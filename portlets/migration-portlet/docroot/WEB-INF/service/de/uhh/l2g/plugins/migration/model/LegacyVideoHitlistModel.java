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
 * The base model interface for the LegacyVideoHitlist service. Represents a row in the &quot;videohitlist&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link de.uhh.l2g.plugins.migration.model.impl.LegacyVideoHitlistModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link de.uhh.l2g.plugins.migration.model.impl.LegacyVideoHitlistImpl}.
 * </p>
 *
 * @author unihh
 * @see LegacyVideoHitlist
 * @see de.uhh.l2g.plugins.migration.model.impl.LegacyVideoHitlistImpl
 * @see de.uhh.l2g.plugins.migration.model.impl.LegacyVideoHitlistModelImpl
 * @generated
 */
public interface LegacyVideoHitlistModel extends BaseModel<LegacyVideoHitlist> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a legacy video hitlist model instance should use the {@link LegacyVideoHitlist} interface instead.
	 */

	/**
	 * Returns the primary key of this legacy video hitlist.
	 *
	 * @return the primary key of this legacy video hitlist
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this legacy video hitlist.
	 *
	 * @param primaryKey the primary key of this legacy video hitlist
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this legacy video hitlist.
	 *
	 * @return the ID of this legacy video hitlist
	 */
	public long getId();

	/**
	 * Sets the ID of this legacy video hitlist.
	 *
	 * @param id the ID of this legacy video hitlist
	 */
	public void setId(long id);

	/**
	 * Returns the hitsperday of this legacy video hitlist.
	 *
	 * @return the hitsperday of this legacy video hitlist
	 */
	public long getHitsperday();

	/**
	 * Sets the hitsperday of this legacy video hitlist.
	 *
	 * @param hitsperday the hitsperday of this legacy video hitlist
	 */
	public void setHitsperday(long hitsperday);

	/**
	 * Returns the hitsperweek of this legacy video hitlist.
	 *
	 * @return the hitsperweek of this legacy video hitlist
	 */
	public long getHitsperweek();

	/**
	 * Sets the hitsperweek of this legacy video hitlist.
	 *
	 * @param hitsperweek the hitsperweek of this legacy video hitlist
	 */
	public void setHitsperweek(long hitsperweek);

	/**
	 * Returns the hitspermonth of this legacy video hitlist.
	 *
	 * @return the hitspermonth of this legacy video hitlist
	 */
	public long getHitspermonth();

	/**
	 * Sets the hitspermonth of this legacy video hitlist.
	 *
	 * @param hitspermonth the hitspermonth of this legacy video hitlist
	 */
	public void setHitspermonth(long hitspermonth);

	/**
	 * Returns the hitsperyear of this legacy video hitlist.
	 *
	 * @return the hitsperyear of this legacy video hitlist
	 */
	public long getHitsperyear();

	/**
	 * Sets the hitsperyear of this legacy video hitlist.
	 *
	 * @param hitsperyear the hitsperyear of this legacy video hitlist
	 */
	public void setHitsperyear(long hitsperyear);

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
	public int compareTo(
		de.uhh.l2g.plugins.migration.model.LegacyVideoHitlist legacyVideoHitlist);

	@Override
	public int hashCode();

	@Override
	public CacheModel<de.uhh.l2g.plugins.migration.model.LegacyVideoHitlist> toCacheModel();

	@Override
	public de.uhh.l2g.plugins.migration.model.LegacyVideoHitlist toEscapedModel();

	@Override
	public de.uhh.l2g.plugins.migration.model.LegacyVideoHitlist toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}