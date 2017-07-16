package org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722;
import org.opendaylight.yangtools.yang.binding.DataRoot;


/**
 * Reference Monitor configuration
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>reference</b>
 * <br>Source path: <i>META-INF/yang/reference.yang</i>):
 * <pre>
 * module reference {
 *     yang-version 1;
 *     namespace "urn:eu:virtuwind:reference";
 *     prefix "reference";
 *
 *     import yang-ext { prefix "ext"; }
 *     
 *     import ietf-yang-types { prefix "yang"; }
 *     
 *     import opendaylight-inventory { prefix "inv"; }
 *     
 *     import ietf-inet-types { prefix "inet"; }
 *     revision 2015-07-22 {
 *         description "Reference Monitor configuration
 *         ";
 *     }
 *
 *     container application-registry {
 *         list application-registry-entry {
 *             key "appId"
 *             leaf appId {
 *                 type int32;
 *             }
 *             leaf packetLoss {
 *                 type decimal64;
 *             }
 *             leaf packetDelay {
 *                 type decimal64;
 *             }
 *             leaf jitter {
 *                 type decimal64;
 *             }
 *             leaf bandwidth {
 *                 type decimal64;
 *             }
 *         }
 *     }
 *
 *     rpc addApplication {
 *         input {
 *             leaf appId {
 *                 type int32;
 *             }
 *             leaf bandwidth {
 *                 type decimal64;
 *             }
 *             leaf packetLoss {
 *                 type decimal64;
 *             }
 *             leaf packetDelay {
 *                 type decimal64;
 *             }
 *             leaf jitter {
 *                 type decimal64;
 *             }
 *         }
 *         
 *     }
 * }
 * </pre>
 *
 */
public interface ReferenceData
    extends
    DataRoot
{




    ApplicationRegistry getApplicationRegistry();

}

