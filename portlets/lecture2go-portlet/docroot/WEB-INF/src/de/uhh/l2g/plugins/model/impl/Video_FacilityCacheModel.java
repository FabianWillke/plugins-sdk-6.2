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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import de.uhh.l2g.plugins.model.Video_Facility;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Video_Facility in entity cache.
 *
 * @author Iavor Sturm
 * @see Video_Facility
 * @generated
 */
public class Video_FacilityCacheModel implements CacheModel<Video_Facility>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{videoFacilityId=");
		sb.append(videoFacilityId);
		sb.append(", videoId=");
		sb.append(videoId);
		sb.append(", facilityId=");
		sb.append(facilityId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Video_Facility toEntityModel() {
		Video_FacilityImpl video_FacilityImpl = new Video_FacilityImpl();

		video_FacilityImpl.setVideoFacilityId(videoFacilityId);
		video_FacilityImpl.setVideoId(videoId);
		video_FacilityImpl.setFacilityId(facilityId);

		video_FacilityImpl.resetOriginalValues();

		return video_FacilityImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		videoFacilityId = objectInput.readLong();
		videoId = objectInput.readLong();
		facilityId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(videoFacilityId);
		objectOutput.writeLong(videoId);
		objectOutput.writeLong(facilityId);
	}

	public long videoFacilityId;
	public long videoId;
	public long facilityId;
}