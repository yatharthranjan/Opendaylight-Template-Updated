package org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.impl.rev150722.modules.module.configuration;
import org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.impl.rev150722.modules.module.configuration.negotiator.impl.RpcRegistry;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.Configuration;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.impl.rev150722.modules.module.configuration.negotiator.impl.NotificationService;
import org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.impl.rev150722.modules.module.configuration.negotiator.impl.DataBroker;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>negotiator-impl</b>
 * <br>(Source path: <i>META-INF/yang/negotiator-impl.yang</i>):
 * <pre>
 * case negotiator-impl {
 *     container data-broker {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:eu:virtuwind:negotiator:impl?revision=2015-07-22)type {
 *                 leaf type {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 *     container notification-service {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:eu:virtuwind:negotiator:impl?revision=2015-07-22)type {
 *                 leaf type {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 *     container rpc-registry {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:eu:virtuwind:negotiator:impl?revision=2015-07-22)type {
 *                 leaf type {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>negotiator-impl/modules/module/configuration/(urn:eu:virtuwind:negotiator:impl?revision=2015-07-22)negotiator-impl</i>
 *
 */
public interface NegotiatorImpl
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.impl.rev150722.modules.module.configuration.NegotiatorImpl>,
    Configuration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:eu:virtuwind:negotiator:impl",
        "2015-07-22", "negotiator-impl").intern();

    DataBroker getDataBroker();
    
    NotificationService getNotificationService();
    
    RpcRegistry getRpcRegistry();

}

