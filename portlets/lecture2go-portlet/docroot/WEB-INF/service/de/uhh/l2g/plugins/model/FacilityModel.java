/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package de.uhh.l2g.plugins.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Facility service. Represents a row in the &quot;LG_Facility&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link de.uhh.l2g.plugins.model.impl.FacilityModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link de.uhh.l2g.plugins.model.impl.FacilityImpl}.
 * </p>
 *
 * @author Iavor Sturm
 * @see Facility
 * @see de.uhh.l2g.plugins.model.impl.FacilityImpl
 * @see de.uhh.l2g.plugins.model.impl.FacilityModelImpl
 * @generated
 */
public interface FacilityModel extends BaseModel<Facility> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a facility model instance should use the {@link Facility} interface instead.
	 */

	/**
	 * Returns the primary key of this facility.
	 *
	 * @return the primary key of this facility
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this facility.
	 *
	 * @param primaryKey the primary key of this facility
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the facility ID of this facility.
	 *
	 * @return the facility ID of this facility
	 */
	public long getFacilityId();

	/**
	 * Sets the facility ID of this facility.
	 *
	 * @param facilityId the facility ID of this facility
	 */
	public void setFacilityId(long facilityId);

	/**
	 * Returns the parent ID of this facility.
	 *
	 * @return the parent ID of this facility
	 */
	public int getParentId();

	/**
	 * Sets the parent ID of this facility.
	 *
	 * @param parentId the parent ID of this facility
	 */
	public void setParentId(int parentId);

	/**
	 * Returns the name of this facility.
	 *
	 * @return the name of this facility
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this facility.
	 *
	 * @param name the name of this facility
	 */
	public void setName(String name);

	/**
	 * Returns the typ of this facility.
	 *
	 * @return the typ of this facility
	 */
	@AutoEscape
	public String getTyp();

	/**
	 * Sets the typ of this facility.
	 *
	 * @param typ the typ of this facility
	 */
	public void setTyp(String typ);

	/**
	 * Returns the www of this facility.
	 *
	 * @return the www of this facility
	 */
	@AutoEscape
	public String getWww();

	/**
	 * Sets the www of this facility.
	 *
	 * @param www the www of this facility
	 */
	public void setWww(String www);

	/**
	 * Returns the level of this facility.
	 *
	 * @return the level of this facility
	 */
	public int getLevel();

	/**
	 * Sets the level of this facility.
	 *
	 * @param level the level of this facility
	 */
	public void setLevel(int level);

	/**
	 * Returns the sort of this facility.
	 *
	 * @return the sort of this facility
	 */
	public int getSort();

	/**
	 * Sets the sort of this facility.
	 *
	 * @param sort the sort of this facility
	 */
	public void setSort(int sort);

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
	public int compareTo(Facility facility);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Facility> toCacheModel();

	@Override
	public Facility toEscapedModel();

	@Override
	public Facility toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}