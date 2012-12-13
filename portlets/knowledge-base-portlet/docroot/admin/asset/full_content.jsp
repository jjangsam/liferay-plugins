<%--
/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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
--%>

<%@ include file="/admin/init.jsp" %>

<%
KBArticle kbArticle = (KBArticle)request.getAttribute(WebKeys.KNOWLEDGE_BASE_KB_ARTICLE);

List<FileEntry> attachmentsFileEntries = kbArticle.getAttachmentsFileEntries();
%>

<%= kbArticle.getContent() %>

<c:if test="<%= attachmentsFileEntries.size() > 0 %>">
	<div class="kb-article-attachments">

		<%
		LiferayPortletURL liferayPortletURL = PortletURLFactoryUtil.create(request, PortletKeys.KNOWLEDGE_BASE_DISPLAY, themeDisplay.getPlid(), PortletRequest.RESOURCE_PHASE);

		liferayPortletURL.setDoAsGroupId(kbArticle.getGroupId());
		liferayPortletURL.setParameter("mvcPath", "/display/view_article.jsp");
		liferayPortletURL.setParameter("p_p_resource_id", "attachment");
		liferayPortletURL.setParameter("resourcePrimKey", String.valueOf(kbArticle.getResourcePrimKey()));


		for (FileEntry fileEntry : attachmentsFileEntries) {
			liferayPortletURL.setParameter("fileEntryId", String.valueOf(fileEntry.getFileEntryId()));
		%>

			<div>
				<liferay-ui:icon
					image="clip"
					label="<%= true %>"
					message='<%= fileEntry.getTitle() + " (" + TextFormatter.formatStorageSize(fileEntry.getSize(), locale) + ")" %>'
					method="get"
					url="<%= liferayPortletURL.toString() %>"
				/>
			</div>

		<%
		}
		%>

	</div>
</c:if>