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
 *     Nuxeo - initial API and implementation
 *
 * $Id: WSClient.java 20672 2007-06-17 14:11:55Z sfermigier $
 */

package org.nuxeo.ecm.platform.intuition.ws.client;

import java.net.URL;
import java.util.Arrays;

import org.nuxeo.ecm.core.api.security.jaws.ACE;
import org.nuxeo.ecm.platform.api.ws.jaws.DocumentBlob;
import org.nuxeo.ecm.platform.api.ws.jaws.DocumentDescriptor;
import org.nuxeo.ecm.platform.api.ws.jaws.DocumentProperty;
import org.nuxeo.ecm.platform.audit.api.AuditException;
import org.nuxeo.ecm.platform.audit.ws.api.jaws.ModifiedDocumentDescriptor;
import org.nuxeo.ecm.platform.intuition.ws.jaws.WSIntuitionInterface;
import org.nuxeo.ecm.platform.intuition.ws.jaws.WSIntuitionInterfaceBindingStub;
import org.nuxeo.ecm.platform.intuition.ws.jaws.WSIntuitionServiceLocator;

/**
 *
 * @author <a href="mailto:ja@nuxeo.com">Julien Anguenot</a>
 *
 */
public class WSClient {

    public static String UUID;

    private WSIntuitionInterfaceBindingStub stub;

    // public static WSClient create(String url) {
    // Proxy.newProxyInstance(loader, new Class[] {NuxeoRemoting.class}, )
    // }

    public static WSIntuitionInterface create() throws Exception {
        WSIntuitionServiceLocator locator = new WSIntuitionServiceLocator();
        WSIntuitionInterfaceBindingStub _stub = new WSIntuitionInterfaceBindingStub(
                new URL(locator.getWSIntuitionInterfacePortAddress()), locator);
        _stub.setPortName(locator.getWSIntuitionInterfacePortWSDDServiceName());
        return _stub;
    }

    /**
     * @param args
     */
    public static void main(String[] args) throws AuditException {
        try {

            WSIntuitionInterface remoting = create();
            if (remoting == null)
                new Exception("remoting init failed");

            System.out.println("Starting test suite.....");

            // connection
            String sessionId = remoting.connect("Administrator",
                    "Administrator");
            System.out.println("Connected....");


            System.out.println("No date range.");
            ModifiedDocumentDescriptor[] docs = remoting.listModifiedDocuments(
                    sessionId, null);
            printDocuments(docs);

            System.out.println("Docs modified during the last 72 hours....");
            docs = remoting.listModifiedDocuments(sessionId, "72h");
            printDocuments(docs);

            System.out.println("Docs modified during the last 2 hours....");
            docs = remoting.listModifiedDocuments(sessionId, "2h");
            printDocuments(docs);

            System.out.println("Docs modified during the last 1 hours....");
            docs = remoting.listModifiedDocuments(sessionId, "1h");
            printDocuments(docs);

            System.out.println("Docs modified during the last 59 minutes....");
            docs = remoting.listModifiedDocuments(sessionId, "59m");
            printDocuments(docs);

            System.out.println("Docs modified during the last 45 minutes....");
            docs = remoting.listModifiedDocuments(sessionId, "45m");
            printDocuments(docs);

            System.out.println("Docs modified during the last 2 minutes....");
            docs = remoting.listModifiedDocuments(sessionId, "2m");
            printDocuments(docs);

            String repo = remoting.getRepositoryName(sessionId);
            System.out.println("repository: " + repo);

            // user and groups
            String[] groups = remoting.listGroups(sessionId, 0, 1);
            System.out.println("groups: " + Arrays.toString(groups));
            String[] users = remoting.listUsers(sessionId, 0, 1);
            System.out.println("users: " + Arrays.toString(users));

            groups = remoting.getGroups(sessionId, null);
            System.out.println("tope level groups: " + Arrays.toString(groups));
            users = remoting.getUsers(sessionId, groups[0]);
            System.out.println("users in " + groups[0] + ": "
                    + Arrays.toString(users));

            // remoting.listAllDocumentUUIDsAndVersions(string_1, int_1, int_2,
            // boolean_1, string_2);

            // navigation
            DocumentDescriptor doc = remoting.getRootDocument(sessionId);
            printTree(remoting, doc, sessionId, "");

            if (UUID != null) {

                // acl
                ACE[] acl = remoting.getDocumentACL(sessionId, UUID);
                printACL(acl);

                DocumentProperty[] props = remoting.getDocumentProperties(
                        sessionId, UUID);
                printProperties(props);

                props = remoting.getDocumentNoBlobProperties(sessionId, UUID);
                printProperties(props);

                DocumentBlob[] blobs = remoting.getDocumentBlobs(sessionId,
                        UUID);
                printBlobs(blobs);

                // rpath
                String rpath = remoting.getRelativePathAsString(sessionId, UUID);
                assert rpath != null;
                assert rpath != "";
                System.out.println("rpath = " + rpath);

            } else {
                System.out.println("No document of type file in the remoting Nuxeo core. Cannot test out ...");
            }


            remoting.disconnect(sessionId);
            System.out.println("Disconnected....");

            System.out.println("done.....");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static final void printDocuments(ModifiedDocumentDescriptor[] docs) {
        System.out.println("###############################################");
        if (docs == null || docs.length == 0) {
            System.out.println("No documents found...");
        } else {
            for (ModifiedDocumentDescriptor doc : docs) {
                System.out.println("Doc UUID=" + doc.getUUID());
                System.out.println("Doc type=" + doc.getType());
                System.out.println("Doc modified" + doc.getModified());
            }
        }
        System.out.println("###############################################");
    }

    public static void printTree(WSIntuitionInterface remoting,
            DocumentDescriptor parent, String sessionId, String prefix)
            throws Exception {
        System.out.println(prefix + "> " + parent.getTitle() + " ["
                + parent.getUUID() + " : " + parent.getType() + "] ");
        DocumentDescriptor[] docs = remoting.getChildren(sessionId,
                parent.getUUID());
        if (docs == null)
            return;
        for (DocumentDescriptor doc : docs) {
            printTree(remoting, doc, sessionId, prefix + "--");
            if (doc.getType().equals("File")) {
                UUID = doc.getUUID();
            }
        }
    }

    public static void printACL(ACE[] aces) throws Exception {
        for (ACE ace : aces) {
            System.out.println("ACE { " + ace.getUsername() + " : "
                    + ace.getPermission() + " : " + ace.isGranted() + " }");
        }
    }

    public static void printProperties(DocumentProperty[] props)
            throws Exception {
        System.out.println("DOC PROPERTIES: ");
        for (DocumentProperty prop : props) {
            System.out.println(prop.getName() + " = " + prop.getValue());
        }
    }

    public static void printBlobs(DocumentBlob[] blobs) throws Exception {
        System.out.println("DOC BLOBS: ");
        if (blobs == null)
            return;
        for (DocumentBlob blob : blobs) {
            System.out.println(blob.getName() + " { " + blob.getMimetype()
                    + " : " + blob.getEncoding() + "}");
        }
    }

    public static void printBlobContents(DocumentBlob[] blobs) throws Exception {
        for (DocumentBlob blob : blobs) {
            System.out.println(new String(blob.getBlob()));
        }
    }

}
