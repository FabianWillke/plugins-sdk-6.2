package de.uhh.l2g.plugins.admin;

import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.util.bridges.mvc.MVCPortlet;

import de.uhh.l2g.plugins.model.Facility;
import de.uhh.l2g.plugins.model.Lectureseries;
import de.uhh.l2g.plugins.service.LectureseriesLocalServiceUtil;
import de.uhh.l2g.plugins.service.persistence.FacilityFinderUtil;

public class AdminLectureSeriesManagement extends MVCPortlet {
	
	public void viewLectureseries(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
		// requested lectureseries
		long reqUserId = new Long(request.getParameterMap().get("lectureseriesId")[0]);
		Lectureseries reqLectureseries = LectureseriesLocalServiceUtil.getLectureseries(reqUserId);
		request.setAttribute("reqLectureseries", reqLectureseries);
		
		// requested facilities
		List<Facility> fl = FacilityFinderUtil.findAll(0, 5);
		response.setRenderParameter("jspPage", "/admin/editLectureseries.jsp");
	}

}