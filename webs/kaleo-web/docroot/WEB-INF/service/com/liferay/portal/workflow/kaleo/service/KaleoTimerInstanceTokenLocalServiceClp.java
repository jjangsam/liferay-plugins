/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.liferay.portal.workflow.kaleo.service;

import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * @author Brian Wing Shun Chan
 */
public class KaleoTimerInstanceTokenLocalServiceClp
	implements KaleoTimerInstanceTokenLocalService {
	public KaleoTimerInstanceTokenLocalServiceClp(
		ClassLoaderProxy classLoaderProxy) {
		_classLoaderProxy = classLoaderProxy;

		_addKaleoTimerInstanceTokenMethodKey0 = new MethodKey(_classLoaderProxy.getClassName(),
				"addKaleoTimerInstanceToken",
				com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken.class);

		_createKaleoTimerInstanceTokenMethodKey1 = new MethodKey(_classLoaderProxy.getClassName(),
				"createKaleoTimerInstanceToken", long.class);

		_deleteKaleoTimerInstanceTokenMethodKey2 = new MethodKey(_classLoaderProxy.getClassName(),
				"deleteKaleoTimerInstanceToken", long.class);

		_deleteKaleoTimerInstanceTokenMethodKey3 = new MethodKey(_classLoaderProxy.getClassName(),
				"deleteKaleoTimerInstanceToken",
				com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken.class);

		_dynamicQueryMethodKey4 = new MethodKey(_classLoaderProxy.getClassName(),
				"dynamicQuery",
				com.liferay.portal.kernel.dao.orm.DynamicQuery.class);

		_dynamicQueryMethodKey5 = new MethodKey(_classLoaderProxy.getClassName(),
				"dynamicQuery",
				com.liferay.portal.kernel.dao.orm.DynamicQuery.class,
				int.class, int.class);

		_dynamicQueryMethodKey6 = new MethodKey(_classLoaderProxy.getClassName(),
				"dynamicQuery",
				com.liferay.portal.kernel.dao.orm.DynamicQuery.class,
				int.class, int.class,
				com.liferay.portal.kernel.util.OrderByComparator.class);

		_dynamicQueryCountMethodKey7 = new MethodKey(_classLoaderProxy.getClassName(),
				"dynamicQueryCount",
				com.liferay.portal.kernel.dao.orm.DynamicQuery.class);

		_getKaleoTimerInstanceTokenMethodKey8 = new MethodKey(_classLoaderProxy.getClassName(),
				"getKaleoTimerInstanceToken", long.class);

		_getKaleoTimerInstanceTokensMethodKey9 = new MethodKey(_classLoaderProxy.getClassName(),
				"getKaleoTimerInstanceTokens", int.class, int.class);

		_getKaleoTimerInstanceTokensCountMethodKey10 = new MethodKey(_classLoaderProxy.getClassName(),
				"getKaleoTimerInstanceTokensCount");

		_updateKaleoTimerInstanceTokenMethodKey11 = new MethodKey(_classLoaderProxy.getClassName(),
				"updateKaleoTimerInstanceToken",
				com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken.class);

		_updateKaleoTimerInstanceTokenMethodKey12 = new MethodKey(_classLoaderProxy.getClassName(),
				"updateKaleoTimerInstanceToken",
				com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken.class,
				boolean.class);

		_addKaleoTimerInstanceTokenMethodKey13 = new MethodKey(_classLoaderProxy.getClassName(),
				"addKaleoTimerInstanceToken", long.class, long.class,
				java.lang.String.class, java.util.Map.class,
				com.liferay.portal.service.ServiceContext.class);

		_addKaleoTimerInstanceTokensMethodKey14 = new MethodKey(_classLoaderProxy.getClassName(),
				"addKaleoTimerInstanceTokens",
				com.liferay.portal.workflow.kaleo.model.KaleoInstanceToken.class,
				java.util.Collection.class, java.util.Map.class,
				com.liferay.portal.service.ServiceContext.class);

		_completeKaleoTimerInstanceTokensMethodKey15 = new MethodKey(_classLoaderProxy.getClassName(),
				"completeKaleoTimerInstanceTokens", long.class,
				java.util.Collection.class,
				com.liferay.portal.service.ServiceContext.class);

		_completeKaleoTimerInstanceTokenMethodKey16 = new MethodKey(_classLoaderProxy.getClassName(),
				"completeKaleoTimerInstanceToken", long.class,
				com.liferay.portal.service.ServiceContext.class);

		_deleteKaleoTimerInstanceTokenMethodKey17 = new MethodKey(_classLoaderProxy.getClassName(),
				"deleteKaleoTimerInstanceToken", long.class, long.class);

		_getKaleoTimerInstanceTokenMethodKey18 = new MethodKey(_classLoaderProxy.getClassName(),
				"getKaleoTimerInstanceToken", long.class, long.class);

		_getKaleoTimerInstanceTokensCountMethodKey19 = new MethodKey(_classLoaderProxy.getClassName(),
				"getKaleoTimerInstanceTokensCount", long.class,
				java.lang.Boolean.class,
				com.liferay.portal.service.ServiceContext.class);
	}

	public com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken addKaleoTimerInstanceToken(
		com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken kaleoTimerInstanceToken)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addKaleoTimerInstanceTokenMethodKey0,
				ClpSerializer.translateInput(kaleoTimerInstanceToken));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken)ClpSerializer.translateOutput(returnObj);
	}

	public com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken createKaleoTimerInstanceToken(
		long kaleoTimerInstanceTokenId) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_createKaleoTimerInstanceTokenMethodKey1,
				kaleoTimerInstanceTokenId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken)ClpSerializer.translateOutput(returnObj);
	}

	public void deleteKaleoTimerInstanceToken(long kaleoTimerInstanceTokenId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteKaleoTimerInstanceTokenMethodKey2,
				kaleoTimerInstanceTokenId);

		try {
			_classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	public void deleteKaleoTimerInstanceToken(
		com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken kaleoTimerInstanceToken)
		throws com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteKaleoTimerInstanceTokenMethodKey3,
				ClpSerializer.translateInput(kaleoTimerInstanceToken));

		try {
			_classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_dynamicQueryMethodKey4,
				ClpSerializer.translateInput(dynamicQuery));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_dynamicQueryMethodKey5,
				ClpSerializer.translateInput(dynamicQuery), start, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_dynamicQueryMethodKey6,
				ClpSerializer.translateInput(dynamicQuery), start, end,
				ClpSerializer.translateInput(orderByComparator));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_dynamicQueryCountMethodKey7,
				ClpSerializer.translateInput(dynamicQuery));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	public com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken getKaleoTimerInstanceToken(
		long kaleoTimerInstanceTokenId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getKaleoTimerInstanceTokenMethodKey8,
				kaleoTimerInstanceTokenId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken> getKaleoTimerInstanceTokens(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getKaleoTimerInstanceTokensMethodKey9,
				start, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken>)ClpSerializer.translateOutput(returnObj);
	}

	public int getKaleoTimerInstanceTokensCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getKaleoTimerInstanceTokensCountMethodKey10);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken updateKaleoTimerInstanceToken(
		com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken kaleoTimerInstanceToken)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateKaleoTimerInstanceTokenMethodKey11,
				ClpSerializer.translateInput(kaleoTimerInstanceToken));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken)ClpSerializer.translateOutput(returnObj);
	}

	public com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken updateKaleoTimerInstanceToken(
		com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken kaleoTimerInstanceToken,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateKaleoTimerInstanceTokenMethodKey12,
				ClpSerializer.translateInput(kaleoTimerInstanceToken), merge);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken)ClpSerializer.translateOutput(returnObj);
	}

	public com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken addKaleoTimerInstanceToken(
		long kaleoInstanceTokenId, long kaleoTimerId,
		java.lang.String kaleoTimerName,
		java.util.Map<java.lang.String, java.io.Serializable> workflowContext,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addKaleoTimerInstanceTokenMethodKey13,
				kaleoInstanceTokenId, kaleoTimerId,
				ClpSerializer.translateInput(kaleoTimerName),
				ClpSerializer.translateInput(workflowContext),
				ClpSerializer.translateInput(serviceContext));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken> addKaleoTimerInstanceTokens(
		com.liferay.portal.workflow.kaleo.model.KaleoInstanceToken kaleoInstanceToken,
		java.util.Collection<com.liferay.portal.workflow.kaleo.model.KaleoTimer> kaleoTimers,
		java.util.Map<java.lang.String, java.io.Serializable> workflowContext,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addKaleoTimerInstanceTokensMethodKey14,
				ClpSerializer.translateInput(kaleoInstanceToken),
				ClpSerializer.translateInput(kaleoTimers),
				ClpSerializer.translateInput(workflowContext),
				ClpSerializer.translateInput(serviceContext));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken>)ClpSerializer.translateOutput(returnObj);
	}

	public void completeKaleoTimerInstanceTokens(long kaleoInstanceId,
		java.util.Collection<com.liferay.portal.workflow.kaleo.model.KaleoTimer> kaleoTimers,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_completeKaleoTimerInstanceTokensMethodKey15,
				kaleoInstanceId, ClpSerializer.translateInput(kaleoTimers),
				ClpSerializer.translateInput(serviceContext));

		try {
			_classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	public com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken completeKaleoTimerInstanceToken(
		long kaleoTimerInstanceTokenId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_completeKaleoTimerInstanceTokenMethodKey16,
				kaleoTimerInstanceTokenId,
				ClpSerializer.translateInput(serviceContext));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken)ClpSerializer.translateOutput(returnObj);
	}

	public void deleteKaleoTimerInstanceToken(long kaleoInstanceId,
		long kaleoTimerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteKaleoTimerInstanceTokenMethodKey17,
				kaleoInstanceId, kaleoTimerId);

		try {
			_classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	public com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken getKaleoTimerInstanceToken(
		long kaleoInstanceId, long kaleoTimerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getKaleoTimerInstanceTokenMethodKey18,
				kaleoInstanceId, kaleoTimerId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken)ClpSerializer.translateOutput(returnObj);
	}

	public int getKaleoTimerInstanceTokensCount(long kaleoInstanceId,
		java.lang.Boolean completed,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getKaleoTimerInstanceTokensCountMethodKey19,
				kaleoInstanceId, ClpSerializer.translateInput(completed),
				ClpSerializer.translateInput(serviceContext));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public ClassLoaderProxy getClassLoaderProxy() {
		return _classLoaderProxy;
	}

	private ClassLoaderProxy _classLoaderProxy;
	private MethodKey _addKaleoTimerInstanceTokenMethodKey0;
	private MethodKey _createKaleoTimerInstanceTokenMethodKey1;
	private MethodKey _deleteKaleoTimerInstanceTokenMethodKey2;
	private MethodKey _deleteKaleoTimerInstanceTokenMethodKey3;
	private MethodKey _dynamicQueryMethodKey4;
	private MethodKey _dynamicQueryMethodKey5;
	private MethodKey _dynamicQueryMethodKey6;
	private MethodKey _dynamicQueryCountMethodKey7;
	private MethodKey _getKaleoTimerInstanceTokenMethodKey8;
	private MethodKey _getKaleoTimerInstanceTokensMethodKey9;
	private MethodKey _getKaleoTimerInstanceTokensCountMethodKey10;
	private MethodKey _updateKaleoTimerInstanceTokenMethodKey11;
	private MethodKey _updateKaleoTimerInstanceTokenMethodKey12;
	private MethodKey _addKaleoTimerInstanceTokenMethodKey13;
	private MethodKey _addKaleoTimerInstanceTokensMethodKey14;
	private MethodKey _completeKaleoTimerInstanceTokensMethodKey15;
	private MethodKey _completeKaleoTimerInstanceTokenMethodKey16;
	private MethodKey _deleteKaleoTimerInstanceTokenMethodKey17;
	private MethodKey _getKaleoTimerInstanceTokenMethodKey18;
	private MethodKey _getKaleoTimerInstanceTokensCountMethodKey19;
}