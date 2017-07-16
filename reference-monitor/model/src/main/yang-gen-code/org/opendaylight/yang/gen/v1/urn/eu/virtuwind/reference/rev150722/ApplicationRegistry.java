package org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.application.registry.ApplicationRegistryEntry;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>reference</b>
 * <br>(Source path: <i>META-INF/yang/reference.yang</i>):
 * <pre>
 * container application-registry {
 *     list application-registry-entry {
 *         key "appId"
 *         leaf appId {
 *             type int32;
 *         }
 *         leaf packetLoss {
 *             type decimal64;
 *         }
 *         leaf packetDelay {
 *             type decimal64;
 *         }
 *         leaf jitter {
 *             type decimal64;
 *         }
 *         leaf bandwidth {
 *             type decimal64;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>reference/application-registry</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.ApplicationRegistryBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.ApplicationRegistryBuilder
 *
 */
public interface ApplicationRegistry
    extends
    ChildOf<ReferenceData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.ApplicationRegistry>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:eu:virtuwind:reference",
        "2015-07-22", "application-registry").intern();

    List<ApplicationRegistryEntry> getApplicationRegistryEntry();

}

