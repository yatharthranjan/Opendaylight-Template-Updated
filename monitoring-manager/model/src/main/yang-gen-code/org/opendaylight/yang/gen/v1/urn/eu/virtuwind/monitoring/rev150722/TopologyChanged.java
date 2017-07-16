package org.opendaylight.yang.gen.v1.urn.eu.virtuwind.monitoring.rev150722;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.eu.virtuwind.monitoring.rev150722.TopologyChanged.TopologyChange;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Notification;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>monitoring</b>
 * <br>(Source path: <i>META-INF/yang/monitoring.yang</i>):
 * <pre>
 * notification topologyChanged {
 *     leaf topologyChange {
 *         type enumeration;
 *     }
 *     leaf linkId {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>monitoring/topologyChanged</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.eu.virtuwind.monitoring.rev150722.TopologyChangedBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.eu.virtuwind.monitoring.rev150722.TopologyChangedBuilder
 *
 */
public interface TopologyChanged
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.monitoring.rev150722.TopologyChanged>,
    Notification
{


    public enum TopologyChange {
        /**
         * The link failed.
         *
         */
        LinkFailed(0),
        
        /**
         * The link was overloaded.
         *
         */
        LinkOverloaded(1)
        ;
    
    
        int value;
        private static final java.util.Map<java.lang.Integer, TopologyChange> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, TopologyChange> b = com.google.common.collect.ImmutableMap.builder();
            for (TopologyChange enumItem : TopologyChange.values())
            {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private TopologyChange(int value) {
            this.value = value;
        }
    
        /**
         * @return integer value
         */
        public int getIntValue() {
            return value;
        }
    
        /**
         * @param valueArg
         * @return corresponding TopologyChange item
         */
        public static TopologyChange forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:eu:virtuwind:monitoring",
        "2015-07-22", "topologyChanged").intern();

    TopologyChange getTopologyChange();
    
    java.lang.String getLinkId();

}

