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

package de.uhh.l2g.plugins.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import de.uhh.l2g.plugins.model.Lectureseries_Facility;
import de.uhh.l2g.plugins.service.Lectureseries_FacilityLocalServiceUtil;

/**
 * The extended model base implementation for the Lectureseries_Facility service. Represents a row in the &quot;LG_Lectureseries_Facility&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Lectureseries_FacilityImpl}.
 * </p>
 *
 * @author Iavor Sturm
 * @see Lectureseries_FacilityImpl
 * @see de.uhh.l2g.plugins.model.Lectureseries_Facility
 * @generated
 */
public abstract class Lectureseries_FacilityBaseImpl
	extends Lectureseries_FacilityModelImpl implements Lectureseries_Facility {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a lectureseries_ facility model instance should use the {@link Lectureseries_Facility} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			Lectureseries_FacilityLocalServiceUtil.addLectureseries_Facility(this);
		}
		else {
			Lectureseries_FacilityLocalServiceUtil.updateLectureseries_Facility(this);
		}
	}
}