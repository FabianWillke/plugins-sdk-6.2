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

package de.uhh.l2g.plugins.migration.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import de.uhh.l2g.plugins.migration.model.LegacyProducerLectureseries;

/**
 * The persistence interface for the legacy producer lectureseries service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author unihh
 * @see LegacyProducerLectureseriesPersistenceImpl
 * @see LegacyProducerLectureseriesUtil
 * @generated
 */
public interface LegacyProducerLectureseriesPersistence extends BasePersistence<LegacyProducerLectureseries> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LegacyProducerLectureseriesUtil} to access the legacy producer lectureseries persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the legacy producer lectureseries in the entity cache if it is enabled.
	*
	* @param legacyProducerLectureseries the legacy producer lectureseries
	*/
	public void cacheResult(
		de.uhh.l2g.plugins.migration.model.LegacyProducerLectureseries legacyProducerLectureseries);

	/**
	* Caches the legacy producer lectureserieses in the entity cache if it is enabled.
	*
	* @param legacyProducerLectureserieses the legacy producer lectureserieses
	*/
	public void cacheResult(
		java.util.List<de.uhh.l2g.plugins.migration.model.LegacyProducerLectureseries> legacyProducerLectureserieses);

	/**
	* Creates a new legacy producer lectureseries with the primary key. Does not add the legacy producer lectureseries to the database.
	*
	* @param id the primary key for the new legacy producer lectureseries
	* @return the new legacy producer lectureseries
	*/
	public de.uhh.l2g.plugins.migration.model.LegacyProducerLectureseries create(
		long id);

	/**
	* Removes the legacy producer lectureseries with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the legacy producer lectureseries
	* @return the legacy producer lectureseries that was removed
	* @throws de.uhh.l2g.plugins.migration.NoSuchLegacyProducerLectureseriesException if a legacy producer lectureseries with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public de.uhh.l2g.plugins.migration.model.LegacyProducerLectureseries remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			de.uhh.l2g.plugins.migration.NoSuchLegacyProducerLectureseriesException;

	public de.uhh.l2g.plugins.migration.model.LegacyProducerLectureseries updateImpl(
		de.uhh.l2g.plugins.migration.model.LegacyProducerLectureseries legacyProducerLectureseries)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the legacy producer lectureseries with the primary key or throws a {@link de.uhh.l2g.plugins.migration.NoSuchLegacyProducerLectureseriesException} if it could not be found.
	*
	* @param id the primary key of the legacy producer lectureseries
	* @return the legacy producer lectureseries
	* @throws de.uhh.l2g.plugins.migration.NoSuchLegacyProducerLectureseriesException if a legacy producer lectureseries with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public de.uhh.l2g.plugins.migration.model.LegacyProducerLectureseries findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			de.uhh.l2g.plugins.migration.NoSuchLegacyProducerLectureseriesException;

	/**
	* Returns the legacy producer lectureseries with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the legacy producer lectureseries
	* @return the legacy producer lectureseries, or <code>null</code> if a legacy producer lectureseries with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public de.uhh.l2g.plugins.migration.model.LegacyProducerLectureseries fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the legacy producer lectureserieses.
	*
	* @return the legacy producer lectureserieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<de.uhh.l2g.plugins.migration.model.LegacyProducerLectureseries> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the legacy producer lectureserieses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.uhh.l2g.plugins.migration.model.impl.LegacyProducerLectureseriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of legacy producer lectureserieses
	* @param end the upper bound of the range of legacy producer lectureserieses (not inclusive)
	* @return the range of legacy producer lectureserieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<de.uhh.l2g.plugins.migration.model.LegacyProducerLectureseries> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the legacy producer lectureserieses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.uhh.l2g.plugins.migration.model.impl.LegacyProducerLectureseriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of legacy producer lectureserieses
	* @param end the upper bound of the range of legacy producer lectureserieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of legacy producer lectureserieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<de.uhh.l2g.plugins.migration.model.LegacyProducerLectureseries> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the legacy producer lectureserieses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of legacy producer lectureserieses.
	*
	* @return the number of legacy producer lectureserieses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}