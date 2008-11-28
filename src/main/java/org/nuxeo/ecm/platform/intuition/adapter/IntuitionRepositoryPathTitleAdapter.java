/*
 * (C) Copyright 2008 Nuxeo SAS (http://nuxeo.com/) and contributors.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * Contributors:
 *     Nuxeo - initial API and implementation
 *
 * $Id: IntuitionACLIndexingAdapter.java 31426 2008-04-09 17:00:34Z ogrisel $
 */

package org.nuxeo.ecm.platform.intuition.adapter;

import org.nuxeo.ecm.platform.indexing.gateway.adapter.RepositoryPathTitleAdapter;

/**
 * Adapter to build a new property ecm:pathTitle holding the physical path in
 * the repository with human readable titles instead of technical local path ids
 * found in the default ecm:path property.
 *
 * @author Olivier Grisel <ogrisel@nuxeo.com>
 */
public class IntuitionRepositoryPathTitleAdapter extends RepositoryPathTitleAdapter {

}
