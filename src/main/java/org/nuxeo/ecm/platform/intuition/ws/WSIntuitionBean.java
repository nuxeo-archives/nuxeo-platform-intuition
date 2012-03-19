/*
 * (C) Copyright 2006-2007 Nuxeo SAS (http://nuxeo.com/) and contributors.
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
 *
 */
@Stateless
@WebService(name = "WSIntuitionInterface", serviceName = "WSIntuitionService")
@SOAPBinding(style = Style.DOCUMENT)
public class WSIntuitionBean extends WSIndexingGatewayBean implements
        WSIntuition {

    private static final long serialVersionUID = 4696352633818100451L;

}
