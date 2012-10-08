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

package com.liferay.testsearchcontainer.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import com.liferay.testsearchcontainer.model.Foo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Foo in entity cache.
 *
 * @author Janghyun Kim
 * @see Foo
 * @generated
 */
public class FooCacheModel implements CacheModel<Foo>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{fooId=");
		sb.append(fooId);
		sb.append(", value=");
		sb.append(value);
		sb.append("}");

		return sb.toString();
	}

	public Foo toEntityModel() {
		FooImpl fooImpl = new FooImpl();

		fooImpl.setFooId(fooId);
		fooImpl.setValue(value);

		fooImpl.resetOriginalValues();

		return fooImpl;
	}

	public void readExternal(ObjectInput objectInput) throws IOException {
		fooId = objectInput.readLong();
		value = objectInput.readInt();
	}

	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(fooId);
		objectOutput.writeInt(value);
	}

	public long fooId;
	public int value;
}