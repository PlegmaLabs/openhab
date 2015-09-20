/**
 * Copyright (c) 2010-2015, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
 
package org.openhab.binding.sunnywebbox;

import org.openhab.core.binding.BindingProvider;

/**
 * @author Manolis Nikiforakis
 * @author Yiannis Gkoufas
 * @since 1.5.0
 */
public interface SunnyWebBoxBindingProvider extends BindingProvider {
	String getDeviceId(String itemName);
	String getMeta(String itemName);
	String getUrlKey(String itemName);

}
