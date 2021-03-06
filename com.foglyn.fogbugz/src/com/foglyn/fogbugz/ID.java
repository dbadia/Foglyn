/*******************************************************************************
 * Copyright (c) 2008,2011 Peter Stibrany
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Peter Stibrany (pstibrany@gmail.com) - initial API and implementation
 *******************************************************************************/

package com.foglyn.fogbugz;

/**
 * This interface has two purposes.
 * 
 * 1) It simplifies some coding in FogBugzClient by providing common type for generic methods.
 * 
 * 2) It allows ProGuard to keep package name unmodified by keeping this interface name untouched.
 */
public interface ID {
    // empty
}
