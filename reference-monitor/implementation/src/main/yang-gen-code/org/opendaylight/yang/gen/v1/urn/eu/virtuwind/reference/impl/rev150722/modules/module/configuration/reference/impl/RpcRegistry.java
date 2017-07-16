package org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.impl.rev150722.modules.module.configuration.reference.impl;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.Module;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceRef;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>reference-impl</b>
 * <br>(Source path: <i>META-INF/yang/reference-impl.yang</i>):
 * <pre>
 * container rpc-registry {
 *     leaf type {
 *         type leafref;
 *     }
 *     leaf name {
 *         type leafref;
 *     }
 *     uses service-ref {
 *         refine (urn:eu:virtuwind:reference:impl?revision=2015-07-22)type {
 *             leaf type {
 *                 type leafref;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>reference-impl/modules/module/configuration/(urn:eu:virtuwind:reference:impl?revision=2015-07-22)reference-impl/rpc-registry</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.impl.rev150722.modules.module.configuration.reference.impl.RpcRegistryBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.impl.rev150722.modules.module.configuration.reference.impl.RpcRegistryBuilder
 *
 */
public interface RpcRegistry
    extends
    ChildOf<Module>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.impl.rev150722.modules.module.configuration.reference.impl.RpcRegistry>,
    ServiceRef
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:eu:virtuwind:reference:impl",
        "2015-07-22", "rpc-registry").intern();


}

