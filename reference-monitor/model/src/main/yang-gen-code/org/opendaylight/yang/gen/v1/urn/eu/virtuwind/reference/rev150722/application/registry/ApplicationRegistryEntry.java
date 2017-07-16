package org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.application.registry;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.ApplicationRegistry;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.math.BigDecimal;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>reference</b>
 * <br>(Source path: <i>META-INF/yang/reference.yang</i>):
 * <pre>
 * list application-registry-entry {
 *     key "appId"
 *     leaf appId {
 *         type int32;
 *     }
 *     leaf packetLoss {
 *         type decimal64;
 *     }
 *     leaf packetDelay {
 *         type decimal64;
 *     }
 *     leaf jitter {
 *         type decimal64;
 *     }
 *     leaf bandwidth {
 *         type decimal64;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>reference/application-registry/application-registry-entry</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.application.registry.ApplicationRegistryEntryBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.application.registry.ApplicationRegistryEntryBuilder
 * @see org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.application.registry.ApplicationRegistryEntryKey
 *
 */
public interface ApplicationRegistryEntry
    extends
    ChildOf<ApplicationRegistry>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.application.registry.ApplicationRegistryEntry>,
    Identifiable<ApplicationRegistryEntryKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:eu:virtuwind:reference",
        "2015-07-22", "application-registry-entry").intern();

    java.lang.Integer getAppId();
    
    BigDecimal getPacketLoss();
    
    BigDecimal getPacketDelay();
    
    BigDecimal getJitter();
    
    BigDecimal getBandwidth();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     */
    ApplicationRegistryEntryKey getKey();

}

