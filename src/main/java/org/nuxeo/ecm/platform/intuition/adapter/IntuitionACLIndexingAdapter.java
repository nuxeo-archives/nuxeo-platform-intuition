/*
 * (C) Copyright 2008 Nuxeo SA (http://nuxeo.com/) and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *     Nuxeo - initial API and implementation
 *
 * $Id: IntuitionACLIndexingAdapter.java 31426 2008-04-09 17:00:34Z ogrisel $
 */

package org.nuxeo.ecm.platform.intuition.adapter;

import org.nuxeo.ecm.platform.indexing.gateway.adapter.SimpleACLIndexingAdapter;

/**
 * Sinequa IndexingAdapter that filters blocked local ACEs with the default blocking strategy in Nuxeo:
 * "Deny Everything to Everyone" and only provide intuition with permissions that are related to read access.
 *
 * @author Olivier Grisel <ogrisel@nuxeo.com>
 */
public class IntuitionACLIndexingAdapter extends SimpleACLIndexingAdapter {

}
