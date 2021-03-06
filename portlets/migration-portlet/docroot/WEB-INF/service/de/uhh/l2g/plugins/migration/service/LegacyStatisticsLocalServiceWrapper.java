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

package de.uhh.l2g.plugins.migration.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LegacyStatisticsLocalService}.
 *
 * @author unihh
 * @see LegacyStatisticsLocalService
 * @generated
 */
public class LegacyStatisticsLocalServiceWrapper
	implements LegacyStatisticsLocalService,
		ServiceWrapper<LegacyStatisticsLocalService> {
	public LegacyStatisticsLocalServiceWrapper(
		LegacyStatisticsLocalService legacyStatisticsLocalService) {
		_legacyStatisticsLocalService = legacyStatisticsLocalService;
	}

	/**
	* Adds the legacy statistics to the database. Also notifies the appropriate model listeners.
	*
	* @param legacyStatistics the legacy statistics
	* @return the legacy statistics that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public de.uhh.l2g.plugins.migration.model.LegacyStatistics addLegacyStatistics(
		de.uhh.l2g.plugins.migration.model.LegacyStatistics legacyStatistics)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _legacyStatisticsLocalService.addLegacyStatistics(legacyStatistics);
	}

	/**
	* Creates a new legacy statistics with the primary key. Does not add the legacy statistics to the database.
	*
	* @param id the primary key for the new legacy statistics
	* @return the new legacy statistics
	*/
	@Override
	public de.uhh.l2g.plugins.migration.model.LegacyStatistics createLegacyStatistics(
		int id) {
		return _legacyStatisticsLocalService.createLegacyStatistics(id);
	}

	/**
	* Deletes the legacy statistics with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the legacy statistics
	* @return the legacy statistics that was removed
	* @throws PortalException if a legacy statistics with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public de.uhh.l2g.plugins.migration.model.LegacyStatistics deleteLegacyStatistics(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _legacyStatisticsLocalService.deleteLegacyStatistics(id);
	}

	/**
	* Deletes the legacy statistics from the database. Also notifies the appropriate model listeners.
	*
	* @param legacyStatistics the legacy statistics
	* @return the legacy statistics that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public de.uhh.l2g.plugins.migration.model.LegacyStatistics deleteLegacyStatistics(
		de.uhh.l2g.plugins.migration.model.LegacyStatistics legacyStatistics)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _legacyStatisticsLocalService.deleteLegacyStatistics(legacyStatistics);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _legacyStatisticsLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _legacyStatisticsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.uhh.l2g.plugins.migration.model.impl.LegacyStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _legacyStatisticsLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.uhh.l2g.plugins.migration.model.impl.LegacyStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _legacyStatisticsLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _legacyStatisticsLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _legacyStatisticsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public de.uhh.l2g.plugins.migration.model.LegacyStatistics fetchLegacyStatistics(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _legacyStatisticsLocalService.fetchLegacyStatistics(id);
	}

	/**
	* Returns the legacy statistics with the primary key.
	*
	* @param id the primary key of the legacy statistics
	* @return the legacy statistics
	* @throws PortalException if a legacy statistics with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public de.uhh.l2g.plugins.migration.model.LegacyStatistics getLegacyStatistics(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _legacyStatisticsLocalService.getLegacyStatistics(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _legacyStatisticsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the legacy statisticses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.uhh.l2g.plugins.migration.model.impl.LegacyStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of legacy statisticses
	* @param end the upper bound of the range of legacy statisticses (not inclusive)
	* @return the range of legacy statisticses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<de.uhh.l2g.plugins.migration.model.LegacyStatistics> getLegacyStatisticses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _legacyStatisticsLocalService.getLegacyStatisticses(start, end);
	}

	/**
	* Returns the number of legacy statisticses.
	*
	* @return the number of legacy statisticses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLegacyStatisticsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _legacyStatisticsLocalService.getLegacyStatisticsesCount();
	}

	/**
	* Updates the legacy statistics in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param legacyStatistics the legacy statistics
	* @return the legacy statistics that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public de.uhh.l2g.plugins.migration.model.LegacyStatistics updateLegacyStatistics(
		de.uhh.l2g.plugins.migration.model.LegacyStatistics legacyStatistics)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _legacyStatisticsLocalService.updateLegacyStatistics(legacyStatistics);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _legacyStatisticsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_legacyStatisticsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _legacyStatisticsLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LegacyStatisticsLocalService getWrappedLegacyStatisticsLocalService() {
		return _legacyStatisticsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLegacyStatisticsLocalService(
		LegacyStatisticsLocalService legacyStatisticsLocalService) {
		_legacyStatisticsLocalService = legacyStatisticsLocalService;
	}

	@Override
	public LegacyStatisticsLocalService getWrappedService() {
		return _legacyStatisticsLocalService;
	}

	@Override
	public void setWrappedService(
		LegacyStatisticsLocalService legacyStatisticsLocalService) {
		_legacyStatisticsLocalService = legacyStatisticsLocalService;
	}

	private LegacyStatisticsLocalService _legacyStatisticsLocalService;
}