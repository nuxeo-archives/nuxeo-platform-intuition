/*
 * (C) Copyright 2006-2007 Nuxeo SA (http://nuxeo.com/) and others.
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
 *     anguenot
 *
 * $Id: WSIntuitionBean.java 31898 2008-05-14 09:54:36Z tdelprat $
 */

package org.nuxeo.ecm.platform.intuition.ws;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.nuxeo.ecm.platform.indexing.gateway.ws.WSIndexingGatewayBean;
import org.nuxeo.ecm.platform.intuition.ws.api.WSIntuition;

/**
 * Intuition specific web services.
 *
 * @author <a href="mailto:ja@nuxeo.com">Julien Anguenot</a>
 * @author Olivier Grisel <ogrisel@nuxeo.com>
 * @author Thierry Delprat <td@nuxeo.com>
 */
@Stateless
@WebService(name = "WSIntuitionInterface", serviceName = "WSIntuitionService")
@SOAPBinding(style = Style.DOCUMENT)
public class WSIntuitionBean extends WSIndexingGatewayBean implements WSIntuition {

    private static final long serialVersionUID = 4696352633818100451L;

}
