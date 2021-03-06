/**
 *  Copyright (c) 2013-2015 Angelo ZERR.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Angelo Zerr <angelo.zerr@gmail.com> - initial API and implementation
 */
package tern.angular.modules;

/**
 * Angular restriction.
 * 
 */
public enum Restriction {

	A, E, C, M;

	/**
	 * Returns true if the given restrict match a restriction and false
	 * otherwise.
	 * 
	 * @param restrict
	 * @return
	 */
	public boolean isMatch(String restrict) {
		return restrict.contains(name());
	}
}
