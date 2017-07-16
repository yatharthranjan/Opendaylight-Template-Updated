package org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.math.BigDecimal;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>negotiator</b>
 * <br>(Source path: <i>META-INF/yang/negotiator.yang</i>):
 * <pre>
 * container input {
 *     leaf appId {
 *         type int32;
 *     }
 *     leaf bandwidth {
 *         type decimal64;
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
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>negotiator/negotiation/input</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722.NegotiationInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722.NegotiationInputBuilder
 *
 */
public interface NegotiationInput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722.NegotiationInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:eu:virtuwind:negotiator",
        "2015-07-22", "input").intern();

    java.lang.Integer getAppId();
    
    BigDecimal getBandwidth();
    
    BigDecimal getPacketLoss();
    
    BigDecimal getPacketDelay();
    
    BigDecimal getJitter();

}

