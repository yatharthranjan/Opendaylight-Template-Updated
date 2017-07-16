package org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.impl.rev150722.modules.module.configuration.negotiator.impl;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.Module;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceRef;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>negotiator-impl</b>
 * <br>(Source path: <i>META-INF/yang/negotiator-impl.yang</i>):
 * <pre>
 * container notification-service {
 *     leaf type {
 *         type leafref;
 *     }
 *     leaf name {
 *         type leafref;
 *     }
 *     uses service-ref {
 *         refine (urn:eu:virtuwind:negotiator:impl?revision=2015-07-22)type {
 *             leaf type {
 *                 type leafref;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>negotiator-impl/modules/module/configuration/(urn:eu:virtuwind:negotiator:impl?revision=2015-07-22)negotiator-impl/notification-service</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.impl.rev150722.modules.module.configuration.negotiator.impl.NotificationServiceBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.impl.rev150722.modules.module.configuration.negotiator.impl.NotificationServiceBuilder
 *
 */
public interface NotificationService
    extends
    ChildOf<Module>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.impl.rev150722.modules.module.configuration.negotiator.impl.NotificationService>,
    ServiceRef
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:eu:virtuwind:negotiator:impl",
        "2015-07-22", "notification-service").intern();


}

