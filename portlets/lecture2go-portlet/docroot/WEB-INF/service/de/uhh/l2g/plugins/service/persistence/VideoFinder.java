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

package de.uhh.l2g.plugins.service.persistence;

/**
 * @author Iavor Sturm
 */
public interface VideoFinder {
	public int unlinkLectureseriesFromVideos(java.lang.Long lectureseriesId);

	public de.uhh.l2g.plugins.model.Video findLatestOpenAccessVideoForLectureseries(
		java.lang.Long lectureseriesId);

	public java.util.List<de.uhh.l2g.plugins.model.Video> findFilteredByInstitutionParentInstitutionTermCategoryCreator(
		java.lang.Long institutionId, java.lang.Long parentInstitutionId,
		java.util.ArrayList<java.lang.Long> termIds,
		java.util.ArrayList<java.lang.Long> categoryIds,
		java.util.ArrayList<java.lang.Long> creatorIds);

	public java.util.List<de.uhh.l2g.plugins.model.Video> findLatestVideos();
}