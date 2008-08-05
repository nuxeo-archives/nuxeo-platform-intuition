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

import org.nuxeo.ecm.platform.indexing.gateway.adapter.SimpleACLIndexingAdapter;

/**
 * Sinequa IndexingAdapter that filters blocked local ACEs with the default
 * blocking strategy in Nuxeo: "Deny Everything to Everyone" and only provide
 * intuition with permissions that are related to read access.
 *
 * @author Olivier Grisel <ogrisel@nuxeo.com>
 *
 */
public class IntuitionACLIndexingAdapter extends SimpleACLIndexingAdapter {

}
